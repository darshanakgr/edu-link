package edu.sliit.edulink.lesson.gradethree.english.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import edu.sliit.edulink.R;

public class GradeThreeEngLessonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade_three_eng_lesson);

        getSupportActionBar().setTitle("Grade 3 | English");

        Button lessonOneBtn = (Button) findViewById(R.id.lesson_1_btn);
        lessonOneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(GradeThreeEngLessonActivity.this, GradeThreeMyselfActivity.class));
            }
        });
    }
}
