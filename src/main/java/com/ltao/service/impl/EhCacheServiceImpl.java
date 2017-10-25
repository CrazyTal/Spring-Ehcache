package com.ltao.service.impl;

import com.ltao.service.EhCacheService;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

/**
 * Created by ltao on 2017/10/25.
 */
@Service
public class EhCacheServiceImpl implements EhCacheService {

    //测试传入两个参数时是否识别
    @Cacheable(value = "timeStr", key = "#param+#num")
    public String getTimestamp(String param, int num) {
        Long timestamp = System.currentTimeMillis();
        return timestamp.toString() + "___" + num;
    }
}
