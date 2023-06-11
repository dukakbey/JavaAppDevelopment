package org.csystem.util.string;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.sceylan.util.string.StringUtil;

import java.util.Arrays;
import java.util.Collection;
import java.util.Objects;

@RunWith(Parameterized.class)
public class StringUtilGetLetterTest
{
    private ResultInfo resultInfo;
    public StringUtilGetLetterTest(ResultInfo resultInfo_)
    {
        resultInfo = resultInfo_;
    }
    @Before
    public void setup()
    {
        System.out.printf("test is begining... text:%s  expected:%s\n",resultInfo.getM_text(),resultInfo.getM_expected());
    }
    @After
    public void tearDown()
    {
        System.out.println("test has finished.");
    }
    @Parameterized.Parameters
    public static Collection<ResultInfo> provideData()
    {
        return Arrays.asList(
                new ResultInfo(1,"ankara6345746","ankara"),
                new ResultInfo(2,"demet    -*-6345746","demet"),
                new ResultInfo(3,"zeynep *-*))==    -*-6345746","zeynep")
                );
    }

    @Test
    public void givenString_whenMixedCharacters_thenReturnJustLetters()
    {
        assertEquals(resultInfo.getM_expected(),StringUtil.getLetters(resultInfo.getM_text()));
    }
}
