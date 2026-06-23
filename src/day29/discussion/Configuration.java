/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package day29.discussion;

import java.util.HashMap;
import java.util.Map;


public class Configuration {
    /*
        Map can store configuration settings or environment variables where 
        configuration name is the key, and the configuration value is the value.
    */
    // databaseUrl: "jdbc:mysql://localhost:4000/dbname";
    // maxConnection: 500
    public static void main(String[] args) {
        Map<String, String> config = new HashMap<>();
        config.put("dbUrl", "jdbc:mysql://localhost:4000/dbname");
        config.put("maxConnection", "500");
        
        String databaseUrl = config.get("dbUrl");
        System.out.println("Database URL" + databaseUrl);
        
        int maxConnect = Integer.parseInt(config.get("maxConnection"));
        System.out.println("Server max connection: " + maxConnect);
    }
}
