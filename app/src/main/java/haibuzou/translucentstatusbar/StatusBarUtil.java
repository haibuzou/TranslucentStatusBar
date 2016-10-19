package haibuzou.translucentstatusbar;


import android.app.Activity;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;

public class StatusBarUtil {

    public static void setStatusBarColor(Activity activity,int color){
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.KITKAT&&Build.VERSION.SDK_INT<Build.VERSION_CODES.LOLLIPOP) {
            activity.getWindow().setFlags(
                    WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS,
                    WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            View statusBar = createStatusBar(color,activity);
            ViewGroup contentView = (ViewGroup)activity.getWindow().getDecorView().findViewById(android.R.id.content);
            contentView.addView(statusBar);


        }else if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.LOLLIPOP){
            activity.getWindow().setStatusBarColor(color);
        }
    }

    private static View createStatusBar(int color,Activity activity){
        View statusBar = new View(activity);
        statusBar.setBackgroundColor(color);
        return statusBar;
    }


}
