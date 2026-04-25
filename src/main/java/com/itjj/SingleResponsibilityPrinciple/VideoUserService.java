package com.itjj.SingleResponsibilityPrinciple;

public class VideoUserService {

    public void serveGrade(String grade) {
        if("VipUser".equals(grade)){
            System.out.println("VipUser 视频清晰度 [1080p]");
            System.out.println("VipUser 广告 [无]");
        }else if("GuesUser".equals(grade)){
            System.out.println("GuesUser 视频清晰度 [720p]");
            System.out.println("GuesUser 广告 [有]");
        }else if("OrdinaryUser".equals(grade)){
            System.out.println("OrdinaryUser 视频清晰度 [480p]");
            System.out.println("OrdinaryUser 广告 [多]");
        }
    }

}
