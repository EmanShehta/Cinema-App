package com.example.cinema;
import android.animation.AnimatorInflater;
import android.animation.StateListAnimator;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.NumberPicker;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import java.util.Calendar;
public class MainActivity5 extends AppCompatActivity {
    NumberPicker np1, np2;
    Spinner spinner,spinner1;
    String text,text1;
    TextView g;
    int m = Calendar.getInstance().get(Calendar.MONTH) + 1;
    int y = Calendar.getInstance().get(Calendar.YEAR);
    CardView c1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5);
        np1 = findViewById(R.id.np1);
        np1.setMaxValue(30);
        np1.setMinValue(1);
        np1.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
               // Toast.makeText(getBaseContext(), "You Booked on" + newVal + "/" + m + "/" + y + "", Toast.LENGTH_SHORT).show();
            }
        });
        np2 = findViewById(R.id.np11);
        np2.setMaxValue(15);
        np2.setMinValue(1);
        np2.setOnValueChangedListener(new NumberPicker.OnValueChangeListener() {
            @Override
            public void onValueChange(NumberPicker picker, int oldVal, int newVal) {
               // Toast.makeText(getBaseContext(), "You Booked " + newVal + " " + "Chairs", Toast.LENGTH_SHORT).show();
            }
        });
        Spinner spinner = findViewById(R.id.spiner1);
        spinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                 text = parent.getItemAtPosition(position).toString();
               // Toast.makeText(getBaseContext(), "Your Show Time In" + " " + text + "", Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        Spinner spinner1 = findViewById(R.id.spiner11);
        spinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                 text1 = parent.getItemAtPosition(position).toString();
              //  Toast.makeText(getBaseContext(), "Price of a ticket" + " " + text1 + "", Toast.LENGTH_LONG).show();
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });
        c1 = findViewById(R.id.card_2);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            StateListAnimator stateListAnimator = AnimatorInflater
                    .loadStateListAnimator(this, R.drawable.animation);
            c1.setStateListAnimator(stateListAnimator);
            c1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                        int x = np1.getValue();
                        int y=np2.getValue();
                        String s=Integer.toString(x);
                      String s1=Integer.toString(y);
                    Intent u = new Intent(getBaseContext(),MainActivity6.class);
                        u.putExtra("value",s);
                        u.putExtra("value01",s1);
                        u.putExtra("value1" ,text);
                        u.putExtra("value2" ,text1);
                    startActivity(u);
                    Intent u1 = new Intent(getBaseContext(),tickit.class);
                    u1.putExtra("value",s);
                    u1.putExtra("value01",s1);
                    u1.putExtra("value1" ,text);
                    u1.putExtra("value2" ,text1);
                }
            });
        }
    }
}
