package com.aghabalaee.siavash.myrsa;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.aghabalaee.siavash.myrsa.util.RSA;

import java.util.Map;

public class MainActivity extends AppCompatActivity {

    //private String publicKey = "";
    //private String privateKey = "";
    //private String encrypt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //try {
        //    Map<String, String> map = RSA.generateKeyPair();
//
        //    publicKey = map.get("publicKey");
        //    privateKey = map.get("privateKey");
//
//
        //    publicKey = "MIGfMA0GCSqGSIb3DQEBAQUAA4GNADCBiQKBgQCv/PEYIPClBBnmQAp9oeH3FenedFZx5lv01RMbiySiNNU1NfBAHstXnU1osFqJnDxWThexiwyf5POP3cM4QNYo8IsfcDotsG+/DQXwNqp+4sYzqgCXUJQYVNCHOMPo7Gmeuu6nVvvKVOzlfejM0lnlLeincKymIC0ayZgCiqPMwQIDAQAB";
//
//
        //    Log.i("kk",publicKey);
        //    Log.i("kk",privateKey);
//
        //} catch (Exception e) {
        //    e.printStackTrace();
        //    Log.i("kk","catch1");
        //}
//
//
        //try {
//
        //    encrypt = RSA.encrypt("json", publicKey);
        //    Log.i("kk",encrypt);
//
        //} catch (Exception e) {
        //    e.printStackTrace();
        //    Log.i("kk","catch2");
        //}
//
        //try {
        //    String sign = RSA.sign(encrypt, privateKey);
        //    Log.i("kk",sign);
        //}catch (Exception e){
        //    Log.i("kk","catch3");
        //}



    }
}
