import help.AudienceHelp;
import help.FiftyFiftyHelp;
import help.HelpAnswer;
import main.WhileDevopsGame;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import questionAnswer.Question;
import Exception.InvalidScoreException;
import Exception.InvalidLevelException;
import java.util.List;
import java.util.Random;

public class FiftyfiftyHelpTest {
    @Test
    void FifftyfiftyHelpTest() throws InvalidLevelException, InvalidScoreException, NullPointerException {
        Random rand = new Random();
        int range = rand.nextInt(2);

        WhileDevopsGame game = new WhileDevopsGame();
        Question question = game.getQuestionByLevel(range);

        FiftyFiftyHelp fiftyfiftyHelp = new FiftyFiftyHelp();
        List<HelpAnswer> answers = fiftyfiftyHelp.getHelpAnswers(question);

        Assertions.assertTrue(answers.get(0).getAnswers().isCorrect());
        Assertions.assertFalse(answers.get(1).getAnswers().isCorrect());
        Assertions.assertNotNull(answers.get(0));
    }
}
