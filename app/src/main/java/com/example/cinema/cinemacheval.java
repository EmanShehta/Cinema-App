package com.example.cinema;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class cinemacheval extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cinemas);
        RecyclerView rv2;

        rv2= findViewById(R.id.rv_main);
        ArrayList<film> p2 = new ArrayList<>();
        p2.add(new film( "JUNGLE CRUISE","Based on Disneyland's theme park ride where a small riverboat takes a group of travelers through a jungle filled with dangerous animals and reptiles but with a supernatural element.",R.drawable.jungle));
        p2.add(new film( "THE PROTÉGÉ","Rescued as a child by the legendary assassin Moody (Samuel L. Jackson) and trained in the family business, Anna (Maggie Q) is the world's most skilled contract killer. But when Moody - the man who was like a father to her and taught her everything she needs to know about trust and survival - is brutally killed, Anna vows revenge. As she becomes entangled with an enigmatic killer (Michael Keaton) whose attraction to her goes way beyond cat and mouse, their confrontation turns deadly and the loose ends of a life spent killing will weave themselves even tighter. ",R.drawable.protege));
        p2.add(new film( "Mousa","An engineering college student invents the first of its kind robot in the Middle East, in an attempt to avenge his father's death and achieve justice, which gets him pursued by the authorities.",R.drawable.mosa));
        p2.add(new film( "Blood Red Sky","When a group of terrorists hijacks an overnight transatlantic flight, a mysteriously ill woman must unleash a monstrous secret to protect her young son.",R.drawable.blood));
        p2.add(new film( "The kissing booth 3"," Determined to make the most of her final summer before college, Elle plans the ultimate bucket list as she navigates what comes next with Noah and Lee. ",R.drawable.kissingbooth));
        p2.add(new film( "Warth Man","Mysterious and wild-eyed, a new security guard for a cash truck surprises his co-workers when he unleashes precision skills during a heist. The crew is left wondering who he is and where he came from. Soon, the marksman's ultimate motive becomes clear as he takes dramatic and irrevocable steps to settle a score.",R.drawable.warthman));
        p2.add(new film( "Deep","Four insomniac medical school students are lured into a neuroscience experiment that spirals out of control -- and must find a way out before it's too late. ",R.drawable.deep));
        p2.add(new film( "Spiral","Working in the shadow of his father, Detective Ezekiel \"Zeke\" Banks and his rookie partner take charge of an investigation into grisly murders that are eerily reminiscent of the city's gruesome past. Unwittingly entrapped in a deepening mystery, Zeke finds himself at the center of the killer's morbid game.",R.drawable.spiral));
        RecyclerAdapter adpt2 = new RecyclerAdapter(p2,this);
        RecyclerView.LayoutManager lm2 = new LinearLayoutManager(this);
        rv2.setLayoutManager(lm2);
        rv2.setAdapter(adpt2);
        rv2.setHasFixedSize(true);


    }

}