package org.sceylan.myapps;

import org.sceylan.myclasses.GradeInfo;
import org.sceylan.util.string.StringUtil;

public class GradeInfoParser {
    public static void run()
    {
        String[] str = new String[4];
        str[0] ="Alican Keçici:Evrim:29/04/2021:23/06/2022:78:97";;
        str[1] ="Baturhan Sahin:Matematik:19/07/2023:31/12/2023:79:97";
        str[2] ="Oguz Karan:Fonksiyonel Analiz:23/05/1997:26/06/1997:45:55";
        str[3] =" Bartu Çankaya:Termodinamik:15/01/2017:25/05/2017:04:21";
        String[] words = new String[6];
        GradeInfo gradeInfo;
        for (String i:str)
        {
            words = i.split(":");
            gradeInfo = new GradeInfo();
            gradeInfo.studentName = words[0];
            gradeInfo.lessonName = words[1];
            gradeInfo.midtermExamDate = words[2].split("/");
            gradeInfo.finalExamDate = words[3].split("/");
            gradeInfo.midtermExamScore = Integer.parseInt(words[4]);
            gradeInfo.finalSExamcore = Integer.parseInt(words[5]);
            gradeInfo.printResult();
        }

    }
}
