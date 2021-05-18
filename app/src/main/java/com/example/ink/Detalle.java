package com.example.ink;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Spinner;

public class Detalle extends AppCompatActivity {
    String tintas[][]={{"3PK-TANK","100 ml","5000 pág"},
            {"BT6001BK","110 ml","6000 pág"},
            {"BRD60BK","108 ml","6000 pág"},
            {"GI-10C","70 ml","7700 pág"},
            {"GI-190BK","135 ml","7000 pág"},
            {"GI-190C","70 ml","7000 pág"},
            {"GI-190M","70 ml","7000 pág"},
            {"GI-190Y","70 ml","7000 pág"},
            {"GT53BK","70 ml","4000 pág"},
            {"GT52C","70 ml","8000 pág"},
            {"GT52M","70 ml","8000 pág"},
            {"CT52Y","70 ml","8000 pág"},
            {"504 BK","127 ml","13500 pág"},
            {"504 C","70 ml","6000 pág"},
            {"504 M","70 ml","6000 pág"},
            {"504 Y","70 ml","6000 pág"},
            {"544 BK","65 ml","5500 pág"},
            {"544 C","65 ml","5500 pág"},
            {"544 M","65 ml","5500 pág"},
            {"544 Y","65 ml","5500 pág"},
            {"664 BK","70 ml","7500 pág"},
            {"664 C","70 ml","6000 pág"},
            {"664 M","70 ml","6000 pág"},
            {"664 Y","70 ml","6000 pág"},
            {"673 C","70 ml","6000 pág"},
            {"673 M","70 ml","6000 pág"},
            {"673 MC","70 ml","6000 pág"},
            {"774 BK","140 ml","15000 pág"},
            {"T49 C","140 ml","12000 pág"},
            {"T49 M","140 ml","12000 pág"},
            {"T49 Y","140 ml","12000 pág"},

    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detalle);


    }
}