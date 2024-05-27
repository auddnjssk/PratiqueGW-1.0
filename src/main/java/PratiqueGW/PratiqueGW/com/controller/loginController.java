package PratiqueGW.PratiqueGW.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class loginController {

		@RequestMapping("/login")
	    public String hello () {
	        System.out.println("들어오나 /?");
	        return "hello";
	    }

	

}
