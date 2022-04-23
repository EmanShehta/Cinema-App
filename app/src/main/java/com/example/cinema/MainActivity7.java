package com.example.cinema;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity7 extends AppCompatActivity {
Button b; EditText e1,e2,e3,e4,e5,e6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7);
        b=findViewById(R.id.btnBuy);e1=findViewById(R.id.e1);e2=findViewById(R.id.e2);e3=findViewById(R.id.e3);
        e4=findViewById(R.id.e4);e5=findViewById(R.id.e5);e6=findViewById(R.id.e6);
        b.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                String user1 =e1.getText().toString();String user2 =e2.getText().toString();
                String user3 =e3.getText().toString();String user4 =e4.getText().toString();
                String user5 =e5.getText().toString();String user6 =e6.getText().toString();
                if (user1.equals("") || user2.equals("")|| user3.equals("") || user4.equals("") || user5.equals("") || user6.equals(""))
                    Toast.makeText(MainActivity7.this, "Please Enter This Information To Continue", Toast.LENGTH_SHORT).show();
                else  {
                    Toast.makeText(MainActivity7.this, "Confirmation Succeeded", Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(getApplicationContext(), tickit.class);
                    startActivity(intent); }}});
        Button faw = findViewById(R.id.faw);
        faw.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent u = new Intent(Intent.ACTION_VIEW);
                u.setData(Uri.parse("https://fawry.com/?lang=ar"));
                startActivity(u);
            }});
    }}