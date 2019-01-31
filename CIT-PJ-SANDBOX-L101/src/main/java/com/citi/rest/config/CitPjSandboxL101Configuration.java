package com.citi.rest.config;

import java.sql.SQLException;
import java.util.Properties;
import javax.sql.DataSource;
import javax.validation.constraints.NotNull;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import oracle.jdbc.pool.OracleDataSource;

@Configuration
@ConfigurationProperties("oracle")
public class CitPjSandboxL101Configuration {
	 @NotNull
	 private String username;
	 @NotNull
	 private String password;
     @NotNull
	 private String url;     
     @NotNull
	 private String readTimeout;
     
	public void setUsername(String username) {
        this.username = username;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setUrl(String url) {
        this.url = url;
    }	
	public String getReadTimeout() {
		return readTimeout;
	}
	public void setReadTimeout(String readTimeout) {
		this.readTimeout = readTimeout;
	}
	@Bean
	    DataSource dataSource() throws SQLException 
	{
	        OracleDataSource dataSource = new OracleDataSource();
	        dataSource.setUser(username);
	        dataSource.setPassword(password);
	        dataSource.setURL(url);
	        dataSource.setImplicitCachingEnabled(true);
	        dataSource.setFastConnectionFailoverEnabled(true);
	        Properties prop =new Properties();
			prop.put("oracle.jdbc.ReaTimeout", readTimeout);
			dataSource.setConnectionProperties(prop);
			return dataSource;
	    }	
}
