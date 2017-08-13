package edu.sliit.edulink.controller;

import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by drox2014 on 8/3/2017.
 */

public class TutorialImageController {
    public static Drawable[] getTutorial(int grade, String subject, int tutorial, AssetManager assetManager) throws IOException {
        switch (grade){
            case 1:
                if(subject.equals("ENG")){
                    switch (tutorial){
                        case 1:
                            return null;
                        case 2:
                            return getGradeOneEngTutTwoImages(assetManager);
                        case 3:
                            return null;
                        default:
                            return null;
                    }
                }else if(subject.equals("MATH")){
                    switch (tutorial){
                        case 1:
                            return getGradeOneMatTutOneImages(assetManager);
                        case 2:
                            return getGradeOneMatTutTwoImages(assetManager);
                        case 3:
                            return getGradeOneMatTutThreeImages(assetManager);
                        default:
                            return null;
                    }
                }else{
                    switch (tutorial){
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
                    switch (tutorial){
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
                    switch (tutorial){
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
                    switch (tutorial){
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
                    switch (tutorial){
                        case 1:
                            return getGradeThreeEngTutOneImages(assetManager);
                        case 2:
                            return getGradeThreeEngTutTwoImages(assetManager);
                        case 3:
                            return null;
                        default:
                            return null;
                    }
                }else if(subject.equals("MATH")){
                    switch (tutorial){
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
                    switch (tutorial){
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
                    switch (tutorial){
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
                    switch (tutorial){
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
                    switch (tutorial){
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

    private static Drawable[] getGradeThreeEngTutOneImages(AssetManager assetManager) throws IOException {
        Drawable[] arr = new Drawable[4];
        for (int i = 0; i < 4; i++) {
            InputStream stream = assetManager.open("gr-3-eng-tut-1-" + (i + 1)+ "-min.png");
            arr[i] = Drawable.createFromStream(stream, null);
        }
        return arr;
    }

    private static Drawable[] getGradeOneEngTutTwoImages(AssetManager assetManager) throws IOException {
        Drawable[] arr = new Drawable[5];
        for (int i = 0; i < 5; i++) {
            InputStream stream = assetManager.open("gr-1-eng-tut-2-" + (i + 1)+ "-min.png");
            arr[i] = Drawable.createFromStream(stream, null);
        }
        return arr;
    }

    private static Drawable[] getGradeOneMatTutOneImages(AssetManager assetManager) throws IOException {
        Drawable[] arr = new Drawable[5];
        for (int i = 0; i < 5; i++) {
            InputStream stream = assetManager.open("gr-1-mat-tut-2-" + (i + 1)+ "-min.png");
            arr[i] = Drawable.createFromStream(stream, null);
        }
        return arr;
    }
    private static Drawable[] getGradeOneMatTutTwoImages(AssetManager assetManager) throws IOException {
        Drawable[] arr = new Drawable[6];
        for (int i = 0; i < 6; i++) {
            InputStream stream = assetManager.open("gr-1-mat-tut-1-" + (i + 1)+ "-min.png");
            arr[i] = Drawable.createFromStream(stream, null);
        }
        return arr;
    }
    private static Drawable[] getGradeOneMatTutThreeImages(AssetManager assetManager) throws IOException {
        Drawable[] arr = new Drawable[5];
        for (int i = 0; i < 5; i++) {
            InputStream stream = assetManager.open("gr-1-mat-tut-3-" + (i + 1)+ "-min.png");
            arr[i] = Drawable.createFromStream(stream, null);
        }
        return arr;
    }


    private static Drawable[] getGradeThreeEngTutTwoImages(AssetManager assetManager) throws IOException {
        Drawable[] arr = new Drawable[4];
        for (int i = 0; i < 4; i++) {
            InputStream stream = assetManager.open("gr-3-eng-tut-2-" + (i + 1)+ "-min.png");
            arr[i] = Drawable.createFromStream(stream, null);
        }
        return arr;
    }
}
