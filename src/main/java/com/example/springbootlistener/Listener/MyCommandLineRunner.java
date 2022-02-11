package com.example.springbootlistener.Listener;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.lang.reflect.Array;
import java.util.Arrays;

/**
 * 当项目启动执行run方法
 */
@Component
public class MyCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("CommandLineRunner=======================>run方法");
        System.out.println(Arrays.asList(args));
    }
}
