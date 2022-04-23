package com.example.cinema;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class cinemasuncity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cinemas);
        RecyclerView rv2;

        rv2= findViewById(R.id.rv_main);
        ArrayList<film> p2 = new ArrayList<>();
        p2.add(new film( "Fear of rain","Rain has early-onset schizophrenia, a condition that not only causes her to see vivid hallucinations, but also puts a strain on her parents. When she meets Caleb, a charmingly awkward new student at school, she finally feels she has a lifeline to normalcy. But as Rain starts to suspect that her neighbor kidnapped a child, she must soon figure out who and what is real while also battling the overwhelming forces that haunt her daily life.",R.drawable.fear));
        p2.add(new film( "The Tomorrow War"," The world is stunned when a group of time travellers arrive from the year 2051 to deliver an urgent message: thirty years in the future, mankind is losing a global war against a deadly alien species.",R.drawable.tommorw));
        p2.add(new film( "Deep","Four insomniac medical school students are lured into a neuroscience experiment that spirals out of control -- and must find a way out before it's too late. ",R.drawable.deep));
        p2.add(new film( "Warth Man","When a group of terrorists hijacks an overnight transatlantic flight, a mysteriously ill woman must unleash a monstrous secret to protect her young son.",R.drawable.blood));
        p2.add(new film( "The kissing booth 3"," Determined to make the most of her final summer before college, Elle plans the ultimate bucket list as she navigates what comes next with Noah and Lee. ",R.drawable.kissingbooth));
        p2.add(new film( "Blackpink: The Movie"," A documentary that reviews the celebrations of the fifth anniversary of the debut of the famous K-pop group \"BLACKPINK, and the many challenges and successes that the group has experienced and achieved over the past 5 years.",R.drawable.blackpink));
        p2.add(new film( "Stowaway","A three-person crew on a mission to Mars faces an impossible choice when an unplanned passenger jeopardizes the lives of everyone on board",R.drawable.sto));
        p2.add(new film( "The last letter from your lover","After finding a trove of love letters from the 1960s, a journalist sets out to solve the mystery of a secret affair.",R.drawable.love));
        RecyclerAdapter adpt2 = new RecyclerAdapter(p2,this);
        RecyclerView.LayoutManager lm2 = new LinearLayoutManager(this);
        rv2.setLayoutManager(lm2);
        rv2.setAdapter(adpt2);
        rv2.setHasFixedSize(true);


    }

}