package com.od.working_with_databases;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DbHandler handler = new DbHandler(this,"empdb",null,1);
//        handler.addEmployee(new Employee(10, "Onkar",33.3));
        handler.getEmployee(3);
        handler.close();
    }
}