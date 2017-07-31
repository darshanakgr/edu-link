package edu.sliit.edulink.lesson.gradethree.english.activity;

import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.util.Iterator;
import java.util.List;

import edu.sliit.edulink.R;
import edu.sliit.edulink.controller.LessonController;

public class GradeThreeMyselfActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grade_three_myself);

        final ImageView imageView = (ImageView) findViewById(R.id.grade_3_eng_les_1_img);

        AssetManager assets = getResources().getAssets();
        try {
            final List<Drawable> drawables = LessonController.getGradeThreeEngLesOneImages(assets);
            final Iterator<Drawable> iterator = drawables.iterator();
            final Button nextButton = (Button) findViewById(R.id.grade_3_eng_les_1_next_btn);
            if(iterator.hasNext()){
                imageView.setImageDrawable(iterator.next());
            }
            nextButton.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(iterator.hasNext()){
                        imageView.setImageDrawable(iterator.next());
                        if(!iterator.hasNext()){
                            nextButton.setText("Launch Game >>");
                        }
                    }else{
                        Toast.makeText(getApplicationContext(), "Launching game", Toast.LENGTH_SHORT);
                    }
                }
            });
        } catch (IOException e) {
            Log.e("ERR", e.getMessage());
        }
    }
}
