package com.draft;


import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

import java.lang.management.ManagementFactory;


@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        com.sun.management.OperatingSystemMXBean os = (com.sun.management.OperatingSystemMXBean)
                ManagementFactory.getOperatingSystemMXBean();

        System.out.println("availableProcessors:" + Runtime.getRuntime().availableProcessors());
        System.out.println("TotalMemorySize, mb:" + os.getTotalMemorySize() / 1024 / 1024);
        System.out.println("maxMemory, mb:" + Runtime.getRuntime().maxMemory() / 1024 / 1024);
        System.out.println("freeMemory, mb:" + Runtime.getRuntime().freeMemory() / 1024 / 1024);

        new SpringApplicationBuilder().sources(Application.class).run(args);
    }
}
