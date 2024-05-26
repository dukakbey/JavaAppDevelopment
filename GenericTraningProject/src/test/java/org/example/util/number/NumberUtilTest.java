package org.example.util.number;

import org.example.util.number.NumberUtil;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
@Ignore
public class NumberUtilTest {

    private final DataInfo dataInfo;

    public NumberUtilTest(DataInfo dataInfo) {
        this.dataInfo = dataInfo;
    }

    public static class DataInfo
    {
        long num;
        boolean expected;

        public DataInfo(long output, boolean expected) {
            this.num = output;
            this.expected = expected;
        }
    }

    @Parameterized.Parameters
    public static Collection<DataInfo> provideData()throws InterruptedException
    {
        return Arrays.asList(
                new DataInfo(2L,true),
                new DataInfo(3L,true),
                new DataInfo(7L,true),
                new DataInfo(193L,true),
                new DataInfo(197L,true),
                new DataInfo(4L,false),
                new DataInfo(192L,false),
                new DataInfo(38L,false),
                new DataInfo(69L,false),
                new DataInfo(195L,false)

        );
    }

    @Test
    public void testIsPrime()
    {
        Assert.assertEquals(NumberUtil.isPrime(dataInfo.num),dataInfo.expected);
    }
}
