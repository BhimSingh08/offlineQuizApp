package com.example.offlinequizapp;

import java.util.ArrayList;
import java.util.List;

public class QuestionsBank {

    private static List<QuestionList> javaQuestions(){

        final List<QuestionList> questionLists = new ArrayList<>();

        //create object of QuestionList class and pass a question along with options and answer
        final QuestionList question1 = new QuestionList("what is the size of int variable?", "16 bit","8 bit","32 bit", "64 bit","32 bit","");
        final QuestionList question2 = new QuestionList("what is the default value of Boolean Variable?", "true","false","null", "not defined ","false","");
        final QuestionList question3 = new QuestionList("what of the following is the default value of an instance variable ?", "Depends upon the type of variable","null","0", "not assigned","Depends upon the type of variable","");
        final QuestionList question4 = new QuestionList("which is a reserved word in the java programming language?", "method","native","reference", "array","native","");

        // add all question to list<QuestionsList>
        questionLists.add(question1);
        questionLists.add(question2);
        questionLists.add(question3);
        questionLists.add(question4);

        return questionLists;

    }

    private static List<QuestionList>phpQuestions(){
        final List<QuestionList> questionLists = new ArrayList<>();

        //Create object of QuestionList class and pass a question along with options and answer
        final QuestionList question1 = new QuestionList("What does PHP stand for ?", "Professional Home Page ","Hypertext Preprocessor","Pretext Hypertext Processor", "Preprocessor Home Page ","Hypertext Preprocessor","");
        final QuestionList question2 = new QuestionList("who is the father of PHP ?", "Rasmus Lerdorf","Willam Makepiece","Drek Kolkevi", "List Barely ","Rasmus Lerdorf","");
        final QuestionList question3 = new QuestionList("PHP files have a default file extension of. ", ".html ",".php",".xml", ".json ",".php","");
        final QuestionList question4 = new QuestionList("Which version of PHP introduced Try/catch Exception?", "PHP 4","PHP 5","PHP 6", "PHP 5.3","PHP 5","");

        // add all question to list<QuestionsList>
        questionLists.add(question1);
        questionLists.add(question2);
        questionLists.add(question3);
        questionLists.add(question4);

        return questionLists;

    }
    private static List<QuestionList>htmlQuestions(){
        final List<QuestionList> questionLists = new ArrayList<>();

        //Create object of QuestionList class and pass a question along with options and answer
        final QuestionList question1 = new QuestionList("HTML stand for ?", "Hyper Text Markup Language","High Text Markup Language","Hyper Tabular Markup Language", "None of these ","Hyper Text Markup Language","");
        final QuestionList question2 = new QuestionList("Which of the following tag is used to mark a begining of paragraph  ?", "<TD>","<br>","<P>", "<DS>","<DS>","");
        final QuestionList question3 = new QuestionList("From which tag descriptive list starts ?", "<LL>","<DD>","<DL>", "<DS>","<DL>","");
        final QuestionList question4 = new QuestionList("Markup tags tell the web browser ?", "how to organize the page","How to display the page","How to display message box on page", "None of these","How to display the page","");

        // add all question to list<QuestionsList>
        questionLists.add(question1);
        questionLists.add(question2);
        questionLists.add(question3);
        questionLists.add(question4);

        return questionLists;

    }
    private static List<QuestionList>androidQuestions(){
        final List<QuestionList> questionLists = new ArrayList<>();

        //Create object of QuestionList class and pass a question along with options and answer
        final QuestionList question1 = new QuestionList("Select a component which is Not part of Android architecture  ?", "Android Framework","Libraries","Linux Kernel", "Android Document","Linux Kernel","");
        final QuestionList question2 = new QuestionList("A_______ makes a specific set of the application data available to other application ", "Content provider","Broadcast receivers","Intent", "None of these","Content provider","");
        final QuestionList question3 = new QuestionList("Which among these are NOT a part of Android native libraries?","webkit","Dalvik", "OpenGL","SQLite","Dalvik","");
        final QuestionList question4 = new QuestionList("During an Activity life-cycle, what is the first callback method invoked by the system ?", "onStop()","onStart()","onCreate()", "onRestore()","onCreate()","");

        // add all question to list<QuestionsList>
        questionLists.add(question1);
        questionLists.add(question2);
        questionLists.add(question3);
        questionLists.add(question4);

        return questionLists;

    }

    public static List<QuestionList> getQuestions(String selectedTopicName){
        switch (selectedTopicName){

            case "java":
                return javaQuestions();
            case "php":
                return phpQuestions();
            case "android":
                return androidQuestions();
            default:
                return htmlQuestions();

        }
    }
}


