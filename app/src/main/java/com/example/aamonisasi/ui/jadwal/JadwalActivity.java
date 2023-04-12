package com.example.aamonisasi.ui.jadwal;

import android.os.Bundle;
import android.widget.CalendarView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import com.example.aamonisasi.R;

public class JadwalActivity extends AppCompatActivity {

    CalendarView calendarView;
    TextView myDate;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_jadwal);

        calendarView = (CalendarView) findViewById(R.id.calendarView);
        myDate = (TextView) findViewById(R.id.myDate);

        calendarView.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int i, int i1, int i2) {
                String date = (i1 + 1) + "/" + i2 + "/" + i;
                myDate.setText(date);
            }
        });


    }
}
