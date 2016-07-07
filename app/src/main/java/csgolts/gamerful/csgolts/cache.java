package csgolts.gamerful.csgolts;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class cache extends Activity implements View.OnClickListener{
    Button one,two,three,four;
    Button easy,hard;
    ImageView current;
    TextView question;
    String mode = "none";
    Toast toast;
    int level = 1;
    MediaPlayer correct,wrong;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.quizlayout);
        correct = MediaPlayer.create(this,R.raw.correct);
        wrong = MediaPlayer.create(this,R.raw.wrong);
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
                    if(level == 1 || level == 3 || level == 6||level==7||level==8||level==9){
                        toast.show();
                        level ++;
                        change();
                        correct.start();
                    }
                    else wrong.start();
                if(mode.equals("hard"))
                    if(level == 2) {
                        toast.show();
                        level++;
                        change();
                        correct.start();
                    }
                    else wrong.start();
                break;
            case R.id.second:
                if(mode.equals("easy"))
                    if(level == 2 || level == 8 || level==7){
                        toast.show();
                        level ++;
                        change();
                        correct.start();
                    }
                    else wrong.start();
                if(mode.equals("hard"))
                    if(level == 1) {
                        toast.show();
                        level++;
                        change();
                        correct.start();
                    }
                    else wrong.start();
                break;
            case R.id.third:
                if(mode.equals("easy"))
                    if(level ==5 ||level == 7 ||level ==8){
                        toast.show();
                        level ++;
                        change();
                        correct.start();
                    }
                    else wrong.start();
                if(mode.equals("hard"))
                  /*  if() {
                        toast.show();
                        level++;
                        change();
                    }*/wrong.start();
                break;
            case R.id.fourth:
                if(mode.equals("easy"))
                    if(level == 6 || level==4){
                        toast.show();
                        level ++;
                        change();
                        correct.start();
                    }
                    else wrong.start();
                if(mode.equals("hard"))
                    if(level == 3||level==4) {
                        toast.show();
                        level++;
                        change();
                        correct.start();
                    }
                    else wrong.start();
                break;


            case R.id.easy:
                amain(); //i have to start it
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
                nbk(); //i have to start it
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
            if(level == 1)amain(); //1
            if(level == 2)checkers();//2
            if(level == 3)sandbags();//1
            if(level == 4)squeaky();//4
            if(level == 5)sunroom();//3
            if(level == 6)treeroom();//1
            if(level == 7)vents();//1234
            if(level == 8)truck();//1234
            if(level == 9)z();//1
            if(level == 10){
                Intent intent = new Intent(cache.this,mainpage.class);
                startActivity(intent);
            }

        }

        if(mode.equals("hard")){
            if(level == 1)nbk();//2
            if(level == 2)grass();//1
            if(level == 3)shroud();//4
            if(level == 4)cubby();//4
            if(level == 5){
                Intent intent = new Intent(cache.this,mainpage.class);
                startActivity(intent);
            }
        }
    }

    public void amain(){
        current.setImageResource(R.drawable.cache_amain);
        setTexts("a main", "a long", "inner a", "entrance a"); // 1
    }
    public void checkers(){
        current.setImageResource(R.drawable.cache_checkers);
        setTexts("vents drop","checkers","dark room","b side"); // 2
    }
    public void sandbags(){
        current.setImageResource(R.drawable.cache_sandbags);
        setTexts("sandbags","mid sneaky","snipers nest","molly spot"); // 1
    }
    public void squeaky(){
        current.setImageResource(R.drawable.cache_squeaky);
        setTexts("flank","trap","surprise","squeaky"); // 4
    }
    public void sunroom(){
        current.setImageResource(R.drawable.cache_sunroom);
        setTexts("windows","bright spot","sunroom", "b extensions"); // 3
    }
    public void treeroom(){
        current.setImageResource(R.drawable.cache_treeroom);
        setTexts("tree room","b entrance","smoke spot","ct peek"); // 1
    }
    public void vents(){
        current.setImageResource(R.drawable.cache_vent);
        setTexts("vents", "vents", "vents", "vents"); // 1 2 3 4
    }
    public void truck(){
        current.setImageResource(R.drawable.cache_truck);
        setTexts("truck", "truck" , "truck", "truck"); // 1 2 3 4
    }
    public void z(){
        current.setImageResource(R.drawable.cache_z);
        setTexts("z","x","ct mid","runners"); // 1
    }
    public void nbk(){
        current.setImageResource(R.drawable.cache_nbk);
        setTexts("molly spot", "nbk","cross squeaky",  "quiet"); // 2
    }
    public void grass(){
        current.setImageResource(R.drawable.cache_grass);
        setTexts("grass","farmers","dark spot", "back wall"); // 1
    }
    public void shroud(){
        current.setImageResource(R.drawable.cache_shroud);
        setTexts("fly","overhead","invis","shroud"); // 4
    }
    public void cubby(){
        current.setImageResource(R.drawable.cache_cubby);
        setTexts("Right mid","sneaky","ninja","cubby"); // 4
    }



}
