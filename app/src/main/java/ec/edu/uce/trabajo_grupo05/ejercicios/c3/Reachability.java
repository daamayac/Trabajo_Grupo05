package ec.edu.uce.trabajo_grupo05.ejercicios.c3;

import android.app.Activity;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import ec.edu.uce.trabajo_grupo05.R;

public class Reachability extends AppCompatActivity {
    
    ReachabilityManager mReach;
    
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.e12main);
     
        mReach = ReachabilityManager.getInstance(this);
        //mReach.isHostReachable("209.85.227.104")
        Toast.makeText(this, "Network "+mReach.isNetworkReachable()+"\nGoogle "+mReach.isHostReachable(0xD155E368), Toast.LENGTH_SHORT).show();
    }
}