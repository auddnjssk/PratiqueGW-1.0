package PratiqueGW.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import PratiqueGW.com.service.LoginService;


@Controller
public class LoginController {

	@Autowired private LoginService service; 

	@RequestMapping("/")
	public String hello () {
		System.out.println("메인 페이지 진입");

		return "index";
	}
	@PostMapping("/login/loginCheck")
	public String postMethodName(@RequestBody LoginDTO dto) {
		System.out.println("Post 들어옴");

		//HttpResponse response = 
		service.loginCheck(dto);
		
		return "index";
	}


}
