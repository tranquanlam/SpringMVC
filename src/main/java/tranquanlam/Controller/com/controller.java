package tranquanlam.Controller.com;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import tranquanlam.Model.com.Customer;
import tranquanlam.Model.com.UserInforDTO;
import tranquanlam.Servive.com.SeviceCustomer;
import tranquanlam.Servive.com.SvUserInfor;
import tranquanlam.entity.com.UserInfor;

@Controller
public class controller {

	@Autowired
	SvUserInfor svUser;

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String login(HttpServletRequest request) {
		UserInforDTO infor = new UserInforDTO();
		infor.setNameUser("ten User");
		request.setAttribute("user", infor);
		return "User/login";
	}

	@RequestMapping(value="/sigup",method=RequestMethod.GET)
	public @ResponseBody String addUser(@RequestBody UserInforDTO userInforDTO )
	{
	    svUser.addUser(userInforDTO);
		return "User/singup";
	}
	

	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String login(HttpServletRequest request, @ModelAttribute("user") UserInforDTO infor) {
		
		UserInfor infor2 = new UserInfor();
		infor2.setIdUser(infor.getIdUser());
		infor2.setNameUser(infor.getNameUser());
		infor2.setPassUser(infor.getPassUser());
		
		if (svUser.checkPass(infor2.getPassUser()) == true) {
			return "MainPage";
		}
		return "User/login";
	}
	
	@Autowired
	SeviceCustomer sevicecus;
	
	@RequestMapping(value = "/viewTable1", method = RequestMethod.GET)
	public String getviewTable(HttpServletRequest request) {
		
		
		ArrayList<Customer> cus = sevicecus.tableCustomer();
		List<UserInforDTO> dtos = svUser.getAllUser();
		// request.setAttribute("cus", cus);
		request.setAttribute("cus", dtos);
		return "viewTable";
		
	}
}
