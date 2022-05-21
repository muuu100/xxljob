package com.example.xxljobdemo.job;

import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import org.springframework.stereotype.Component;

/**
 * BEAN模式（方法形式）
 * 定时任务
 * @author mjn
 * @date 2022-5-14
 */
@Component
public class AutoQueryAccountFlowsJob {

    @XxlJob(value = "AutoQueryAccountFlowsJob")
    public void demoJobHandler() throws Exception {
        String param = XxlJobHelper.getJobParam();
        XxlJobHelper.log("=====定时任务 AutoQueryAccountFlowsJob===== " + param);
        System.out.println("=====定时任务 AutoQueryAccountFlowsJob===== " + param);
        XxlJobHelper.handleSuccess("执行成功");
    }
}
