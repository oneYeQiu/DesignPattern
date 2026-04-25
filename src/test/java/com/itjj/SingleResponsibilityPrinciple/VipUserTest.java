package com.itjj.SingleResponsibilityPrinciple;

import com.itjj.SingleResponsibilityPrinciple.Impl.VipUser;
import junit.framework.TestCase;
import org.junit.Test;

public class VipUserTest extends TestCase {
    @Test
    public void testDefination() {
        IVideoUserService vipUser = new VipUser();
        vipUser.defination();
    }
    @Test
    public void testAdvertisement() {
        IVideoUserService vipUser = new VipUser();
        vipUser.advertisement();
    }
}