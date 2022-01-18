package org.cityteam.stats;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    private static final String WEBAPP_URL = "https://cityteam-stats.herokuapp.com";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView webView = findViewById(R.id.webview);
        webView.getSettings().setJavaScriptEnabled(true);
        //webView.getSettings().setUserAgentString("CityTeamStats Android");
        webView.loadUrl(WEBAPP_URL);
    }

}
