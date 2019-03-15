package com.bj.example.demo.listener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;

public class MyApplicationStartedEventListener implements ApplicationListener<ApplicationStartedEvent> {
    //private Logger logger = LoggerFactory.getLogger(MyApplicationStartedEventListener.class);
    public void onApplicationEvent(ApplicationStartedEvent event) {
        SpringApplication app = event.getSpringApplication();
        //app.set
        System.out.println("启动事件");
      //  logger.info("==MyApplicationStartedEventListener==");
    }
}
