package com.ts.myapp.activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.ts.myapp.MainActivity;
import com.ts.myapp.R;
import com.ts.myapp.fragment.UserFragment;
import com.ts.myapp.utils.EditTextClearTools;
import com.ts.myapp.utils.ToastUtils;

/**
 * Created by Administrator on 2018/3/23.
 */

public class LoginActivity extends AppCompatActivity {

    private EditText etUserName;
    private EditText etUserPassword;
    private Button btnLogin;
    private String userName;
    private String userPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        init();

        btnLogin = findViewById(R.id.btn_login);
        loginListener();
    }

    private void init() {
        EditText userName = (EditText) findViewById(R.id.et_userName);
        EditText password = (EditText) findViewById(R.id.et_password);
        ImageView unameClear = (ImageView) findViewById(R.id.iv_unameClear);
        ImageView pwdClear = (ImageView) findViewById(R.id.iv_pwdClear);

        EditTextClearTools.addClearListener(userName, unameClear);
        EditTextClearTools.addClearListener(password, pwdClear);
    }


    //定义构造方法
    private void loginListener() {
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ToastUtils.showShortToast(LoginActivity.this, "0000！");
                Intent intent = new Intent(LoginActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }
}
