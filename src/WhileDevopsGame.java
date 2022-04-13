import java.util.Scanner;

public class WhileDevopsGame {
    Question[] allQuestions;

    public void startGame() {
        allQuestions = initQuestion();
        Scanner sc = new Scanner(System.in);
        System.out.println("------Cine vrea sa devina MILIONAR?!------");
        boolean answer = true;
        int level = 1;
        int totalScore = 0;
        while (answer && level <= 10) {
            Question question = getQuestionByLevel(level);
            System.out.println(question.getQuestion());
            for (Answer ans : question.getAnswer()) {
                System.out.println(ans.getOption() + " : " + ans.getAnswer());
            }
            System.out.println("Answer is: ");
            String gamerAnswer = sc.nextLine();

        //    if (gamerAnswer.equalsIgnoreCase("a")) {
        //        System.out.println("Is correct: ");
        //        totalScore += question.getScore();
        //        System.out.println("Score: " + totalScore);
        //    } else if (gamerAnswer.equalsIgnoreCase("b")) {
        //        System.out.println("Is correct: ");
        //        totalScore += question.getScore();
        //        System.out.println("Score: " + totalScore);
        //    } else if (gamerAnswer.equalsIgnoreCase("c")) {
        //        System.out.println("Is correct: ");
        //        totalScore += question.getScore();
        //        System.out.println("Score: " + totalScore);
        //    } else if (gamerAnswer.equalsIgnoreCase("d")) {
         //       System.out.println("Is correct: ");
        //        totalScore += question.getScore();
        //        System.out.println("Score: " + totalScore);
        //    } else {
        //        System.out.println("Is not correct!");
        //        System.out.println("Final score: " + totalScore);
        //        answer = false;

            //  switch (gamerAnswer) {
            //      case "a":

            if (question.getAnswer().isCorrect()) {
                System.out.println("Is correct: ");
                totalScore += question.getScore();
                System.out.println("Score: " + totalScore);
            } else{
                              System.out.println("Is not correct!");
                              System.out.println("Final score: " + totalScore);
                              answer = false;
                          }
                         break;
                //      case "b":
                     //   if (question.getAnswerTwo().isCorrect()) {}
                //             System.out.println("Is not correct!");
                //              System.out.println("Final score: " + totalScore);
                //              answer = false;
                //         } else {
                //              System.out.println("Is correct: ");
                //              totalScore += question.getScore();
                //              System.out.println("Score: " + totalScore);
                //          }
                //          break;
                //      case "c":
                //          if (question.getAnswerThree().isCorrect()) {
                //              System.out.println("Is correct: ");
                //              totalScore += question.getScore();
                //              System.out.println("Score: " + totalScore);
                //          } else {
                //              System.out.println("Is not correct!");
                //              System.out.println("Final score: " + totalScore);
                //             answer = false;
                //          }
                //          break;
                //      case "d":
                //          if (question.getAnswerFour().isCorrect()) {
                //              System.out.println("Is correct: ");
                //              totalScore += question.getScore();
                //              System.out.println("Score: " + totalScore);
                //          } else {
                //              System.out.println("Is not correct!");
                //              System.out.println("Final score: " + totalScore);
                //              answer = false;
                //          }
                //          break;

                //      default:
                // }
                level += 1;
            }
        return ;
    }


        public Question getQuestionByLevel ( int level){
            Question question = null;
            Question[] allQuestions = initQuestion();
            for (Question question1 : allQuestions) {
                if (question1.getLevel() == level) {
                    question = question1;
                    break;
                }
            }
            return question;
        }

