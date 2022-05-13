package main;

import enums.HelpSequence;
import help.*;
import questionAnswer.Answer;
import enums.AnswerSequence;
import questionAnswer.Question;

import java.util.*;

public class WhileDevopsGame {
    List<Question> allQuestions;

    public void startGame() {
        allQuestions = initQuestion();
        Scanner sc = new Scanner(System.in);
        boolean answer = true;
        int level = 1;
        int totalScore = 0;

        HelpOption fiftyfiftyHelp = new FiftyFiftyHelp();
        HelpOption audienceHelp = new AudienceHelp();
        HelpOption phoneHelp = new PhoneHelp();
        List<HelpOption> helpOptions = Arrays.asList(fiftyfiftyHelp, audienceHelp, phoneHelp);

        while (answer && level <= 10) {
            System.out.println("Nivelul: " + level);
            Question question = getQuestionByLevel(level);
            System.out.println("->" + question.getQuestion());
            for (Answer myAnswer : question.getAnswer()) {
                System.out.println(myAnswer.getOption() + " : " + myAnswer.getAnswer());
            }
            System.out.println("------ AJUTOR ------ \n" + "F - 50/50 | P - Suna un prieten | U - Ajutorul publicului");
            System.out.println("Alegerea ta este: ");
            String gamerAnswer = sc.nextLine();

            if (isValidationAnswer(gamerAnswer) || isAHelpOption(gamerAnswer)) {
                if (isAHelpOption(gamerAnswer)) {
                    HelpSequence optionHelp = HelpSequence.valueOf(gamerAnswer.toUpperCase());
                    switch (optionHelp) {
                        case P:
                            System.out.println("Ai ales optiunea sa suni un prieten");
                            phoneHelp.getHelpAnswers(question);

                            break;
                        case F:
                            System.out.println("Ai ales optiunea 50/50");
                            fiftyfiftyHelp.showAnswer();

                            break;
                        case U:
                            System.out.println("Ai ales optiunea ajutorul salii");
                            audienceHelp.showAnswer();
                            break;
                        default:
                            for (HelpOption helpFinish : helpOptions) {
                                if (!helpFinish.isUsed()) {
                                    System.out.println("Ai folosit toate optiunele");
                                }
                            }
                    }
                    continue;
                } else if (isValidationAnswer(gamerAnswer)) {
                    AnswerSequence gamesAnswers = AnswerSequence.valueOf(gamerAnswer.toUpperCase());
                    Answer returnedAnswer = question.getVerifyAns(gamesAnswers);
                    if (returnedAnswer.isCorrect()) {
                        System.out.println("Is correct: ");
                        totalScore += question.getScore();
                        System.out.println("Score: " + totalScore);
                    } else {
                        System.out.println("Is not correct!");
                        System.out.println("Final score: " + totalScore);
                        answer = false;
                    }
                }
            } else {
                System.out.println("Nu ai introdus optiunea corecta!");
                continue;
            }
            level += 1;
        }
    }

    private boolean isValidationAnswer(String gamerAnswer) {
        for (AnswerSequence answerSequence : AnswerSequence.values()) {
            if (answerSequence.name().equals(gamerAnswer)) {
                return true;
            }
        }
        try {
        } catch (IllegalArgumentException e) {
        }
        return false;
    }

    private boolean isAHelpOption(String gamerAnswer) {
        for (HelpSequence helpSequence : HelpSequence.values()) {
            if (helpSequence.name().equals(gamerAnswer)) {
                return true;
            }
        }
        try {
        } catch (IllegalArgumentException e) {
        }
        return false;
    }

    public Question getQuestionByLevel(int level) {
        Question question = null;
        List<Question> allQuestions = initQuestion();
        for (Question question1 : allQuestions) {
            if (question1.getLevel() == level) {
                question = question1;
                break;
            }
        }
        return question;
    }

