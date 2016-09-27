/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.redkalex.pay;

/**
 *
 * 详情见: http://redkale.org
 *
 * @author zhangjx
 */
public abstract class Pays {

    //--------------------- 支付类型 -----------------------------
    //信用/虚拟支付
    public static final short PAYTYPE_CREDIT = 10;

    //银联支付
    public static final short PAYTYPE_UNION = 30;

    //微信支付
    public static final short PAYTYPE_WEIXIN = 40;

    //支付宝支付
    public static final short PAYTYPE_ALIPAY = 50;

    //--------------------- 支付渠道 -----------------------------
    //支付渠道: 10:信用/虚拟支付;30:APP支付; 40:网页支付; 50:机器支付;
    //信用/虚拟支付
    public static final short PAYWAY_CREDIT = 10;

    //APP支付
    public static final short PAYWAY_APP = 30;

    //网页支付
    public static final short PAYWAY_WEB = 40;

    //机器支付
    public static final short PAYWAY_NATIVE = 50;

    //--------------------- 支付状态 -----------------------------
    //10:待支付;20:支付中;30:已支付;40:支付失败;50:带退款;60退款中;70:已退款;80:退款失败;90:已关闭;95:已取消;
    //待支付
    public static final short PAYSTATUS_UNPAY = 10;

    //支付中
    public static final short PAYSTATUS_PAYING = 20;

    //已支付
    public static final short PAYSTATUS_PAYOK = 30;

    //支付失败
    public static final short PAYSTATUS_PAYNO = 40;

    //待退款
    public static final short PAYSTATUS_UNREFUND = 50;

    //退款中
    public static final short PAYSTATUS_REFUNDING = 60;

    //已退款
    public static final short PAYSTATUS_REFUNDOK = 70;

    //退款失败
    public static final short PAYSTATUS_REFUNDNO = 80;

    //已关闭
    public static final short PAYSTATUS_CLOSED = 90;

    //已取消
    public static final short PAYSTATUS_CANCELED = 95;

    //--------------------- 支付操作 -----------------------------
    public static final String PAYACTION_PREPAY = "prepay";

    public static final String PAYACTION_NOTIFY = "notify";

    public static final String PAYACTION_CREATE = "create";

    public static final String PAYACTION_QUERY = "query";

    public static final String PAYACTION_CLOSE = "close";

    public static final String PAYACTION_REFUND = "refund";

    public static final String PAYACTION_QUERYREFUND = "queryrefund";
}
