package com.example.brower;
import androidx.appcompat.app.AppCompatActivity;
import android.webkit.WebView;
import android.os.Bundle;
import android.webkit.WebViewClient;
import android.content.Intent;
import android.net.Uri;
import java.net.URL;
public class web extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intnet=getIntent();
        Uri data=intnet.getData();
        URL url=null;
        try {
            url = new URL(data.getScheme(), data.getHost(),
                    data.getPath());
        } catch (Exception e) {
            e.printStackTrace();
        }
        WebView webView=findViewById(R.id.wbvw);
        webView.getSettings().setJavaScriptEnabled(true);//让浏览器支持javascript
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl(url.toString());
    }
}

