package PratiqueGW.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import PratiqueGW.com.entity.EpyEntity;

public interface EpyRepository extends JpaRepository<EpyEntity, Integer>{
	
	// 유저 ID가 있는지 체크
	Boolean existsByEpyId(String epyId);
	

}
