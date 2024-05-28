package PratiqueGW.PratiqueGW.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class loginController {

		@RequestMapping("/login")
	    public String hello () {
	        System.out.println("ehl되는거 맞아 ???? /?");
	        return "index";
	    }

	

}
