package com.cjbdi.service.impl;

import com.alibaba.dubbo.config.annotation.Reference;
import com.cjbdi.fw.base.service.api.service.AService;
import com.cjbdi.fw.base.service.api.service.BService;
import org.springframework.stereotype.Service;

/**
 * @description 描述
 * @date   2022-04-11 下午6:12
 * @author  wuyanshen
 */
@Service
public class AServiceImpl implements AService {

    @Reference
    BService bService;
//    BService bService = SpringUtils.getBean("BServiceImpl");



    @Override
    public String helloA() {
        System.out.println(bService.helloB());
        return "你好A服务";
    }
}
