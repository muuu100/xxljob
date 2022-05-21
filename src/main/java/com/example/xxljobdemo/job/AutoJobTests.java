package com.example.xxljobdemo.job;

import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.IJobHandler;
import com.xxl.job.core.handler.annotation.XxlJob;
import org.springframework.stereotype.Component;


/**
 * BEAN模式（方法形式）
 * @author mjn
 * @date 2022-5-14
 */
@Component
public class AutoJobTests extends IJobHandler {

    @XxlJob(value = "AutoJobTest1")
    @Override
    public void execute() throws Exception {
        System.out.println("=====AutoJobTest1===== "+ System.currentTimeMillis());
        XxlJobHelper.log("=====AutoJobTest1===== "+ System.currentTimeMillis());
    }

    @XxlJob("AutoJobTest2")
    public void AutoJobTest2() throws Exception {
        System.out.println("=====AutoJobTest2===== "+ System.currentTimeMillis());
        XxlJobHelper.log("=====AutoJobTest2====="+ System.currentTimeMillis());
    }

    @XxlJob("AutoJobTest3")
    public void AutoJobTest3() throws Exception {
        System.out.println("=====AutoJobTest3===== "+ System.currentTimeMillis());
        XxlJobHelper.log("=====AutoJobTest3====="+ System.currentTimeMillis());
    }
}