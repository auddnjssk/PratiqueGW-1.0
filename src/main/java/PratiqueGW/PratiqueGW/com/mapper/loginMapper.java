package PratiqueGW.PratiqueGW.com.mapper;

import org.apache.ibatis.annotations.Mapper;

import PratiqueGW.PratiqueGW.com.vo.loginVo;

@Mapper
public interface loginMapper {

    String loginCheck(loginVo vo);


}
