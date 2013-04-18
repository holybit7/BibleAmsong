package org.sdhanbit.android;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import roboguice.activity.RoboActivity;

/**
 * Created with IntelliJ IDEA.
 * User: jinhyunc
 * Date: 2/16/13
 * Time: 10:14 PM
 * To change this template use File | Settings | File Templates.
 */
public class pMem extends RoboActivity implements View.OnClickListener {
    String t_bible;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.page_amsong);

        Button b1 = (Button) findViewById(R.id.button_hint);
        b1.setOnClickListener(this);
        b1.setText(R.string.t_hint);
        Button b2 = (Button) findViewById(R.id.button_answer);
        b2.setOnClickListener(this);
        b2.setText(R.string.t_answer);

        t_bible = this.getIntent().getStringExtra("t_bible");

        //A
        if (t_bible.equals("t_A1")) {   //        if (t_bible.equals("t_A1")) {
            TextView tv1 = (TextView) findViewById(R.id.textView_amsong_title);
            tv1.setText(R.string.t_A1t);
            tv1.setPadding(7, 7, 7, 7);
            TextView tv2 = (TextView) findViewById(R.id.textView_amsong_content);
            tv2.setText(R.string.t_A1z);
            tv2.setPadding(7, 7, 7, 7);
        }
        else if (t_bible.equals("t_A2")) {
            TextView tv1 = (TextView) findViewById(R.id.textView_amsong_title);
            tv1.setText(R.string.t_A2t);
            tv1.setPadding(7, 7, 7, 7);
            TextView tv2 = (TextView) findViewById(R.id.textView_amsong_content);
            tv2.setText(R.string.t_A2z);
            tv2.setPadding(7, 7, 7, 7);
        }
        else if (t_bible.equals("t_A3")) {
            TextView tv1 = (TextView) findViewById(R.id.textView_amsong_title);
            tv1.setText(R.string.t_A3t);
            tv1.setPadding(7, 7, 7, 7);
            TextView tv2 = (TextView) findViewById(R.id.textView_amsong_content);
            tv2.setText(R.string.t_A3z);
            tv2.setPadding(7, 7, 7, 7);
        }
        else if (t_bible.equals("t_A4")) {
            TextView tv1 = (TextView) findViewById(R.id.textView_amsong_title);
            tv1.setText(R.string.t_A4t);
            tv1.setPadding(7, 7, 7, 7);
            TextView tv2 = (TextView) findViewById(R.id.textView_amsong_content);
            tv2.setText(R.string.t_A4z);
            tv2.setPadding(7, 7, 7, 7);
        }
        else if (t_bible.equals("t_A5")) {
            TextView tv1 = (TextView) findViewById(R.id.textView_amsong_title);
            tv1.setText(R.string.t_A5t);
            tv1.setPadding(7, 7, 7, 7);
            TextView tv2 = (TextView) findViewById(R.id.textView_amsong_content);
            tv2.setText(R.string.t_A5z);
            tv2.setPadding(7, 7, 7, 7);
        }
        else if (t_bible.equals("t_A6")) {
            TextView tv1 = (TextView) findViewById(R.id.textView_amsong_title);
            tv1.setText(R.string.t_A6t);
            tv1.setPadding(7, 7, 7, 7);
            TextView tv2 = (TextView) findViewById(R.id.textView_amsong_content);
            tv2.setText(R.string.t_A6z);
            tv2.setPadding(7, 7, 7, 7);
        }
        else if (t_bible.equals("t_A7")) {
            TextView tv1 = (TextView) findViewById(R.id.textView_amsong_title);
            tv1.setText(R.string.t_A7t);
            tv1.setPadding(7, 7, 7, 7);
            TextView tv2 = (TextView) findViewById(R.id.textView_amsong_content);
            tv2.setText(R.string.t_A7z);
            tv2.setPadding(7, 7, 7, 7);
        }
        else if (t_bible.equals("t_A8")) {
            TextView tv1 = (TextView) findViewById(R.id.textView_amsong_title);
            tv1.setText(R.string.t_A8t);
            tv1.setPadding(7, 7, 7, 7);
            TextView tv2 = (TextView) findViewById(R.id.textView_amsong_content);
            tv2.setText(R.string.t_A8z);
            tv2.setPadding(7, 7, 7, 7);
        }
        else if (t_bible.equals("t_A9")) {
            TextView tv1 = (TextView) findViewById(R.id.textView_amsong_title);
            tv1.setText(R.string.t_A9t);
            tv1.setPadding(7, 7, 7, 7);
            TextView tv2 = (TextView) findViewById(R.id.textView_amsong_content);
            tv2.setText(R.string.t_A9z);
            tv2.setPadding(7, 7, 7, 7);
        }
        else if (t_bible.equals("t_A10")) {
            TextView tv1 = (TextView) findViewById(R.id.textView_amsong_title);
            tv1.setText(R.string.t_A10t);
            tv1.setPadding(7, 7, 7, 7);
            TextView tv2 = (TextView) findViewById(R.id.textView_amsong_content);
            tv2.setText(R.string.t_A10z);
            tv2.setPadding(7, 7, 7, 7);
        }
        else if (t_bible.equals("t_A11")) {
            TextView tv1 = (TextView) findViewById(R.id.textView_amsong_title);
            tv1.setText(R.string.t_A11t);
            tv1.setPadding(7, 7, 7, 7);
            TextView tv2 = (TextView) findViewById(R.id.textView_amsong_content);
            tv2.setText(R.string.t_A11z);
            tv2.setPadding(7, 7, 7, 7);
        }
        else if (t_bible.equals("t_A12")) {
            TextView tv1 = (TextView) findViewById(R.id.textView_amsong_title);
            tv1.setText(R.string.t_A12t);
            tv1.setPadding(7, 7, 7, 7);
            TextView tv2 = (TextView) findViewById(R.id.textView_amsong_content);
            tv2.setText(R.string.t_A12z);
            tv2.setPadding(7, 7, 7, 7);
        }
        //B
        else if (t_bible.equals("t_B1")) {
            TextView tv1 = (TextView) findViewById(R.id.textView_amsong_title);
            tv1.setText(R.string.t_B1t);
            tv1.setPadding(7, 7, 7, 7);
            TextView tv2 = (TextView) findViewById(R.id.textView_amsong_content);
            tv2.setText(R.string.t_B1z);
            tv2.setPadding(7, 7, 7, 7);
        }
        else if (t_bible.equals("t_B2")) {
            TextView tv1 = (TextView) findViewById(R.id.textView_amsong_title);
            tv1.setText(R.string.t_B2t);
            tv1.setPadding(7, 7, 7, 7);
            TextView tv2 = (TextView) findViewById(R.id.textView_amsong_content);
            tv2.setText(R.string.t_B2z);
            tv2.setPadding(7, 7, 7, 7);
        }
        else if (t_bible.equals("t_B3")) {
            TextView tv1 = (TextView) findViewById(R.id.textView_amsong_title);
            tv1.setText(R.string.t_B3t);
            tv1.setPadding(7, 7, 7, 7);
            TextView tv2 = (TextView) findViewById(R.id.textView_amsong_content);
            tv2.setText(R.string.t_B3z);
            tv2.setPadding(7, 7, 7, 7);
        }
        else if (t_bible.equals("t_B4")) {
            TextView tv1 = (TextView) findViewById(R.id.textView_amsong_title);
            tv1.setText(R.string.t_B4t);
            tv1.setPadding(7, 7, 7, 7);
            TextView tv2 = (TextView) findViewById(R.id.textView_amsong_content);
            tv2.setText(R.string.t_B4z);
            tv2.setPadding(7, 7, 7, 7);
        }
        else if (t_bible.equals("t_B5")) {
            TextView tv1 = (TextView) findViewById(R.id.textView_amsong_title);
            tv1.setText(R.string.t_B5t);
            tv1.setPadding(7, 7, 7, 7);
            TextView tv2 = (TextView) findViewById(R.id.textView_amsong_content);
            tv2.setText(R.string.t_B5z);
            tv2.setPadding(7, 7, 7, 7);
        }
        else if (t_bible.equals("t_B6")) {
            TextView tv1 = (TextView) findViewById(R.id.textView_amsong_title);
            tv1.setText(R.string.t_B6t);
            tv1.setPadding(7, 7, 7, 7);
            TextView tv2 = (TextView) findViewById(R.id.textView_amsong_content);
            tv2.setText(R.string.t_B6z);
            tv2.setPadding(7, 7, 7, 7);
        }
        else if (t_bible.equals("t_B7")) {
            TextView tv1 = (TextView) findViewById(R.id.textView_amsong_title);
            tv1.setText(R.string.t_B7t);
            tv1.setPadding(7, 7, 7, 7);
            TextView tv2 = (TextView) findViewById(R.id.textView_amsong_content);
            tv2.setText(R.string.t_B7z);
            tv2.setPadding(7, 7, 7, 7);
        }
        else if (t_bible.equals("t_B8")) {
            TextView tv1 = (TextView) findViewById(R.id.textView_amsong_title);
            tv1.setText(R.string.t_B8t);
            tv1.setPadding(7, 7, 7, 7);
            TextView tv2 = (TextView) findViewById(R.id.textView_amsong_content);
            tv2.setText(R.string.t_B8z);
            tv2.setPadding(7, 7, 7, 7);
        }
        else if (t_bible.equals("t_B9")) {
            TextView tv1 = (TextView) findViewById(R.id.textView_amsong_title);
            tv1.setText(R.string.t_B9t);
            tv1.setPadding(7, 7, 7, 7);
            TextView tv2 = (TextView) findViewById(R.id.textView_amsong_content);
            tv2.setText(R.string.t_B9z);
            tv2.setPadding(7, 7, 7, 7);
        }
        else if (t_bible.equals("t_B10")) {
            TextView tv1 = (TextView) findViewById(R.id.textView_amsong_title);
            tv1.setText(R.string.t_B10t);
            tv1.setPadding(7, 7, 7, 7);
            TextView tv2 = (TextView) findViewById(R.id.textView_amsong_content);
            tv2.setText(R.string.t_B10z);
            tv2.setPadding(7, 7, 7, 7);
        }
        else if (t_bible.equals("t_B11")) {
            TextView tv1 = (TextView) findViewById(R.id.textView_amsong_title);
            tv1.setText(R.string.t_B11t);
            tv1.setPadding(7, 7, 7, 7);
            TextView tv2 = (TextView) findViewById(R.id.textView_amsong_content);
            tv2.setText(R.string.t_B11z);
            tv2.setPadding(7, 7, 7, 7);
        }
        else if (t_bible.equals("t_B12")) {
            TextView tv1 = (TextView) findViewById(R.id.textView_amsong_title);
            tv1.setText(R.string.t_B12t);
            tv1.setPadding(7, 7, 7, 7);
            TextView tv2 = (TextView) findViewById(R.id.textView_amsong_content);
            tv2.setText(R.string.t_B12z);
            tv2.setPadding(7, 7, 7, 7);
        }
        //C
        else if (t_bible.equals("t_C1")) {
            TextView tv1 = (TextView) findViewById(R.id.textView_amsong_title);
            tv1.setText(R.string.t_C1t);
            tv1.setPadding(7, 7, 7, 7);
            TextView tv2 = (TextView) findViewById(R.id.textView_amsong_content);
            tv2.setText(R.string.t_C1z);
            tv2.setPadding(7, 7, 7, 7);
        }
        else if (t_bible.equals("t_C2")) {
            TextView tv1 = (TextView) findViewById(R.id.textView_amsong_title);
            tv1.setText(R.string.t_C2t);
            tv1.setPadding(7, 7, 7, 7);
            TextView tv2 = (TextView) findViewById(R.id.textView_amsong_content);
            tv2.setText(R.string.t_C2z);
            tv2.setPadding(7, 7, 7, 7);
        }
        else if (t_bible.equals("t_C3")) {
            TextView tv1 = (TextView) findViewById(R.id.textView_amsong_title);
            tv1.setText(R.string.t_C3t);
            tv1.setPadding(7, 7, 7, 7);
            TextView tv2 = (TextView) findViewById(R.id.textView_amsong_content);
            tv2.setText(R.string.t_C3z);
            tv2.setPadding(7, 7, 7, 7);
        }
        else if (t_bible.equals("t_C4")) {
            TextView tv1 = (TextView) findViewById(R.id.textView_amsong_title);
            tv1.setText(R.string.t_C4t);
            tv1.setPadding(7, 7, 7, 7);
            TextView tv2 = (TextView) findViewById(R.id.textView_amsong_content);
            tv2.setText(R.string.t_C4z);
            tv2.setPadding(7, 7, 7, 7);
        }
        else if (t_bible.equals("t_C5")) {
            TextView tv1 = (TextView) findViewById(R.id.textView_amsong_title);
            tv1.setText(R.string.t_C5t);
            tv1.setPadding(7, 7, 7, 7);
            TextView tv2 = (TextView) findViewById(R.id.textView_amsong_content);
            tv2.setText(R.string.t_C5z);
            tv2.setPadding(7, 7, 7, 7);
        }
        else if (t_bible.equals("t_C6")) {
            TextView tv1 = (TextView) findViewById(R.id.textView_amsong_title);
            tv1.setText(R.string.t_C6t);
            tv1.setPadding(7, 7, 7, 7);
            TextView tv2 = (TextView) findViewById(R.id.textView_amsong_content);
            tv2.setText(R.string.t_C6z);
            tv2.setPadding(7, 7, 7, 7);
        }
        else if (t_bible.equals("t_C7")) {
            TextView tv1 = (TextView) findViewById(R.id.textView_amsong_title);
            tv1.setText(R.string.t_C7t);
            tv1.setPadding(7, 7, 7, 7);
            TextView tv2 = (TextView) findViewById(R.id.textView_amsong_content);
            tv2.setText(R.string.t_C7z);
            tv2.setPadding(7, 7, 7, 7);
        }
        else if (t_bible.equals("t_C8")) {
            TextView tv1 = (TextView) findViewById(R.id.textView_amsong_title);
            tv1.setText(R.string.t_C8t);
            tv1.setPadding(7, 7, 7, 7);
            TextView tv2 = (TextView) findViewById(R.id.textView_amsong_content);
            tv2.setText(R.string.t_C8z);
            tv2.setPadding(7, 7, 7, 7);
        }
        else if (t_bible.equals("t_C9")) {
            TextView tv1 = (TextView) findViewById(R.id.textView_amsong_title);
            tv1.setText(R.string.t_C9t);
            tv1.setPadding(7, 7, 7, 7);
            TextView tv2 = (TextView) findViewById(R.id.textView_amsong_content);
            tv2.setText(R.string.t_C9z);
            tv2.setPadding(7, 7, 7, 7);
        }
        else if (t_bible.equals("t_C10")) {
            TextView tv1 = (TextView) findViewById(R.id.textView_amsong_title);
            tv1.setText(R.string.t_C10t);
            tv1.setPadding(7, 7, 7, 7);
            TextView tv2 = (TextView) findViewById(R.id.textView_amsong_content);
            tv2.setText(R.string.t_C10z);
            tv2.setPadding(7, 7, 7, 7);
        }
        else if (t_bible.equals("t_C11")) {
            TextView tv1 = (TextView) findViewById(R.id.textView_amsong_title);
            tv1.setText(R.string.t_C11t);
            tv1.setPadding(7, 7, 7, 7);
            TextView tv2 = (TextView) findViewById(R.id.textView_amsong_content);
            tv2.setText(R.string.t_C11z);
            tv2.setPadding(7, 7, 7, 7);
        }
        else if (t_bible.equals("t_C12")) {
            TextView tv1 = (TextView) findViewById(R.id.textView_amsong_title);
            tv1.setText(R.string.t_C12t);
            tv1.setPadding(7, 7, 7, 7);
            TextView tv2 = (TextView) findViewById(R.id.textView_amsong_content);
            tv2.setText(R.string.t_C12z);
            tv2.setPadding(7, 7, 7, 7);
        }
        //D
        else if (t_bible.equals("t_D1")) {
            TextView tv1 = (TextView) findViewById(R.id.textView_amsong_title);
            tv1.setText(R.string.t_D1t);
            tv1.setPadding(7, 7, 7, 7);
            TextView tv2 = (TextView) findViewById(R.id.textView_amsong_content);
            tv2.setText(R.string.t_D1z);
            tv2.setPadding(7, 7, 7, 7);
        }
        else if (t_bible.equals("t_D2")) {
            TextView tv1 = (TextView) findViewById(R.id.textView_amsong_title);
            tv1.setText(R.string.t_D2t);
            tv1.setPadding(7, 7, 7, 7);
            TextView tv2 = (TextView) findViewById(R.id.textView_amsong_content);
            tv2.setText(R.string.t_D2z);
            tv2.setPadding(7, 7, 7, 7);
        }
        else if (t_bible.equals("t_D3")) {
            TextView tv1 = (TextView) findViewById(R.id.textView_amsong_title);
            tv1.setText(R.string.t_D3t);
            tv1.setPadding(7, 7, 7, 7);
            TextView tv2 = (TextView) findViewById(R.id.textView_amsong_content);
            tv2.setText(R.string.t_D3z);
            tv2.setPadding(7, 7, 7, 7);
        }
        else if (t_bible.equals("t_D4")) {
            TextView tv1 = (TextView) findViewById(R.id.textView_amsong_title);
            tv1.setText(R.string.t_D4t);
            tv1.setPadding(7, 7, 7, 7);
            TextView tv2 = (TextView) findViewById(R.id.textView_amsong_content);
            tv2.setText(R.string.t_D4z);
            tv2.setPadding(7, 7, 7, 7);
        }
        else if (t_bible.equals("t_D5")) {
            TextView tv1 = (TextView) findViewById(R.id.textView_amsong_title);
            tv1.setText(R.string.t_D5t);
            tv1.setPadding(7, 7, 7, 7);
            TextView tv2 = (TextView) findViewById(R.id.textView_amsong_content);
            tv2.setText(R.string.t_D5z);
            tv2.setPadding(7, 7, 7, 7);
        }
        else if (t_bible.equals("t_D6")) {
            TextView tv1 = (TextView) findViewById(R.id.textView_amsong_title);
            tv1.setText(R.string.t_D6t);
            tv1.setPadding(7, 7, 7, 7);
            TextView tv2 = (TextView) findViewById(R.id.textView_amsong_content);
            tv2.setText(R.string.t_D6z);
            tv2.setPadding(7, 7, 7, 7);
        }
        else if (t_bible.equals("t_D7")) {
            TextView tv1 = (TextView) findViewById(R.id.textView_amsong_title);
            tv1.setText(R.string.t_D7t);
            tv1.setPadding(7, 7, 7, 7);
            TextView tv2 = (TextView) findViewById(R.id.textView_amsong_content);
            tv2.setText(R.string.t_D7z);
            tv2.setPadding(7, 7, 7, 7);
        }
        else if (t_bible.equals("t_D8")) {
            TextView tv1 = (TextView) findViewById(R.id.textView_amsong_title);
            tv1.setText(R.string.t_D8t);
            tv1.setPadding(7, 7, 7, 7);
            TextView tv2 = (TextView) findViewById(R.id.textView_amsong_content);
            tv2.setText(R.string.t_D8z);
            tv2.setPadding(7, 7, 7, 7);
        }
        else if (t_bible.equals("t_D9")) {
            TextView tv1 = (TextView) findViewById(R.id.textView_amsong_title);
            tv1.setText(R.string.t_D9t);
            tv1.setPadding(7, 7, 7, 7);
            TextView tv2 = (TextView) findViewById(R.id.textView_amsong_content);
            tv2.setText(R.string.t_D9z);
            tv2.setPadding(7, 7, 7, 7);
        }
        else if (t_bible.equals("t_D10")) {
            TextView tv1 = (TextView) findViewById(R.id.textView_amsong_title);
            tv1.setText(R.string.t_D10t);
            tv1.setPadding(7, 7, 7, 7);
            TextView tv2 = (TextView) findViewById(R.id.textView_amsong_content);
            tv2.setText(R.string.t_D10z);
            tv2.setPadding(7, 7, 7, 7);
        }
        else if (t_bible.equals("t_D11")) {
            TextView tv1 = (TextView) findViewById(R.id.textView_amsong_title);
            tv1.setText(R.string.t_D11t);
            tv1.setPadding(7, 7, 7, 7);
            TextView tv2 = (TextView) findViewById(R.id.textView_amsong_content);
            tv2.setText(R.string.t_D11z);
            tv2.setPadding(7, 7, 7, 7);
        }
        else if (t_bible.equals("t_D12")) {
            TextView tv1 = (TextView) findViewById(R.id.textView_amsong_title);
            tv1.setText(R.string.t_D12t);
            tv1.setPadding(7, 7, 7, 7);
            TextView tv2 = (TextView) findViewById(R.id.textView_amsong_content);
            tv2.setText(R.string.t_D12z);
            tv2.setPadding(7, 7, 7, 7);
        }
        //E
        else if (t_bible.equals("t_E1")) {
            TextView tv1 = (TextView) findViewById(R.id.textView_amsong_title);
            tv1.setText(R.string.t_E1t);
            tv1.setPadding(7, 7, 7, 7);
            TextView tv2 = (TextView) findViewById(R.id.textView_amsong_content);
            tv2.setText(R.string.t_E1z);
            tv2.setPadding(7, 7, 7, 7);
        }
        else if (t_bible.equals("t_E2")) {
            TextView tv1 = (TextView) findViewById(R.id.textView_amsong_title);
            tv1.setText(R.string.t_E2t);
            tv1.setPadding(7, 7, 7, 7);
            TextView tv2 = (TextView) findViewById(R.id.textView_amsong_content);
            tv2.setText(R.string.t_E2z);
            tv2.setPadding(7, 7, 7, 7);
        }
        else if (t_bible.equals("t_E3")) {
            TextView tv1 = (TextView) findViewById(R.id.textView_amsong_title);
            tv1.setText(R.string.t_E3t);
            tv1.setPadding(7, 7, 7, 7);
            TextView tv2 = (TextView) findViewById(R.id.textView_amsong_content);
            tv2.setText(R.string.t_E3z);
            tv2.setPadding(7, 7, 7, 7);
        }
        else if (t_bible.equals("t_E4")) {
            TextView tv1 = (TextView) findViewById(R.id.textView_amsong_title);
            tv1.setText(R.string.t_E4t);
            tv1.setPadding(7, 7, 7, 7);
            TextView tv2 = (TextView) findViewById(R.id.textView_amsong_content);
            tv2.setText(R.string.t_E4z);
            tv2.setPadding(7, 7, 7, 7);
        }
        else if (t_bible.equals("t_E5")) {
            TextView tv1 = (TextView) findViewById(R.id.textView_amsong_title);
            tv1.setText(R.string.t_E5t);
            tv1.setPadding(7, 7, 7, 7);
            TextView tv2 = (TextView) findViewById(R.id.textView_amsong_content);
            tv2.setText(R.string.t_E5z);
            tv2.setPadding(7, 7, 7, 7);
        }
        else if (t_bible.equals("t_E6")) {
            TextView tv1 = (TextView) findViewById(R.id.textView_amsong_title);
            tv1.setText(R.string.t_E6t);
            tv1.setPadding(7, 7, 7, 7);
            TextView tv2 = (TextView) findViewById(R.id.textView_amsong_content);
            tv2.setText(R.string.t_E6z);
            tv2.setPadding(7, 7, 7, 7);
        }
        else if (t_bible.equals("t_E7")) {
            TextView tv1 = (TextView) findViewById(R.id.textView_amsong_title);
            tv1.setText(R.string.t_E7t);
            tv1.setPadding(7, 7, 7, 7);
            TextView tv2 = (TextView) findViewById(R.id.textView_amsong_content);
            tv2.setText(R.string.t_E7z);
            tv2.setPadding(7, 7, 7, 7);
        }
        else if (t_bible.equals("t_E8")) {
            TextView tv1 = (TextView) findViewById(R.id.textView_amsong_title);
            tv1.setText(R.string.t_E8t);
            tv1.setPadding(7, 7, 7, 7);
            TextView tv2 = (TextView) findViewById(R.id.textView_amsong_content);
            tv2.setText(R.string.t_E8z);
            tv2.setPadding(7, 7, 7, 7);
        }
        else if (t_bible.equals("t_E9")) {
            TextView tv1 = (TextView) findViewById(R.id.textView_amsong_title);
            tv1.setText(R.string.t_E9t);
            tv1.setPadding(7, 7, 7, 7);
            TextView tv2 = (TextView) findViewById(R.id.textView_amsong_content);
            tv2.setText(R.string.t_E9z);
            tv2.setPadding(7, 7, 7, 7);
        }
        else if (t_bible.equals("t_E10")) {
            TextView tv1 = (TextView) findViewById(R.id.textView_amsong_title);
            tv1.setText(R.string.t_E10t);
            tv1.setPadding(7, 7, 7, 7);
            TextView tv2 = (TextView) findViewById(R.id.textView_amsong_content);
            tv2.setText(R.string.t_E10z);
            tv2.setPadding(7, 7, 7, 7);
        }
        else if (t_bible.equals("t_E11")) {
            TextView tv1 = (TextView) findViewById(R.id.textView_amsong_title);
            tv1.setText(R.string.t_E11t);
            tv1.setPadding(7, 7, 7, 7);
            TextView tv2 = (TextView) findViewById(R.id.textView_amsong_content);
            tv2.setText(R.string.t_E11z);
            tv2.setPadding(7, 7, 7, 7);
        }
        else if (t_bible.equals("t_E12")) {
            TextView tv1 = (TextView) findViewById(R.id.textView_amsong_title);
            tv1.setText(R.string.t_E12t);
            tv1.setPadding(7, 7, 7, 7);
            TextView tv2 = (TextView) findViewById(R.id.textView_amsong_content);
            tv2.setText(R.string.t_E12z);
            tv2.setPadding(7, 7, 7, 7);
        }

    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.button_hint:
                Intent intent1 = new Intent(this,pHint.class);
                intent1.putExtra("t_bible",t_bible);
                startActivity(intent1);
                break;
            case R.id.button_answer:
                Intent intent2 = new Intent(this,pBible.class);
                intent2.putExtra("t_bible",t_bible);
                startActivity(intent2);
                break;
        }
    }

}




