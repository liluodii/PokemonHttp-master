package com.example.pokemonhttp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

public class PokeDisp extends AppCompatActivity {
    ImageView img_poke;
    TextView txt_name,txt_type,txt_ability,txt_height,txt_weight,txt_des;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_poke_disp);

        img_poke=findViewById(R.id.desc_img);
        txt_name=findViewById(R.id.desc_name);
        txt_type=findViewById(R.id.desc_type);
        txt_ability=findViewById(R.id.desc_ability);
        txt_height=findViewById(R.id.desc_height);
        txt_weight=findViewById(R.id.desc_weight);
        txt_des=findViewById(R.id.desc_discription);


        Intent i=getIntent();
        Pokemon pokemon=i.getParcelableExtra("data");

        Picasso.get().load(pokemon.getImage()).into((img_poke));

        txt_name.setText(pokemon.getName());
        txt_type.setText((pokemon.getType()));
        txt_ability.setText(pokemon.getAbility());
        txt_height.setText(pokemon.getHeight());
        txt_weight.setText(pokemon.getWeight());
        txt_des.setText(pokemon.getDesc());
        txt_des.setMovementMethod(new ScrollingMovementMethod());


    }
}
