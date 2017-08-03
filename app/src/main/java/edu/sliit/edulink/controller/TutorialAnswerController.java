package edu.sliit.edulink.controller;

/**
 * Created by drox2014 on 8/3/2017.
 */

public class TutorialAnswerController {
    public static String[][] getTutorial(int grade, String subject, int tutorial) {
        switch (grade) {
            case 1:
                if (subject.equals("ENG")) {
                    switch (tutorial) {
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
                    switch (tutorial) {
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
                    switch (tutorial) {
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
                    switch (tutorial) {
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
                    switch (tutorial) {
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
                    switch (tutorial) {
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
                    switch (tutorial) {
                        case 1:
                            return new String[][]{
                                    {
                                            "Ruwan", "Apple", "Tree", "Ruwan"
                                    },
                                    {
                                            "Banana", "Mouth", "Dog", "Mouth"
                                    },
                                    {
                                            "Eat", "Run", "Swim", "Run"
                                    },
                                    {
                                            "Apple", "Orange", "Biscuit", "Apple"
                                    }
                            };
                        case 2:
                            return new String[][]{
                                    {
                                            "Beak", "Mouth", "Trunk", "Trunk"
                                    },
                                    {
                                            "Horns", "Tail", "Mouth", "Horns"
                                    },
                                    {
                                            "Beak", "Trunk", "Tail", "Beak"
                                    },
                                    {
                                            "Eyes", "Tail", "Head", "Tail"
                                    }
                            };
                        case 3:
                            return null;
                        default:
                            return null;
                    }
                } else if (subject.equals("MATH")) {
                    switch (tutorial) {
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
                    switch (tutorial) {
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
                    switch (tutorial) {
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
                    switch (tutorial) {
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
                    switch (tutorial) {
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
