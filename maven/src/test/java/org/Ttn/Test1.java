package org.Ttn;

import org.junit.Assert;
import org.junit.Test;

public class Test1 {
@Test
    public  void testsum() {
        int result = org.Ttn.Test.sum(1,5);
        Assert.assertEquals(6,result);
    }
}
