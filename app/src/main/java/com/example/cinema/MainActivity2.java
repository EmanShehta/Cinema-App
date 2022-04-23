package com.example.cinema;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity2 extends AppCompatActivity {
    EditText username,password,repassword ,email;
    CardView signup;
    DBHelper db;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        username=(EditText)  findViewById(R.id.user_name_ans);
        password=(EditText)  findViewById(R.id.password_ans);
        email=(EditText) findViewById(R.id.email_ans) ;
        repassword=(EditText)  findViewById(R.id.password_ans1);
        signup=(CardView) findViewById(R.id.card_1);
        db=new DBHelper(this);
        signup.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View View){
                String user=username.getText().toString() ;
                String pass=password.getText().toString();
                String repass=repassword.getText().toString();
                String em=email.getText().toString();
                if(user.equals("")||pass.equals("")||repass.equals(""))
                    Toast.makeText(MainActivity2.this,"Please Enter All Fields",Toast.LENGTH_SHORT).show();
                else{
                    if(pass.equals(repass)) {
                        Boolean checkuser = db.checkusername(user);
                        if (checkuser == false) {
                            Boolean insert = db.insertdata(user, pass ,em);
                            if (insert = true) {
                                Toast.makeText(MainActivity2.this, "Regestration Succeeded", Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                                startActivity(intent);
                            } else {
                                Toast.makeText(MainActivity2.this, "Regestration Failed ,Please Try Again!", Toast.LENGTH_SHORT).show();
                            } } else {
                            Toast.makeText(MainActivity2.this, "User already exist ,Please sign in", Toast.LENGTH_SHORT).show();
                        }
                    }  else{
                        Toast.makeText(MainActivity2.this, "Password Not Match", Toast.LENGTH_SHORT).show();
                    }


                }

            }
        });

    }

}