package ec.edu.uce.trabajo_grupo05.ejercicios.c3;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class E2DisplayingWebInformation extends AppCompatActivity{
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        WebView webview = new WebView(this);
        //Enable JavaScript support
        webview.getSettings().setJavaScriptEnabled(true);
        webview.loadUrl("http://www.android.com/");

        setContentView(webview);
    }
}

