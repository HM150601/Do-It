package net.penguincoders.doit;

import android.app.Notification;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.widget.EditText;
import android.widget.TextView;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import net.penguincoders.doit.R;

import java.util.Date;
import java.util.Objects;
import java.util.Random;


public class ReminderBroadcast extends BroadcastReceiver {

    @Override
    public void onReceive(final Context context, Intent intent) {
        NotificationCompat.Builder builder = new NotificationCompat.Builder(context, "notify");
        builder.setSmallIcon(R.mipmap.ic_launcher);
        builder.setContentTitle("Task management");
        builder.setContentText("You have a task");
        builder.setPriority(NotificationCompat.PRIORITY_DEFAULT);

        NotificationManagerCompat notificationManagerCompat = NotificationManagerCompat.from(context);

        notificationManagerCompat.notify(getNotificationID(), builder.build());


    }

    private int getNotificationID(){
        return (int) new Date().getTime();
    }

}
