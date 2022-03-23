public class AllQuestions {
    String QUESTION_1_LEVEL_1 = "Cine a scris poezia:'Fiind baiet, paduri cutreieram': ";
    String QUESTION_1_ANSWER_1 = "George Enescu";
    String QUESTION_1_ANSWER_2 = "Mihai Eminescu";
    String QUESTION_1_ANSWER_3 = "Alexandru Donici";
    String QUESTION_1_ANSWER_4 = "George Cosbuc";
    int QUESTION_1_MONEY = 100;

    String QUESTION_2_LEVEL_1 = "In ce domeniu este utilizat sistemul Rhesus:";
    String QUESTION_2_ANSWER_1 = "Sport";
    String QUESTION_2_ANSWER_2 = "Medicina";
    String QUESTION_2_ANSWER_3 = "Arhitectura";
    String QUESTION_2_ANSWER_4 = "Tehonologii informationale";
    int QUESTION_2_MONEY = 100;

    String QUESTION_3_LEVEL_2 = "Care din urmatoarele animale inghite prada intreaga: ";
    String QUESTION_3_ANSWER_1 = "Sarpele";
    String QUESTION_3_ANSWER_2 = "Hiena";
    String QUESTION_3_ANSWER_3 = "Ghepardul";
    String QUESTION_3_ANSWER_4 = "Leul";
    int QUESTION_3_MONEY = 500;

    String QUESTION_4_LEVEL_2 = "Care este capitala Australiei: ";
    String QUESTION_4_ANSWER_1 = "Brest";
    String QUESTION_4_ANSWER_2 = "Melbourne";
    String QUESTION_4_ANSWER_3 = "Canberra";
    String QUESTION_4_ANSWER_4 = "Sydney";
    int QUESTION_4_MONEY = 500;

    String QUESTION_5_LEVEL_3 = "Unde strang albinutele polenul: ";
    String QUESTION_5_ANSWER_1 = "In cos";
    String QUESTION_5_ANSWER_2 = "Sub aripi";
    String QUESTION_5_ANSWER_3 = "Pe picioarele posterioare";
    String QUESTION_5_ANSWER_4 = "In urechea interna";
    int QUESTION_5_MONEY = 1500;

    String QUESTION_6_LEVEL_3 = "Unde locuiesc Papuasii:";
    String QUESTION_6_ANSWER_1 = "India";
    String QUESTION_6_ANSWER_2 = "Birmania";
    String QUESTION_6_ANSWER_3 = "Etiopia";
    String QUESTION_6_ANSWER_4 = "Noua Guinee";
    int QUESTION_6_MONEY = 1500;

    String QUESTION_7_LEVEL_4 = "Care este semnificatia expresiei 'Ok' : ";
    String QUESTION_7_ANSWER_1 = "it right";
    String QUESTION_7_ANSWER_2 = "0 killed";
    String QUESTION_7_ANSWER_3 = "on keep";
    String QUESTION_7_ANSWER_4 = "one key";
    int QUESTION_7_MONEY = 3000;

    String QUESTION_8_LEVEL_4 = "Care din urmatoarele variante era numele de domnisoara al chimistei Marie Curie:";
    String QUESTION_8_ANSWER_1 = "Butlerov";
    String QUESTION_8_ANSWER_2 = "Schmidt";
    String QUESTION_8_ANSWER_3 = "Sklodowska";
    String QUESTION_8_ANSWER_4 = "Dupond";
    int QUESTION_8_MONEY = 3000;

    String QUESTION_9_LEVEL_5 = "Cum se numeste calul lui Alexandru cel Mare, tovaras de lupta inmormantat cu onoruri militare:";
    String QUESTION_9_ANSWER_1 = "Marugo";
    String QUESTION_9_ANSWER_2 = "Pegas";
    String QUESTION_9_ANSWER_3 = "Incitatus";
    String QUESTION_9_ANSWER_4 = "Bucifal";
    int QUESTION_9_MONEY = 5000;

    String QUESTION_10_LEVEL_5 = "Unde se afla glanda parotida:";
    String QUESTION_10_ANSWER_1 = "La nivelul capului";
    String QUESTION_10_ANSWER_2 = "La o palma sub ficat";
    String QUESTION_10_ANSWER_3 = "La genunchi";
    String QUESTION_10_ANSWER_4 = "Pe spate";
    int QUESTION_10_MONEY = 5000;


    Question QUESTION_1 = new Question("Cine a scris poezia:'Fiind baiet, paduri cutreieram':", 1,100);
    Question QUESTION_2 = new Question("In ce domeniu este utilizat sistemul Rhesus:", 1,100);
    Question QUESTION_3 = new Question("Care din urmatoarele animale inghite prada intreaga: ", 2,500);
    Question QUESTION_4 = new Question("Care este capitala Australiei:", 2,500);
    Question QUESTION_5 = new Question("Unde strang albinutele polenul:", 3,1500);
    Question QUESTION_6 = new Question("Unde locuiesc Papuasii:", 3,1500);
    Question QUESTION_7 = new Question("Care este semnificatia expresiei 'Ok' :", 4,3000);
    Question QUESTION_8 = new Question("Care din urmatoarele variante era numele de domnisoara al chimistei Marie Curie:", 4,3000);
    Question QUESTION_9 = new Question("Cum se numeste calul lui Alexandru cel Mare, tovaras de lupta inmormantat cu onoruri militare:", 5,5000);
    Question QUESTION_10 = new Question("Unde se afla glanda parotida:", 5,5000);

    Answer question1Answer1 = new Answer("George Enescu", false, "a");
    Answer question1Answer2 = new Answer("Mihai Eminescu", true, "b");
    Answer question1Answer3 = new Answer("Alexandru Donici", false, "c");
    Answer question1Answer4 = new Answer("George Cosbuc", false, "d");

    Answer question2Answer1 = new Answer("Sport", false, "a");
    Answer question2Answer2 = new Answer("Medicina", true, "b");
    Answer question2Answer3 = new Answer("Arhitectura", false, "c");
    Answer question2Answer4 = new Answer("Tehnologii Informationale", false, "d");

    Answer question3Answer1 = new Answer("Sarpele", true, "a");
    Answer question3Answer2 = new Answer("Hiena", false, "b");
    Answer question3Answer3 = new Answer("Ghepardul", false, "c");
    Answer question3Answer4 = new Answer("Leul", false, "d");

    Answer question4Answer1 = new Answer("Brest", false, "a");
    Answer question4Answer2 = new Answer("Melbourne", false, "b");
    Answer question4Answer3 = new Answer("Canberra", true, "c");
    Answer question4Answer4 = new Answer("Sydney", false, "d");

    Answer question5Answer1 = new Answer("In cos", false, "a");
    Answer question5Answer2 = new Answer("Sub aripi", false, "b");
    Answer question5Answer3 = new Answer("Pe picioarele posterioare", true, "c");
    Answer question5Answer4 = new Answer("In urechea interna", false, "d");

    Answer question6Answer1 = new Answer("India", false, "a");
    Answer question6Answer2 = new Answer("Birmania", false, "b");
    Answer question6Answer3 = new Answer("Etiopia", false, "c");
    Answer question6Answer4 = new Answer("Noua Guinee", true, "d");

    Answer question7Answer1 = new Answer("0 killed", true, "a");
    Answer question7Answer2 = new Answer("It right", false, "b");
    Answer question7Answer3 = new Answer("on keep", false, "c");
    Answer question7Answer4 = new Answer("one key", false, "d");

    Answer question8Answer1 = new Answer("Butlerov", false, "a");
    Answer question8Answer2 = new Answer("Schmidt", false, "b");
    Answer question8Answer3 = new Answer("Sklodowska", true, "c");
    Answer question8Answer4 = new Answer("Dupond", false, "d");

    Answer question9Answer1 = new Answer("Marugo", false, "a");
    Answer question9Answer2 = new Answer("Pegas", false, "b");
    Answer question9Answer3 = new Answer("Incitatus", false, "c");
    Answer question9Answer4 = new Answer("Bucifal", true, "d");

    Answer question10Answer1 = new Answer("La nivelul capului", true, "a");
    Answer question10Answer2 = new Answer("La o palma sub ficat", false, "b");
    Answer question10Answer3 = new Answer("La genunchi", false, "c");
    Answer question10Answer4 = new Answer("La spate", false, "d");

}
