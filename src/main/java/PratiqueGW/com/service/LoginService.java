package PratiqueGW.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import PratiqueGW.com.dto.LoginDTO;
import PratiqueGW.com.mapper.LoginMapper;

@Service
public class LoginService {

    @Autowired private LoginMapper mapper;

    public void loginCheck(LoginDTO dto){
        System.out.println("서비스 탔음");
        String count = mapper.loginCheck(dto);
        System.out.println(count + "< 카운트!");
    }
    
}
