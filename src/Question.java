public class Question {
    private String question;
    private int level;
    private int score;

    public Question(String question, int level, int score) {

        this.question = question;
        this.level = level;
        this.score = score;
    }
    Question QUESTION_1_LEVEL_1 = new Question("Cine a scris poezia:'Fiind baiet, paduri cutreieram':", 1,100);
    Question QUESTION_2_LEVEL_1 = new Question("In ce domeniu este utilizat sistemul Rhesus:", 1,100);
    Question QUESTION_3_LEVEL_2 = new Question("Care din urmatoarele animale inghite prada intreaga: ", 2,500);
    Question QUESTION_4_LEVEL_2 = new Question("Care este capitala Australiei:", 2,500);
    Question QUESTION_5_LEVEL_3 = new Question("Unde strang albinutele polenul:", 3,1500);
    Question QUESTION_6_LEVEL_3 = new Question("Unde locuiesc Papuasii:", 3,1500);
    Question QUESTION_7_LEVEL_4 = new Question("Care este semnificatia expresiei 'Ok' :", 4,3000);
    Question QUESTION_8_LEVEL_4 = new Question("Care din urmatoarele variante era numele de domnisoara al chimistei Marie Curie:", 4,3000);
    Question QUESTION_9_LEVEL_5 = new Question("Cum se numeste calul lui Alexandru cel Mare, tovaras de lupta inmormantat cu onoruri militare:", 5,5000);
    Question QUESTION_10_LEVEL_5 = new Question("Unde se afla glanda parotida:", 5,5000);

}

