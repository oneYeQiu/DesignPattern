package com.itjj.SingleResponsibilityPrinciple;


import com.itjj.SingleResponsibilityPrinciple.Impl.GuesUser;
import org.junit.Test;


public class GuesUserTest {
    @Test
    public void testDefination() {
        IVideoUserService guesUser = new GuesUser();
        guesUser.defination();
    }
    @Test
    public void testAdvertisement() {
        IVideoUserService guesUser = new GuesUser();
        guesUser.advertisement();
    }
}