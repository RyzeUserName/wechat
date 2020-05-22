package com.example.wechat.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 新支付
 * @author Ryze
 * @date 2019-12-10 10:39:36
 * @version V1.0.0
 */
@RestController
@RequestMapping("/code")
public class PaymentNewController1 {

    @GetMapping("/notice")
    public String done( @RequestParam String echostr) {
        return echostr;
    }


}
