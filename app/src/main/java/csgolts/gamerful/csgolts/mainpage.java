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
    ImageButton inferno;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);

        inferno = (ImageButton)findViewById(R.id.inferno);
        inferno.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch(v.getId()){

            case R.id.inferno:
                Intent intent = new Intent(mainpage.this,inferno.class);
                startActivity(intent);
                break;
        }
    }
}
