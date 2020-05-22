//package com.example.wechat.controller;
//
//import com.ccbuluo.http.StatusDto;
//
//import javax.servlet.http.HttpServletRequest;
//
///**
// * 新支付
// * @author Ryze
// * @date 2019-12-10 10:42
// */
//public interface PayNewBiz {
//    /**
//     * 二维码生成
//     * @param paySerialNumber 余下单号
//     * @return com.ccbuluo.http.StatusDto<java.lang.String>
//     * @author Ryze
//     * @date 2019-12-10 10:43:07
//     */
//    StatusDto<String> QRCode(String paySerialNumber);
//
//    /**
//     * 二维码扫描
//     * @param paySerialNumber
//     * @param request
//     * @return
//     */
//    String done(String paySerialNumber, HttpServletRequest request);
//}
