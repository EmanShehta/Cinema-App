package com.example.cinema;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class cinemaelzamalek extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cinemas);
        RecyclerView rv2;
        rv2= findViewById(R.id.rv_main);
        ArrayList<film> p2 = new ArrayList<>();
        p2.add(new film( "Night House","Right after her husband's death, a widow living in the house her deceased husband built for her comes to realize her husband's dark secrets, which make a nightmare out of her life.",R.drawable.nighthouse));
        p2.add(new film( "Blackpink: The Movie"," A documentary that reviews the celebrations of the fifth anniversary of the debut of the famous K-pop group \"BLACKPINK, and the many challenges and successes that the group has experienced and achieved over the past 5 years.",R.drawable.blackpink));
        p2.add(new film( "Deep","Four insomniac medical school students are lured into a neuroscience experiment that spirals out of control -- and must find a way out before it's too late. ",R.drawable.deep));
        p2.add(new film( "Spiral","Working in the shadow of his father, Detective Ezekiel \"Zeke\" Banks and his rookie partner take charge of an investigation into grisly murders that are eerily reminiscent of the city's gruesome past. Unwittingly entrapped in a deepening mystery, Zeke finds himself at the center of the killer's morbid game.",R.drawable.spiral));
        p2.add(new film( "The little things","Deputy Sheriff Joe \"Deke\" Deacon joins forces with Sgt. Jim Baxter to search for a serial killer who's terrorizing Los Angeles. As they track the culprit, Baxter is unaware that the investigation is dredging up echoes of Deke's past, uncovering disturbing secrets that could threaten more than his case.",R.drawable.littlethings));
        p2.add(new film( "Old","As a family decides to spend their vacation on a tropical island, they find themselves facing a terrifying nightmare as the island contains a mysterious power that makes people grow old every half hour. ",R.drawable.old));
        p2.add(new film( "The last letter from your lover","After finding a trove of love letters from the 1960s, a journalist sets out to solve the mystery of a secret affair.",R.drawable.love));
        p2.add(new film( "Warth Man","Mysterious and wild-eyed, a new security guard for a cash truck surprises his co-workers when he unleashes precision skills during a heist. The crew is left wondering who he is and where he came from. Soon, the marksman's ultimate motive becomes clear as he takes dramatic and irrevocable steps to settle a score.",R.drawable.warthman));
        RecyclerAdapter adpt2 = new RecyclerAdapter(p2,this);
        RecyclerView.LayoutManager lm2 = new LinearLayoutManager(this);
        rv2.setLayoutManager(lm2);
        rv2.setAdapter(adpt2);
        rv2.setHasFixedSize(true);


    }

}