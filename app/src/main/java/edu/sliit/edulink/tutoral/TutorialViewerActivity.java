package edu.sliit.edulink.tutoral;

import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;

import java.io.IOException;
import java.io.InputStream;

import edu.sliit.edulink.R;
import edu.sliit.edulink.controller.TutorialAnswerController;
import edu.sliit.edulink.controller.TutorialImageController;

public class TutorialViewerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutorial_viewer);

        int grade = getIntent().getIntExtra("Grade", -1);
        int tutorial = getIntent().getIntExtra("Tutorial", -1);
        String subject = getIntent().getStringExtra("Subject");

        setActionbarTitle(grade,subject,tutorial);


        try {
            String[][] answers = TutorialAnswerController.getTutorial(grade, subject, tutorial);
            Drawable[] images = TutorialImageController.getTutorial(grade, subject, tutorial, getResources().getAssets());
            ImageView[] imageViews = getImageViews();
            if(grade==1 && subject=="ENG" && tutorial==1 ) {
                ImageButton[][] buttons = getImageButtons();
                AssetManager assetManager = getResources().getAssets();
                if (answers != null){
                    if(images != null){
                        for (int i = 0; i < 4; i++) {
                            imageViews[i].setImageDrawable(images[i]);
                        }
                        for (int i = 0; i < 4; i++) {
                            for (int j = 0; j < 3; j++) {
                                InputStream stream = assetManager.open(answers[i][j]);
                                buttons[i][j].setImageDrawable(Drawable.createFromStream(stream, null));
                                buttons[i][j].setTag(answers[i][j]);
                                setActionListener(buttons[i][j],answers[i][3]);
                            }
                        }
                    }
                }
            }else {
                Button[][] buttons = getButtons();
                if (answers != null){
                    if(images != null){
                        for (int i = 0; i < 4; i++) {
                            imageViews[i].setImageDrawable(images[i]);
                        }
                        for (int i = 0; i < 4; i++) {
                            for (int j = 0; j < 3; j++) {
                                buttons[i][j].setText(answers[i][j]);
                                setActionListener(buttons[i][j],answers[i][3]);
                            }
                        }
                    }
                }
            }


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private Button[][] getButtons(){
        Button[][] buttons = new Button[4][3];

        buttons[0][0] = (Button) findViewById(R.id.q_1_ans_1);
        buttons[0][1] = (Button) findViewById(R.id.q_1_ans_2);
        buttons[0][2] = (Button) findViewById(R.id.q_1_ans_3);

        buttons[1][0] = (Button) findViewById(R.id.q_2_ans_1);
        buttons[1][1] = (Button) findViewById(R.id.q_2_ans_2);
        buttons[1][2] = (Button) findViewById(R.id.q_2_ans_3);

        buttons[2][0] = (Button) findViewById(R.id.q_3_ans_1);
        buttons[2][1] = (Button) findViewById(R.id.q_3_ans_2);
        buttons[2][2] = (Button) findViewById(R.id.q_3_ans_3);

        buttons[3][0] = (Button) findViewById(R.id.q_4_ans_1);
        buttons[3][1] = (Button) findViewById(R.id.q_4_ans_2);
        buttons[3][2] = (Button) findViewById(R.id.q_4_ans_3);

        return buttons;
    };

    private ImageButton[][] getImageButtons(){
        ImageButton[][] buttons = new ImageButton[4][3];

        buttons[0][0] = (ImageButton) findViewById(R.id.q_1_ans_1);
        buttons[0][1] = (ImageButton) findViewById(R.id.q_1_ans_2);
        buttons[0][2] = (ImageButton) findViewById(R.id.q_1_ans_3);

        buttons[1][0] = (ImageButton) findViewById(R.id.q_2_ans_1);
        buttons[1][1] = (ImageButton) findViewById(R.id.q_2_ans_2);
        buttons[1][2] = (ImageButton) findViewById(R.id.q_2_ans_3);

        buttons[2][0] = (ImageButton) findViewById(R.id.q_3_ans_1);
        buttons[2][1] = (ImageButton) findViewById(R.id.q_3_ans_2);
        buttons[2][2] = (ImageButton) findViewById(R.id.q_3_ans_3);

        buttons[3][0] = (ImageButton) findViewById(R.id.q_4_ans_1);
        buttons[3][1] = (ImageButton) findViewById(R.id.q_4_ans_2);
        buttons[3][2] = (ImageButton) findViewById(R.id.q_4_ans_3);

        return buttons;
    };

    private ImageView[] getImageViews(){
        return new ImageView[]{
                (ImageView) findViewById(R.id.q_1_img_1),
                (ImageView) findViewById(R.id.q_2_img_1),
                (ImageView) findViewById(R.id.q_3_img_1),
                (ImageView) findViewById(R.id.q_4_img_1)
        };
    }

    private void setActionbarTitle(int grade, String subject, int tutorial){
        if(subject.equals("ENG")){
            getSupportActionBar().setTitle(String.format("Grade %d | %s | Tutorial %d", grade, "English", tutorial));
        }else if(subject.equals("MATH")){
            getSupportActionBar().setTitle(String.format("Grade %d | %s | Tutorial %d", grade, "Mathematics", tutorial));
        }else{
            getSupportActionBar().setTitle(String.format("Grade %d | %s | Tutorial %d", grade, "Dictionary", tutorial));
        }
    }

    private void setActionListener(final Button button, final String answer) {
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (button.getText().equals(answer)) {
                    AlertDialogBuilder.getCorrectAnswerDialog(TutorialViewerActivity.this).show();
                } else {
                    AlertDialogBuilder.getWrongAnswerDialog(TutorialViewerActivity.this).show();
                }
            }
        });
    }
    private void setActionListener(final ImageButton button, final String answer){
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(button.getTag().equals(answer)){
                    AlertDialogBuilder.getCorrectAnswerDialog(TutorialViewerActivity.this).show();
                }else{
                    AlertDialogBuilder.getWrongAnswerDialog(TutorialViewerActivity.this).show();
                }
            }
        });
    }
}
