package com.cjbdi.service.impl;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;

import java.lang.reflect.Constructor;

/**
 * @ClassName SpringUtils
 * @Description TODO
 * @Author 风雨阳
 * @Date 2022-4-11 21:01
 * @Versin V1.0
 */

public final class SpringUtils implements BeanFactoryPostProcessor {
    //静态
    private static ConfigurableListableBeanFactory beanFactory; // Spring应用上下文环境

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory)
            throws BeansException {
        SpringUtils.beanFactory = beanFactory;
    }

    /**
     * 获取对象
     *
     * @param name
     * @return Object 一个以所给名字注册的bean的实例
     * @throws org.springframework.beans.BeansException
     *
     */
    @SuppressWarnings("unchecked")
    public static <T> T getBean(String name) throws BeansException {
        return (T) beanFactory.getBean(name);
    }


}
