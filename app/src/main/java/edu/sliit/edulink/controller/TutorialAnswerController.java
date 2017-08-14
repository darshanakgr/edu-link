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
                            return new String[][]{
                                    {
                                            "Hello","Good Bye","Happy Birthday","Good Morning"
                                    },
                                    {
                                            "Happy New Year","Merry Christmas","Good Night","Good Bye"
                                    },
                                    {
                                            "Merry Christmas","Good Afternoon","Good Bye","Hello"
                                    },
                                    {
                                            "Hello","Good Evening","Good Luck","Happy Birthday"
                                    },
                                    {
                                            "Good Bye","Merry Christmas","Good Night","Good Afternoon"
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
                            return new String[][]{
                                    {
                                            "8","2","5","1"
                                    },
                                    {
                                            "4","0","9","3"
                                    },
                                    {
                                            "1","9","6","4"
                                    },
                                    {
                                            "2","7","5","8"
                                    },
                                    {
                                            "3","6","1","5"
                                    }
                            };
                        case 2:
                            return new String[][]{
                                    {
                                            "4","6","9","3"
                                    },
                                    {
                                            "4","6","2","7"
                                    },
                                    {
                                            "3","1","9","4"
                                    },
                                    {
                                            "7","8","2","5"
                                    },
                                    {
                                            "2","8","5","6"
                                    },
                                    {
                                            "9","7","4","8"
                                    }
                            };
                        case 3:
                            return new String[][]{
                                    {
                                            "8","1","7","2"
                                    },
                                    {
                                            "5","7","9","2"
                                    },
                                    {
                                            "0","5","8","3"
                                    },
                                    {
                                            "8","4","1","5"
                                    },
                                    {
                                            "3","0","9","6"
                                    }
                            };
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
