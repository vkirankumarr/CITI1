package com.citi.rest.insurance.controller;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//import com.kk.rest.workgroup.exception.DataNotFoundException;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
@RestController
public class HelloController {
	
	@RequestMapping(value ="/hello", method = RequestMethod.GET)
	//Swagger configaration stats 
	@ApiOperation(value= "Retrun the static string", notes = "Retrun the static string",response= Map.class)
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Successfull", response = Map.class),
		@ApiResponse(code = 400, message = "Invalid input provide"),
		@ApiResponse(code = 500, message = "Internal server error"),})
	//Swagger Configaration end
	public String hello() throws SQLException
	{
				
		return "Hello Welcome to Swagger";
   }

}
