package tranquanlam.Controller.com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class securityController {
	
	@RequestMapping(value="/singup")
	
	public String  security() {
		
		return"#";
	}
	
}
