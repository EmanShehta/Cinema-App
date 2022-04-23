package com.example.cinema;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.cinema.R.drawable;

import java.util.ArrayList;
import java.util.HashMap;

public class cinemas extends AppCompatActivity {
   String [] url={"https://www.google.com/maps/dir//imax+egypt/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x14585a6a5a3643f5:0xa828fea655e33aa8?sa=X&ved=2ahUKEwixsIf16LXyAhVGA2MBHVOBCroQ9RcwE3oECE4QBA","https://www.google.com/maps/dir//almasa+cinema/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x14583e50c30bfa07:0xb334ee491896aae6?sa=X&ved=2ahUKEwiP7N673bXyAhVGzhoKHdcBA58Q9RcwE3oECEoQAw","https://www.google.com/maps/dir//imax+egypt/data=!4m6!4m5!1m1!4e2!1m2!1m1!1s0x14585a6a5a3643f5:0xa828fea655e33aa8?sa=X&ved=2ahUKEwixsIf16LXyAhVGA2MBHVOBCroQ9RcwE3oECE4QBA"};
  ArrayList<HashMap<String,String>>data;
        HashMap<String,String>map;
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cinemas2);
        RecyclerView er;
        er = findViewById(R.id.rv_main1);
        ArrayList<designfilm> p2 = new ArrayList<>();
        data = new ArrayList<>();
        for (int i=0;i<url.length;i++)
        {
            map=new HashMap<String ,String >();
            map.put("cinemas",url[i]);
            data.add(map);
        }
        p2.add(new designfilm("Vox", "- Rate:4.7", "-Almaza city center", R.drawable.vox, (float) 4.7));
        p2.add(new designfilm("Al Masah", "- Rate:4.6", "-Nasr City", drawable.almasa, (float) 4.6));
        p2.add(new designfilm("I Max", "- Rate:4.5", "-Sheikh Zayed City", R.drawable.cinema, (float) 4.5));
        p2.add(new designfilm("Point 90", "- Rate:4.5", "-New Cairo", R.drawable.c3, (float) 4.5));
        p2.add(new designfilm("Sun City", "- Rate:4.5", "-Sheration", R.drawable.suncity, (float) 4.5));
        p2.add(new designfilm("El Zamalek", "- Rate:4.4", "-Zamalek", drawable.zamalk, (float) 4.4));
        p2.add(new designfilm("Nile City", "- Rate:4.3", "-Cairo", drawable.nile, (float) 4.3));
        p2.add(new designfilm("Cheval", "- Rate:4.1", "-Tanta", drawable.cheval, (float) 4.1));
        p2.add(new designfilm("Galaxy", "- Rate:4.1", "-Cairo", drawable.glakcy, (float) 4.1));
        p2.add(new designfilm("Miami", "- Rate:3.4", "-Cairo", R.drawable.img, (float) 3.4));
        Recycler adpt = new Recycler(p2, this,data);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        er.setLayoutManager(lm);
        er.setAdapter(adpt);
        er.setHasFixedSize(true);

    }



    }

