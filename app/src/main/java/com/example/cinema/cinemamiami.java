package com.example.cinema;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
public class cinemamiami extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cinemas);
        RecyclerView rv;
        rv= findViewById(R.id.rv_main);
        ArrayList<film> p = new ArrayList<>();
        p.add(new film( "Blackpink: The Movie"," A documentary that reviews the celebrations of the fifth anniversary of the debut of the famous K-pop group \"BLACKPINK, and the many challenges and successes that the group has experienced and achieved over the past 5 years.",R.drawable.blackpink));        p.add(new film( "Last Summer","During summer vacation in a beachside town, 16-year-old Deniz seeks the affection of his childhood crush and navigates a love triangle. ", R.drawable.lastsummer));
        p.add(new film( "Paper lives","Mehmet runs a solid waste warehouse in an impoverished Istanbul neighbourhood, where he helps everyone in need, especially homeless children and teenagers. One day, Mehmet meets a homeless 8-year-old boy who changes his life.",R.drawable.paperlives));
        p.add(new film( "JUNGLE CRUISE","Based on Disneyland's theme park ride where a small riverboat takes a group of travelers through a jungle filled with dangerous animals and reptiles but with a supernatural element.",R.drawable.jungle));
        p.add(new film( "Deep","Four insomniac medical school students are lured into a neuroscience experiment that spirals out of control -- and must find a way out before it's too late. ",R.drawable.deep));
        p.add(new film( "Blood Red Sky","When a group of terrorists hijacks an overnight transatlantic flight, a mysteriously ill woman must unleash a monstrous secret to protect her young son.",R.drawable.blood));
        p.add(new film( "Old","As a family decides to spend their vacation on a tropical island, they find themselves facing a terrifying nightmare as the island contains a mysterious power that makes people grow old every half hour. ", R.drawable.old));
        p.add(new film( "Aftermath","A young couple struggling to stay together, when they are offered an amazing deal on a home with a questionable past that would normally be beyond their means. In a final attempt to start fresh as a couple they take the deal. ",R.drawable.aftermath));
        p.add(new film( "Things Heard & Seen","After moving to a small town with her husband, a young artist begins to suspect that their home harbours some dark secrets.",R.drawable.heard));

        RecyclerAdapter adpt = new RecyclerAdapter(p,this);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        rv.setLayoutManager(lm);
        rv.setAdapter(adpt);
        rv.setHasFixedSize(true);


    }

}