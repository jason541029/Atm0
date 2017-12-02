package com.example.user.atm0;

import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }
    public void login(View view){
        EditText edUserid = findViewById(R.id.userid);
        EditText password = findViewById(R.id.passwd);
        String userid = edUserid.getText().toString();
        String passwd = password.getText().toString();
        if("jason".equals(userid)&&"1029".equals(password)){
            Toast.makeText(this,"登入成功",Toast.LENGTH_LONG).show();
            finish();

        }else {
            new AlertDialog.Builder(this)
                    .setTitle("登入")
                    .setMessage("登入失敗")
                    .setPositiveButton("ok", null)
                    .show();
        }
}
public void cancel(View veiw){
    }
}