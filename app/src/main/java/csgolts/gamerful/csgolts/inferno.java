package csgolts.gamerful.csgolts;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class inferno extends Activity implements View.OnClickListener{
    Button one,two,three,four;
    Button easy,hard;
    ImageView current;
    TextView question;
    String mode = "none";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quizlayout);

        initialCode();

    }

    public void initialCode(){
        current = (ImageView)findViewById(R.id.currentImage);
        question = (TextView)findViewById(R.id.question);
        question.setVisibility(View.GONE);

        easy = (Button)findViewById(R.id.easy);
        hard = (Button)findViewById(R.id.hard);
        one = (Button)findViewById(R.id.first);
        two = (Button)findViewById(R.id.second);
        three = (Button)findViewById(R.id.third);
        four = (Button)findViewById(R.id.fourth);

        one.setVisibility(View.GONE);
        two.setVisibility(View.GONE);
        three.setVisibility(View.GONE);
        four.setVisibility(View.GONE);

        easy.setOnClickListener(this);
        hard.setOnClickListener(this);
        one.setOnClickListener(this);
        two.setOnClickListener(this);
        three.setOnClickListener(this);
        four.setOnClickListener(this);

    }

    public void setTexts(String ones, String twos, String threes, String fours){
        one.setText(ones);
        two.setText(twos);
        three.setText(threes);
        four.setText(fours);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){



            case R.id.easy:
                easy.setVisibility(View.GONE);
                hard.setVisibility(View.GONE);
                question.setVisibility(View.VISIBLE);
                one.setVisibility(View.VISIBLE);
                two.setVisibility(View.VISIBLE);
                three.setVisibility(View.VISIBLE);
                four.setVisibility(View.VISIBLE);
                mode = "easy";
                break;
            case R.id.hard:
                easy.setVisibility(View.GONE);
                hard.setVisibility(View.GONE);
                question.setVisibility(View.VISIBLE);
                one.setVisibility(View.VISIBLE);
                two.setVisibility(View.VISIBLE);
                three.setVisibility(View.VISIBLE);
                four.setVisibility(View.VISIBLE);
                mode = "hard";
                break;
        }
    }

    public void arch(){
        current.setImageResource(R.drawable.inferno_arch);
        setTexts("90","sub","rotate","arch"); // 4
    }
    public void banana(){
        current.setImageResource(R.drawable.inferno_banana);
        setTexts("banana","b long","car strip","b ramp"); // 1
    }
    public void boiler(){
        current.setImageResource(R.drawable.inferno_banana);
        setTexts("apartments","boiler","mid hold","mid door");//2
    }
    public void cubby(){
        current.setImageResource(R.drawable.inferno_cubbyinferno);
        setTexts("cubby","arch","dark","jump spot");//1
    }
    public void graveyard(){
        current.setImageResource(R.drawable.inferno_graveyard);
        setTexts("top a","royal","graveyard","gates"); // 3
    }
    public void library(){
        current.setImageResource(R.drawable.inferno_library);
        setTexts("a connect","a room","bright room","library");//4
    }
    public void moto(){
        current.setImageResource(R.drawable.inferno_moto);
        setTexts("dark","moto","surprise","glitch");//2
    }
}
