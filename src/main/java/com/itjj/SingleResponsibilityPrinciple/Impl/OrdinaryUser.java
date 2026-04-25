package com.itjj.SingleResponsibilityPrinciple.Impl;

import com.itjj.SingleResponsibilityPrinciple.IVideoUserService;

public class OrdinaryUser implements IVideoUserService {
    @Override
    public void defination() {
        System.out.println("OrdinaryUser 视频清晰度 [720p]");
    }

    @Override
    public void advertisement() {
        System.out.println("OrdinaryUser 广告 [有]");
    }
}
