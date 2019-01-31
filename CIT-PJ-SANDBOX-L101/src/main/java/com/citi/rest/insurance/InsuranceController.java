package com.citi.rest.insurance;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.datetime.DateTimeFormatAnnotationFormatterFactory;
import org.springframework.validation.annotation.Validated;


	@RestController
	public class InsuranceController {
		
		private static final Logger LOGGER = LoggerFactory.getLogger(InsuranceController.class);
		@Autowired
		private InsuranceService insuranceService;
				
				
		@RequestMapping(value ="/v1/insurance/bookings/sourceAccounts/{apidomain}", method = RequestMethod.GET)
		//Swagger configaration stats 
		@ApiOperation(value= "Retrun the apidomain object for that apidomain ", notes = "return apidomain object for that Name",response= Map.class)
		@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfull", response = Map.class),
			@ApiResponse(code = 400, message = "Invalid input provide"),
			@ApiResponse(code = 500, message = "Internal server error"),})
		//Swagger Configaration end
		public List<LisaApiResponseStub1> getApidomain(@PathVariable @Validated String apidomain) throws SQLException
		{
			//Optional<LisaApiResponseStub1 appidomin = new Optional<LisaApiResponseStub1();
			LOGGER.info("getGroupByName:: "+apidomain);
			//appidomin = 
			return insuranceService.getInsurance(apidomain);		
			//return workgroupInfo;
			//return null;
	   }
		
		
		@RequestMapping(value ="/v1/insurance/bookings/sourceAccounts/{apidomain},{rqheader1}", method = RequestMethod.GET)
		//Swagger configaration stats 
		@ApiOperation(value= "Retrun the apidomain object for that apidomain ", notes = "return apidomain object for that Name",response= Map.class)
		@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfull", response = Map.class),
			@ApiResponse(code = 400, message = "Invalid input provide"),
			@ApiResponse(code = 500, message = "Internal server error"),})
		//Swagger Configaration end
		public List<LisaApiResponseStub1> getApidomain(@PathVariable @Validated String apidomain,@PathVariable @Validated String rqheader1) throws SQLException
		{
			//Optional<LisaApiResponseStub1 appidomin = new Optional<LisaApiResponseStub1();
			LOGGER.info("getGroupByName:: "+apidomain);
			//appidomin = 
			return insuranceService.getInsuranceRqheader1(apidomain, rqheader1);		
			//return workgroupInfo;
			//return null;
	   }
		///
		@RequestMapping(value ="/v1/insurance/bookings/sourceAccounts", method = RequestMethod.GET)
		//Swagger configaration stats 
		@ApiOperation(value= "Retrun the insurance object  ", notes = "return group all insurance ",response= Map.class)
		@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfull", response = Map.class),
			@ApiResponse(code = 400, message = "Invalid input provide"),
			@ApiResponse(code = 500, message = "Internal server error"),})
		//Swagger Configaration end
		public List<LisaApiResponseStub1> getInsurance() throws SQLException
		{
			List<LisaApiResponseStub1> insuranceInfo = new ArrayList<LisaApiResponseStub1>();
			LOGGER.info("getInsurance:: ");
			return insuranceService.getAllInsurances();		
			
	   }	
		
		@RequestMapping(method=RequestMethod.POST, value="/v1/insurance/bookings/sourceAccounts")
		//Swagger configaration stats 
				@ApiOperation(value= "Retrun the insurance object  ", notes = "return group all insurance ",response= Map.class)
				@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfull", response = Map.class),
					@ApiResponse(code = 400, message = "Invalid input provide"),
					@ApiResponse(code = 500, message = "Internal server error"),})
				//Swagger Configaration end
		public void getInsurance(@RequestBody LisaApiResponseStub1 insurance)
		{
			insuranceService.addInsurance(insurance);
		}
			} 
	

		
		
		
		

	



