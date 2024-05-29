package PratiqueGW.PratiqueGW.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import PratiqueGW.PratiqueGW.com.mapper.loginMapper;
import PratiqueGW.PratiqueGW.com.vo.loginVo;

@Service
public class loginService {
    
    @Autowired loginMapper mapper;
	
    public String loginCheck(loginVo vo){
        
        System.out.println("Post 들어옴"+vo.getLoginEmail());
        
        mapper.loginCheck(vo);
        
        return null;
    }

}
