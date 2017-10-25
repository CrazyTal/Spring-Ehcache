package com.ltao.service;

import com.ltao.base.SpringTestCase;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by ltao on 2017/10/25.
 */
public class EhCacheServiceTest extends SpringTestCase {

    @Autowired
    private EhCacheService ehCacheService;

    @Test
    public void getTimestampTest() throws InterruptedException {
        System.out.println("第一次调用：" + ehCacheService.getTimestamp("param", 1));
        Thread.sleep(2000);//单位ms
        System.out.println("2秒之后调用：" + ehCacheService.getTimestamp("param", 1));
        Thread.sleep(11000);
        System.out.println("11秒之后调用：" + ehCacheService.getTimestamp("param", 1));
    }

}
