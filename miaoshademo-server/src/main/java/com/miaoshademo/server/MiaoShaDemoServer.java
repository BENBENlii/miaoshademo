package com.miaoshademo.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * Hello world!
 *
 */
@SpringBootApplication(scanBasePackages = "com.miaoshademo.server")
@ImportResource(locations = {"classpath*:applicationDubbo.xml"})
@MapperScan(basePackages = "com.miaoshademo.server.mapper")
public class MiaoShaDemoServer
{
    public static void main( String[] args )
    {
        SpringApplication.run(MiaoShaDemoServer.class);
    }
}
