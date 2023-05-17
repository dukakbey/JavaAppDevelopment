package org.sceylan.myclasses;
import org.sceylan.util.date.DateUtil;
public class GradeInfo {
    public String studentName;
    public String lessonName;
    public String[] midtermExamDate;
    String midExamDateToString()
    {
        return DateUtil.getDateString(Integer.parseInt(midtermExamDate[0]),
            Integer.parseInt(midtermExamDate[1]),Integer.parseInt(midtermExamDate[2]));
    }

    public String[] finalExamDate;
    String finalExamDateToString()
    {
        return DateUtil.getDateString(Integer.parseInt(finalExamDate[0]),
                Integer.parseInt(finalExamDate[1]),Integer.parseInt(finalExamDate[2]));
    }
    public int midtermExamScore;
    public int finalSExamcore;
    public String result()
    {
        return midtermExamScore*0.4+finalSExamcore*0.6 > 60 ? "pass" : "fail";
    }
    public void printResult()
    {
        System.out.println("---------------------------------");
        System.out.printf("Ad Soyad:%s\n",studentName);
        System.out.printf("Ders:%s\n",lessonName);
        System.out.printf("Vize Tarih:%s\n",midExamDateToString());
        System.out.printf("Final Tarih:%s\n",finalExamDateToString());
        System.out.printf("Arasinav Notu:%d\n",midtermExamScore);
        System.out.printf("Final Notu:%d\n",finalSExamcore);
        System.out.printf("Is Pass:%s\n",result());
    }

}
