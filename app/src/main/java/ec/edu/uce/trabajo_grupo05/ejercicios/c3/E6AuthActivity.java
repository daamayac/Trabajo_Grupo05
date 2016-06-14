package ec.edu.uce.trabajo_grupo05.ejercicios.c3;

import android.app.Activity;
import android.app.ProgressDialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import ec.edu.uce.trabajo_grupo05.ejercicios.c3.E6RestTask.ResponseCallback;

import java.net.Authenticator;
import java.net.PasswordAuthentication;

public class E6AuthActivity extends AppCompatActivity implements ResponseCallback {

    private static final String URI = "http://httpbin.org/basic-auth/android/recipes";
    private static final String USERNAME = "android";
    private static final String PASSWORD = "recipes";
    
    private TextView mResult;
    private ProgressDialog mProgress;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mResult = new TextView(this);
        setContentView(mResult);
        
        Authenticator.setDefault(new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(USERNAME, PASSWORD.toCharArray());
            }
        });
        
        try {
            E6RestTask task = E6RestUtil.obtainGetTask(URI);
            task.setResponseCallback(this);
            task.execute();
        } catch (Exception e) {
            mResult.setText(e.getMessage());
        }
        
//        try {
//            RestTask task = RestUtil.obtainAuthenticatedGetTask(URI, USERNAME, PASSWORD);
//            task.setResponseCallback(this);
//            task.execute();
//        } catch (Exception e) {
//            mResult.setText(e.getMessage());
//        }
    }
    
    @Override
    public void onRequestSuccess(String response) {
        if (mProgress != null) {
            mProgress.dismiss();
            mProgress = null;
        }
        mResult.setText(response);
    }

    @Override
    public void onRequestError(Exception error) {
        if (mProgress != null) {
            mProgress.dismiss();
            mProgress = null;
        }
        mResult.setText(error.getMessage());
    }

}
