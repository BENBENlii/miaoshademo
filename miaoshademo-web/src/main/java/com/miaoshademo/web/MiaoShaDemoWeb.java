package com.miaoshademo.web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Hello world!
 *
 */
@SpringBootApplication(scanBasePackages = "com.miaoshademo.web")
@ImportResource(locations = {"classpath*:applicationDubbo.xml"})
public class MiaoShaDemoWeb
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );

        SpringApplication.run(MiaoShaDemoWeb.class);
    }
}
