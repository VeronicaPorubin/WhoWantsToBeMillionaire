import main.WhileDevopsGame;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import questionAnswer.Answer;
import questionAnswer.Question;
import Exception.InvalidLevelException;
import Exception.InvalidScoreException;

import java.util.List;
import java.util.Random;

public class QuestionTest {
    private int NullPointerException;

    @Test
    void getCorrectAnswerTest() throws InvalidLevelException, InvalidScoreException, NullPointerException {
        Random rand = new Random();
        int range = rand.nextInt(2);

        WhileDevopsGame game = new WhileDevopsGame();
        Question question = game.getQuestionByLevel(range);

        Answer answer = question.getCorrectAnswer();

        Assertions.assertTrue(answer.isCorrect());
    }

    @Test
    void getWrongAnswerTest() throws InvalidLevelException, InvalidScoreException, NullPointerException {
        Random rand = new Random();
        int range = rand.nextInt(2);

        WhileDevopsGame game = new WhileDevopsGame();
        Question question = game.getQuestionByLevel(range);

        List<Answer> answer = question.getWrongAnswers();
        int i = 0;
        for (answer.get(i).isCorrect(); i < 3; i++) {
            System.out.println("Obj is - " + answer.get(i).isCorrect());
            Assertions.assertFalse(answer.get(i).isCorrect());
        }
    }
}
