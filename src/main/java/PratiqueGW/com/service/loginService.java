package PratiqueGW.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import PratiqueGW.com.mapper.loginMapper;
import PratiqueGW.com.vo.loginVo;

@Service
public class loginService {

    @Autowired private loginMapper mapper;

    public void loginCheck(loginVo vo){
        System.out.println("서비스 탔음");
        String count = mapper.loginCheck(vo);
        System.out.println(count + "< 카운트!");
    }
    
}
