package haibuzou.translucentstatusbar;


import android.app.Activity;
import android.os.Build;
import android.view.WindowManager;

public class StatusBarAdapt {

    public static void setStatusBarColor(Activity activity,int color){
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.KITKAT&&Build.VERSION.SDK_INT<Build.VERSION_CODES.LOLLIPOP) {
            activity.getWindow().setFlags(
                    WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS,
                    WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            activity.getWindow().getDecorView();


        }else if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP){
            activity.getWindow().setStatusBarColor(color);
        }
    }


}
