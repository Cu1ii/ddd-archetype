package com.feiniaojin.ddd.launcher;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Launcher {
    public static void main(String[] args) {
        SpringApplication.run(Launcher.class, args);
    }
}