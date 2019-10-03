package com.example.clock;

import androidx.appcompat.app.AppCompatActivity;
import java.util.TimeZone;
import java.util.Locale;
import java.util.Calendar;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

// this code below is used to get the 24hr time for sydney


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


// this code below is used to get the 24hr time for Auckland

    private TextView aucklandT;
    TimeZone auckland = TimeZone.getTimeZone("Pacific/Auckland");
    Calendar u = Calendar.getInstance(auckland);
    final int hourU = u.get(Calendar.HOUR_OF_DAY);
    String aucklandTimeS = hourU + ":" + String.format(Locale.ENGLISH, "%02d", u.get(Calendar.MINUTE));

// this code below is used to get the 24hr time for Sauigon

    private TextView saigonT;
    TimeZone saigon = TimeZone.getTimeZone("Asia/Saigon");
    Calendar s = Calendar.getInstance(saigon);
    final int hourS = s.get(Calendar.HOUR_OF_DAY);
    String saigonTimeS = hourS + ":" + String.format(Locale.ENGLISH, "%02d", s.get(Calendar.MINUTE));
    // this code below is used to get the 24hr time for Shanghai
    private TextView shanghaiT;
    TimeZone shanghai = TimeZone.getTimeZone("Asia/Shanghai");
    Calendar h = Calendar.getInstance(shanghai);
    final int hourH = h.get(Calendar.HOUR_OF_DAY);
    String shanghaiTimeS = hourH + ":" + String.format(Locale.ENGLISH, "%02d", h.get(Calendar.MINUTE));


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // this code is used to to set the sydney time textview
        sydneyT = findViewById(R.id.sydneyT);
        sydneyT.setText(sydneyTimeS);

// this code is used to set the time for tokyo in the textview
        tokyoT = findViewById(R.id.tokyoT);
        tokyoT.setText(tokyoTimeS);
// this code below is used to set the time for auckland in the textview
        aucklandT = findViewById(R.id.aucklandT);
        aucklandT.setText(aucklandTimeS);
// this is used to set the time for saigon in the textview
        saigonT = findViewById(R.id.saigonT);
        saigonT.setText(saigonTimeS);
// this is used to set the time for shanghai in the textview
        shanghaiT = findViewById(R.id.shanghaiT);
        shanghaiT.setText(shanghaiTimeS);




    }
}
