package edu.sliit.edulink;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.Toast;

import edu.sliit.edulink.lesson.SubjectContentActivity;

public class SubjectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_subject);

        final int grade = getIntent().getIntExtra("Grade", -1);
        getSupportActionBar().setTitle("Grade " + grade);

        ImageButton englishButton = (ImageButton) findViewById(R.id.english_btn);
        ImageButton mathematicButton = (ImageButton) findViewById(R.id.mathemathics_btn);
        ImageButton dictionaryButton = (ImageButton) findViewById(R.id.dictionary_btn);

        englishButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SubjectActivity.this, SubjectContentActivity.class);
                intent.putExtra("Grade", grade);
                intent.putExtra("Subject", "ENG");
                startActivity(intent);
            }
        });

        dictionaryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SubjectActivity.this, SubjectContentActivity.class);
                intent.putExtra("Grade", grade);
                intent.putExtra("Subject", "DICT");
                startActivity(intent);
            }
        });

        mathematicButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(SubjectActivity.this, SubjectContentActivity.class);
                intent.putExtra("Grade", grade);
                intent.putExtra("Subject", "MATH");
                startActivity(intent);
            }
        });


    }
}
