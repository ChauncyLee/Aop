package com.hz.service;

/**
 * @author Chuncy
 * @version V1.0
 * @Date: 2021/4/13 16:44
 **/
public interface UsbSell {

    /**
     * 定义一个方法，参数 amount：表示一次购买的数量，暂时不用
     * 返回值表示一个u盘的价格
     * @param amount
     * @return
     */
    float sell(int amount);
}
