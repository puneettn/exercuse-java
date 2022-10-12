package org.Ttn;

import org.junit.Assert;
import org.junit.Test;

public class MainTest {
    Main m=new Main();
    @Test
    public void mainMultiplyTest()
    {
        Assert.assertEquals(12,m.multiply(6,2));
    }
}
