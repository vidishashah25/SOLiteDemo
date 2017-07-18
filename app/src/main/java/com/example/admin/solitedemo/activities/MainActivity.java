package com.example.admin.solitedemo.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.admin.solitedemo.R;
import com.example.admin.solitedemo.database.DBHandler;
import com.example.admin.solitedemo.models.StudentModel;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        DBHandler db = new DBHandler(getApplicationContext());

        db.addStudent(new StudentModel(1, "Vidisha", "v@gmail.com"));
        db.addStudent(new StudentModel(2, "Aesha", "a@gmail.com"));
        db.addStudent(new StudentModel(3, "Manali", "m@gmail.com"));

        //Getting student from database

        List<StudentModel> students = db.getAllStudents();

        for (StudentModel i : students){
            String log = "Id:" + i.getStudentID() +
                    " ,Name: " + i.getStudentName() +
                    " ,Email:" + i.getStudentEmail();

            //writing Contacts to log

            Log.d("MainActivity",log);

        }

    }
}
