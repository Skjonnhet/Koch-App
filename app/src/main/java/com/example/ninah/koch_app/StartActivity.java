package com.example.ninah.koch_app;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class StartActivity extends AppCompatActivity implements View.OnClickListener{

    TextView bestRecipe;
    TextView fastRecipe;
    TextView randomRecipe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_start);
        bestRecipe.findViewById(R.id.viewBestRecipe);
        fastRecipe.findViewById(R.id.viewFastRecipe);
        randomRecipe.findViewById(R.id.viewRandomRecipe);

        bestRecipe.setOnClickListener(this);
        fastRecipe.setOnClickListener(this);
        randomRecipe.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){
            case R.id.viewBestRecipe:
                Intent bestRecipeIntent = new Intent(StartActivity.this, Recipe.class);
                startActivity(bestRecipeIntent);
                break;
            case R.id.viewFastRecipe:
                Intent fastRecipeIntent = new Intent(StartActivity.this, Recipe.class);
                startActivity(fastRecipeIntent);
                break;
            case R.id.viewRandomRecipe:
                Intent randomRecipeIntent = new Intent(StartActivity.this, Recipe.class);
                startActivity(randomRecipeIntent);
                break;
            default:
                break;
        }
    }
}
