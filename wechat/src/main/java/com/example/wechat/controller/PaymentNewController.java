//package com.example.wechat.controller;
//
//import com.ccbuluo.http.StatusDto;
//import com.ccbuluo.trade.biz.PayNewBiz;
//import io.swagger.annotations.Api;
//import io.swagger.annotations.ApiImplicitParam;
//import io.swagger.annotations.ApiImplicitParams;
//import io.swagger.annotations.ApiOperation;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Controller;
//import org.springframework.validation.annotation.Validated;
//import org.springframework.web.bind.annotation.*;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.validation.constraints.NotNull;
//
///**
// * 新支付
// * @author Ryze
// * @date 2019-12-10 10:39:36
// * @version V1.0.0
// */
//@RestController
//@Api(tags = "新支付")
//@RequestMapping("/trade/paymentnew")
//@Validated
//public class PaymentNewController {
//    @Autowired
//    private PayNewBiz payNewBiz;
//
//    /**
//     * 收银台二维码生成
//     * @param paySerialNumber 流水号
//     * @return com.ccbuluo.http.StatusDto
//     * @author Ryze
//     * @date 2019-12-10 10:47:34
//     */
//    @ResponseBody
//    @ApiOperation(value = "收银台二维码生成", notes = "李福田")
//    @ApiImplicitParams({@ApiImplicitParam(name = "paySerialNumber", value = "支付流水号", paramType = "query")})
//    @GetMapping(value = "/code")
//    public StatusDto code(@NotNull(message = "支付流水不能为空") @RequestParam String paySerialNumber) {
//        return payNewBiz.QRCode(paySerialNumber);
//    }
//
//    /**
//     * 收银台二维码扫描
//     * @param paySerialNumber 流水号
//     * @return com.ccbuluo.http.StatusDto
//     * @author Ryze
//     * @date 2019-12-10 10:47:34
//     */
//    @ApiOperation(value = "收银台二维码扫描", notes = "李福田")
//    @ApiImplicitParams({@ApiImplicitParam(name = "paySerialNumber", value = "支付流水号", paramType = "query")})
//    @GetMapping(value = "/done")
//    public String done(@NotNull(message = "支付流水不能为空") @RequestParam String paySerialNumber, HttpServletRequest request) {
//        return payNewBiz.done(paySerialNumber,request);
//    }
//
//
//}
