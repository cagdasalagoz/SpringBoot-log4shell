package com.cagdasalagoz.log4shell;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Log4shellApplication {

    public static void main(String[] args) {
        System.setProperty("com.sun.jndi.ldap.object.trustURLCodebase", "true");
        System.setProperty("com.sun.jndi.rmi.object.trustURLCodebase", "true");

        SpringApplication.run(Log4shellApplication.class, args);
    }

}
