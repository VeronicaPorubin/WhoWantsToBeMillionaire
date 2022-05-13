package questionAnswer;

import enums.AnswerSequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AllQuestions {
    String QUESTION_1_LEVEL_1 = "Cine a scris poezia:'Fiind baiet, paduri cutreieram': ";
    String QUESTION_1_ANSWER_1 = "George Enescu";
    String QUESTION_1_ANSWER_2 = "Mihai Eminescu";
    String QUESTION_1_ANSWER_3 = "Alexandru Donici";
    String QUESTION_1_ANSWER_4 = "George Cosbuc";
    int QUESTION_1_MONEY = 100;

    String QUESTION_2_LEVEL_2 = "In ce domeniu este utilizat sistemul Rhesus:";
    String QUESTION_2_ANSWER_1 = "Sport";
    String QUESTION_2_ANSWER_2 = "Medicina";
    String QUESTION_2_ANSWER_3 = "Arhitectura";
    String QUESTION_2_ANSWER_4 = "Tehonologii informationale";
    int QUESTION_2_MONEY = 250;

    String QUESTION_3_LEVEL_3 = "Care din urmatoarele animale inghite prada intreaga: ";
    String QUESTION_3_ANSWER_1 = "Sarpele";
    String QUESTION_3_ANSWER_2 = "Hiena";
    String QUESTION_3_ANSWER_3 = "Ghepardul";
    String QUESTION_3_ANSWER_4 = "Leul";
    int QUESTION_3_MONEY = 500;

    String QUESTION_4_LEVEL_4 = "Care este capitala Australiei: ";
    String QUESTION_4_ANSWER_1 = "Brest";
    String QUESTION_4_ANSWER_2 = "Melbourne";
    String QUESTION_4_ANSWER_3 = "Canberra";
    String QUESTION_4_ANSWER_4 = "Sydney";
    int QUESTION_4_MONEY = 750;

    String QUESTION_5_LEVEL_5 = "Unde strang albinutele polenul: ";
    String QUESTION_5_ANSWER_1 = "In cos";
    String QUESTION_5_ANSWER_2 = "Sub aripi";
    String QUESTION_5_ANSWER_3 = "Pe picioarele posterioare";
    String QUESTION_5_ANSWER_4 = "In urechea interna";
    int QUESTION_5_MONEY = 1000;

    String QUESTION_6_LEVEL_6 = "Unde locuiesc Papuasii:";
    String QUESTION_6_ANSWER_1 = "India";
    String QUESTION_6_ANSWER_2 = "Birmania";
    String QUESTION_6_ANSWER_3 = "Etiopia";
    String QUESTION_6_ANSWER_4 = "Noua Guinee";
    int QUESTION_6_MONEY = 1500;

    String QUESTION_7_LEVEL_7 = "Care este semnificatia expresiei 'Ok' : ";
    String QUESTION_7_ANSWER_1 = "it right";
    String QUESTION_7_ANSWER_2 = "0 killed";
    String QUESTION_7_ANSWER_3 = "on keep";
    String QUESTION_7_ANSWER_4 = "one key";
    int QUESTION_7_MONEY = 2000;

    String QUESTION_8_LEVEL_8 = "Care din urmatoarele variante era numele de domnisoara al chimistei Marie Curie:";
    String QUESTION_8_ANSWER_1 = "Butlerov";
    String QUESTION_8_ANSWER_2 = "Schmidt";
    String QUESTION_8_ANSWER_3 = "Sklodowska";
    String QUESTION_8_ANSWER_4 = "Dupond";
    int QUESTION_8_MONEY = 2500;

    String QUESTION_9_LEVEL_9 = "Cum se numeste calul lui Alexandru cel Mare, tovaras de lupta inmormantat cu onoruri militare:";
    String QUESTION_9_ANSWER_1 = "Marugo";
    String QUESTION_9_ANSWER_2 = "Pegas";
    String QUESTION_9_ANSWER_3 = "Incitatus";
    String QUESTION_9_ANSWER_4 = "Bucifal";
    int QUESTION_9_MONEY = 4000;

    String QUESTION_10_LEVEL_10 = "Unde se afla glanda parotida:";
    String QUESTION_10_ANSWER_1 = "La nivelul capului";
    String QUESTION_10_ANSWER_2 = "La o palma sub ficat";
    String QUESTION_10_ANSWER_3 = "La genunchi";
    String QUESTION_10_ANSWER_4 = "Pe spate";
    int QUESTION_10_MONEY = 5000;


    Question QUESTION_1;
    Question QUESTION_2;
    Question QUESTION_3;
    Question QUESTION_4;
    Question QUESTION_5;
    Question QUESTION_6;
    Question QUESTION_7;
    Question QUESTION_8;
    Question QUESTION_9;
    Question QUESTION_10;

    public AllQuestions() {
        QUESTION_1 = new Question("Cine a scris poezia:'Fiind baiet, paduri cutreieram':", 1, 100, question1Answers);
        QUESTION_2 = new Question("In ce domeniu este utilizat sistemul Rhesus:", 2, 250, question2Answers);
        QUESTION_3 = new Question("Care din urmatoarele animale inghite prada intreaga: ", 3, 500, question3Answers);
        QUESTION_4 = new Question("Care este capitala Australiei:", 4, 750, question4Answers);
        QUESTION_5 = new Question("Unde strang albinutele polenul:", 5, 1000, question5Answers);
        QUESTION_6 = new Question("Unde locuiesc Papuasii:", 6, 1500, question6Answers);
        QUESTION_7 = new Question("Care este semnificatia expresiei 'Ok' :", 7, 2000, question7Answers);
        QUESTION_8 = new Question("Care din urmatoarele variante era numele de domnisoara al chimistei Marie Curie:", 8, 2500, question8Answers);
        QUESTION_9 = new Question("Cum se numeste calul lui Alexandru cel Mare, tovaras de lupta inmormantat cu onoruri militare:", 9, 4000, question9Answers);
        QUESTION_10 = new Question("Unde se afla glanda parotida:", 10, 5000, question10Answers);
    }

    Answer question1Answer1 = new Answer("George Enescu", false, AnswerSequence.A);
    Answer question1Answer2 = new Answer("Mihai Eminescu", true, AnswerSequence.B);
    Answer question1Answer3 = new Answer("Alexandru Donici", false, AnswerSequence.C);
    Answer question1Answer4 = new Answer("George Cosbuc", false, AnswerSequence.C);
    List<Answer> question1Answers = Arrays.asList(question1Answer1, question1Answer2, question1Answer3, question1Answer4);

    Answer question2Answer1 = new Answer("Sport", false, AnswerSequence.A);
    Answer question2Answer2 = new Answer("Medicina", true, AnswerSequence.B);
    Answer question2Answer3 = new Answer("Arhitectura", false, AnswerSequence.C);
    Answer question2Answer4 = new Answer("Tehnologii Informationale", false, AnswerSequence.C);
    List<Answer> question2Answers = Arrays.asList(question2Answer1, question2Answer2, question2Answer3, question2Answer4);

    Answer question3Answer1 = new Answer("Sarpele", true, AnswerSequence.A);
    Answer question3Answer2 = new Answer("Hiena", false, AnswerSequence.B);
    Answer question3Answer3 = new Answer("Ghepardul", false, AnswerSequence.C);
    Answer question3Answer4 = new Answer("Leul", false, AnswerSequence.D);
    List<Answer> question3Answers = Arrays.asList(question3Answer1,question3Answer2,question3Answer3,question3Answer4);

    Answer question4Answer1 = new Answer("Brest", false, AnswerSequence.A);
    Answer question4Answer2 = new Answer("Melbourne", false, AnswerSequence.B);
    Answer question4Answer3 = new Answer("Canberra", true, AnswerSequence.C);
    Answer question4Answer4 = new Answer("Sydney", false, AnswerSequence.D);
    List<Answer> question4Answers = Arrays.asList(question4Answer1,question4Answer2,question4Answer3,question4Answer4);

    Answer question5Answer1 = new Answer("In cos", false, AnswerSequence.A);
    Answer question5Answer2 = new Answer("Sub aripi", false, AnswerSequence.B);
    Answer question5Answer3 = new Answer("Pe picioarele posterioare", true, AnswerSequence.C);
    Answer question5Answer4 = new Answer("In urechea interna", false, AnswerSequence.D);
    List<Answer> question5Answers = Arrays.asList(question5Answer1,question5Answer2,question5Answer3,question5Answer4);

    Answer question6Answer1 = new Answer("India", false, AnswerSequence.A);
    Answer question6Answer2 = new Answer("Birmania", false, AnswerSequence.B);
    Answer question6Answer3 = new Answer("Etiopia", false, AnswerSequence.C);
    Answer question6Answer4 = new Answer("Noua Guinee", true, AnswerSequence.D);
    List<Answer> question6Answers = Arrays.asList(question6Answer1,question6Answer2,question6Answer3,question6Answer4);

    Answer question7Answer1 = new Answer("0 killed", true, AnswerSequence.A);
    Answer question7Answer2 = new Answer("It right", false, AnswerSequence.B);
    Answer question7Answer3 = new Answer("on keep", false, AnswerSequence.C);
    Answer question7Answer4 = new Answer("one key", false, AnswerSequence.D);
    List<Answer> question7Answers = Arrays.asList(question7Answer1,question7Answer2,question7Answer3,question7Answer4);

    Answer question8Answer1 = new Answer("Butlerov", false, AnswerSequence.A);
    Answer question8Answer2 = new Answer("Schmidt", false, AnswerSequence.B);
    Answer question8Answer3 = new Answer("Sklodowska", true, AnswerSequence.C);
    Answer question8Answer4 = new Answer("Dupond", false, AnswerSequence.D);
    List<Answer> question8Answers = Arrays.asList(question8Answer1,question8Answer2,question8Answer3,question8Answer4);

    Answer question9Answer1 = new Answer("Marugo", false, AnswerSequence.A);
    Answer question9Answer2 = new Answer("Pegas", false, AnswerSequence.B);
    Answer question9Answer3 = new Answer("Incitatus", false, AnswerSequence.C);
    Answer question9Answer4 = new Answer("Bucifal", true, AnswerSequence.D);
    List<Answer> question9Answers = Arrays.asList(question9Answer1,question9Answer2,question9Answer3,question9Answer4);

    Answer question10Answer1 = new Answer("La nivelul capului", true, AnswerSequence.A);
    Answer question10Answer2 = new Answer("La o palma sub ficat", false, AnswerSequence.B);
    Answer question10Answer3 = new Answer("La genunchi", false, AnswerSequence.C);
    Answer question10Answer4 = new Answer("La spate", false, AnswerSequence.D);
    List<Answer> question10Answers = Arrays.asList(question10Answer1,question10Answer2,question10Answer3,question10Answer4);


}
