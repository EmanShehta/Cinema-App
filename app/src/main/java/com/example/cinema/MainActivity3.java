package com.example.cinema;

import android.animation.AnimatorInflater;
import android.animation.StateListAnimator;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity3 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        CardView c1 = findViewById(R.id.cardview1);
        c1.animate().alpha(1f).setDuration(30000).start();
        c1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent u = new Intent(MainActivity3.this, cinemavox.class);
                startActivity(u);
            }
        });
        CardView c2 = findViewById(R.id.cardview2);
        c2.animate().alpha(1f).setDuration(30000).start();
        c2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent u = new Intent(MainActivity3.this, cinemaalmasah.class);
                startActivity(u);
            }
        });
        CardView c3 = findViewById(R.id.cardview3);
        c3.animate().alpha(1f).setDuration(30000).start();
        c3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent u = new Intent(MainActivity3.this, cinemaimax.class);
                startActivity(u);
            }
        });
        CardView c4 = findViewById(R.id.cardview4);
        c4.animate().alpha(1f).setDuration(30000).start();
        c4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent u = new Intent(MainActivity3.this, cinemapoint90.class);
                startActivity(u);
            }
        });
        CardView c5 = findViewById(R.id.cardview5);
        c5.animate().alpha(1f).setDuration(30000).start();
        c5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent u = new Intent(MainActivity3.this, cinemasuncity.class);
                startActivity(u);
            }
        });
        CardView c6 = findViewById(R.id.cardview6);
        c6.animate().alpha(1f).setDuration(30000).start();
        c6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent u = new Intent(MainActivity3.this, cinemaelzamalek.class);
                startActivity(u);
            }
        });
        CardView c7 = findViewById(R.id.cardview7);
        c7.animate().alpha(1f).setDuration(30000).start();
        c7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent u = new Intent(MainActivity3.this, cinemanilecity.class);
                startActivity(u);
            }
        });
        CardView c8 = findViewById(R.id.cardview8);
        c8.animate().alpha(1f).setDuration(30000).start();
        c8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent u = new Intent(MainActivity3.this, cinemacheval.class);
                startActivity(u);
            }
        });
        CardView c9 = findViewById(R.id.cardview9);
        c9.animate().alpha(1f).setDuration(30000).start();
        c9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent u = new Intent(MainActivity3.this, cinemagalaxy.class);
                startActivity(u);
            }
        });
        CardView c10 = findViewById(R.id.cardview10);
        c10.animate().alpha(1f).setDuration(30000).start();
        c10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent u = new Intent(MainActivity3.this, cinemamiami.class);
                startActivity(u);
            }
        });
        Button f = findViewById(R.id.map_max39);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            StateListAnimator stateListAnimator = AnimatorInflater
                    .loadStateListAnimator(this, R.drawable.animation);
            f.setStateListAnimator(stateListAnimator);
            f.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent u = new Intent(Intent.ACTION_VIEW);

                    u.setData(Uri.parse("https://www.google.com/maps/dir/30.2293297,31.3203071/vox/@30.1545552,31.4464816,12z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x14583d0c045dab79:0x5ead4da702f5488e!2m2!1d31.3630643!2d30.0818484"));
                    startActivity(u);
                }
            });
            Button f1 = findViewById(R.id.map_max3);
            f1.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent u = new Intent(Intent.ACTION_VIEW);
                    u.setData(Uri.parse("https://www.google.com/maps/dir//almasa+cinema/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x14583e50c30bfa07:0xb334ee491896aae6?sa=X&ved=2ahUKEwiP7N673bXyAhVGzhoKHdcBA58Q9RcwE3oECEoQAw"));
                    startActivity(u);
                }
            });

            Button f2 = findViewById(R.id.map_max);
            f2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent u = new Intent(Intent.ACTION_VIEW);
                    u.setData(Uri.parse("https://www.google.com/maps/dir//imax+egypt/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x14585a6a5a3643f5:0xa828fea655e33aa8?sa=X&ved=2ahUKEwixsIf16LXyAhVGA2MBHVOBCroQ9RcwE3oECE4QBA"));
                    startActivity(u);
                }
            });
            Button f3 = findViewById(R.id.map_max4);
            f3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent u = new Intent(Intent.ACTION_VIEW);
                    u.setData(Uri.parse("https://www.google.com/maps/dir//imax+egypt/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x14585a6a5a3643f5:0xa828fea655e33aa8?sa=X&ved=2ahUKEwixsIf16LXyAhVGA2MBHVOBCroQ9RcwE3oECE4QBA"));
                    startActivity(u);
                }
            });
            Button f4 = findViewById(R.id.map_max5);
            f4.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent u = new Intent(Intent.ACTION_VIEW);
                    u.setData(Uri.parse("https://www.google.com/maps/dir/30.223276,31.3470711/zamalek+cinema/@30.1447534,31.4506657,11z/data=!3m1!4b1!4m9!4m8!1m1!4e1!1m5!1m1!1s0x145840e1afe56fab:0xe133971743d0f4ec!2m2!1d31.21901!2d30.0617317"));
                    startActivity(u);
                }
            });
            Button f5 = findViewById(R.id.map_max6);
            f5.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent u = new Intent(Intent.ACTION_VIEW);
                    u.setData(Uri.parse("https://www.google.com/maps/dir/30.2232734,31.347004/%D8%B3%D9%8A%D9%86%D9%85%D8%A7+%D8%B5%D9%86+%D8%B3%D9%8A%D8%AA%D9%8A%E2%80%AD%E2%80%AD/@30.1537546,31.4799015,11.55z/data=!4m9!4m8!1m1!4e1!1m5!1m1!1s0x14581645d9293687:0x28ddad67ad9edc31!2m2!1d31.3855469!2d30.1021165"));
                    startActivity(u);
                }
            });
            Button f6 = findViewById(R.id.map_max7);
            f6.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent u = new Intent(Intent.ACTION_VIEW);
                    u.setData(Uri.parse("https://www.google.com/maps/dir//galaxy+cinemas/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x14584722289602e1:0xe95c710a300e2aa0?sa=X&hl=ar&ved=2ahUKEwiS2JjUlbjyAhWD0eAKHbEEBxUQ9RcwFHoECEoQBA"));
                    startActivity(u);
                }
            });
            Button f7 = findViewById(R.id.map_max93);
            f7.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent u = new Intent(Intent.ACTION_VIEW);
                    u.setData(Uri.parse("https://www.google.com/maps/dir//galaxy+cinemas/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x14584722289602e1:0xe95c710a300e2aa0?sa=X&hl=ar&ved=2ahUKEwiS2JjUlbjyAhWD0eAKHbEEBxUQ9RcwFHoECEoQBA"));
                    startActivity(u);
                }
            });
            Button f8 = findViewById(R.id.map_max1);
            f8.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent u = new Intent(Intent.ACTION_VIEW);
                    u.setData(Uri.parse("https://www.google.com/maps?q=%D8%AC%D9%8A%D9%81%D8%A7%D9%84+%D8%B7%D9%86%D8%B7%D8%A7&gs_lcp=Cgdnd3Mtd2l6EAEYADIECAAQQzIICC4QgAQQsQMyCAguEIAEELEDMggILhCABBCxAzIKCC4QxwEQrwEQQzIFCC4QgAQyBQguEIAEMgUIABCABDIFCC4QgAQyCwguEIAEEMcBENEDOhQILhCABBCxAxCDARDHARDRAxCTAjoICAAQsQMQgwE6CwgAEIAEELEDEIMBOggIABCABBCxAzoICC4QsQMQgwE6BAguEEM6CwguEIAEEMcBEK8BOgQIABAKOgQILhAKOgcILhCABBAKSgQIQRgBUKsUWKVAYPJPaAZwAHgDgAGCAYgBogiSAQM0LjaYAQCgAQGwAQDAAQE&um=1&ie=UTF-8&sa=X&ved=2ahUKEwitiMesp7jyAhUDHxoKHZuHB90Q_AUoAXoECAEQAw"));
                    startActivity(u);
                }
            });
            Button f9 = findViewById(R.id.map_max9);
            f9.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent u = new Intent(Intent.ACTION_VIEW);
                    u.setData(Uri.parse("https://www.google.com/maps/place/%D8%B3%D9%8A%D9%86%D9%85%D8%A7+%D9%85%D9%8A%D8%A7%D9%85%D9%89%E2%80%AD/@30.0490108,31.2435533,15.32z/data=!4m5!3m4!1s0x145840bf948d0bab:0xfc6ac989636d7cf3!8m2!3d30.0513418!4d31.2407807"));
                    startActivity(u);
                }
            });
        }
    }
}