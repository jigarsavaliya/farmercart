package com.farmercats.com.utils;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.net.Uri;
import android.media.RingtoneManager;
import android.os.Build;

import androidx.core.app.NotificationCompat;
import androidx.core.app.NotificationManagerCompat;

import com.farmercats.com.R;
import com.farmercats.com.activities.MainActivity;


/**
 * NotificationHelper is used to create new Notifications
 **/

public class NotificationHelper {
    
    
    public static final int NOTIFICATION_REQUEST_CODE = 100;
    
    
    //*********** Used to create Notifications ********//
    
    public static void showNewNotification(Context context, Intent intent, String title, String msg, Bitmap bitmap) {

        Uri notificationSound = RingtoneManager.getDefaultUri(RingtoneManager.TYPE_NOTIFICATION);

        String CHANNEL_ID = context.getString(R.string.app_name);
        String CHANNEL_NAME = "Notification";

        Intent notificationIntent;

        if (intent != null) {
            notificationIntent = intent;
        }
        else {
            notificationIntent = new Intent(context.getApplicationContext(), MainActivity.class);
            notificationIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TOP);
        }

        PendingIntent pendingIntent = PendingIntent.getActivity(context, 0, notificationIntent, PendingIntent.FLAG_UPDATE_CURRENT| PendingIntent.FLAG_ONE_SHOT);


        // I removed one of the semi-colons in the next line of code
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);

        NotificationCompat.BigPictureStyle bigPictureStyle = new NotificationCompat.BigPictureStyle();
        bigPictureStyle.setBigContentTitle(title);
//        bigPictureStyle.setSummaryText(Html.fromHtml(newsItem.getNewsDetails()).toString());
        bigPictureStyle.bigPicture(bitmap);

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            // I would suggest that you use IMPORTANCE_DEFAULT instead of IMPORTANCE_HIGH
            NotificationChannel channel = new NotificationChannel(CHANNEL_ID, CHANNEL_NAME, NotificationManager.IMPORTANCE_HIGH);
            channel.enableVibration(true);
            channel.setLightColor(Color.BLUE);
            channel.enableLights(true);
            channel.setShowBadge(true);
            notificationManager.createNotificationChannel(channel);
        }

        NotificationCompat.Builder notificationBuilder = new NotificationCompat.Builder(context, CHANNEL_ID)
                .setContentTitle(title)
                .setContentText(msg)
                .setTicker(context.getString(R.string.app_name))
                .setSmallIcon(R.drawable.ic_logo)
                .setSound(notificationSound)
                .setLights(Color.RED, 3000, 3000)
                .setVibrate(new long[] { 1000, 1000 })
                .setWhen(System.currentTimeMillis())
                .setDefaults(Notification.DEFAULT_SOUND)
                .setAutoCancel(true)
                .setContentIntent(pendingIntent);
                        if (bitmap != null)
                            notificationBuilder.setStyle(bigPictureStyle);


        // Bitmap bitmap = getBitmapFromURL(newsItem.getNewsPrimaryMediaUrl1());

        // Don't forget to set the ChannelID!!
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            notificationBuilder.setChannelId(CHANNEL_ID);
        }

        notificationManager.notify(CHANNEL_ID, NOTIFICATION_REQUEST_CODE, notificationBuilder.build());


//        NotificationManagerCompat notificationManager = NotificationManagerCompat.from(context);
//
//
//        Notification.Builder builder = new Notification.Builder(context);
//        if (bitmap != null)
//            builder.setStyle(new Notification.BigPictureStyle().bigPicture(bitmap));
//
//
//        // Create Notification
//        Notification notification = null;
//        builder.setContentTitle(title)
//                .setContentText(msg)
//                .setTicker(context.getString(R.string.app_name))
//                .setSmallIcon(R.drawable.ic_logo)
//                .setSound(notificationSound)
//                .setLights(Color.RED, 3000, 3000)
//                .setVibrate(new long[] { 1000, 1000 })
//                .setWhen(System.currentTimeMillis())
//                .setDefaults(Notification.DEFAULT_SOUND)
//                .setAutoCancel(true)
//                .setContentIntent(pendingIntent);
//        if (android.os.Build.VERSION.SDK_INT >= android.os.Build.VERSION_CODES.O) {
//         builder.setChannelId("Notification");
//        }
//        notification =builder.build();
//
//
//        notificationManager.notify(NOTIFICATION_REQUEST_CODE, notification);
        
    }
    
    
}

