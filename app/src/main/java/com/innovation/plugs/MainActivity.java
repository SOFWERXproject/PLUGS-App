package com.innovation.plugs;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    Button btnOnOff, btnDiscovery, btnSend;
    ListView listView;
    TextView read_msg_box, ConnectionStatus;
    EditText writeMSg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