        private Question[] initQuestion () {
            Question[] questions = new Question[10];
            Answer question1Answer1 = new Answer("George Enescu", false, "a");
            Answer question1Answer2 = new Answer("Mihai Eminescu", true, "b");
            Answer question1Answer3 = new Answer("Alexandru Donici", false, "c");
            Answer question1Answer4 = new Answer("George Cosbuc", false, "d");
            Question question1 = new Question("Cine a scris poezia:'Fiind baiet, paduri cutreieram':", 1, 100, new Answer[]{question1Answer1, question1Answer2, question1Answer3, question1Answer4});

            Answer question2Answer1 = new Answer("Sport", false, "a");
            Answer question2Answer2 = new Answer("Medicina", true, "b");
            Answer question2Answer3 = new Answer("Arhitectura", false, "c");
            Answer question2Answer4 = new Answer("Tehnologii Informationale", false, "d");
            Question question2 = new Question("In ce domeniu este utilizat sistemul Rhesus:", 2, 250, new Answer[]{question2Answer1, question2Answer2, question2Answer3, question2Answer4});

            Answer question3Answer1 = new Answer("Sarpele", true, "a");
            Answer question3Answer2 = new Answer("Hiena", false, "b");
            Answer question3Answer3 = new Answer("Ghepardul", false, "c");
            Answer question3Answer4 = new Answer("Leul", false, "d");
            Question question3 = new Question("Care din urmatoarele animale inghite prada intreaga: ", 3, 500, new Answer[]{question3Answer1, question3Answer2, question3Answer3, question3Answer4});

            Answer question4Answer1 = new Answer("Brest", false, "a");
            Answer question4Answer2 = new Answer("Melbourne", false, "b");
            Answer question4Answer3 = new Answer("Canberra", true, "c");
            Answer question4Answer4 = new Answer("Sydney", false, "d");
            Question question4 = new Question("Care este capitala Australiei:", 4, 750, new Answer[]{question4Answer1, question4Answer2, question4Answer3, question4Answer4});

            Answer question5Answer1 = new Answer("In cos", false, "a");
            Answer question5Answer2 = new Answer("Sub aripi", false, "b");
            Answer question5Answer3 = new Answer("Pe picioarele posterioare", true, "c");
            Answer question5Answer4 = new Answer("In urechea interna", false, "d");
            Question question5 = new Question("Unde strang albinutele polenul:", 5, 1000, new Answer[]{question5Answer1, question5Answer2, question5Answer3, question5Answer4});

            Answer question6Answer1 = new Answer("India", false, "a");
            Answer question6Answer2 = new Answer("Birmania", false, "b");
            Answer question6Answer3 = new Answer("Etiopia", false, "c");
            Answer question6Answer4 = new Answer("Noua Guinee", true, "d");
            Question question6 = new Question("Unde locuiesc Papuasii:", 6, 1500, new Answer[]{question6Answer1, question6Answer2, question6Answer3, question6Answer4});

            Answer question7Answer1 = new Answer("0 killed", true, "a");
            Answer question7Answer2 = new Answer("It right", false, "b");
            Answer question7Answer3 = new Answer("on keep", false, "c");
            Answer question7Answer4 = new Answer("one key", false, "d");
            Question question7 = new Question("Care este semnificatia expresiei 'Ok' :", 7, 2000, new Answer[]{question7Answer1, question7Answer2, question7Answer3, question7Answer4});

            Answer question8Answer1 = new Answer("Butlerov", false, "a");
            Answer question8Answer2 = new Answer("Schmidt", false, "b");
            Answer question8Answer3 = new Answer("Sklodowska", true, "c");
            Answer question8Answer4 = new Answer("Dupond", false, "d");
            Question question8 = new Question("Care din urmatoarele variante era numele de domnisoara al chimistei Marie Curie:", 8, 2500, new Answer[]{question8Answer1, question8Answer2, question8Answer3, question8Answer4});

            Answer question9Answer1 = new Answer("Marugo", false, "a");
            Answer question9Answer2 = new Answer("Pegas", false, "b");
            Answer question9Answer3 = new Answer("Incitatus", false, "c");
            Answer question9Answer4 = new Answer("Bucifal", true, "d");
            Question question9 = new Question("Cum se numeste calul lui Alexandru cel Mare, tovaras de lupta inmormantat cu onoruri militare:", 9, 4000, new Answer[]{question9Answer1, question9Answer2, question9Answer3, question9Answer4});

            Answer question10Answer1 = new Answer("La nivelul capului", true, "a");
            Answer question10Answer2 = new Answer("La o palma sub ficat", false, "b");
            Answer question10Answer3 = new Answer("La genunchi", false, "c");
            Answer question10Answer4 = new Answer("La spate", false, "d");
            Question question10 = new Question("Unde se afla glanda parotida:", 10, 5000, new Answer[]{question10Answer1, question10Answer2, question10Answer3, question10Answer4});

            questions[0] = question1;
            questions[1] = question2;
            questions[2] = question3;
            questions[3] = question4;
            questions[4] = question5;
            questions[5] = question6;
            questions[6] = question7;
            questions[7] = question8;
            questions[8] = question9;
            questions[9] = question10;
            return questions;
        }

    }
