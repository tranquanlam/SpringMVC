package tranquanlam.Controller.com;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import tranquanlam.Model.com.Customer;
import tranquanlam.Model.com.GiftCard;
import tranquanlam.Model.com.LoaiCard;
import tranquanlam.Model.com.UserInforDTO;
import tranquanlam.Servive.com.SeviceCustomer;
import tranquanlam.Servive.com.SvGiftCard;
import tranquanlam.Servive.com.SvTypeCard;
import tranquanlam.Servive.com.SvUserInfor;
import tranquanlam.entity.com.UserInfor;

@Controller
public class ViewControler {// ten class viet hoa chu cai dau tien nha. ten package dat ten cong ty truoc,
							// ten project va ten folder nh�m chuc nang
	@Autowired
	SeviceCustomer sevicecus;

	@Autowired
	SvGiftCard gcard;

	@Autowired
	SvTypeCard type;

	@Autowired
	SvUserInfor svUser;

	@RequestMapping("/header")
	public String header() {
		return "header";
	}

	// ko viet hoa
	@RequestMapping("/hinh")
	public String html() {
		return "hinh";
	}

	@RequestMapping(value = "/MainPage", method = RequestMethod.GET)
	public String MainPage(HttpServletRequest rq) {
		List<GiftCard> cards = gcard.getAll();
		List<LoaiCard> TypeCard = type.getAll();
		rq.setAttribute("gcard", cards);
		rq.setAttribute("type", TypeCard);
		return "MainPage";
	}

	@RequestMapping(value = "/json", method = RequestMethod.GET)
	public @ResponseBody List<UserInforDTO> jsonUserDTOlist() {
		List<UserInforDTO> dtos = svUser.getAllUser();
		return dtos;
	}

	@RequestMapping(value = "/addjson", method = RequestMethod.POST)
	public @ResponseBody void addjson(@RequestBody UserInforDTO value) {
		svUser.addUser(value);
	}

	@RequestMapping(value = "/MainPage", method = RequestMethod.POST)
	public String MainPage1(HttpServletRequest rq, @ModelAttribute("user") UserInforDTO infor) {
		List<GiftCard> cards = gcard.getAll();
		List<LoaiCard> TypeCard = type.getAll();
		rq.setAttribute("gcard", cards);
		rq.setAttribute("type", TypeCard);

		UserInfor infor2 = new UserInfor();
		infor2.setIdUser(infor.getIdUser());
		infor2.setNameUser(infor.getNameUser());
		infor2.setPassUser(infor.getPassUser());

		if (svUser.checkPass(infor2.getPassUser()) == true) {
			return "MainPage";
		}
		return "User/login";

	}

	@RequestMapping(value = "/hotel", method = RequestMethod.GET)
	public String hotel() {

		return "hotel/hotelPage";
	}
	
	@RequestMapping(value = "/OK", method = RequestMethod.POST)
	public String LoginSecurity(HttpServletRequest rq,UserInforDTO infor) {
		
		System.out.println("da vao");
		UserInfor infor2 = new UserInfor();
		infor2.setIdUser(infor.getIdUser());
		infor2.setNameUser(infor.getNameUser());
		infor2.setPassUser(infor.getPassUser());

		
		if (svUser.checkPass(infor2.getPassUser()) == true) {
			return "MainPage";
		}
		return "admin/viewTable";
	}
	

}
