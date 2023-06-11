package org.sceylan.util.recursive;
import org.csystem.util.string.ResultInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Collection;
import static org.junit.Assert.*;

import java.util.Arrays;

@RunWith(Parameterized.class)
public class FindFactorielTest {
    private final FactorialResultInfo m_resultInfo;
    private static class FactorialResultInfo
    {
        public long number;
        public long expected;

        public FactorialResultInfo(long number, long expected) {
            this.number = number;
            this.expected = expected;
        }
    }

    public FindFactorielTest(FactorialResultInfo resultInfo)
    {
        m_resultInfo = resultInfo;
    }

    @Parameterized.Parameters
    public static Collection<FactorialResultInfo> createResultInfo()
    {
        return Arrays.asList(
                new FactorialResultInfo(1L,1L),
                new FactorialResultInfo(2L,2L),
                new FactorialResultInfo(3L,6L),
                new FactorialResultInfo(4L,24L),
                new FactorialResultInfo(5L,120L)
        );
    }
    @Test
    public void givenValue_thenReturnFactorial()
    {
        assertEquals(m_resultInfo.expected ,RecursiveUtil.findFactorial(m_resultInfo.number));
    }
}
