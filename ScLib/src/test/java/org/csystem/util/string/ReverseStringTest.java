package org.csystem.util.string;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import static org.junit.Assert.*;
import org.sceylan.util.string.StringUtil;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ReverseStringTest
{
    public ReverseStringTest(StringReverseResultInfo stringReverseResultInfo_)
    {
        stringReverseResultInfo = stringReverseResultInfo_;
    }
    StringReverseResultInfo stringReverseResultInfo;
    static class StringReverseResultInfo
    {
        String txt;
        String Expected;

        public StringReverseResultInfo(String txt, String expected) {
            this.txt = txt;
            Expected = expected;
        }
    }

    @Parameterized.Parameters
    public static Collection<StringReverseResultInfo> getResultInfo()
    {
        return Arrays.asList(
                new StringReverseResultInfo("sezgin","nigzes"),
                new StringReverseResultInfo("demet","temed"),
                new StringReverseResultInfo("zeynep","penyez"),
                new StringReverseResultInfo("ecrin","nirce")


        );
    }
    @Test
    public void givenString_thenReturnReverse()
    {
        assertEquals(stringReverseResultInfo.Expected,StringUtil.reverse(stringReverseResultInfo.txt));
    }
}
