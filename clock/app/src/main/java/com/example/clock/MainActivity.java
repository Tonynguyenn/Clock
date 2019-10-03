package com.example.clock;

import androidx.appcompat.app.AppCompatActivity;
import java.util.TimeZone;
import java.util.Locale;
import java.util.Calendar;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

// get Sydney time


    private TextView sydneyT;
    TimeZone sydney = TimeZone.getTimeZone("Australia/Sydney");
    Calendar a = Calendar.getInstance(sydney);
    final int hourA = a.get(Calendar.HOUR_OF_DAY);
    String sydneyTimeS = hourA + ":" + String.format(Locale.ENGLISH, "%02d", a.get(Calendar.MINUTE));

    // get Tokyo
    private TextView tokyoT;
    TimeZone tokyo = TimeZone.getTimeZone("Asia/Tokyo");
    Calendar t = Calendar.getInstance(tokyo);
    final int hourT = t.get(Calendar.HOUR_OF_DAY);
    String tokyoTimeS = hourT + ":" + String.format(Locale.ENGLISH, "%02d", t.get(Calendar.MINUTE));


// Auckland time

    private TextView aucklandT;
    TimeZone auckland = TimeZone.getTimeZone("Pacific/Auckland");
    Calendar u = Calendar.getInstance(auckland);
    final int hourU = u.get(Calendar.HOUR_OF_DAY);
    String aucklandTimeS = hourU + ":" + String.format(Locale.ENGLISH, "%02d", u.get(Calendar.MINUTE));

// saigon time

    private TextView saigonT;
    TimeZone saigon = TimeZone.getTimeZone("Asia/Saigon");
    Calendar s = Calendar.getInstance(saigon);
    final int hourS = s.get(Calendar.HOUR_OF_DAY);
    String saigonTimeS = hourS + ":" + String.format(Locale.ENGLISH, "%02d", s.get(Calendar.MINUTE));

    private TextView shanghaiT;
    TimeZone shanghai = TimeZone.getTimeZone("Asia/Shanghai");
    Calendar h = Calendar.getInstance(shanghai);
    final int hourH = h.get(Calendar.HOUR_OF_DAY);
    String shanghaiTimeS = hourH + ":" + String.format(Locale.ENGLISH, "%02d", h.get(Calendar.MINUTE));


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sydneyT = findViewById(R.id.sydneyT);
        sydneyT.setText(sydneyTimeS);


        tokyoT = findViewById(R.id.tokyoT);
        tokyoT.setText(tokyoTimeS);

        aucklandT = findViewById(R.id.aucklandT);
        aucklandT.setText(aucklandTimeS);

        saigonT = findViewById(R.id.saigonT);
        saigonT.setText(saigonTimeS);

        shanghaiT = findViewById(R.id.shanghaiT);
        shanghaiT.setText(shanghaiTimeS);




    }
}
