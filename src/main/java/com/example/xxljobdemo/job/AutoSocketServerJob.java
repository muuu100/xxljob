package com.example.xxljobdemo.job;

import com.xxl.job.core.context.XxlJobHelper;
import com.xxl.job.core.handler.annotation.XxlJob;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * BEAN模式（方法形式）
 * 线程任务
 * @author mjn
 * @date 2022-5-14
 */
@Component
public class AutoSocketServerJob {


    private static ServerSocket serverSocket;

    static {
        try {
            serverSocket = new ServerSocket(9205);
            System.out.println("=====AutoSocketServerJob 9205===== ");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    @XxlJob(value = "AutoSocketServerJob")
    public void demoJobHandler() throws Exception {
        String param = XxlJobHelper.getJobParam();
        XxlJobHelper.log("=====线程任务 AutoSocketServerJob===== " + param);
        System.out.println("=====线程任务 AutoSocketServerJob===== " + param);
        XxlJobHelper.handleSuccess("执行成功");

        while(true){
            try {
                Socket socket = serverSocket.accept();
                XxlJobHelper.log("=====serverSocket.accept===== ");
                System.out.println("=====serverSocket.accept===== ");
                invoke(socket);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void invoke(final Socket socket){
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("....run....");
            }
        }).start();
    }
}
