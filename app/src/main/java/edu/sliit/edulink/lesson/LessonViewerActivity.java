package edu.sliit.edulink.lesson;

import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

import java.io.IOException;

import edu.sliit.edulink.R;
import edu.sliit.edulink.controller.LessonController;
import edu.sliit.edulink.iterator.Iterator;

public class LessonViewerActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lesson_viewer);

        int grade = getIntent().getIntExtra("Grade", -1);
        int lesson = getIntent().getIntExtra("Lesson", -1);
        String subject = getIntent().getStringExtra("Subject");

        setActionbarTitle(grade, subject, lesson);

        try {
            Drawable[] lessons = LessonController.getLessons(grade, subject, lesson, getResources().getAssets());
            setActions(lessons);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    protected void setActions(final Drawable[] drawables){
        if(drawables != null){
            final ImageView imageView = (ImageView) findViewById(R.id.img_viewer_img);
            final Button nextButton = (Button) findViewById(R.id.img_viewer_next_btn);
            final Button prevButton = (Button) findViewById(R.id.img_viewer_prev_btn);

            final Iterator<Drawable> iterator = new Iterator<>(drawables);
            prevButton.setEnabled(false);
            if(iterator.hasNext()){
                imageView.setImageDrawable(iterator.next());
            }
            nextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(iterator.hasNext()){
                        prevButton.setEnabled(true);
                        imageView.setImageDrawable(iterator.next());
                        if(!iterator.hasNext()){
                            nextButton.setEnabled(false);
                        }
                    }
                }
            });
            prevButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(iterator.hasPrevious()){
                        nextButton.setEnabled(true);
                        imageView.setImageDrawable(iterator.previous());
                        if(!iterator.hasPrevious()){
                            prevButton.setEnabled(false);
                        }
                    }
                }
            });
        }
    }

    private void setActionbarTitle(int grade, String subject, int lesson){
        if(subject.equals("ENG")){
            getSupportActionBar().setTitle(String.format("Grade %d | %s | Lesson %d", grade, "English", lesson));
        }else if(subject.equals("MATH")){
            getSupportActionBar().setTitle(String.format("Grade %d | %s | Lesson %d", grade, "Mathematics", lesson));
        }else{
            getSupportActionBar().setTitle(String.format("Grade %d | %s | Lesson %d", grade, "Dictionary", lesson));
        }
    }


}
