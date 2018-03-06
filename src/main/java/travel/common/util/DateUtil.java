package travel.common.util;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 杨景
 */
public class DateUtil {

    private DateUtil (){}

    public static String formatDate(Date date){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return simpleDateFormat.format(date);
    }
}
