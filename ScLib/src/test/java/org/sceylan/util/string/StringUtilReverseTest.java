package org.sceylan.util.string;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.*;
@RunWith(Parameterized.class)
public class StringUtilReverseTest
{
    public StringUtilReverseTest(String text, String expected) {
        this.text = text;
        this.expected = expected;
    }

    String text;
    String expected;

    @Parameterized.Parameters
    public static Collection<String[]> mylist()
    {
        return Arrays.asList(new String[][]{
                {"ankara","arakna"},
                {"scey","yecs"},
                {"sez","zes"}
                }


        );
    }

    @Test
    public void whenGivenStringReverseCharacters()
    {
        assertEquals(expected,StringUtil.reverse(text));
    }
}
