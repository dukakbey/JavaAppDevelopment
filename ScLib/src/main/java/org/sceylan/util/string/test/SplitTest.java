package org.sceylan.util.string.test;
import org.sceylan.util.string.StringUtil;
public class SplitTest {

    public static void run()
    {
        String[] str = new String[4];
        str[0] ="Alican Keçici:Evrim:29/04/2021:23/06/2022:78:97";;
        str[1] ="Baturhan Sahin:Matematik:19/07/2023:31/12/2023:79:97";
        str[2] ="Oguz Karan:Fonksiyonel Analiz:23/05/1997:26/06/1997:45:55";
        str[3] =" Bartu Çankaya:Termodinamik:15/01/2017:25/05/2017:04:21";

        for (String i:str)
        {
            StringUtil.printSplitResult(i);
        }
    }
}
