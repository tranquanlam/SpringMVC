package tranquanlam.Controller.com;

import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import tranquanlam.Model.com.Customer;
import tranquanlam.Model.com.GiftCard;
import tranquanlam.Model.com.LoaiCard;
import tranquanlam.Model.com.UserInforDTO;
import tranquanlam.Servive.com.SeviceCustomer;
import tranquanlam.Servive.com.SvUserInfor;
import tranquanlam.entity.com.UserInfor;

@Controller
@RequestMapping(value="/admin")
public class ControllerAdmin {
	
	@Autowired
	SvUserInfor svUser;
	@Autowired
	SeviceCustomer sevicecus;
	
	private static Logger logger=Logger.getLogger(adminController.class);
	
	@RequestMapping(value = "/viewTable", method = RequestMethod.GET)
	public String getviewTable(HttpServletRequest request) {
		
		logger.info("Thong tin admin");
		ArrayList<Customer> cus = sevicecus.tableCustomer();
		List<UserInforDTO> dtos = svUser.getAllUser();
		// request.setAttribute("cus", cus);
		request.setAttribute("cus", dtos);
		return "viewTable";
		
	}


}
