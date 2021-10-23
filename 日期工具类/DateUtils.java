import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtils {
    //构造方法私有
    private DateUtils(){}

    //成员方法静态

    //把日期转变为指定格式
    public static String dateToString(Date d,String format){

        SimpleDateFormat sdf = new SimpleDateFormat(format);
        String s = sdf.format(d);
        return s;

    }
    //把字符串解析为指定的日期
    public static Date stringToDate(String s,String format) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        Date d = new Date();
        d = sdf.parse(s);
        return d;
    }
}