package com.hz.business;

/**
 * @author Chuncy
 * @version V1.0
 * @Date: 2021/4/13 17:03
 **/
public class ShopMain {
    public static void main(String[] args) {
        TaoBao taoBao=new TaoBao();
        float price = taoBao.sell(2);
        System.out.println("购买一件产品.淘宝的报价为: "+price);
    }
}
