package PratiqueGW.PratiqueGW.com.controller;


import java.net.http.HttpResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import PratiqueGW.PratiqueGW.com.service.loginService;
import PratiqueGW.PratiqueGW.com.vo.loginVo;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
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
