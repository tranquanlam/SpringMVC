package tranquanlam.Controller.com;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller

public class adminController {

	private static Logger logger=Logger.getLogger(adminController.class);
	
    @RequestMapping(value="/login1")
	public String getInforUser(@RequestParam(defaultValue="erro") String erro) {
		logger.error(erro);		
		return "/loginAdmin";
	}
}
