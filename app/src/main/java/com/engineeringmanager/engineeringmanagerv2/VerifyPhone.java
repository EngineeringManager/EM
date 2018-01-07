package com.engineeringmanager.engineeringmanagerv2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.firebase.auth.FirebaseAuth;

public class VerifyPhone extends AppCompatActivity {

    private final int REQUEST_LOGIN=1000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_verify_phone);

        FirebaseAuth auth = FirebaseAuth.getInstance();
        if(auth.getCurrentUser() !=null)
        {
            if(!FirebaseAuth.getInstance().getCurrentUser().getEmail()
                    .isEmpty())
            {
                startActivity(new Intent(this,SignIn.class)
                .putExtra("phone",FirebaseAuth.getInstance()
                        .getCurrentUser().getPhoneNumber().isEmpty())
                );
                finish();
            }
            else
            {
                startActivityForResult(AuthUI.getInstance()
                        .createSignInIntentBuilder()
                        .setAvailabeProviders(new AuthUI.IdpConfig
                        .Builder(AuthUI.PHONE_VERIFICATION_PROVIDER).build()));
            }
        }
    }
}
