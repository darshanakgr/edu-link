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
        Log.d(TAG, subject + grade + lesson);
        switch (grade){
            case 1:
                if(subject.equals("ENG")){
                    switch (lesson){
                        case 1:
                            return null;
                        case 2:
                            return null;
                        case 3:
                            return null;
                        default:
                            return null;
                    }
                }else if(subject.equals("MATH")){
                    switch (lesson){
                        case 1:
                            return null;
                        case 2:
                            return null;
                        case 3:
                            return null;
                        default:
                            return null;
                    }
                }else{
                    switch (lesson){
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
                if(subject.equals("ENG")){
                    switch (lesson){
                        case 1:
                            return null;
                        case 2:
                            return null;
                        case 3:
                            return null;
                        default:
                            return null;
                    }
                }else if(subject.equals("MATH")){
                    switch (lesson){
                        case 1:
                            return null;
                        case 2:
                            return null;
                        case 3:
                            return null;
                        default:
                            return null;
                    }
                }else{
                    switch (lesson){
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
                if(subject.equals("ENG")){
                    switch (lesson){
                        case 1:
                            return getGradeThreeEngLesOneImages(assetManager);
                        case 2:
                            return getGradeThreeEngLesTwoImages(assetManager);
                        case 3:
                            return null;
                        default:
                            return null;
                    }
                }else if(subject.equals("MATH")){
                    switch (lesson){
                        case 1:
                            return null;
                        case 2:
                            return null;
                        case 3:
                            return null;
                        default:
                            return null;
                    }
                }else{
                    switch (lesson){
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
                if(subject.equals("ENG")){
                    switch (lesson){
                        case 1:
                            return null;
                        case 2:
                            return null;
                        case 3:
                            return null;
                        default:
                            return null;
                    }
                }else if(subject.equals("MATH")){
                    switch (lesson){
                        case 1:
                            return null;
                        case 2:
                            return null;
                        case 3:
                            return null;
                        default:
                            return null;
                    }
                }else{
                    switch (lesson){
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

    private static Drawable[] getGradeThreeEngLesOneImages(AssetManager assetManager) throws IOException {
        Drawable[] arr = new Drawable[4];
        for (int i = 0; i < 4; i++) {
            InputStream stream = assetManager.open("gr-3-eng-les-1-" + (i + 1)+ ".png");
            arr[i] = Drawable.createFromStream(stream, null);
        }
        return arr;
    }

    private static Drawable[] getGradeThreeEngLesTwoImages(AssetManager assetManager) throws IOException {
        Drawable[] arr = new Drawable[5];
        for (int i = 0; i < 5; i++) {
            InputStream stream = assetManager.open("gr-3-eng-les-2-" + (i + 1)+ ".png");
            arr[i] = Drawable.createFromStream(stream, null);
        }
        return arr;
    }
}
