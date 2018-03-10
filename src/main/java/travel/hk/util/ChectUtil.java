package travel.hk.util;

public class ChectUtil {
    public static boolean isStringNull(String str){
        if(str==null){
            return true;
        }
        if(str.trim().length()==0){
            return true;
        }
        return false;
    }

    public static boolean isIntegerNull(Integer integer){
        if(integer==null){
            return true;
        }
        return false;
    }
}
