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

public class dust2 extends Activity implements View.OnClickListener{
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
                    if(level == 3 || level == 4 || level == 7){
                        toast.show();
                        level ++;
                        change();
                    }
                if(mode.equals("hard"))
                    if(level == 3 || level == 4) {
                        toast.show();
                        level++;
                        change();
                    }
                break;
            case R.id.second:
                if(mode.equals("easy"))
                    if(level == 1 || level == 8){
                        toast.show();
                        level ++;
                        change();
                    }
                if(mode.equals("hard"))
                    if(level == 1 || level == 5) {
                        toast.show();
                        level++;
                        change();
                    }
                break;
            case R.id.third:
                if(mode.equals("easy"))
                    if(level == 2 ||level == 5 ||level ==9){
                        toast.show();
                        level ++;
                        change();
                    }
                if(mode.equals("hard"))
                    if(level == 6) {
                        toast.show();
                        level++;
                        change();
                    }
                break;
            case R.id.fourth:
                if(mode.equals("easy"))
                    if(level == 4){
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


            case R.id.easy:
                backplat(); //i have to start it
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
                bigbox(); //i have to start it
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
            if(level == 1)backplat(); //2
            if(level == 2)fastcat();//3
            if(level == 3)bluebin();//1
            if(level == 4)cat();//1
            if(level == 5)doublestack();//3
            if(level == 6)elevator();//4
            if(level == 7)goose();//1
            if(level == 8)pit();//2
            if(level == 9)xbox();//3
            if(level == 10){
                Intent intent = new Intent(dust2.this,mainpage.class);
                startActivity(intent);
            }

        }

        if(mode.equals("hard")){
            if(level == 1)bigbox();//2
            if(level == 2)green();//4
            if(level == 3)ninja();//1
            if(level == 4)palmtree();//1
            if(level == 5)scaffolding();//2
            if(level == 6)suicide();//3
            if(level == 7){
                Intent intent = new Intent(dust2.this,mainpage.class);
                startActivity(intent);
            }
        }
    }

    public void backplat(){
        current.setImageResource(R.drawable.dust2_backplat);
        setTexts("back b","back plat","back box","corner stacks"); // 2
    }
    public void bluebin(){
        current.setImageResource(R.drawable.dust2_bluebin);
        setTexts("blue bin","garbage","short a","long a"); // 1
    }
    public void bigbox(){
        current.setImageResource(R.drawable.dust2_bigboxb);
        setTexts("quad","big box","stacks","plat");// 2
    }
    public void cat(){
        current.setImageResource(R.drawable.dust2_cat);
        setTexts("cat","right side mid","fast","a surprise"); // 1
    }
    public void goose(){
        current.setImageResource(R.drawable.dust2_goosea);
        setTexts("goose","dark","back a","end wall"); // 1
    }
    public void doublestack(){
        current.setImageResource(R.drawable.dust2_doublestack);
        setTexts("common boxes", "bomb box", "double stack","window stacks"); // 3
    }
    public void elevator(){
        current.setImageResource(R.drawable.dust2_elevator);
        setTexts("clean","hidden","scout spot","elevator"); // 4
    }
    public void fastcat(){
        current.setImageResource(R.drawable.dust2_fastcat);
        setTexts("ct ramp","ct boost","fast cat","ct boxes"); //3
    }
    public void green(){
        current.setImageResource(R.drawable.dust2_green);
        setTexts("red","blue","left side mid","green"); // 4
    }
    public void ninja(){
        current.setImageResource(R.drawable.dust2_ninja);
        setTexts("ninja", "hidden", "knife","quite"); // 1
    }
    public void palmtree(){
        current.setImageResource(R.drawable.dust2_palmtree);
        setTexts("palm tree","headshot barrels","mid pole","snipers nest"); // 1
    }
    public void pit(){
        current.setImageResource(R.drawable.dust2_pit);
        setTexts("dark", "pit", "a drop", "sneaky"); // 2
    }
    public void scaffolding(){
        current.setImageResource(R.drawable.dust2_scaffolding);
        setTexts("woods","scaffolding","Right window","jump spot"); // 2
    }
    public void suicide(){
        current.setImageResource(R.drawable.dust2_suicide);
        setTexts("drop t","surprise","suicide","front mid"); // 3
    }
    public void xbox(){
        current.setImageResource(R.drawable.dust2_xboxmid);
        setTexts("cat boost","mid box","xbox", "snipers box"); // 3
    }


}
