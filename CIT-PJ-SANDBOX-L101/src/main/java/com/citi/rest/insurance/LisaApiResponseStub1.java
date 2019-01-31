package com.citi.rest.insurance;


import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;


/**
 * The persistent class for the LISA_API_RESPONSE_STUB1 database table.
 * 
 */
@Entity
@Table(name="LISA_API_RESPONSE_STUB1")
@NamedQuery(name="LisaApiResponseStub1.findAll", query="SELECT l FROM LisaApiResponseStub1 l")
public class LisaApiResponseStub1 implements Serializable {
	private static final long serialVersionUID = 1L;
    
	private String api;
	@Id
	private String apidomain;

	private String bodyparam1;

	private String bodyparam2;

	private String bodyparam3;

	private String bodyparam4;

	private String bodyparamvalue1;

	private String bodyparamvalue2;

	private String bodyparamvalue3;

	private String bodyparamvalue4;

	@Lob
	private String jsonresponse;

	private String queryparam1;

	private String queryparam2;

	private String queryparam3;

	private String queryparam4;

	private String queryparamvalue1;

	private String queryparamvalue2;

	private String queryparamvalue3;

	private String queryparamvalue4;

	private String responsecode;

	private String rqheader1;

	private String rqheader2;

	private String rqheader3;

	private String rqheader4;

	private String rqheadervalue1;

	private String rqheadervalue2;

	private String rqheadervalue3;

	private String rqheadervalue4;

	private String uridataparam1;

	private String uridataparam2;

	private String uridataparam3;

	private String uridataparamvalue1;

	private String uridataparamvalue2;

	private String uridataparamvalue3;

	@Column(name="UUID")
	private Long uuid;

	public LisaApiResponseStub1() {
	}

	public String getApi() {
		return this.api;
	}

	public void setApi(String api) {
		this.api = api;
	}

	public String getApidomain() {
		return this.apidomain;
	}

	public void setApidomain(String apidomain) {
		this.apidomain = apidomain;
	}

	public String getBodyparam1() {
		return this.bodyparam1;
	}

	public void setBodyparam1(String bodyparam1) {
		this.bodyparam1 = bodyparam1;
	}

	public String getBodyparam2() {
		return this.bodyparam2;
	}

	public void setBodyparam2(String bodyparam2) {
		this.bodyparam2 = bodyparam2;
	}

	public String getBodyparam3() {
		return this.bodyparam3;
	}

	public void setBodyparam3(String bodyparam3) {
		this.bodyparam3 = bodyparam3;
	}

	public String getBodyparam4() {
		return this.bodyparam4;
	}

	public void setBodyparam4(String bodyparam4) {
		this.bodyparam4 = bodyparam4;
	}

	public String getBodyparamvalue1() {
		return this.bodyparamvalue1;
	}

	public void setBodyparamvalue1(String bodyparamvalue1) {
		this.bodyparamvalue1 = bodyparamvalue1;
	}

	public String getBodyparamvalue2() {
		return this.bodyparamvalue2;
	}

	public void setBodyparamvalue2(String bodyparamvalue2) {
		this.bodyparamvalue2 = bodyparamvalue2;
	}

	public String getBodyparamvalue3() {
		return this.bodyparamvalue3;
	}

	public void setBodyparamvalue3(String bodyparamvalue3) {
		this.bodyparamvalue3 = bodyparamvalue3;
	}

	public String getBodyparamvalue4() {
		return this.bodyparamvalue4;
	}

	public void setBodyparamvalue4(String bodyparamvalue4) {
		this.bodyparamvalue4 = bodyparamvalue4;
	}

	public String getJsonresponse() {
		return this.jsonresponse;
	}

	public void setJsonresponse(String jsonresponse) {
		this.jsonresponse = jsonresponse;
	}

	public String getQueryparam1() {
		return this.queryparam1;
	}

	public void setQueryparam1(String queryparam1) {
		this.queryparam1 = queryparam1;
	}

	public String getQueryparam2() {
		return this.queryparam2;
	}

	public void setQueryparam2(String queryparam2) {
		this.queryparam2 = queryparam2;
	}

