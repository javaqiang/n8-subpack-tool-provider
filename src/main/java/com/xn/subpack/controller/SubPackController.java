package com.xn.subpack.controller;

import com.xn.subpack.service.SubPackageApk;
import org.apache.http.util.TextUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class SubPackController {
    @Autowired
    private SubPackageApk packageApk;

    @RequestMapping(value = "/pack/{baseApk}/{channels}", method = RequestMethod.GET)
    public String pack(@PathVariable String baseApk, @PathVariable String channels) {

        if (TextUtils.isEmpty(baseApk)) {
            System.out.println("baseApk不能为空");
            return "baseApk不能为空";
        }

        if (TextUtils.isEmpty(channels)) {
            System.out.println("渠道不能为空");
            return "渠道不能为空";
        }

        new Thread(new Runnable() {
            @Override
            public void run() {
                String[] channelArray  = channels.split(",");
                System.out.println("start build");
                List<String> channelList = Arrays.asList(channelArray);
                packageApk.generateChannels(baseApk, channelList);
                System.exit(0);
            }
        }).start();

        return channels +" pack!";
    }
}
