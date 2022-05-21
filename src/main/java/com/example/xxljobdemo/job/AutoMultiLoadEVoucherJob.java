//package com.example.xxljobdemo.job;
//
//import com.xxl.job.core.biz.model.ReturnT;
//import com.xxl.job.core.handler.IJobHandler;
//import com.xxl.job.core.handler.annotation.JobHandler;
//import org.springframework.stereotype.Component;
//
//
///**
// * BEAN模式（类形式）
// * @author mjn
// * @date 2022-5-14
// */
//@JobHandler("AutoMultiLoadEVoucherJob")
//@Component
//public class AutoMultiLoadEVoucherJob extends IJobHandler {
//
//    @Override
//    public ReturnT<String> execute(String s) throws Exception {
//        System.out.println("=====AutoMultiLoadEVoucherJob===== " + s + " " + System.currentTimeMillis());
//        return null;
//    }
//}