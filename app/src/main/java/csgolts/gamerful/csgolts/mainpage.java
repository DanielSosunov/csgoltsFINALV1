package csgolts.gamerful.csgolts;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class mainpage extends Activity implements View.OnClickListener{
    ImageButton inferno,dust2,mirage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);

        mirage = (ImageButton) findViewById(R.id.mirage);
        inferno = (ImageButton)findViewById(R.id.inferno);
        dust2 =(ImageButton)findViewById(R.id.dust2);
        dust2.setOnClickListener(this);
        inferno.setOnClickListener(this);
        mirage.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){

            case R.id.inferno:
                Intent inferno = new Intent(mainpage.this,inferno.class);
                startActivity(inferno);
                break;
            case R.id.dust2:
                Intent dust2 = new Intent(mainpage.this,dust2.class);
                startActivity(dust2);
                break;
            case R.id.mirage:
                Intent mirage = new Intent(mainpage.this,mirage.class);
                startActivity(mirage);
                break;
        }
    }
}
