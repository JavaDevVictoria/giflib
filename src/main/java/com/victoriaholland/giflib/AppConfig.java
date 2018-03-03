package com.victoriaholland.giflib;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by victoria on 24/02/18.
 */

@EnableAutoConfiguration
@ComponentScan
public class AppConfig {
    public static void main (String[] args) {
        SpringApplication.run(AppConfig.class, args);
    }
}
