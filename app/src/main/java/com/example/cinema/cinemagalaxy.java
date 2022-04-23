package com.example.cinema;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
public class cinemagalaxy extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cinemas);
        RecyclerView rv2;

        rv2= findViewById(R.id.rv_main);
        ArrayList<film> p2 = new ArrayList<>();
        p2.add(new film( "THE PROTÉGÉ","Rescued as a child by the legendary assassin Moody (Samuel L. Jackson) and trained in the family business, Anna (Maggie Q) is the world's most skilled contract killer. But when Moody - the man who was like a father to her and taught her everything she needs to know about trust and survival - is brutally killed, Anna vows revenge. As she becomes entangled with an enigmatic killer (Michael Keaton) whose attraction to her goes way beyond cat and mouse, their confrontation turns deadly and the loose ends of a life spent killing will weave themselves even tighter. ",R.drawable.protege));
        p2.add(new film( "Night House","Right after her husband's death, a widow living in the house her deceased husband built for her comes to realize her husband's dark secrets, which make a nightmare out of her life.",R.drawable.nighthouse));
        p2.add(new film( "Reminiscence","As a private investigator of an unusual kind helps his clients regain their past memories, he comes upon a grand conspiracy, as searching for loved ones becomes an obsession.",R.drawable.re));
        p2.add(new film( "Cruella","Estella is a young and clever grifter who's determined to make a name for herself in the fashion world. She soon meets a pair of thieves who appreciate her appetite for mischief, and together they build a life for themselves on the streets of London. However, when Estella befriends fashion legend Baroness von Hellman, she embraces her wicked side to become the raucous and revenge-bent Cruella. ",R.drawable.cruella));
        p2.add(new film( "Paper lives","Mehmet runs a solid waste warehouse in an impoverished Istanbul neighbourhood, where he helps everyone in need, especially homeless children and teenagers. One day, Mehmet meets a homeless 8-year-old boy who changes his life.",R.drawable.paperlives));
        p2.add(new film( "Stowaway","A three-person crew on a mission to Mars faces an impossible choice when an unplanned passenger jeopardizes the lives of everyone on board",R.drawable.sto));
        p2.add(new film( "The last letter from your lover","After finding a trove of love letters from the 1960s, a journalist sets out to solve the mystery of a secret affair.",R.drawable.love));
        p2.add(new film( "Warth Man","Mysterious and wild-eyed, a new security guard for a cash truck surprises his co-workers when he unleashes precision skills during a heist. The crew is left wondering who he is and where he came from. Soon, the marksman's ultimate motive becomes clear as he takes dramatic and irrevocable steps to settle a score.",R.drawable.warthman));
        RecyclerAdapter adpt2 = new RecyclerAdapter(p2,this);
        RecyclerView.LayoutManager lm2 = new LinearLayoutManager(this);
        rv2.setLayoutManager(lm2);
        rv2.setAdapter(adpt2);
        rv2.setHasFixedSize(true);


    }

}