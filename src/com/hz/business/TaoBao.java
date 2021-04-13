package com.hz.business;

import com.hz.factory.UsbKingFactory;
import com.hz.service.UsbSell;

/**
 * @author Chuncy
 * @version V1.0
 * @Date: 2021/4/13 16:56
 **/
public class TaoBao implements UsbSell {
//淘宝是一个商家，代理金士顿u盘的销售
    /**
    * 声明商家代理的厂家是谁
    */
    private UsbKingFactory factory=new UsbKingFactory();



    /**
     * 定义一个方法，参数 amount：表示一次购买的数量，暂时不用
     * 返回值表示一个u盘的价格
     * @param amount
     * @return
     */
    @Override
    public float sell(int amount) {
        float price=factory.sell(amount);
        price = price + 25;
        System.out.println("淘宝再给你返回一个优惠券,或者红包");
        //        增加的价格
        return price;
    }
}
