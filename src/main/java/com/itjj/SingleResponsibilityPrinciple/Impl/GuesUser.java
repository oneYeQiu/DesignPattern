package com.itjj.SingleResponsibilityPrinciple.Impl;

import com.itjj.SingleResponsibilityPrinciple.IVideoUserService;

public class GuesUser implements IVideoUserService {
    @Override
    public void defination() {
        System.out.println("GuesUser 视频清晰度 [480p]");
    }

    @Override
    public void advertisement() {
        System.out.println("GuesUser 广告 [多]");
    }
}
