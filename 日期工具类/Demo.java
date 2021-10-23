import java.text.ParseException;
import java.util.Date;

public class Demo {
    public static void main(String[] args) throws ParseException {

        //测试1
        Date d = new Date();
        String format1 = "yyyy年MM月dd日 HH时mm分ss秒";
        String s = DateUtils.dateToString(d,format1);
        System.out.println(s);
        Date dd = DateUtils.stringToDate(s,format1);
        System.out.println(dd);

        System.out.println("----------------");

        //测试2,换一种格式
        String ss = "2001-03-14 03:33:20";
        String format2 = "yyyy-MM-dd HH:mm:ss";
        d = DateUtils.stringToDate(ss,format2);
        System.out.println(d);

        System.out.println("----------------");

        //测试3，再换一种格式
        String format3 = "HH:mm:ss";
        //d = DateUtils.stringToDate(s,format);
        //System.out.println(d);
        // 报错，String s 的格式要与 format 一致
        String sss = DateUtils.dateToString(d,format3);
        System.out.println(sss);
    }
}