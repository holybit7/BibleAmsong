package org.sdhanbit.android;

import android.content.Intent;
import android.content.pm.LabeledIntent;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import org.sdhanbit.android.util.CurrentTime;
import com.google.inject.Inject;
import roboguice.activity.RoboActivity;
import roboguice.inject.InjectView;
import android.view.View;
import android.view.View.OnClickListener;

import java.util.Random;

public class StarterActivity extends RoboActivity implements OnClickListener {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        Button b1 = (Button) findViewById(R.id.button_p_A);
        b1.setText(R.string.t_A);
        b1.setOnClickListener(this);
        Button b2 = (Button) findViewById(R.id.button_p_B);
        b2.setText(R.string.t_B);
        b2.setOnClickListener(this);
        Button b3 = (Button) findViewById(R.id.button_p_C);
        b3.setText(R.string.t_C);
        b3.setOnClickListener(this);
        Button b4 = (Button) findViewById(R.id.button_p_D);
        b4.setText(R.string.t_D);
        b4.setOnClickListener(this);
        Button b5 = (Button) findViewById(R.id.button_p_E);
        b5.setText(R.string.t_E);
        b5.setOnClickListener(this);

        Button b6 = (Button) findViewById(R.id.button_day);
        b6.setText(R.string.t_day);
        b6.setOnClickListener(this);
        Button b7 = (Button) findViewById(R.id.button_rand);
        b7.setText(R.string.t_rand);
        b7.setOnClickListener(this);
    }

    public void onClick(View v) {
        String bible[] ={
                "t_A1","t_A2","t_A3","t_A4","t_A5","t_A6","t_A7","t_A8","t_A9","t_A10","t_A11","t_A12",
                "t_B1","t_B2","t_B3","t_B4","t_B5","t_B6","t_B7","t_B8","t_B9","t_B10","t_B11","t_B12",
                "t_C1","t_C2","t_C3","t_C4","t_C5","t_C6","t_C7","t_C8","t_C9","t_C10","t_C11","t_C12",
                "t_D1","t_D2","t_D3","t_D4","t_D5","t_D6","t_D7","t_D8","t_D9","t_D10","t_D11","t_D12",
                "t_E1","t_E2","t_E3","t_E4","t_E5","t_E6","t_E7","t_E8","t_E9","t_E10","t_E11","t_E12"};

        switch (v.getId()) {
            case R.id.button_p_A:
                Intent intent1 = new Intent(this,pageA.class);
                startActivity(intent1);
                break;
            case R.id.button_p_B:
                Intent intent2 = new Intent(this,pageB.class);
                startActivity(intent2);
                break;
            case R.id.button_p_C:
                Intent intent3 = new Intent(this,pageC.class);
                startActivity(intent3);
                break;
            case R.id.button_p_D:
                Intent intent4 = new Intent(this,pageD.class);
                startActivity(intent4);
                break;
            case R.id.button_p_E:
                Intent intent5 = new Intent(this,pageE.class);
                startActivity(intent5);
                break;

            case R.id.button_day:
                Random rnd1 = new Random();
                Intent intent6 = new Intent(this,pBible.class);
                intent6.putExtra("t_bible",bible[rnd1.nextInt(60)-1]);
                startActivity(intent6);
                break;
            case R.id.button_rand:
                Random rnd2 = new Random();
                Intent intent7 = new Intent(this,pMem.class);
                intent7.putExtra("t_bible",bible[rnd2.nextInt(60)-1]);
                startActivity(intent7);
                break;

        }
    }




}