    private List<Question> initQuestion() {

        List<Question> questions = new ArrayList<>();
        Answer question1Answer1 = new Answer("George Enescu", false, AnswerSequence.A);
        Answer question1Answer2 = new Answer("Mihai Eminescu", true, AnswerSequence.B);
        Answer question1Answer3 = new Answer("Alexandru Donici", false, AnswerSequence.C);
        Answer question1Answer4 = new Answer("George Cosbuc", false, AnswerSequence.C);
        List<Answer> question1Answers = Arrays.asList(question1Answer1, question1Answer2, question1Answer3, question1Answer4);
        questions.add(new Question("Cine a scris poezia:'Fiind baiet, paduri cutreieram':", 1, 100, question1Answers));

        Answer question2Answer1 = new Answer("Sport", false, AnswerSequence.A);
        Answer question2Answer2 = new Answer("Medicina", true, AnswerSequence.B);
        Answer question2Answer3 = new Answer("Arhitectura", false, AnswerSequence.C);
        Answer question2Answer4 = new Answer("Tehnologii Informationale", false, AnswerSequence.C);
        List<Answer> question2Answers = Arrays.asList(question2Answer1, question2Answer2, question2Answer3, question2Answer4);
        questions.add(new Question("In ce domeniu este utilizat sistemul Rhesus:", 2, 250, question2Answers));

        Answer question3Answer1 = new Answer("Sarpele", true, AnswerSequence.A);
        Answer question3Answer2 = new Answer("Hiena", false, AnswerSequence.B);
        Answer question3Answer3 = new Answer("Ghepardul", false, AnswerSequence.C);
        Answer question3Answer4 = new Answer("Leul", false, AnswerSequence.D);
        List<Answer> question3Answers = Arrays.asList(question3Answer1, question3Answer2, question3Answer3, question3Answer4);
        questions.add(new Question("Care din urmatoarele animale inghite prada intreaga: ", 3, 500, question3Answers));

        Answer question4Answer1 = new Answer("Brest", false, AnswerSequence.A);
        Answer question4Answer2 = new Answer("Melbourne", false, AnswerSequence.B);
        Answer question4Answer3 = new Answer("Canberra", true, AnswerSequence.C);
        Answer question4Answer4 = new Answer("Sydney", false, AnswerSequence.D);
        List<Answer> question4Answers = Arrays.asList(question4Answer1, question4Answer2, question4Answer3, question4Answer4);
        questions.add(new Question("Care este capitala Australiei:", 4, 750, question4Answers));

        Answer question5Answer1 = new Answer("In cos", false, AnswerSequence.A);
        Answer question5Answer2 = new Answer("Sub aripi", false, AnswerSequence.B);
        Answer question5Answer3 = new Answer("Pe picioarele posterioare", true, AnswerSequence.C);
        Answer question5Answer4 = new Answer("In urechea interna", false, AnswerSequence.D);
        List<Answer> question5Answers = Arrays.asList(question5Answer1, question5Answer2, question5Answer3, question5Answer4);
        questions.add(new Question("Unde strang albinutele polenul:", 5, 1000, question5Answers));

        Answer question6Answer1 = new Answer("India", false, AnswerSequence.A);
        Answer question6Answer2 = new Answer("Birmania", false, AnswerSequence.B);
        Answer question6Answer3 = new Answer("Etiopia", false, AnswerSequence.C);
        Answer question6Answer4 = new Answer("Noua Guinee", true, AnswerSequence.D);
        List<Answer> question6Answers = Arrays.asList(question6Answer1, question6Answer2, question6Answer3, question6Answer4);
        questions.add(new Question("Unde locuiesc Papuasii:", 6, 1500, question6Answers));

        Answer question7Answer1 = new Answer("0 killed", true, AnswerSequence.A);
        Answer question7Answer2 = new Answer("It right", false, AnswerSequence.B);
        Answer question7Answer3 = new Answer("on keep", false, AnswerSequence.C);
        Answer question7Answer4 = new Answer("one key", false, AnswerSequence.D);
        List<Answer> question7Answers = Arrays.asList(question7Answer1, question7Answer2, question7Answer3, question7Answer4);
        questions.add(new Question("Care este semnificatia expresiei 'Ok' :", 7, 2000, question7Answers));

        Answer question8Answer1 = new Answer("Butlerov", false, AnswerSequence.A);
        Answer question8Answer2 = new Answer("Schmidt", false, AnswerSequence.B);
        Answer question8Answer3 = new Answer("Sklodowska", true, AnswerSequence.C);
        Answer question8Answer4 = new Answer("Dupond", false, AnswerSequence.D);
        List<Answer> question8Answers = Arrays.asList(question8Answer1, question8Answer2, question8Answer3, question8Answer4);
        questions.add(new Question("Care din urmatoarele variante era numele de domnisoara al chimistei Marie Curie:", 8, 2500, question8Answers));

        Answer question9Answer1 = new Answer("Marugo", false, AnswerSequence.A);
        Answer question9Answer2 = new Answer("Pegas", false, AnswerSequence.B);
        Answer question9Answer3 = new Answer("Incitatus", false, AnswerSequence.C);
        Answer question9Answer4 = new Answer("Bucifal", true, AnswerSequence.D);
        List<Answer> question9Answers = Arrays.asList(question9Answer1, question9Answer2, question9Answer3, question9Answer4);
        questions.add(new Question("Cum se numeste calul lui Alexandru cel Mare, tovaras de lupta inmormantat cu onoruri militare:", 9, 4000, question9Answers));

        Answer question10Answer1 = new Answer("La nivelul capului", true, AnswerSequence.A);
        Answer question10Answer2 = new Answer("La o palma sub ficat", false, AnswerSequence.B);
        Answer question10Answer3 = new Answer("La genunchi", false, AnswerSequence.C);
        Answer question10Answer4 = new Answer("La spate", false, AnswerSequence.D);
        List<Answer> question10Answers = Arrays.asList(question10Answer1, question10Answer2, question10Answer3, question10Answer4);
        questions.add(new Question("Unde se afla glanda parotida:", 10, 5000, question10Answers));

        return questions;
    }

}
