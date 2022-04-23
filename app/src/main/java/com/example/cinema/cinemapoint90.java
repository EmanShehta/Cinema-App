package com.example.cinema;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class cinemapoint90 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cinemas);
        RecyclerView rv2;
        rv2= findViewById(R.id.rv_main);
        ArrayList<film> p2 = new ArrayList<>();
        p2.add(new film( "Stowaway","A three-person crew on a mission to Mars faces an impossible choice when an unplanned passenger jeopardizes the lives of everyone on board",R.drawable.sto));
        p2.add(new film( "The last letter from your lover","After finding a trove of love letters from the 1960s, a journalist sets out to solve the mystery of a secret affair.",R.drawable.love));
        p2.add(new film( "Deep","Four insomniac medical school students are lured into a neuroscience experiment that spirals out of control -- and must find a way out before it's too late. ",R.drawable.deep));
        p2.add(new film( "Warth Man","When a group of terrorists hijacks an overnight transatlantic flight, a mysteriously ill woman must unleash a monstrous secret to protect her young son.",R.drawable.blood));
        p2.add(new film( "Paper lives","Mehmet runs a solid waste warehouse in an impoverished Istanbul neighbourhood, where he helps everyone in need, especially homeless children and teenagers. One day, Mehmet meets a homeless 8-year-old boy who changes his life.",R.drawable.paperlives));
        p2.add(new film( "Warth Man","When a group of terrorists hijacks an overnight transatlantic flight, a mysteriously ill woman must unleash a monstrous secret to protect her young son.",R.drawable.blood));
        p2.add(new film( "Oxygene","A woman wakes in a cryogenic chamber with no recollection of how she got there. As she's running out of oxygen, she must rebuild her memory to find a way out of her nightmare.",R.drawable.oxygene));
        p2.add(new film( "Old","As a family decides to spend their vacation on a tropical island, they find themselves facing a terrifying nightmare as the island contains a mysterious power that makes people grow old every half hour. ",R.drawable.old));
        RecyclerAdapter adpt2 = new RecyclerAdapter(p2,this);
        RecyclerView.LayoutManager lm2 = new LinearLayoutManager(this);
        rv2.setLayoutManager(lm2);
        rv2.setAdapter(adpt2);
        rv2.setHasFixedSize(true);


    }

}