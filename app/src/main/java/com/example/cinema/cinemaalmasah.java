package com.example.cinema;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class cinemaalmasah extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cinemas);
        RecyclerView rv2;
        rv2= findViewById(R.id.rv_main);
        ArrayList<film> p2 = new ArrayList<>();
        p2.add(new film( "Reminiscence","As a private investigator of an unusual kind helps his clients regain their past memories, he comes upon a grand conspiracy, as searching for loved ones becomes an obsession.",R.drawable.re));
        p2.add(new film( "Aftermath","A young couple struggling to stay together, when they are offered an amazing deal on a home with a questionable past that would normally be beyond their means. In a final attempt to start fresh as a couple they take the deal. ",R.drawable.aftermath));
        p2.add(new film( "Night House","Right after her husband's death, a widow living in the house her deceased husband built for her comes to realize her husband's dark secrets, which make a nightmare out of her life.",R.drawable.nighthouse));
        p2.add(new film( "Warth Man","When a group of terrorists hijacks an overnight transatlantic flight, a mysteriously ill woman must unleash a monstrous secret to protect her young son.",R.drawable.blood));
        p2.add(new film( "Deep","Four insomniac medical school students are lured into a neuroscience experiment that spirals out of control -- and must find a way out before it's too late. ",R.drawable.deep));
        p2.add(new film( "Good on paper","After years of putting her career ahead of love, stand-up comic Andrea Singer stumbles upon the perfect guy. On paper, Dennis checks all the boxes, but Andrea's friend, Margot, is convinced he's not all he appears to be.",R.drawable.goodonpaper));
        p2.add(new film( "Spiral","Working in the shadow of his father, Detective Ezekiel \"Zeke\" Banks and his rookie partner take charge of an investigation into grisly murders that are eerily reminiscent of the city's gruesome past. Unwittingly entrapped in a deepening mystery, Zeke finds himself at the center of the killer's morbid game.",R.drawable.spiral));
        p2.add(new film( "THE PROTÉGÉ","Rescued as a child by the legendary assassin Moody (Samuel L. Jackson) and trained in the family business, Anna (Maggie Q) is the world's most skilled contract killer. But when Moody - the man who was like a father to her and taught her everything she needs to know about trust and survival - is brutally killed, Anna vows revenge. As she becomes entangled with an enigmatic killer (Michael Keaton) whose attraction to her goes way beyond cat and mouse, their confrontation turns deadly and the loose ends of a life spent killing will weave themselves even tighter. ",R.drawable.protege));

        RecyclerAdapter adpt2 = new RecyclerAdapter(p2,this);
        RecyclerView.LayoutManager lm2 = new LinearLayoutManager(this);
        rv2.setLayoutManager(lm2);
        rv2.setAdapter(adpt2);
        rv2.setHasFixedSize(true);


    }

}