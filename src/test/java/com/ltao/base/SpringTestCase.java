package com.ltao.base;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * Created by ltao on 2017/10/25.
 */
//指定bean注入的配置文件
@ContextConfiguration(locations = {"classpath:application.xml"})
//使用标准的JUnit
//@RunWith注解告诉JUnit使用SpringTestRunner
@RunWith(SpringJUnit4ClassRunner.class)
public class SpringTestCase extends AbstractJUnit4SpringContextTests {
}
