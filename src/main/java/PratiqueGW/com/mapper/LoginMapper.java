package PratiqueGW.com.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import PratiqueGW.com.dto.LoginDTO;

@Repository
@Mapper
public interface LoginMapper {

    String loginCheck(LoginDTO dto);


}
