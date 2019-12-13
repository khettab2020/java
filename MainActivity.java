package com.bakrstudio.app.rassidnet;
import com.google.android.gms.ads.MobileAds;
import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import static android.widget.Toast.makeText;
import static java.lang.String.*;

public class MainActivity extends AppCompatActivity {
    private AdView mAdView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        MobileAds.initialize(this, "ca-app-pub-1214181743912826~5799190937");
        mAdView = findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        final int[] x1 = {15};
final TextView text = (TextView)findViewById(R.id.text1);
 Button button = (Button)findViewById(R.id.but);
 button.setOnClickListener(new View.OnClickListener() {
     @Override
     public void onClick(View v) {

        Intent intent2 = new Intent(MainActivity.this,Main3Activity.class);
        startActivity(intent2);
        text.setText(valueOf(x1[0] = x1[0] +7));
     }
 });
Button button1 = (Button)findViewById(R.id.sent);
button1.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {

            makeText(MainActivity.this, "إجمع المزيد من نقاط ", Toast.LENGTH_SHORT).show();

    }


});
    }
}
