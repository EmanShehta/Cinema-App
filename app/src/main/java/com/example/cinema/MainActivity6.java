package com.example.cinema;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.view.View;
import android.widget.TextView;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
public class MainActivity6 extends AppCompatActivity {
    TextView t1,t2,t3,t4,t5;
    int d = Calendar.getInstance().get(Calendar.MONTH) + 1;
    int y = Calendar.getInstance().get(Calendar.YEAR);
    @RequiresApi(api = Build.VERSION_CODES.O)
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6);
        t1 = findViewById(R.id.tw11);
        t2 = findViewById(R.id.tw22);
        //t3 = findViewById(R.id.tw33);
        t4 = findViewById(R.id.tw44);
        t5 = findViewById(R.id.tw55);
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd..HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        t1.setText(dtf.format(now));
        Intent i = getIntent();
        Bundle vl = i.getExtras();
        if (vl != null) {
            String j = (String) vl.get("value");
            String j2 = (String) vl.get("value1");
            t2.setText(j + "/" + d + "/" + y +"..."+ j2);
        }
        Intent i1 = getIntent();
        Bundle vl1 = i1.getExtras();
        if (vl1 != null) {
            String j1 = (String) vl1.get("value01");
            t5.setText(j1);
        }
            Intent i2 = getIntent();
            Bundle vl2 = i.getExtras();
            if (vl2 != null) {
                String j22 = (String) vl2.get("value2");
                t4.setText(j22);
            }
        CardView c4 = findViewById(R.id.card_2);
        c4.animate().alpha(1f).setDuration(30000).start();
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent u = new Intent(MainActivity6.this, MainActivity7.class);
                startActivity(u);
            }
        });
        }
    }



