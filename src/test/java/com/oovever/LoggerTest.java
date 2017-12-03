package com.oovever;

import lombok.extern.java.Log;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.logging.impl.SLF4JLog;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import sun.security.jgss.GSSToken;

/**
 * @Author OovEver
 * @Date 2017/12/3 15:48
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class LoggerTest {
    @Test
    public void test1() {
        log.debug("debug...");
        log.info("info...");
        log.error("error");
    }
}
