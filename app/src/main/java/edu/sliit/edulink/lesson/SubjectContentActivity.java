package edu.sliit.edulink.lesson;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import edu.sliit.edulink.R;
import edu.sliit.edulink.tutoral.TutorialViewerActivity;

public class SubjectContentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject_content);

        setActionbarTitle();

        Button lessonOneBtn = (Button) findViewById(R.id.lesson_1_btn);
        Button lessonTwoBtn = (Button) findViewById(R.id.lesson_2_btn);
        Button lessonThreeBtn = (Button) findViewById(R.id.lesson_3_btn);
        Button tutorialOneBtn = (Button) findViewById(R.id.tutorial_1_btn);
        Button tutorialTwoBtn = (Button) findViewById(R.id.tutorial_2_btn);
        Button tutorialThreeBtn = (Button) findViewById(R.id.tutorial_3_btn);
        lessonOneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SubjectContentActivity.this, LessonViewerActivity.class);
                intent.putExtra("Grade", getIntent().getIntExtra("Grade", -1));
                intent.putExtra("Subject", getIntent().getStringExtra("Subject"));
                intent.putExtra("Lesson", 1);
                startActivity(intent);
            }
        });

        lessonTwoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SubjectContentActivity.this, LessonViewerActivity.class);
                intent.putExtra("Grade", getIntent().getIntExtra("Grade", -1));
                intent.putExtra("Subject", getIntent().getStringExtra("Subject"));
                intent.putExtra("Lesson", 2);
                startActivity(intent);
            }
        });

        lessonThreeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SubjectContentActivity.this, LessonViewerActivity.class);
                intent.putExtra("Grade", getIntent().getIntExtra("Grade", -1));
                intent.putExtra("Subject", getIntent().getStringExtra("Subject"));
                intent.putExtra("Lesson", 3);
                startActivity(intent);
            }
        });

        tutorialOneBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SubjectContentActivity.this, TutorialViewerActivity.class);
                intent.putExtra("Grade", getIntent().getIntExtra("Grade", -1));
                intent.putExtra("Subject", getIntent().getStringExtra("Subject"));
                intent.putExtra("Tutorial", 1);
                startActivity(intent);
            }
        });

        tutorialTwoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SubjectContentActivity.this, TutorialViewerActivity.class);
                intent.putExtra("Grade", getIntent().getIntExtra("Grade", -1));
                intent.putExtra("Subject", getIntent().getStringExtra("Subject"));
                intent.putExtra("Tutorial", 2);
                startActivity(intent);
            }
        });

        tutorialThreeBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SubjectContentActivity.this, TutorialViewerActivity.class);
                intent.putExtra("Grade", getIntent().getIntExtra("Grade", -1));
                intent.putExtra("Subject", getIntent().getStringExtra("Subject"));
                intent.putExtra("Tutorial", 3);
                startActivity(intent);
            }
        });
    }


    private void setActionbarTitle(){
        int grade = getIntent().getIntExtra("Grade", -1);
        String subject = getIntent().getStringExtra("Subject");
        if(subject.equals("ENG")){
            getSupportActionBar().setTitle(String.format("Grade %d | %s", grade, "English"));
        }else if(subject.equals("MATH")){
            getSupportActionBar().setTitle(String.format("Grade %d | %s", grade, "Mathematics"));
        }else{
            getSupportActionBar().setTitle(String.format("Grade %d | %s", grade, "Dictionary"));
        }
    }
}
