package com.example.xxljobdemo.job;

import com.xxl.job.core.context.XxlJobHelper;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * BEAN模式（方法形式）
 * 定时任务
 * @author mjn
 * @date 2022-5-14
 */
@Component
public class AutoCreateDaliyJob {

    @Scheduled(cron = "0/10 * * * * ?")
    public void demoJobHandler() {
        String param = XxlJobHelper.getJobParam();
        XxlJobHelper.log("=====线程任务 AutoSocketServerJob===== " + param);
        System.out.println("=====线程任务 AutoSocketServerJob===== " + param);
        XxlJobHelper.handleSuccess("执行成功");
    }
}
