package PratiqueGW.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import PratiqueGW.com.service.loginService;
import PratiqueGW.com.vo.loginVo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Controller
public class loginController {

	@Autowired private loginService service; 

	@RequestMapping("/")
	public String hello () {
		System.out.println("메인 페이지 진입");

		return "index";
	}
	@PostMapping("/login/loginCheck")
	public String postMethodName(@RequestBody loginVo vo) {
		System.out.println("Post 들어옴"+vo.getLoginEmail());

		//HttpResponse response = 
		service.loginCheck(vo);
		
		return "index";
	}


}
