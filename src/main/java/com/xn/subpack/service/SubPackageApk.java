package com.xn.subpack.service;

import com.leon.channel.command.Util;
import org.springframework.stereotype.Component;
import java.io.*;
import java.util.List;

@Component
public class SubPackageApk {

    public void generateChannels(String baseApkPath, List<String> channelList) {
        long startTime = System.currentTimeMillis();
        File baseApkDic = new File("/apks-oss");
        if (baseApkDic.exists()) {
            System.out.println("/apks-oss dic exits");
        } else {
            System.out.println("/apks-oss dic not exits!!");
        }

        File baseApk = new File(baseApkDic, baseApkPath);
        File outputDir = new File("/outputs-oss");

        if (baseApk.exists()) {
            System.out.println(baseApk.getAbsolutePath() + "exits");
        } else {
            System.out.println("baseApk not exits!!");
        }

        System.out.println("母包耗时：" + (System.currentTimeMillis() - startTime) + "ms");
        try {
            Util.writeChannel(baseApk, channelList, outputDir, true, true);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("总耗时：" + (System.currentTimeMillis() - startTime) + "ms");
    }
}
