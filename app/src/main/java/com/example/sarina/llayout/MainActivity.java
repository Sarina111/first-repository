package com.example.sarina.llayout;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    private EditText etname;
    private EditText etpassword;
    private EditText etemail;
    private Button btnLogin;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }

    private void init(){
        etname=(EditText)findViewById(R.id.etname);
        etpassword=(EditText)findViewById(R.id.etpassword);
        btnLogin=(Button)findViewById(R.id.btnlog);
        btnLogin.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch(view.getId()){
            case R.id.btnlog:
                LoginClick();
                break;


        }

    }
    private void LoginClick(){
        String name=etname.getText().toString().trim();
        String pass=etpassword.getText().toString().trim();
        Toast.makeText(this,name +"  "+pass,Toast.LENGTH_SHORT).show();
    }
}
