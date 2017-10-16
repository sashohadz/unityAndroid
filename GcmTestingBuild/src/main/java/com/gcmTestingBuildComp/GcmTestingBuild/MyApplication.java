package com.gcmTestingBuildComp.GcmTestingBuild;

import android.app.Application;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import com.leanplum.LeanplumActivityHelper;
import com.leanplum.LeanplumPushNotificationCustomizer;
import com.leanplum.LeanplumPushService;

/**
 * Created by sashohadzhiev on 10/16/17.
 */

public class MyApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        LeanplumPushService.setCustomizer(new LeanplumPushNotificationCustomizer() {
            @Override
            public void customize(NotificationCompat.Builder builder, Bundle notificationPayload) {
                // Setting a custom smallIcon included in the Drawable folder
                builder.setSmallIcon(R.drawable.itest);
            }
        });
        LeanplumActivityHelper.enableLifecycleCallbacks(this);
    }
}
