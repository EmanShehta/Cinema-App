package com.example.cinema;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class cinemavox extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cinemas);
        RecyclerView rv;
        rv= findViewById(R.id.rv_main);
        ArrayList<film> p = new ArrayList<>();
        p.add(new film( "Oxygene","A woman wakes in a cryogenic chamber with no recollection of how she got there. As she's running out of oxygen, she must rebuild her memory to find a way out of her nightmare.", R.drawable.oxygene));
        p.add(new film( "Last Summer","During summer vacation in a beachside town, 16-year-old Deniz seeks the affection of his childhood crush and navigates a love triangle. ", R.drawable.lastsummer));
        p.add(new film( "Cruella","Estella is a young and clever grifter who's determined to make a name for herself in the fashion world. She soon meets a pair of thieves who appreciate her appetite for mischief, and together they build a life for themselves on the streets of London. However, when Estella befriends fashion legend Baroness von Hellman, she embraces her wicked side to become the raucous and revenge-bent Cruella. ", R.drawable.cruella));
        p.add(new film( "Warth Man","Mysterious and wild-eyed, a new security guard for a cash truck surprises his co-workers when he unleashes precision skills during a heist. The crew is left wondering who he is and where he came from. Soon, the marksman's ultimate motive becomes clear as he takes dramatic and irrevocable steps to settle a score.", R.drawable.warthman));
        p.add(new film( "Deep","Four insomniac medical school students are lured into a neuroscience experiment that spirals out of control -- and must find a way out before it's too late. ",R.drawable.deep));
        p.add(new film( "The kissing booth 3"," Determined to make the most of her final summer before college, Elle plans the ultimate bucket list as she navigates what comes next with Noah and Lee. ", R.drawable.kissingbooth));
        p.add(new film( "Old","As a family decides to spend their vacation on a tropical island, they find themselves facing a terrifying nightmare as the island contains a mysterious power that makes people grow old every half hour. ", R.drawable.old));
        p.add(new film( "The Tomorrow War"," The world is stunned when a group of time travellers arrive from the year 2051 to deliver an urgent message: thirty years in the future, mankind is losing a global war against a deadly alien species.",R.drawable.tommorw));

        RecyclerAdapter adpt = new RecyclerAdapter(p,this);
        RecyclerView.LayoutManager lm = new LinearLayoutManager(this);
        rv.setLayoutManager(lm);
        rv.setAdapter(adpt);
        rv.setHasFixedSize(true);


    }

}