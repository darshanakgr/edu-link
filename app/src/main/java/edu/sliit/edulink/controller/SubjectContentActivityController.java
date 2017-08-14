package edu.sliit.edulink.controller;

/**
 * Created by drox2014 on 8/3/2017.
 */

public class SubjectContentActivityController {
    public static boolean[] getLessonsCount(int grade, String subject){
        switch (grade){
            case 1:
                if(subject.equals("ENG")){
                    return new boolean[]{true,true,false};
                }else if(subject.equals("MATH")){
                    return new boolean[]{true,true,true};
                }else{
                    return new boolean[]{false,false,false};
                }
            case 2:
                if(subject.equals("ENG")){
                    return new boolean[]{false,false,false};
                }else if(subject.equals("MATH")){
                    return new boolean[]{false,false,false};
                }else{
                    return new boolean[]{false,false,false};
                }
            case 3:
                if(subject.equals("ENG")){
                    return new boolean[]{true,true,true};
                }else if(subject.equals("MATH")){
                    return new boolean[]{true,false,false};
                }else{
                    return new boolean[]{false,false,false};
                }
            case 4:
                if(subject.equals("ENG")){
                    return new boolean[]{false,false,false};
                }else if(subject.equals("MATH")){
                    return new boolean[]{false,false,false};
                }else{
                    return new boolean[]{false,false,false};
                }
            default:
                return new boolean[]{false,false,false};
        }
    }

    public static boolean[] getTutorialCount(int grade, String subject){
        switch (grade){
            case 1:
                if(subject.equals("ENG")){
                    return new boolean[]{false,true,false};
                }else if(subject.equals("MATH")){
                    return new boolean[]{true,true,true};
                }else{
                    return new boolean[]{false,false,false};
                }
            case 2:
                if(subject.equals("ENG")){
                    return new boolean[]{false,false,false};
                }else if(subject.equals("MATH")){
                    return new boolean[]{false,false,false};
                }else{
                    return new boolean[]{false,false,false};
                }
            case 3:
                if(subject.equals("ENG")){
                    return new boolean[]{true,true,false};
                }else if(subject.equals("MATH")){
                    return new boolean[]{true,false,false};
                }else{
                    return new boolean[]{false,false,false};
                }
            case 4:
                if(subject.equals("ENG")){
                    return new boolean[]{false,false,false};
                }else if(subject.equals("MATH")){
                    return new boolean[]{false,false,false};
                }else{
                    return new boolean[]{false,false,false};
                }
            default:
                return new boolean[]{false,false,false};
        }
    }
}
