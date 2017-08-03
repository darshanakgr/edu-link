package edu.sliit.edulink.controller;

import android.content.Context;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.drawable.Drawable;
import android.view.View;

import java.io.IOException;

import edu.sliit.edulink.lesson.SubjectContentActivity;
import edu.sliit.edulink.tutoral.gradethree.english.activity.GradeThreeEngTutorialOne;

/**
 * Created by drox2014 on 8/2/2017.
 */

public class TutorialController {
    public static Intent getTutorial(int grade, String subject, int tutorial, SubjectContentActivity context){
        switch (grade){
            case 1:
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
                            Intent intent = new Intent(context, GradeThreeEngTutorialOne.class);
                            intent.putExtra("Titke", "Grade 3 | English | Tutorial 1");
                            return intent;
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
}
