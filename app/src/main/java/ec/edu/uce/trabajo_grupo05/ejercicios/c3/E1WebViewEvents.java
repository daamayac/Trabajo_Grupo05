package ec.edu.uce.trabajo_grupo05.ejercicios.c3;

import android.app.Activity;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

import ec.edu.uce.trabajo_grupo05.R;

public class E1WebViewEvents extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainc3e2);

        WebView upperView = (WebView) findViewById(R.id.upperview);
        // Zoom feature must be enabled
        upperView.getSettings().setBuiltInZoomControls(true);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.HONEYCOMB) {
            //Android 3.0+ has pinch-zoom, don't need buttons
            upperView.getSettings().setDisplayZoomControls(false);
        }
        upperView.loadUrl("file:///android_asset/e2android.jpg");

        WebView lowerView = (WebView) findViewById(R.id.lowerview);
        String htmlString = "<h1>Header</h1><p>This is HTML text<br /><i>Formatted in italics</i></p>";
        lowerView.loadData(htmlString, "text/html", "utf-8");
    }

}
