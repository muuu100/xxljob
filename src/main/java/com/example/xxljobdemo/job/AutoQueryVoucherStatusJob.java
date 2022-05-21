package com.example.xxljobdemo.job;

import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import org.springframework.stereotype.Component;

/**
 * BEAN模式（方法形式）
 * 间隔任务
 * @author mjn
 * @date 2022-5-14
 */
@Component
public class AutoQueryVoucherStatusJob {

    @XxlJob(value = "AutoQueryVoucherStatusJob")
    public void demoJobHandler() throws Exception {
        String param = XxlJobHelper.getJobParam();
        XxlJobHelper.log("=====间隔任务 AutoQueryVoucherStatusJob===== " + param);
        System.out.println("=====间隔任务 AutoQueryVoucherStatusJob===== " + param);
        XxlJobHelper.handleSuccess("执行成功");
    }
}
