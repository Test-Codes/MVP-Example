package io.realm.mvp.example;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import io.realm.mvp.example.model.User;


public class MainActivity extends AppCompatActivity {

    User user;
    TextView userInfoTextView;
    EditText fullName;
    EditText email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        user  = new User();

        userInfoTextView = (TextView) findViewById(R.id.userInfo);
        fullName = (EditText) findViewById(R.id.fullName);
        email = (EditText) findViewById(R.id.email);

        fullName.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                user.setFullName(String.valueOf(fullName.getText()));
                updateViews();
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
        email.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {
            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                user.setEmail(String.valueOf(email.getText()));
                updateViews();

            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
    }

    private void updateViews() {
        userInfoTextView.setText(user.toString());
    }
}
