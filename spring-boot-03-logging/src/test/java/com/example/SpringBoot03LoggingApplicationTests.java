package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SpringBoot03LoggingApplicationTests {

    final static Logger logger = LoggerFactory.getLogger(SpringBoot03LoggingApplicationTests.class);

    @Test
    public void contextLoads() {
        logger.trace("这是trace的包");
        logger.debug("这是debug的...");
        logger.info("这是info的...");
        logger.warn("这是warn的...");
        logger.error("这是error的...");
    }

}
