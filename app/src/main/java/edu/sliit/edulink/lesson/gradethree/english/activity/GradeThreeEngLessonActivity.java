package edu.sliit.edulink.lesson.gradethree.english.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import edu.sliit.edulink.R;

public class GradeThreeEngLessonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade_three_eng_lesson);

        getSupportActionBar().setTitle("Grade 3 | English");
    }
}
