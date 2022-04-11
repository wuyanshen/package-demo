package com.cjbdi.controller;

import com.cjbdi.fw.base.service.api.service.AService;
import com.cjbdi.fw.base.service.api.service.BService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @description 描述
 * @date   2022-04-11 下午6:40
 * @author  wuyanshen
 */
@RequestMapping("b")
@RestController
public class BController {
    // @Autowired
    // private AService aService;

    @Autowired
    private BService bService;

    // @GetMapping("hello/a")
    // public String helloA() {
    //     return aService.helloA();
    // }

    @GetMapping("hello/b")
    public String helloB() {
        return bService.helloB();
    }
}
