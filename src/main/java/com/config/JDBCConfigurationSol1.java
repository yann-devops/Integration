package com.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;

@Configuration
@PropertySource(value = {"classpath:application.properties"})
public class JDBCConfigurationSol1 {
	
    //Attributs
    
    public static String url;
    public static String user;
    public static String password;
	
    // Méthodes
    
    @Value("${jdbc.url}")
    public void setUrl(String string) {
	url = string;
    }

    
    @Value("${jdbc.user}")
    public void setUser(String string) {
	user = string;
    }
	
    
    @Value("${jdbc.password}")
    public void setPassword(String string) {
        password = string;
    } 
	
	@Bean
    public static Connection getConnection() throws SQLException{		
	    
	    String url = "jdbc:mysql://localhost:3306/projet";
            String user = "root";
            String passwd = "";
               
            Connection conn = DriverManager.getConnection(url, user, passwd);
		
		return conn;
    }
    
}
