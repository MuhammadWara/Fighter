package com.example.initalizing_app;

        import androidx.appcompat.app.AppCompatActivity;
        import androidx.recyclerview.widget.GridLayoutManager;
        import androidx.recyclerview.widget.RecyclerView;

        import android.os.Bundle;

        import java.util.ArrayList;
        import java.util.List;

public class MainActivity extends AppCompatActivity {

    List<Characters> Char;
    String adondis, akumadis, birdiedis,charliedis,dandis;

    RecyclerView dataList;
    RecyclerViewAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        dataList = findViewById(R.id.dataList);

        dandis = "After defeating Sagat and avenging his fallen father, Dan now wants to travel the world to prove his \"Saikyo Style\" is the best fighting style in the world! Along the way, he picks up Blanka and a rather reluctant Sakura under the guise that he will teach them his new martial arts. ";
        akumadis = "Akuma is back, and he returns wanting to seek new challenges as he waits for Ryu to reach his true potential. Akuma also sets his sights on defeating M. Bison as he believes the latter is an even greater evil. ";
        adondis = "After the self proclaimed God of Muay Thai defeated his former master Sagat in the previous game, Adon now sets his sights on Akuma, as he believes the latter's mastery of the Shun Goku Satsu will make him even more powerful. ";
        birdiedis = "Not content with working with Shadaloo as a mere goon anymore, Birdie now plans to seek out his superior M. Bison so he can overthrow him! To do this, he will need to find something called the Psycho Drive. ";
        charliedis = "Charlie was rumored to have gone AWOL after the events of Street Fighter Alpha 2, but in fact was furthering investigations of Shadaloo and their connections to military corruption, the drugs market and other criminal activities with his forces. ";


        Char = new ArrayList<>();

        Char.add(new Characters("Adon",adondis,R.drawable.adon,"Street Fighter","Khmer Ruins, Thailand", R.drawable.adongif,"Wataru Takagi "));
        Char.add(new Characters("Akuma",akumadis,R.drawable.akuma,"Street Fighter II ","Oni Fang Cave, Japan", R.drawable.akuma4,"Tomomichi Nishimura "));
        Char.add(new Characters("Birdie",birdiedis,R.drawable.birdie,"Street Fighter","Train Cemetery, England", R.drawable.birdiegif,"Wataru Takagi"));
        Char.add(new Characters("Charlie", charliedis, R.drawable.charlie, "Street Fighter ", "Frankfort Hangar, USA", R.drawable.charlie2, "Tomomichi Nishimura "));
        Char.add(new Characters("Dan", dandis, R.drawable.dan, "Super Fighter ", "Hinode Park, Japan", R.drawable.dangif, "Tomomichi Nishimura "));

        adapter = new RecyclerViewAdapter(Char, this);

        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL,false);

        dataList.setLayoutManager(gridLayoutManager);
        dataList.setAdapter(adapter);
    }


}