	public String getQueryparam3() {
		return this.queryparam3;
	}

	public void setQueryparam3(String queryparam3) {
		this.queryparam3 = queryparam3;
	}

	public String getQueryparam4() {
		return this.queryparam4;
	}

	public void setQueryparam4(String queryparam4) {
		this.queryparam4 = queryparam4;
	}

	public String getQueryparamvalue1() {
		return this.queryparamvalue1;
	}

	public void setQueryparamvalue1(String queryparamvalue1) {
		this.queryparamvalue1 = queryparamvalue1;
	}

	public String getQueryparamvalue2() {
		return this.queryparamvalue2;
	}

	public void setQueryparamvalue2(String queryparamvalue2) {
		this.queryparamvalue2 = queryparamvalue2;
	}

	public String getQueryparamvalue3() {
		return this.queryparamvalue3;
	}

	public void setQueryparamvalue3(String queryparamvalue3) {
		this.queryparamvalue3 = queryparamvalue3;
	}

	public String getQueryparamvalue4() {
		return this.queryparamvalue4;
	}

	public void setQueryparamvalue4(String queryparamvalue4) {
		this.queryparamvalue4 = queryparamvalue4;
	}

	public String getResponsecode() {
		return this.responsecode;
	}

	public void setResponsecode(String responsecode) {
		this.responsecode = responsecode;
	}

	public String getRqheader1() {
		return this.rqheader1;
	}

	public void setRqheader1(String rqheader1) {
		this.rqheader1 = rqheader1;
	}

	public String getRqheader2() {
		return this.rqheader2;
	}

	public void setRqheader2(String rqheader2) {
		this.rqheader2 = rqheader2;
	}

	public String getRqheader3() {
		return this.rqheader3;
	}

	public void setRqheader3(String rqheader3) {
		this.rqheader3 = rqheader3;
	}

	public String getRqheader4() {
		return this.rqheader4;
	}

	public void setRqheader4(String rqheader4) {
		this.rqheader4 = rqheader4;
	}

	public String getRqheadervalue1() {
		return this.rqheadervalue1;
	}

	public void setRqheadervalue1(String rqheadervalue1) {
		this.rqheadervalue1 = rqheadervalue1;
	}

	public String getRqheadervalue2() {
		return this.rqheadervalue2;
	}

	public void setRqheadervalue2(String rqheadervalue2) {
		this.rqheadervalue2 = rqheadervalue2;
	}

	public String getRqheadervalue3() {
		return this.rqheadervalue3;
	}

	public void setRqheadervalue3(String rqheadervalue3) {
		this.rqheadervalue3 = rqheadervalue3;
	}

	public String getRqheadervalue4() {
		return this.rqheadervalue4;
	}

	public void setRqheadervalue4(String rqheadervalue4) {
		this.rqheadervalue4 = rqheadervalue4;
	}

	public String getUridataparam1() {
		return this.uridataparam1;
	}

	public void setUridataparam1(String uridataparam1) {
		this.uridataparam1 = uridataparam1;
	}

	public String getUridataparam2() {
		return this.uridataparam2;
	}

	public void setUridataparam2(String uridataparam2) {
		this.uridataparam2 = uridataparam2;
	}

	public String getUridataparam3() {
		return this.uridataparam3;
	}

	public void setUridataparam3(String uridataparam3) {
		this.uridataparam3 = uridataparam3;
	}

	public String getUridataparamvalue1() {
		return this.uridataparamvalue1;
	}

	public void setUridataparamvalue1(String uridataparamvalue1) {
		this.uridataparamvalue1 = uridataparamvalue1;
	}

	public String getUridataparamvalue2() {
		return this.uridataparamvalue2;
	}

	public void setUridataparamvalue2(String uridataparamvalue2) {
		this.uridataparamvalue2 = uridataparamvalue2;
	}

	public String getUridataparamvalue3() {
		return this.uridataparamvalue3;
	}

	public void setUridataparamvalue3(String uridataparamvalue3) {
		this.uridataparamvalue3 = uridataparamvalue3;
	}

	public Long getUuid() {
		return uuid;
	}

	

}