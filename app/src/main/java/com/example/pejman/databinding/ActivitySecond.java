package com.example.pejman.databinding;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

import com.example.pejman.databinding.databinding.ActivitySecondBinding;

public class ActivitySecond extends AppCompatActivity implements View.OnClickListener {

    private String userName, userLastName, userJob;
    private int userGender;


    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_second);

        getUserInfoFromLoginPage();

        Person person = new Person();

        person.setPersonName(userName);
        person.setPersonLastName(userLastName);

        if(userGender == 0)
            person.setPersonGender("Male");
        else
            person.setPersonGender("Female");

        person.setPersonJob(userJob);


        ActivitySecondBinding binding = DataBindingUtil.setContentView(this , R.layout.activity_second);
        binding.setPerson(person);








    }




    private void getUserInfoFromLoginPage() {
        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {
            userName = bundle.getString("name");
            userLastName = bundle.getString("last_name");
            userJob = bundle.getString("job");
            userGender = bundle.getInt("gender");


        }
    }


    @Override
    public void onClick(View v) {

        switch (v.getId())
        {
            case R.id.txtjob :
            {
                Log.i("Log" , "Ok");
                Toast.makeText(this, "Mahdi"  , Toast.LENGTH_SHORT).show();break;
            }
        }
    }
}



