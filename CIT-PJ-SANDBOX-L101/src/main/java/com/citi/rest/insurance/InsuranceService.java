package com.citi.rest.insurance;



import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class InsuranceService {

	@Autowired	
private LisaApiResponseStub1Repository lisaApiResponseStub1Repository;
	
	public List<LisaApiResponseStub1> getAllInsurances()
	{
		List<LisaApiResponseStub1> insurance = new ArrayList<>();
		lisaApiResponseStub1Repository.findAll().forEach(insurance::add);
		return insurance;
	}
	
	public List<LisaApiResponseStub1> getInsurance(String apidomain)
	{
		
		return lisaApiResponseStub1Repository.findByApidomain(apidomain);				
		
	}
	public List<LisaApiResponseStub1> getInsuranceRqheader1(String apidomain,String rqheader1)
	{
		
		return lisaApiResponseStub1Repository.findByApidomainAndRqheader1(apidomain,rqheader1);				
		
	}
	
	
	
	public void  addInsurance(LisaApiResponseStub1 insurance)
	{
		lisaApiResponseStub1Repository.save(insurance);
	}
}
