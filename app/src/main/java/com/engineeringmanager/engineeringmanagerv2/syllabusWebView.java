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

        if(getIntent() != null)
        {
            String info = getIntent().getStringExtra("info");
            //  txtInfo.setText(info);

            Toast.makeText(this, info.toString(), Toast.LENGTH_SHORT).show();
            if(info.equals("0"))
            {
                final WebView webView;
                webView = (WebView) findViewById(R.id.webviewPDFarea);
                webView.getSettings().setJavaScriptEnabled(true);

                //setWebView
                String pdf_url = "http://skyjack.com/sites/default/files/warranty.pdf";
                webView.loadUrl("http://docs.google.com/gview?embedded=true&url=" + pdf_url);

                /*webView = (WebView) findViewById(R.id.webviewPDFarea);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/open?id=1c4sos05bVerPHSDbaIrZhWsoBomGE_tH");*/

            }
            else if(info.equals("1"))
            {
                final WebView webView;

                webView = (WebView) findViewById(R.id.webviewPDFarea);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/open?id=1uNQxEV8tdfPLYdt0vR6xTNnCjADD70wj");

            }
            else if(info.equals("2"))
            {
                final WebView webView;

                webView = (WebView) findViewById(R.id.webviewPDFarea);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/open?id=1uNQxEV8tdfPLYdt0vR6xTNnCjADD70wj");

            }
            else if(info.equals("3"))
            {
                final WebView webView;

                webView = (WebView) findViewById(R.id.webviewPDFarea);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.loadUrl("https://drive.google.com/open?id=1uNQxEV8tdfPLYdt0vR6xTNnCjADD70wj");

            }
          /* final WebView webView;

            webView = (WebView) findViewById(R.id.webviewPDFarea);
            webView.getSettings().setJavaScriptEnabled(true);
            webView.loadUrl("www.google.com");*/


        }
    }
}
