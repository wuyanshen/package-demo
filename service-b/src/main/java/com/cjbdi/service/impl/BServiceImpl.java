package com.cjbdi.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.cjbdi.fw.base.service.api.service.BService;

/**
 * @description 描述
 * @date   2022-04-11 下午6:12
 * @author  wuyanshen
 */
@Service
public class BServiceImpl implements BService {

    @Override
    public String helloB() {
        return "你好B服务";
    }
}
