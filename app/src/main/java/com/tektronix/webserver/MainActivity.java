package com.tektronix.webserver;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import java.io.IOException;
import java.util.HashMap;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TinyWebServer.startServer("10.255.254.11",9000, "/");
    }

    public String simplejson(HashMap qparms){
        //simple json output demo from controller method
        String json = "{\"name\":\"sonu\",\"age\":29}";
        return json.toString();
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        //stop webserver on destroy of service or process
        TinyWebServer.stopServer();
    }
}