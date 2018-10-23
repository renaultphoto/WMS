package com.ken.wms.common;


import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @Author: zhoujl
 * @Date: 2018/10/23 18:04
 * @Description:进存销系统常量
 *
 * */
public class WmsConstants {

    /**
     * 数据是否有效
     */
    @Getter
    @AllArgsConstructor
    public enum dataAliveFlag {
        /** 有效 */
        PRODUCTPRIMARYFLAG_1("是", "1"),
        /** 失效 */
        PRODUCTPRIMARYFLAG_0("否", "0");
        private String name;
        private String value;
    }

    /**
     * 物流方式
     */
    @Getter
    @AllArgsConstructor
    public enum logisticsWay{
       /* 自提*/
        ZITI("自提","1"),
        /*快递*/
        KUAIDI("快递","2");
        private String name;
        private String value;
    }
    /**
     * 支付方式
     */
    @Getter
    @AllArgsConstructor
    public enum PayWay{
        /* 自提*/
        CASH("现金","1"),
        /*快递*/
        TRANSFER("转账","2");
        private String name;
        private String value;
    }
}
