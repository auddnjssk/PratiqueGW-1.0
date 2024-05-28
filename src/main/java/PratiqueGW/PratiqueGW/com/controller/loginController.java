package PratiqueGW.PratiqueGW.com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class loginController {

		@RequestMapping("/")
	    public String hello () {
	        System.out.println("ehl되는거 맞아 ???? /?");
	        return "index";
	    }
		@PostMapping("/login/loginCheck")
		public String postMethodName() {
			//TODO: process POST request
			System.out.println("Post 들어옴ㅋㅋ");
			
			return "entity";
		}
	

}
