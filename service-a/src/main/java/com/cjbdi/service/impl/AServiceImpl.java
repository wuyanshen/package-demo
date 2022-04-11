package com.cjbdi.service.impl;

import com.cjbdi.fw.base.service.api.service.AService;
import org.springframework.stereotype.Component;

/**
 * @description 描述
 * @date   2022-04-11 下午6:12
 * @author  wuyanshen
 */
@Component
public class AServiceImpl implements AService {

    @Override
    public String helloA() {
        return "你好A服务";
    }
}
