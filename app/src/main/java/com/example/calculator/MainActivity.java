package com.example.calculator;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button bt0, bt1, bt2, bt3, bt4, bt5, bt6, bt7, bt8, bt9, btplus, btminus, btmul, btdiv, btequal, btclear, btperiod;
    EditText et1, et2, etresult;
    float num1, num2, result;
    boolean plus, minus, mul, div;
    public static final String CHANNEL_ID = "1";

    private NotificationCompat.Builder builder;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bt0 = findViewById(R.id.bt0);
        bt1 = findViewById(R.id.bt1);
        bt2 = findViewById(R.id.bt2);
        bt3 = findViewById(R.id.bt3);
        bt4 = findViewById(R.id.bt4);
        bt5 = findViewById(R.id.bt5);
        bt6 = findViewById(R.id.bt6);
        bt7 = findViewById(R.id.bt7);
        bt8 = findViewById(R.id.bt8);
        bt9 = findViewById(R.id.bt9);
        btperiod = findViewById(R.id.btperiod);
        btplus = findViewById(R.id.btplus);
        btmul = findViewById(R.id.btmul);
        btdiv = findViewById(R.id.btdiv);
        btminus = findViewById(R.id.btminus);
        btequal = findViewById(R.id.btequal);
        btclear = findViewById(R.id.btclear);

        et1 = findViewById(R.id.et1);
        et2 = findViewById(R.id.et2);
        etresult = findViewById(R.id.etresult);

        bt1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (et1.isFocused()){
                    et1.setText(et1.getText()+"1");}
                else if (et2.isFocused()){
                    et2.setText(et2.getText()+"1");
                }
            }
        });

        bt2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (et1.isFocused()){
                    et1.setText(et1.getText()+"2");}
                else if (et2.isFocused()){
                    et2.setText(et2.getText()+"2");
                }
            }
        });

        bt3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (et1.isFocused()){
                    et1.setText(et1.getText()+"3");}
                else if (et2.isFocused()){
                    et2.setText(et2.getText()+"3");
                }
            }
        });

        bt4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (et1.isFocused()){
                    et1.setText(et1.getText()+"4");}
                else if (et2.isFocused()){
                    et2.setText(et2.getText()+"4");
                }
            }
        });

        bt5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (et1.isFocused()){
                    et1.setText(et1.getText()+"5");}
                else if (et2.isFocused()){
                    et2.setText(et2.getText()+"5");
                }
            }
        });

        bt6.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (et1.isFocused()){
                    et1.setText(et1.getText()+"6");}
                else if (et2.isFocused()){
                    et2.setText(et2.getText()+"6");
                }
            }
        });

        bt7.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (et1.isFocused()){
                    et1.setText(et1.getText()+"7");}
                else if (et2.isFocused()){
                    et2.setText(et2.getText()+"7");
                }
            }
        });

        bt8.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (et1.isFocused()){
                    et1.setText(et1.getText()+"8");}
                else if (et2.isFocused()){
                    et2.setText(et2.getText()+"8");
                }
            }
        });

        bt9.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (et1.isFocused()){
                    et1.setText(et1.getText()+"9");}
                else if (et2.isFocused()){
                    et2.setText(et2.getText()+"9");
                }
            }
        });

        bt0.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (et1.isFocused()){
                    et1.setText(et1.getText()+"0");}
                else if (et2.isFocused()){
                    et2.setText(et2.getText()+"0");
                }
            }
        });

        btperiod.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (et1.isFocused()){
                    et1.setText(et1.getText()+".");}
                else if (et2.isFocused()){
                    et2.setText(et2.getText()+".");
                }
            }
        });

        btplus.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(et1.getText().toString()) || TextUtils.isEmpty(et2.getText().toString())){
                    Toast.makeText(MainActivity.this, "Please Enter a valid number",Toast.LENGTH_LONG).show();
                    et2.requestFocus();
                }
                else {
                    num1 = Float.parseFloat(et1.getText()+"");
                    num2 = Float.parseFloat((et2.getText()+""));
                    result = num1 + num2;
                    plus = true;
                    minus = false;
                    mul = false;
                    div = false;
                }
                }
            }
        );

        btmul.setOnClickListener(new View.OnClickListener(){
              @Override
              public void onClick(View view) {
                  if (TextUtils.isEmpty(et1.getText().toString()) || TextUtils.isEmpty(et2.getText().toString())){
                      Toast.makeText(MainActivity.this, "Please Enter a valid number",Toast.LENGTH_LONG).show();
                      et2.requestFocus();
                  }
                  else {
                      num1 = Float.parseFloat(et1.getText()+"");
                      num2 = Float.parseFloat((et2.getText()+""));
                      result = num1 * num2;
                      plus = false;
                      minus = false;
                      mul = true;
                      div = false;
                  }
              }
            }
        );

        btdiv.setOnClickListener(new View.OnClickListener(){
            @Override
                 public void onClick(View view) {
                     if (TextUtils.isEmpty(et1.getText().toString()) || TextUtils.isEmpty(et2.getText().toString())){
                         Toast.makeText(MainActivity.this, "Please Enter a valid number",Toast.LENGTH_LONG).show();
                         et2.requestFocus();
                     }
                     else {
                         num1 = Float.parseFloat(et1.getText()+"");
                         num2 = Float.parseFloat((et2.getText()+""));
                         if (num2 != 0){
                            result = num1 / num2;
                         }
                         else{
                             Toast.makeText(MainActivity.this, "Cannot divide by 0; Undefined",Toast.LENGTH_LONG).show();
                             et2.setError("Error!");
                         }

                         plus = false;
                         minus = false;
                         mul = false;
                         div = true;
                     }
                 }
            }
        );

        btminus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (TextUtils.isEmpty(et1.getText().toString()) || TextUtils.isEmpty(et2.getText().toString())){
                    Toast.makeText(MainActivity.this, "Please Enter a valid number",Toast.LENGTH_LONG).show();
                    et2.requestFocus();
                }
                else {
                    num1 = Float.parseFloat(et1.getText()+"");
                    num2 = Float.parseFloat((et2.getText().toString()));
                    result = num1 - num2;
                    minus = true;
                    plus = false;
                    mul = false;
                    div = false;
                }

            }
        });

        btequal.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.O)
            @Override
            public void onClick(View view) {
                if (plus == true){
                    etresult.setText(String.valueOf(result));
                    AddNotification();
                }
                if (minus == true){
                    etresult.setText(result + "");
                    AddNotification();
                }
                if (mul == true){
                    etresult.setText(result + "");
                    AddNotification();
                }
                if (div == true){
                    etresult.setText(result + "");
                    AddNotification();
                }
            }
        });

        btclear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                et1.getText().clear();
                et2.getText().clear();
                etresult.getText().clear();
            }
        });


    }

    @RequiresApi(api = Build.VERSION_CODES.O)
    private void AddNotification(){
        NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);

        NotificationChannel notificationChannel =
                new NotificationChannel(CHANNEL_ID, "channel 1", NotificationManager.IMPORTANCE_DEFAULT);

        notificationManager.createNotificationChannel(notificationChannel);

        builder = new NotificationCompat.Builder(MainActivity.this, CHANNEL_ID);
        builder.setSmallIcon(R.drawable.ic_baseline_calculate_24)
                .setContentTitle("Result")
                .setContentText("Your result is: " + etresult.getText().toString());

        Intent intent = new Intent(this, MainActivity.class);
        PendingIntent pendingIntent = PendingIntent.getActivity(this, 1, intent, PendingIntent.FLAG_UPDATE_CURRENT);
        builder.setContentIntent(pendingIntent);

        notificationManager.notify(1, builder.build());

    }
}