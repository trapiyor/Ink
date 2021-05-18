package com.example.ink;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    String[][] impresoras={{"DCP-T300","BROTHER","3PK-TANK","BT6001BK","",""},
            {"DCP-T500W","BROTHER","3PK-TANK","BT6001BK","",""},
            {"DCP-T700W","BROTHER","3PK-TANK","BT6001BK","",""},
            {"DCP-T510W","BROTHER","BRD60BK","","",""},
            {"DCP-T710W","BROTHER","BRD60BK","","",""},
            {"MFCT810W","BROTHER","BRD60BK","","",""},
            {"MFCT910DW","BROTHER","BRD60BK","","",""},
            {"G6010","CANON","GI-10C","","",""},
            {"G3100","CANON","GI-190BK","GI-190C","GI-190M","GI-190Y"},
            {"G2100","CANON","GI-190BK","GI-190C","GI-190M","GI-190Y"},
            {"G100","CANON","GI-190BK","GI-190C","GI-190M","GI-190Y"},
            {"Ink Tank 315","HP","GT53BK","GT52C","GT52M","CT52Y"},
            {"Ink Tank 415","HP","GT53BK","GT52C","GT52M","CT52Y"},
            {"Ink Tank 415","HP","GT53BK","GT52C","GT52M","CT52Y"},
            {"Smart Tank 517","HP","GT53BK","GT52C","GT52M","CT52Y"},
            {"Smart Tank 519","HP","GT53BK","GT52C","GT52M","CT52Y"},
            {"Smart Tank 615","HP","GT53BK","GT52C","GT52M","CT52Y"},
            {"Smart Tank 618","HP","GT53BK","GT52C","GT52M","CT52Y"},
            {"EcoTank L4150","EPSON","504 BK","504 C","504 M","504 Y"},
            {"EcoTank L4160","EPSON","504 BK","504 C","504 M","504 Y"},
            {"EcoTank L4171","EPSON","504 BK","504 C","504 M","504 Y"},
            {"EcoTank L3110","EPSON","544 BK","544 C","544 M","544 Y"},
            {"EcoTank L1110","EPSON","544 BK","544 C","544 M","544 Y"},
            {"EcoTank L3150","EPSON","544 BK","544 C","544 M","544 Y"},
            {"EcoTank L5190","EPSON","544 BK","544 C","544 M","544 Y"},
            {"L110","EPSON","664 BK","664 C","664 M","664 Y"},
            {"L1300","EPSON","664 BK","664 C","664 M","664 Y"},
            {"L210","EPSON","664 BK","664 C","664 M","664 Y"},
            {"L220","EPSON","664 BK","664 C","664 M","664 Y"},
            {"L310","EPSON","664 BK","664 C","664 M","664 Y"},
            {"L355","EPSON","664 BK","664 C","664 M","664 Y"},
            {"L365","EPSON","664 BK","664 C","664 M","664 Y"},
            {"L455","EPSON","664 BK","664 C","664 M","664 Y"},
            {"L555","EPSON","664 BK","664 C","664 M","664 Y"},
            {"L565","EPSON","664 BK","664 C","664 M","664 Y"},
            {"L1800","EPSON","673 C","673 M","673 MC",""},
            {"L800","EPSON","673 C","673 M","673 MC",""},
            {"L810","EPSON","673 C","673 M","673 MC",""},
            {"M100","EPSON","774 BK","T49 C","T49 M","T49 Y"},
            {"M105","EPSON","774 BK","T49 C","T49 M","T49 Y"},
            {"M200","EPSON","774 BK","T49 C","T49 M","T49 Y"},
            {"M205","EPSON","774 BK","T49 C","T49 M","T49 Y"}
    };
    String[] temp={"","","","","","",""};
    String[] cmodelo;
    String[] ctinta;
    String[] cmarca = {"CANON", "EPSON", "HP", "BROTHER"};
    Spinner spMarca,spModelo,spTinta;
    int cont=0;

    char color = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        spMarca = findViewById(R.id.spMarca);
        spModelo = findViewById(R.id.spModelo);
        spTinta = findViewById(R.id.spTinta);
        spMarca.setAdapter(new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, cmarca));
        spModelo.setAdapter(new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, temp));
        spTinta.setAdapter(new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, temp));

        spMarca.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int i, long id) {

                for(cont=0;cont<=6;cont++)
                {
                    cmodelo[cont]=impresoras[0][cont];
                    //else if(spMarca.getSelectedItem()=="CANON"){cmodelo[cont]=impresoras[cont+7][0];}
                    //else if(spMarca.getSelectedItem()=="HP"){cmodelo[cont]=impresoras[cont+11][0];}
                    //else if(spMarca.getSelectedItem()=="EPSON"){cmodelo[cont]=impresoras[cont+18][0];}
                    //else{cmodelo[cont]="";}
                };
                //spModelo.setAdapter(new ArrayAdapter<String>(MainActivity.this, android.R.layout.simple_spinner_dropdown_item, temp));
            }
            @Override
            public void onNothingSelected(AdapterView<?> parent) {
            }
        });


    }

    public void Color1(View view) {       color=1;    }

    public void Color2(View view) {        color=2;    }

    public void Color3(View view) {        color=3;    }

    public void Color4(View view) {        color=4;    }
}