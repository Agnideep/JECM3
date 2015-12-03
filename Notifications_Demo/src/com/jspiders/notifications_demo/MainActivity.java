package com.jspiders.notifications_demo;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.os.Bundle;
import android.support.v4.app.NotificationCompat;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class MainActivity extends Activity {

	Button notifybutton;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		notifybutton = (Button) findViewById(R.id.buttonnotify);
		
		notifybutton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View arg0) 
			{
                 	NotificationCompat.Builder builder	= new NotificationCompat.Builder(MainActivity.this);
                 	builder.setContentTitle("This is my notification");
                 	builder.setContentText("New Notification");
                 	builder.setSmallIcon(R.drawable.ic_launcher);
               
                 	Notification notification = builder.build();
                 	
                 	
                NotificationManager manager = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
                manager.notify(1, notification);
          
			}
			
		});
		
		
	}


}
