import lombok.extern.slf4j.Slf4j;

import java.time.ZonedDateTime;

/**
 * 2 * @Author: 王Sir
 * 3 * @Date: 2021/1/6 23:32
 * 4
 */
@Slf4j
public class Test {
    @org.junit.Test
    public void test1(){
        ZonedDateTime now = ZonedDateTime.now();
        log.info(""+now);
    }
}
