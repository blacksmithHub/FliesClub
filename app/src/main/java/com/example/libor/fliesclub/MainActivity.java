package com.example.libor.fliesclub;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Adapter;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public ImageButton signup = (ImageButton) findViewById(R.id.imageButton_submit);
    public EditText surname, firstname, mi, birth, address, email, password, confirm;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        surname = (EditText)findViewById(R.id.editText_surname);
        firstname = (EditText)findViewById(R.id.editText_firstname);
        mi = (EditText)findViewById(R.id.editText_middleinitial);
        birth = (EditText)findViewById(R.id.editText_birthday);
        address = (EditText)findViewById(R.id.editText_address);
        email = (EditText)findViewById(R.id.editText_email);
        password = (EditText)findViewById(R.id.editText_password);
        confirm = (EditText)findViewById(R.id.editText_retypepass);

    }

    public void onButtonClickListener (View v) {
        final Animation myAnim = AnimationUtils.loadAnimation(this, R.anim.alpha);
        signup.startAnimation(myAnim);

        if (password.getText().toString().matches(confirm.getText().toString()))
        {
            if(surname.getText().toString().matches("") && firstname.getText().toString().matches("")
                    && mi.getText().toString().matches("") && birth.getText().toString().matches("")
                    && address.getText().toString().matches("") && email.getText().toString().matches("")
                    && password.getText().toString().matches("") && confirm.getText().toString().matches(""))
            {
                Toast.makeText(MainActivity.this, "Invalid surname, Invalid firstname, Invalid middle initial, Invalid birthday, Invalid email, Invalid address, and Invalid password", Toast.LENGTH_LONG).show();
            }
            else if(firstname.getText().toString().matches("")
                    && mi.getText().toString().matches("") && birth.getText().toString().matches("")
                    && address.getText().toString().matches("") && email.getText().toString().matches("")
                    && password.getText().toString().matches("") && confirm.getText().toString().matches(""))
            {
                Toast.makeText(MainActivity.this, "Invalid firstname, Invalid middle initial, Invalid birthday, Invalid email, Invalid address, and Invalid password", Toast.LENGTH_LONG).show();
            }
            else if(mi.getText().toString().matches("") && birth.getText().toString().matches("")
                    && address.getText().toString().matches("") && email.getText().toString().matches("")
                    && password.getText().toString().matches("") && confirm.getText().toString().matches(""))
            {
                Toast.makeText(MainActivity.this, "Invalid middle initial, Invalid birthday, Invalid email, Invalid address, and Invalid password", Toast.LENGTH_LONG).show();
            }
            else if(birth.getText().toString().matches("")
                    && address.getText().toString().matches("") && email.getText().toString().matches("")
                    && password.getText().toString().matches("") && confirm.getText().toString().matches(""))
            {
                Toast.makeText(MainActivity.this, "Invalid birthday, Invalid email, Invalid address, and Invalid password", Toast.LENGTH_LONG).show();
            }
            else if( address.getText().toString().matches("") && email.getText().toString().matches("")
                    && password.getText().toString().matches("") && confirm.getText().toString().matches(""))
            {
                Toast.makeText(MainActivity.this, "Invalid email, Invalid address, and Invalid password", Toast.LENGTH_LONG).show();
            }
            else if(email.getText().toString().matches("")
                    && password.getText().toString().matches("") && confirm.getText().toString().matches(""))
            {
                Toast.makeText(MainActivity.this, "Invalid address, and Invalid password", Toast.LENGTH_LONG).show();
            }
            else if (surname.getText().toString().matches(""))
            {
                Toast.makeText(MainActivity.this, "Surname is required", Toast.LENGTH_SHORT).show();
            }
            else if (firstname.getText().toString().matches(""))
            {
                Toast.makeText(MainActivity.this, "First Name is required", Toast.LENGTH_SHORT).show();
            }
            else if (mi.getText().toString().matches(""))
            {
                Toast.makeText(MainActivity.this, "Middle Initial is required", Toast.LENGTH_SHORT).show();
            }
            else if (address.getText().toString().matches(""))
            {
                Toast.makeText(MainActivity.this, "Address is required", Toast.LENGTH_SHORT).show();
            }
            else if (birth.getText().toString().matches(""))
            {
                Toast.makeText(MainActivity.this, "Date of birth is required", Toast.LENGTH_SHORT).show();
            }
            else if (email.getText().toString().matches("") || email.getText().toString().endsWith("@gmail.com"))
            {
                Toast.makeText(MainActivity.this, "E-mail is required", Toast.LENGTH_SHORT).show();
            }
            else if (password.getText().toString().matches("") && confirm.getText().toString().matches(""))
            {
                Toast.makeText(MainActivity.this, "Password is required", Toast.LENGTH_SHORT).show();
            }
            else
            {
                Toast.makeText(MainActivity.this, "submitting...", Toast.LENGTH_SHORT).show();
            }
        }
        else if(!password.getText().toString().matches(confirm.getText().toString()))
        {
            if (confirm.getText().toString().matches(""))
            {
                Toast.makeText(MainActivity.this, "Password is required", Toast.LENGTH_SHORT).show();
            }
            else
            {
                Toast.makeText(MainActivity.this, "Password is not match", Toast.LENGTH_SHORT).show();
            }
        }

    }
}
