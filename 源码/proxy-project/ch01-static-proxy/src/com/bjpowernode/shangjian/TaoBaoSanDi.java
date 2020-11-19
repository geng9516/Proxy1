package com.bjpowernode.shangjian;

import com.bjpowernode.factory.UsbKingFactory;
import com.bjpowernode.factory.UsbSanFactory;
import com.bjpowernode.service.UsbSell;

//taobao是一个商家，代理金士顿u盘的销售。
public class TaoBaoSanDi implements UsbSell {

    //声明 商家代理的厂家具体是谁
    private UsbSanFactory factory = new UsbSanFactory();

    @Override
    //实现销售u盘功能
    public float sell(int amount) {

        //向厂家发送订单，告诉厂家，我买了u盘，厂家发货
        float price = factory.sell(amount); //厂家的价格。
        //商家 需要加价， 也就是代理要增加价格。
        price = price + 25; //增强功能，代理类在完成目标类方法调用后，增强了功能。
        //在目标类的方法调用后，你做的其它功能，都是增强的意思。
        System.out.println("淘宝商家，给你返一个优惠券，或者红包");

        //增加的价格
        return price;
    }
}
