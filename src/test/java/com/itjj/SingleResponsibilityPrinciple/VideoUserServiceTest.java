package com.itjj.SingleResponsibilityPrinciple;

import junit.framework.TestCase;
import org.junit.Test;

public class VideoUserServiceTest extends TestCase {
    @Test
    public void testServeGrade() {
        VideoUserService videoUserService = new VideoUserService();
        videoUserService.serveGrade("VipUser");
        videoUserService.serveGrade("GuesUser");
        videoUserService.serveGrade("OrdinaryUser");
    }
}