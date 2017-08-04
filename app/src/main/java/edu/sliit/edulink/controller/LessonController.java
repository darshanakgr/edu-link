package edu.sliit.edulink.controller;

import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.util.Log;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by drox on 7/31/2017.
 */

public class LessonController {

    private static String TAG = "LessonController";

    public static Drawable[] getLessons(int grade, String subject, int lesson, AssetManager assetManager) throws IOException {
        switch (grade) {
            case 1:
                if (subject.equals("ENG")) {
                    switch (lesson) {
                        case 1:
                            return getGradeOneEngLesImages(assetManager);
                        case 2:
                            return null;
                        case 3:
                            return null;
                        default:
                            return null;
                    }
                } else if (subject.equals("MATH")) {
                    switch (lesson) {
                        case 1:
                            return getGradeOneMatLesOneImages(assetManager);
                        case 2:
                            return getGradeOneMatLesTwoImages(assetManager);
                        case 3:
                            return getGradeOneMatLesThreeImages(assetManager);
                        default:
                            return null;
                    }
                } else {
                    switch (lesson) {
                        case 1:
                            return null;
                        case 2:
                            return null;
                        case 3:
                            return null;
                        default:
                            return null;
                    }
                }
            case 2:
                if (subject.equals("ENG")) {
                    switch (lesson) {
                        case 1:
                            return null;
                        case 2:
                            return null;
                        case 3:
                            return null;
                        default:
                            return null;
                    }
                } else if (subject.equals("MATH")) {
                    switch (lesson) {
                        case 1:
                            return null;
                        case 2:
                            return null;
                        case 3:
                            return null;
                        default:
                            return null;
                    }
                } else {
                    switch (lesson) {
                        case 1:
                            return null;
                        case 2:
                            return null;
                        case 3:
                            return null;
                        default:
                            return null;
                    }
                }
            case 3:
                if (subject.equals("ENG")) {
                    switch (lesson) {
                        case 1:
                            return getGradeThreeEngLesOneImages(assetManager);
                        case 2:
                            return getGradeThreeEngLesTwoImages(assetManager);
                        case 3:
                            return getGradeThreeEngLesThreeImages(assetManager);
                        default:
                            return null;
                    }
                } else if (subject.equals("MATH")) {
                    switch (lesson) {
                        case 1:
                            return null;
                        case 2:
                            return null;
                        case 3:
                            return null;
                        default:
                            return null;
                    }
                } else {
                    switch (lesson) {
                        case 1:
                            return null;
                        case 2:
                            return null;
                        case 3:
                            return null;
                        default:
                            return null;
                    }
                }
            case 4:
                if (subject.equals("ENG")) {
                    switch (lesson) {
                        case 1:
                            return null;
                        case 2:
                            return null;
                        case 3:
                            return null;
                        default:
                            return null;
                    }
                } else if (subject.equals("MATH")) {
                    switch (lesson) {
                        case 1:
                            return null;
                        case 2:
                            return null;
                        case 3:
                            return null;
                        default:
                            return null;
                    }
                } else {
                    switch (lesson) {
                        case 1:
                            return null;
                        case 2:
                            return null;
                        case 3:
                            return null;
                        default:
                            return null;
                    }
                }
            default:
                return null;
        }
    }

    private static Drawable[] getGradeOneMatLesThreeImages(AssetManager assetManager) throws IOException {
        Drawable[] arr = new Drawable[5];
        for (int i = 0; i < 5; i++) {
            InputStream stream = assetManager.open("gr-1-mat-les-3-" + (i + 1) + "-min.png");
            arr[i] = Drawable.createFromStream(stream, null);
        }
        return arr;
    }

    private static Drawable[] getGradeOneMatLesTwoImages(AssetManager assetManager) throws IOException {
        Drawable[] arr = new Drawable[5];
        for (int i = 0; i < 5; i++) {
            InputStream stream = assetManager.open("gr-1-mat-les-1-" + (i + 1) + "-min.png");
            arr[i] = Drawable.createFromStream(stream, null);
        }
        return arr;
    }

    private static Drawable[] getGradeOneMatLesOneImages(AssetManager assetManager) throws IOException {
        Drawable[] arr = new Drawable[9];
        for (int i = 0; i < 9; i++) {
            InputStream stream = assetManager.open("gr-1-mat-les-2-" + (i + 1) + "-min.png");
            arr[i] = Drawable.createFromStream(stream, null);
        }
        return arr;
    }

    private static Drawable[] getGradeOneEngLesImages(AssetManager assetManager) throws IOException {
        Drawable[] arr = new Drawable[26];
        for (int i = 0; i < 26; i++) {
            InputStream stream = assetManager.open("gr-1-eng-les-" + (i + 1) + "-min-min.png");
            arr[i] = Drawable.createFromStream(stream, null);
        }
        return arr;
    }


    private static Drawable[] getGradeThreeEngLesOneImages(AssetManager assetManager) throws IOException {
        Drawable[] arr = new Drawable[4];
        for (int i = 0; i < 4; i++) {
            InputStream stream = assetManager.open("gr-3-eng-les-1-" + (i + 1) + "-min.png");
            arr[i] = Drawable.createFromStream(stream, null);
        }
        return arr;
    }

    private static Drawable[] getGradeThreeEngLesTwoImages(AssetManager assetManager) throws IOException {
        Drawable[] arr = new Drawable[5];
        for (int i = 0; i < 5; i++) {
            InputStream stream = assetManager.open("gr-3-eng-les-2-" + (i + 1) + "-min.png");
            arr[i] = Drawable.createFromStream(stream, null);
        }
        return arr;
    }

    private static Drawable[] getGradeThreeEngLesThreeImages(AssetManager assetManager) throws IOException {
        Drawable[] arr = new Drawable[10];
        for (int i = 0; i < 10; i++) {
            InputStream stream = assetManager.open("gr-3-eng-les-3-" + (i + 1) + "-min.png");
            arr[i] = Drawable.createFromStream(stream, null);
        }
        return arr;
    }
}
