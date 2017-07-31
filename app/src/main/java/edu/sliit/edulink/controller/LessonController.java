package edu.sliit.edulink.controller;

import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by drox on 7/31/2017.
 */

public class LessonController {
    public static List<Drawable> getGradeThreeEngLesOneImages(AssetManager assetManager) throws IOException {
        ArrayList<Drawable> drawables = new ArrayList<>();
        for (int i = 1; i < 5; i++) {
            InputStream stream = assetManager.open("gr-3-eng-les-" + i + ".png");
            drawables.add(Drawable.createFromStream(stream, null));
        }
        return drawables;
    }
}
