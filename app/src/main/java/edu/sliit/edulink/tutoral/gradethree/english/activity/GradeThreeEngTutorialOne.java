package edu.sliit.edulink.tutoral.gradethree.english.activity;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import edu.sliit.edulink.R;
import edu.sliit.edulink.tutoral.AlertDialogBuilder;

public class GradeThreeEngTutorialOne extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade_three_eng_tutorial_one);

        String title = getIntent().getStringExtra("Title");
        getSupportActionBar().setTitle(title);

        ((Button) findViewById(R.id.q_1_ans_1)).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialogBuilder.getWrongAnswerDialog(GradeThreeEngTutorialOne.this).show();
            }
        });
    }
}
