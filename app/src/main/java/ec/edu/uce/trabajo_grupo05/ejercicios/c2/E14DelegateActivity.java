package ec.edu.uce.trabajo_grupo05.ejercicios.c2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

public class E14DelegateActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        E14TouchDelegateLayout layout = new E14TouchDelegateLayout(this);

        setContentView(layout);
    }
}
