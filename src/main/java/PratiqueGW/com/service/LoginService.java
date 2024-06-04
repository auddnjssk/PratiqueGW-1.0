package PratiqueGW.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import PratiqueGW.com.dto.LoginDTO;
import PratiqueGW.com.entity.EpyEntity;
import PratiqueGW.com.repository.EpyRepository;

@Service
public class LoginService {

    
    private final EpyRepository epyRepository;
    
    private final BCryptPasswordEncoder bCryptPasswordEncoder;
    
    
    // 생성자 방식으로 초기화
    public LoginService(EpyRepository epyRepository,BCryptPasswordEncoder bCryptPasswordEncoder) {
    	
    	this.epyRepository = epyRepository;
		this.bCryptPasswordEncoder = new BCryptPasswordEncoder();
    	
    	
    	
    }

    public void loginCheck(LoginDTO dto){
    	//String userName = dto.get
    	
    	String epyId = dto.getUserId();
    	String epyPassword = dto.getPassWord();
    	
    	// 동일한 아이디 있는지 확인
    	Boolean isExist = epyRepository.existsByEpyId(epyId);
    	
    	// 동일한 아이디 존재할시 
    	if(isExist) {
    		
    		return;
    		
    	}
    	
    	EpyEntity data = new EpyEntity();
    	data.setUserId(epyId);
    	
    	//암호화 진행된 패스워드 입
    	data.setUserId(bCryptPasswordEncoder.encode(epyPassword));
    	// 스프링은 _접두사가 무조건 붙어야함
    	data.setUserId("ROLE_ADMIN");
    	
    
    }
    
    
    
}
