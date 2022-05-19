package help;



import questionAnswer.Question;

import java.util.ArrayList;

import java.util.List;
import java.util.Random;

public class AudienceHelp extends HelpOption {

    Random random = new Random();

    @Override
    public void showAnswer(List<HelpAnswer> helpAnswer) {
        helpAnswer.forEach(helpAns -> {System.out.println(helpAns.getAnswers().getOption() + ": " +
                helpAns.getAnswers().getAnswer() + "-------->" + helpAns.getProbability() + "%"); });
    }

    @Override
    public List<HelpAnswer> getHelpAnswers(Question question) throws NullPointerException {
        List<HelpAnswer> helpAnswers = new ArrayList<>();
        helpAnswers.add(new HelpAnswer(question.getCorrectAnswer(), randomPercentage()[0]));
        helpAnswers.add(new HelpAnswer(question.getWrongAnswers().get(0), randomPercentage()[1]));
        helpAnswers.add(new HelpAnswer(question.getWrongAnswers().get(1), randomPercentage()[2]));
        helpAnswers.add(new HelpAnswer(question.getWrongAnswers().get(2), randomPercentage()[3]));

        return helpAnswers;
    }

    public int[] randomPercentage() {
        int[] randomArray = new int[4];
        int randomBuffer = 100;
        randomArray[0] = getRandomPercent(randomBuffer + 1);
        randomArray[1] = getRandomPercent(randomBuffer - randomArray[0]);
        randomArray[2] = getRandomPercent(randomBuffer - randomArray[1] - randomArray[0]);
        randomArray[3] = randomBuffer - randomArray[0] - randomArray[1] - randomArray[2];

        int max = randomArray[0];
        int p = 0;
        for (int i = 1; i < randomArray.length; i++) {
            if (randomArray[i] > max) {
                max = randomArray[i];
                p = i;
            }
        }

        int n = randomArray.length;
        for (int i = p; i < n - 1; i++) {
            randomArray[i] = randomArray[i + 1];
        }
        n--;
        return randomArray;
    }

    private int getRandomPercent(int randomBuffer) {
        return random.nextInt(randomBuffer + 1);
    }


}
