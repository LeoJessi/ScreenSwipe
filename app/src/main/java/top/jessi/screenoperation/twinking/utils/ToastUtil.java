package top.jessi.screenoperation.twinking.utils;

import android.content.Context;
import android.widget.Toast;


/**
 * Created by lcodecore on 2017/2/28.
 */

public class ToastUtil {
    public static void show(Context context,String msg){
        Toast.makeText(context, msg, Toast.LENGTH_SHORT).show();
    }
}
