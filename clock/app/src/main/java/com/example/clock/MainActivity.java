package com.example.clock;

import androidx.appcompat.app.AppCompatActivity;
import java.util.TimeZone;
import java.util.Locale;
import java.util.Calendar;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Button;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import android.view.View;

public class MainActivity extends AppCompatActivity {

// this code below is used to get the 24hr time for sydney

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // this code is used to to set the sydney time textview
        TextView sydneyT = findViewById(R.id.sydneyT);
        TextView tokyoT = findViewById(R.id.tokyoT);
        TextView aucklandT = findViewById(R.id.aucklandT);
        TextView saigonT = findViewById(R.id.saigonT);
        TextView shanghaiT = findViewById(R.id.shanghaiT);

        get24T();

//// this code is used to set the time for tokyo in the textview
//        TextView tokyoT = findViewById(R.id.tokyoT);
//        tokyoT.setText(tokyoTimeS);
//// this code below is used to set the time for auckland in the textview
//        TextView aucklandT = findViewById(R.id.aucklandT);
//        aucklandT.setText(aucklandTimeS);
//// this is used to set the time for saigon in the textview
//        TextView saigonT = findViewById(R.id.saigonT);
//        saigonT.setText(saigonTimeS);
//// this is used to set the time for shanghai in the textview
//        TextView shanghaiT = findViewById(R.id.shanghaiT);
//        shanghaiT.setText(shanghaiTimeS);

        ConstraintLayout activityLayout = findViewById(R.id.activityLayout);
        Button button = activityLayout.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                get12T();
                System.out.println("hello world");
            }
        });


        Button button2 = activityLayout.findViewById(R.id.button2);
        button2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {

                get24T();
                System.out.println("hello world");
            }
        });







    }


    public void get24T() {

        TextView sydneyT = findViewById(R.id.sydneyT);
        TimeZone sydney = TimeZone.getTimeZone("Australia/Sydney");
        Calendar a = Calendar.getInstance(sydney);
        final int hourA = a.get(Calendar.HOUR_OF_DAY);
        String sydneyTimeS = hourA + ":" + String.format(Locale.ENGLISH, "%02d", a.get(Calendar.MINUTE));
        sydneyT.setText(sydneyTimeS);

        TextView tokyoT = findViewById(R.id.tokyoT);
        TimeZone tokyo = TimeZone.getTimeZone("Asia/Tokyo");
        Calendar t = Calendar.getInstance(tokyo);
        final int hourT = t.get(Calendar.HOUR_OF_DAY);
        String tokyoTimeS = hourT + ":" + String.format(Locale.ENGLISH, "%02d", t.get(Calendar.MINUTE));
        tokyoT.setText(tokyoTimeS);


        TextView aucklandT = findViewById(R.id.aucklandT);
           TimeZone auckland = TimeZone.getTimeZone("Pacific/Auckland");
       Calendar u = Calendar.getInstance(auckland);
        final int hourU = u.get(Calendar.HOUR_OF_DAY);
       String aucklandTimeS = hourU + ":" + String.format(Locale.ENGLISH, "%02d", u.get(Calendar.MINUTE));
        aucklandT.setText(aucklandTimeS);


        TextView saigonT = findViewById(R.id.saigonT);
        TimeZone saigon = TimeZone.getTimeZone("Asia/Saigon");
        Calendar s = Calendar.getInstance(saigon);
        final int hourS = s.get(Calendar.HOUR_OF_DAY);
        String saigonTimeS = hourS + ":" + String.format(Locale.ENGLISH, "%02d", s.get(Calendar.MINUTE));
        saigonT.setText(saigonTimeS);


        TextView shanghaiT = findViewById(R.id.shanghaiT);
        TimeZone shanghai = TimeZone.getTimeZone("Asia/Shanghai");
        Calendar h = Calendar.getInstance(shanghai);
        final int hourH = h.get(Calendar.HOUR_OF_DAY);
        String shanghaiTimeS = hourH + ":" + String.format(Locale.ENGLISH, "%02d", h.get(Calendar.MINUTE));
        shanghaiT.setText(shanghaiTimeS);




    }

    public void get12T() {

        TextView sydneyT = findViewById(R.id.sydneyT);
        TimeZone sydney = TimeZone.getTimeZone("Australia/Sydney");
        Calendar a = Calendar.getInstance(sydney);
        String meridian = "AM";
        int hourA = a.get(Calendar.HOUR_OF_DAY);
        if(hourA > 12){
            hourA -=12;
            meridian = "PM";
        }
        String sydneyTimeS = hourA + ":" + String.format(Locale.ENGLISH, "%02d", a.get(Calendar.MINUTE)) + meridian;
        sydneyT.setText(sydneyTimeS);



        TextView tokyoT = findViewById(R.id.tokyoT);
        TimeZone tokyo = TimeZone.getTimeZone("Asia/Tokyo");
        Calendar t = Calendar.getInstance(tokyo);
        String meridian1 = "AM";
        int hourT = t.get(Calendar.HOUR_OF_DAY);
        if(hourT > 12){
            hourT -=12;
            meridian1 = "PM";
        }
        String tokyoTimeS = hourT + ":" + String.format(Locale.ENGLISH, "%02d", t.get(Calendar.MINUTE)) + meridian1;
        tokyoT.setText(tokyoTimeS);



        TextView aucklandT = findViewById(R.id.aucklandT);
        TimeZone auckland = TimeZone.getTimeZone("Pacific/Auckland");
        Calendar u = Calendar.getInstance(auckland);
        String meridian2 = "AM";
        int hourU = u.get(Calendar.HOUR_OF_DAY);
        if(hourU > 12){
            hourU -=12;
            meridian2 = "PM";
        }
        String aucklandTimeS = hourU + ":" + String.format(Locale.ENGLISH, "%02d", u.get(Calendar.MINUTE)) + meridian2;
        aucklandT.setText(aucklandTimeS);





        TextView saigonT = findViewById(R.id.saigonT);
        TimeZone saigon = TimeZone.getTimeZone("Asia/Saigon");
        Calendar s = Calendar.getInstance(saigon);
        String meridian3 = "AM";
        int hourS = s.get(Calendar.HOUR_OF_DAY);
        if(hourS > 12){
            hourS -=12;
            meridian3 = "PM";
        }
        String saigonTimeS = hourS + ":" + String.format(Locale.ENGLISH, "%02d", s.get(Calendar.MINUTE)) + meridian3;
        saigonT.setText(saigonTimeS);


        TextView shanghaiT = findViewById(R.id.shanghaiT);
        TimeZone shanghai = TimeZone.getTimeZone("Asia/Shanghai");
        Calendar h = Calendar.getInstance(shanghai);
        String meridian4 = "AM";
        int hourH = h.get(Calendar.HOUR_OF_DAY);
        if(hourH > 12){
            hourH -=12;
            meridian4 = "PM";
        }
        String shanghaiTimeS = hourH + ":" + String.format(Locale.ENGLISH, "%02d", h.get(Calendar.MINUTE)) + meridian4;
        shanghaiT.setText(shanghaiTimeS);

    }















}
