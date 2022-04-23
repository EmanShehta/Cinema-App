package com.example.cinema;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class cinemaimax extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cinemas);
        RecyclerView rv2;

        rv2= findViewById(R.id.rv_main);
        ArrayList<film> p2 = new ArrayList<>();
        p2.add(new film( "The little things","Deputy Sheriff Joe \"Deke\" Deacon joins forces with Sgt. Jim Baxter to search for a serial killer who's terrorizing Los Angeles. As they track the culprit, Baxter is unaware that the investigation is dredging up echoes of Deke's past, uncovering disturbing secrets that could threaten more than his case.",R.drawable.littlethings));
        p2.add(new film( "Paper lives","Mehmet runs a solid waste warehouse in an impoverished Istanbul neighbourhood, where he helps everyone in need, especially homeless children and teenagers. One day, Mehmet meets a homeless 8-year-old boy who changes his life.",R.drawable.paperlives));
        p2.add(new film( "Reminiscence","As a private investigator of an unusual kind helps his clients regain their past memories, he comes upon a grand conspiracy, as searching for loved ones becomes an obsession.",R.drawable.re));
        p2.add(new film( "Cruella","Estella is a young and clever grifter who's determined to make a name for herself in the fashion world. She soon meets a pair of thieves who appreciate her appetite for mischief, and together they build a life for themselves on the streets of London. However, when Estella befriends fashion legend Baroness von Hellman, she embraces her wicked side to become the raucous and revenge-bent Cruella. ",R.drawable.cruella));
        p2.add(new film( "JUNGLE CRUISE","Based on Disneyland's theme park ride where a small riverboat takes a group of travelers through a jungle filled with dangerous animals and reptiles but with a supernatural element.",R.drawable.jungle));
        p2.add(new film( "Aftermath","A young couple struggling to stay together, when they are offered an amazing deal on a home with a questionable past that would normally be beyond their means. In a final attempt to start fresh as a couple they take the deal. ",R.drawable.aftermath));
        p2.add(new film( "The last letter from your lover","After finding a trove of love letters from the 1960s, a journalist sets out to solve the mystery of a secret affair.",R.drawable.love));
        p2.add(new film( "Warth Man","Mysterious and wild-eyed, a new security guard for a cash truck surprises his co-workers when he unleashes precision skills during a heist. The crew is left wondering who he is and where he came from. Soon, the marksman's ultimate motive becomes clear as he takes dramatic and irrevocable steps to settle a score.",R.drawable.warthman));
        RecyclerAdapter adpt2 = new RecyclerAdapter(p2,this);
        RecyclerView.LayoutManager lm2 = new LinearLayoutManager(this);
        rv2.setLayoutManager(lm2);
        rv2.setAdapter(adpt2);
        rv2.setHasFixedSize(true);

    }

}