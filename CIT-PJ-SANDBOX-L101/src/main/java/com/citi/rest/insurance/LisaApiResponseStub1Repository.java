package com.citi.rest.insurance;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

public interface LisaApiResponseStub1Repository extends CrudRepository<LisaApiResponseStub1, String > {
	List<LisaApiResponseStub1> findByApidomain(String apidomain);
	List<LisaApiResponseStub1> findByApidomainAndRqheader1(String apidomain,String rqheader1);
}
