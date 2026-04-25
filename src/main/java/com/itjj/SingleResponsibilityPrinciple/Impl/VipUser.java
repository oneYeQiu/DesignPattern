package com.itjj.SingleResponsibilityPrinciple.Impl;

import com.itjj.SingleResponsibilityPrinciple.IVideoUserService;

public class VipUser implements IVideoUserService {
    @Override
    public void defination() {
        System.out.println("VipUser 视频清晰度 [1080p]");
    }

    @Override
    public void advertisement() {
        System.out.println("VipUser 广告 [无]");
    }
}
