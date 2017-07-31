package edu.sliit.edulink;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class LessonActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson);

        final int grade = getIntent().getIntExtra("Grade", -1);
        final String subject = getIntent().getStringExtra("Subject");

        TextView testView = (TextView) findViewById(R.id.MyText);

        testView.setText(grade + " : " + subject);
    }
}
