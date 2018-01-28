package com.engineeringmanager.engineeringmanagerv2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.webkit.WebView;
import android.widget.Toast;

public class syllabusWebView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_syllabus_web_view);

        if(getIntent() != null) {
            String info = getIntent().getStringExtra("info");
            final WebView webView;

            webView = (WebView) findViewById(R.id.webviewPDFarea);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.loadUrl(info);


        }


    }
}
 