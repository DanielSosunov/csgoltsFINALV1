package csgolts.gamerful.csgolts;

import android.app.Activity;
import android.content.Intent;
import android.media.Image;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;

public class mainpage extends Activity implements View.OnClickListener{
    ImageButton inferno,dust2,mirage,cache;
    ImageButton subscribe;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mainpage);

        subscribe = (ImageButton)findViewById(R.id.subscribe);
        subscribe.setOnClickListener(this);

        MobileAds.initialize(getApplicationContext(), "ca-app-pub-3770630979290223/5544858313");

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        cache= (ImageButton)findViewById(R.id.cache);
        mirage = (ImageButton) findViewById(R.id.mirage);
        inferno = (ImageButton)findViewById(R.id.inferno);
        dust2 =(ImageButton)findViewById(R.id.dust2);
        dust2.setOnClickListener(this);
        cache.setOnClickListener(this);
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
            case R.id.cache:
                Intent cache = new Intent(mainpage.this,cache.class);
                startActivity(cache);
                break;
            case R.id.subscribe:
                Intent intent = new Intent();
                intent.setAction(Intent.ACTION_VIEW);
                intent.addCategory(Intent.CATEGORY_BROWSABLE);
                intent.setData(Uri.parse("https://www.youtube.com/subscription_center?add_user=danielthegamerful"));
                startActivity(intent);
                break;
        }
    }
}
