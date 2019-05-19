package com.example.newquizapp;

public class Questions {
    public  String questions[] = {
            "Which is the first planet in the solar system?",
            "Which is the second planet in the solar system?",
            "Which is the third planet in the solar system?",
            "Which is the fourth planet in the solar system?",
            "Which is the fifth planet in the solar system?",
            "Which is the sixth planet in the solar system?",
            "Which is the seventh planet in the solar system?",
            "Which is the eighth planet in the solar system?",
            "Which is the ninth planet in the solar system?"
    };

    private String choices[][] = {
            {"Mercury", "Venus", "Mars","Saturn"},
            {"Jupiter","Venus","Earth","Neptune"},
            {"Earth","Jupiter ","Pluto ","Venus "},
            {"Jupiter ","Saturn ","Mars ","Earth "},
            {"Earth ","Pluto ","Mercury ","Earth "},
            {"Uranus ","Venus ","Mars ","Saturn "},
            {"Saturn ","Pluto ","Uranus ","Earth "},
            {"Venus ","Neptune ","Pluto ","Mars "},
            {"Mercury ","Venus ","Mars ","Pluto "}

    };

    private String correctanswer[] = {"Mercury","Venus","Earth","Mars","Jupiter","Saturn","Uranus","Neptune","Pluto"};

    public String getquestion(int a)
    {
        String question = questions[a];
        return question;
    }

    public  String getchoice1(int a)
    {
        String choice1 = choices[a][0];
        return  choice1;
    }

    public  String getchoice2(int a)
    {
        String choice2 = choices[a][1];
        return  choice2;
    }
    public  String getchoice3(int a)
    {
        String choice3 = choices[a][2];
        return  choice3;
    }
    public  String getchoice4(int a)
    {
        String choice4 = choices[a][3];
        return  choice4;
    }

    public String getcorrectanswer(int a)
    {
        String answer=correctanswer[a];
        return  answer;
    }

}
