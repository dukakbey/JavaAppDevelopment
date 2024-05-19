package org.example.util.string;

import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
@Ignore
public class TextGeneratorTest {
    private final DataInfo dataInfo;
    private static class DataInfo
    {
        int input_bound;
        int input_min;
        int output;

        public DataInfo(int input_bound, int input_min,int output) {
            this.input_bound = input_bound;
            this.input_min = input_min;
            this.output = output;
        }
    }
    public TextGeneratorTest(DataInfo dataInfo)
    {
        this.dataInfo = dataInfo;
    }

    @Parameterized.Parameters
    public static Collection<DataInfo> provideData()
    {
        return Arrays.asList(
                new DataInfo(3,1,2),
                new DataInfo(5,1,4),
                new DataInfo(6,1,5),
                new DataInfo(4,1,2)
        );
    }

    @Test
    public void testTextGenerator()
    {
        boolean condition1 = dataInfo.input_min<TextGenerator.getRandomTextTR(dataInfo.input_min,dataInfo.input_bound).length();
        boolean condition2 = TextGenerator.getRandomTextTR(dataInfo.input_min,dataInfo.input_bound).length() < dataInfo.input_bound;
        Assert.assertTrue("Test failed", condition1 && condition2);
    }
}
