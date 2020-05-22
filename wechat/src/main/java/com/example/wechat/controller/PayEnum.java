//package com.example.wechat.controller;
//
//import org.apache.commons.lang.StringUtils;
//
//import javax.annotation.Nullable;
//
///**
// * 支付方式
// * @author Ryze
// * @date 2019-12-10 11:23:17
// * @version V1.0.0
// */
//public enum PayEnum {
//    WE_CHAT {
//        @Override
//        public String pay() {
//            return null;
//        }
//
//        @Override
//        public String key() {
//            return "MICROMESSENGER";
//        }
//    }, ALI_PAY {
//        @Override
//        public String pay() {
//            return null;
//        }
//
//        @Override
//        public String key() {
//            return "ALIPAYCLIENT";
//        }
//    };
//
//    public abstract String pay();
//    public abstract String key();
//    @Nullable
//    public static PayEnum payType(String userAgent){
//        if(StringUtils.isBlank(userAgent)){
//            return null;
//        }
//        String key = WE_CHAT.key();
//        return StringUtils.containsIgnoreCase(userAgent,key)?WE_CHAT:ALI_PAY;
//    }
//}
