package questionAnswer;

import Exception.InvalidLevelException;
import Exception.InvalidScoreException;
import enums.AnswerSequence;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Question {
    private String question;
    private int level;
    private int score;
    List<Answer> answers;

    public Question(String question, int level, int score, List<Answer> answers) throws InvalidLevelException, InvalidScoreException {
        this.question = question;
        this.level = level;
        if (level < 0 || level > 10) {
            throw new InvalidLevelException("Level value must be greater than 0 and less than 15");
        }
        this.score = score;
        if (score < 0) {
            throw new InvalidScoreException("Score value must be greater than 0");
        }
        this.answers = answers;
    }


    public void setQuestion(String question) {
        this.question = question;
    }

    public List<Answer> getAnswer() {
        return answers;
    }

    public void setAnswer(List<Answer> answers) {
        this.answers = answers;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion() {
        this.question = question;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }


    public Answer getVerifyAns(AnswerSequence answerSequence) {
        return (Answer) this.answers.stream().filter(answers -> answers.getOption().equals(answerSequence)).findFirst().get();
    }

    public Answer getCorrectAnswer() {
        return this.answers.stream().filter(Answer::isCorrect).findFirst().get();
    }

    public List<Answer> getWrongAnswers() {
        return this.answers.stream().filter(answers -> !answers.isCorrect()).collect(Collectors.toList());
    }

}

