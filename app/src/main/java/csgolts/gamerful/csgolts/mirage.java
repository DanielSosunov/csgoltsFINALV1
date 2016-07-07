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

public class mirage extends Activity implements View.OnClickListener{
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
                    if(level == 1 || level == 4 || level == 6||level == 10){
                        toast.show();
                        level ++;
                        change();
                    }
                if(mode.equals("hard"))
                    if(level == 1 || level == 4) {
                        toast.show();
                        level++;
                        change();
                    }
                break;
            case R.id.second:
                if(mode.equals("easy"))
                    if(level == 2 || level == 9 ||level == 7){
                        toast.show();
                        level ++;
                        change();
                    }
                if(mode.equals("hard"))
                    if(level == 2 ) {
                        toast.show();
                        level++;
                        change();
                    }
                break;
            case R.id.third:
                if(mode.equals("easy"))
                    if(level == 5){
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
                    if(level == 3||level==8){
                        toast.show();
                        level ++;
                        change();
                    }
                if(mode.equals("hard"))
                    if(level == 3||level==5) {
                        toast.show();
                        level++;
                        change();
                    }
                break;


            case R.id.easy:
                apartments(); //i have to start it
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
                ebox(); //i have to start it
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
            if(level == 1)apartments(); //1
            if(level == 2)van();//2
            if(level == 3)sandwich();//4
            if(level == 4)palace();//1
            if(level == 5)jungle();//3
            if(level == 6)tetris();//1
            if(level == 7)kitchen();//2
            if(level == 8)firebox();//4
            if(level == 9)chair();//2
            if(level == 10)bench();//1
            if(level == 11){
                Intent intent = new Intent(mirage.this,mainpage.class);
                startActivity(intent);
            }

        }

        if(mode.equals("hard")){
            if(level == 1)ebox();//1
            if(level == 2)ninja();//2
            if(level == 3)ticketbooth();//4
            if(level == 4)minibench();//1
            if(level == 5)minichair();//4
            if(level == 6)dark();//3
            if(level == 7){
                Intent intent = new Intent(mirage.this,mainpage.class);
                startActivity(intent);
            }
        }
    }

    public void apartments(){
        current.setImageResource(R.drawable.mirage_apartments);
        setTexts("apartments", "halls", "house", "b long"); // 1
    }
    public void bench(){
        current.setImageResource(R.drawable.mirage_bench);
        setTexts("bench","back b","hard","cat watch"); // 1
    }
    public void chair(){
        current.setImageResource(R.drawable.mirage_chair);
        setTexts("right mid","chair","cat peek", "top ramp"); // 2
    }
    public void dark(){
        current.setImageResource(R.drawable.mirage_dark);
        setTexts("sneaky", "hidden", "dark", "mid ramp"); // 3
    }
    public void ebox(){
        current.setImageResource(R.drawable.mirage_ebox);
        setTexts("ebox","unknown","right side b","market box"); // 1
    }
    public void firebox(){
        current.setImageResource(R.drawable.mirage_firebox); // 4
        setTexts("triple","hidden","ninja","fire box");
    }
    public void jungle(){
        current.setImageResource(R.drawable.mirage_jungle);
        setTexts("window house","green","jungle","dark"); // 3
    }
    public void kitchen(){
        current.setImageResource(R.drawable.mirage_kitchen); // 2
        setTexts("woods","kitchen","clean","dirt");
    }
    public void minibench(){
        current.setImageResource(R.drawable.mirage_minibench);
        setTexts("minibench", "bench", "dark", "corner b"); // 1
    }
    public void minichair(){
        current.setImageResource(R.drawable.mirage_minichair);
        setTexts("chair", "outside aps", "entrance aps", "minichair"); // 4
    }
    public void palace(){
        current.setImageResource(R.drawable.mirage_palace);
        setTexts("palace","a long","a fast","dark house"); // 1
    }
    public void sandwich(){
        current.setImageResource(R.drawable.mirage_sandwich);
        setTexts("dark","under stairs","trap","sandwich"); // 4
    }
    public void tetris(){
        current.setImageResource(R.drawable.mirage_tetris);
        setTexts("tetris","a house","top stacks","left slant"); // 1
    }
    public void ticketbooth(){
        current.setImageResource(R.drawable.mirage_ticketbooth);
        setTexts("top ct","a fly","over","ticketbooth"); // 4
    }
    public void van(){
        current.setImageResource(R.drawable.mirage_van);
        setTexts("white","van","barrel","long peek"); // 2
    }

    public void ninja(){
        current.setImageResource(R.drawable.mirage_ninjamirage);
        setTexts("back fire","ninja","dumb","winner"); // 2
    }


}
