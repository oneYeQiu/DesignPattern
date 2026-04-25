package com.itjj.SingleResponsibilityPrinciple;

import com.itjj.SingleResponsibilityPrinciple.Impl.OrdinaryUser;
import junit.framework.TestCase;
import org.junit.Test;

public class OrdinaryUserTest extends TestCase {
    @Test
    public void testDefination() {
        IVideoUserService ordinaryUser = new OrdinaryUser();
        ordinaryUser.defination();
    }

    @Test
    public void testAdvertisement() {
        IVideoUserService ordinaryUser = new OrdinaryUser();
        ordinaryUser.advertisement();
    }
}