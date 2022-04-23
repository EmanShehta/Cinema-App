package com.example.cinema;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {
    EditText username,password;
    CardView btnlogin;
    DBHelper DB;
    String user;
    @Override protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView t = findViewById(R.id.create_account);
        t.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View v) {
              //  System.out.println("Welcome To Sign Up Page");
                Intent u = new Intent(MainActivity.this, MainActivity2.class);
                startActivity(u);
            }});
        EditText email,pass;
        email = findViewById(R.id.user_name_ans);
        pass = findViewById(R.id.password_ans);
       String e= email.getText().toString();
        String p=pass.getText().toString();
        ImageView f=findViewById(R.id.imageView3);
        f.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View v) {
       Intent u = new Intent(Intent.ACTION_VIEW);
       u.setData(Uri.parse("https://web.facebook.com"));
                startActivity(u); }});
        ImageView g=findViewById(R.id.imageView4);
        g.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent u = new Intent(Intent.ACTION_VIEW);
                u.setData(Uri.parse("https://myaccount.google.com/?utm_source=sign_in_no_continue"));
                startActivity(u); }});
        password=(EditText) findViewById(R.id.password_ans);
        username=(EditText) findViewById(R.id.user_name_ans);
        btnlogin=(CardView) findViewById(R.id.card_1);
        DB=new DBHelper(this);
        btnlogin.setOnClickListener(new View.OnClickListener() {@Override public void onClick(View view) {
                 user =username.getText().toString();
                String pass=password.getText().toString();
                if(user.equals("admin@yahoo.com")||pass.equals("admain216")){
                    Intent intent = new Intent(getApplicationContext(), MainActivity3.class);
                    startActivity(intent);} else{
                    if(user.equals("")||pass.equals(""))
                        Toast.makeText(MainActivity.this, "Please Enter All Fields", Toast.LENGTH_SHORT).show();
                    else{
                        Boolean checkuserpass=DB.ceckusernamepassword(user,pass);
                        if(checkuserpass==true){
                            Toast.makeText(MainActivity.this, "Sign In Successful", Toast.LENGTH_SHORT).show();
                            Intent intent=new Intent(getApplicationContext(),MainActivity3.class);
                            startActivity(intent); } else{
                            Toast.makeText(MainActivity.this, "Invalid User name Or Password ,Please Try Again", Toast.LENGTH_SHORT).show(); }}}}});}}
