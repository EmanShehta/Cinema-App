package com.example.cinema;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public class cinemanilecity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cinemas);
        RecyclerView rv2;

        rv2= findViewById(R.id.rv_main);
        ArrayList<film> p2 = new ArrayList<>();
        p2.add(new film( "Without Remorse","Seeking justice for the murder of his pregnant wife, an elite Navy SEAL uncovers a covert plot that threatens to engulf the United States and Russia in an all-out war.",R.drawable.without));
        p2.add(new film( "Things Heard & Seen","After moving to a small town with her husband, a young artist begins to suspect that their home harbours some dark secrets.",R.drawable.heard));
        p2.add(new film( "Deep","Four insomniac medical school students are lured into a neuroscience experiment that spirals out of control -- and must find a way out before it's too late. ",R.drawable.deep));
        p2.add(new film( "Blood Red Sky","When a group of terrorists hijacks an overnight transatlantic flight, a mysteriously ill woman must unleash a monstrous secret to protect her young son.",R.drawable.blood));
        p2.add(new film( "THE PROTÉGÉ","Rescued as a child by the legendary assassin Moody (Samuel L. Jackson) and trained in the family business, Anna (Maggie Q) is the world's most skilled contract killer. But when Moody - the man who was like a father to her and taught her everything she needs to know about trust and survival - is brutally killed, Anna vows revenge. As she becomes entangled with an enigmatic killer (Michael Keaton) whose attraction to her goes way beyond cat and mouse, their confrontation turns deadly and the loose ends of a life spent killing will weave themselves even tighter. ",R.drawable.protege));
        p2.add(new film( "Old","As a family decides to spend their vacation on a tropical island, they find themselves facing a terrifying nightmare as the island contains a mysterious power that makes people grow old every half hour. ",R.drawable.old));
        p2.add(new film( "Paper lives","Mehmet runs a solid waste warehouse in an impoverished Istanbul neighbourhood, where he helps everyone in need, especially homeless children and teenagers. One day, Mehmet meets a homeless 8-year-old boy who changes his life.",R.drawable.paperlives));
        p2.add(new film( "JUNGLE CRUISE","Based on Disneyland's theme park ride where a small riverboat takes a group of travelers through a jungle filled with dangerous animals and reptiles but with a supernatural element.",R.drawable.jungle));
        RecyclerAdapter adpt2 = new RecyclerAdapter(p2,this);
        RecyclerView.LayoutManager lm2 = new LinearLayoutManager(this);
        rv2.setLayoutManager(lm2);
        rv2.setAdapter(adpt2);
        rv2.setHasFixedSize(true);


    }

}