package com.demo4j.framework.fly.samples;

import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.springframework.boot.test.context.SpringBootTest;

@Slf4j
@SpringBootTest
public class BaseTest {

    @Before
    public void before() {
        log.info("单元测试开始");
    }

    @After
    public void after() {
        log.info("单元测试结束");
    }
}
