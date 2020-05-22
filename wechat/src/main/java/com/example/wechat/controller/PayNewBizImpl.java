//package com.example.wechat.controller;
//
//import com.ccbuluo.http.StatusDto;
//import com.ccbuluo.qrcode.QRCodeUtils;
//import com.ccbuluo.trade.biz.PayNewBiz;
//import com.ccbuluo.trade.dto.PayEnum;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.stereotype.Service;
//
//import javax.servlet.http.HttpServletRequest;
//
///**
// * 新支付
// * @author Ryze
// * @date 2019-12-10 10:44
// */
//@Service
//public class PayNewBizImpl implements PayNewBiz {
//    @Value("${qrcode.url}")
//    private String urlHeader;
//
//    /**
//     * 二维码生成
//     * @param paySerialNumber 余下单号
//     * @return com.ccbuluo.http.StatusDto<java.lang.String>
//     * @author Ryze
//     * @date 2019-12-10 10:43:07
//     */
//    @Override
//    public StatusDto<String> QRCode(String paySerialNumber) {
//        return StatusDto.buildDataSuccessStatusDto(QRCodeUtils.createQrCode(urlHeader + "/pay/scan.html?paySerialNumber=" + paySerialNumber, 500));
//    }
//
//    /**
//     * 二维码扫描
//     * @param paySerialNumber 流水号
//     * @param request
//     * @return
//     */
//    @Override
//    public String done(String paySerialNumber, HttpServletRequest request) {
//        String header = request.getHeader("user-agent");
//        PayEnum payEnum = PayEnum.payType(header);
//        //判断支付方式  配置的支付方式
//        if (payEnum == null || PayEnum.ALI_PAY.equals(payEnum)) {
//
//        }
//        return urlHeader + "/pay/scan.html";
//    }
//}
