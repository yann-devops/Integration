package com.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import lombok.extern.slf4j.Slf4j;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Slf4j
@Configuration
@PropertySource(value = {"classpath:application.properties"})
public class JDBCConfigurationSol2 {
	
	public static String dbDriver;
	@Value("${jdbc.driver.class.name}")
	public void setDbDriver(String string) {
		dbDriver = string;
	}
	public static String dbConnection;
	@Value("${jdbc.connection}")
	public void setDbConnection(String string) {
		dbConnection = string;
	}
	
	// solution static, oblige à recompiler le projet pour changer les valeurs
	//private static final String DB_DRIVER = "com.mysql.jdbc.Driver";
	//private static final String DB_CONNECTION = "jdbc:mysql://127.0.0.1/api_rest?user=root&password=";

	static Connection connection = null;
	
	@Bean
    public static Connection getConnection(){		

    	try {
    	    System.out.println("Connection : "+ dbConnection);
    	    
    	    // chargement du driver (ici MySQL)
			Class.forName(dbDriver);
			
			// création de la connexion
            if(connection == null) {
                connection = DriverManager.getConnection(dbConnection);
            }
    	} catch (ClassNotFoundException e) {
    		System.out.println("Erreur pendant la récupération du driver ("+ dbDriver +")");
			e.printStackTrace();
		} catch (SQLException e1) {
			System.out.println("Erreur pendant la creation de la connexion à la BDD.");
            e1.printStackTrace();
        }
        return connection;
    }
    
}
