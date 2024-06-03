package PratiqueGW.com.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import PratiqueGW.com.vo.loginVo;

@Repository
@Mapper
public interface loginMapper {

    String loginCheck(loginVo vo);


}
