package csgolts.gamerful.csgolts;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class inferno extends Activity implements View.OnClickListener{
    Button one,two,three,four;
    Button easy,hard;
    ImageView current;
    TextView question;
    String mode = "none";
    Toast toast;
    int level = 1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quizlayout);

        initialCode();

    }

    public void initialCode(){
        toast = Toast.makeText(getApplicationContext(),"Correct", Toast.LENGTH_SHORT);
       toast.setGravity(Gravity.BOTTOM,0,0);

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
            case R.id.first:
                if(mode.equals("easy"))
                    if(level == 1 || level == 3 || level == 6){
                        toast.show();
                        level ++;
                        change();
                    }
                if(mode.equals("hard"))
                    if(level == 2) {
                        toast.show();
                        level++;
                        change();
                    }
                break;
            case R.id.second:
                if(mode.equals("easy"))
                    if(level == 2 || level == 7){
                        toast.show();
                        level ++;
                        change();
                    }
                if(mode.equals("hard"))
                    if(level == 1) {
                        toast.show();
                        level++;
                        change();
                    }
                break;
            case R.id.third:
                if(mode.equals("easy"))
                    if(level == 4){
                        toast.show();
                        level ++;
                        change();
                    }
                break;
            case R.id.fourth:
                if(mode.equals("easy"))
                    if(level == 8 || level == 5){
                        toast.show();
                        level ++;
                        change();
                    }
                break;


            case R.id.easy:
                cubby(); //i have to start it
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
                moto(); //i have to start it
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

    public void change(){
        if(mode.equals("easy")){
            if(level == 1)cubby();
            if(level == 2)boiler();
            if(level == 3)banana();
            if(level == 4)graveyard();
            if(level == 5)library();
            if(level == 6)spools();
            if(level == 7)tree();
            if(level == 8)arch();
            if(level == 9){
                Intent intent = new Intent(inferno.this,mainpage.class);
                startActivity(intent);
            }

        }

        if(mode.equals("hard")){
            if(level == 1)moto();
            if(level == 2)underbalcony();
            if(level == 3){
                Intent intent = new Intent(inferno.this,mainpage.class);
                startActivity(intent);
            }
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
        current.setImageResource(R.drawable.inferno_boiler);
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
    public void spools(){
        current.setImageResource(R.drawable.inferno_spools);
        setTexts("spool","top b","first spot","queen"); // 1
    }
    public void tree(){
        current.setImageResource(R.drawable.inferno_tree);
        setTexts("trap","tree","wood","headshot"); // 2
    }
    public void underbalcony(){
        current.setImageResource(R.drawable.inferno_underbalcony);
        setTexts("under balcony", "dark", "bomb spot","hidden" ); // 1
    }
}
