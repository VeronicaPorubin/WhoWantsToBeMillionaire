package help;


import questionAnswer.Answer;
import questionAnswer.Question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class AudienceHelp extends HelpOption {

    Random random =new Random();

    @Override
    public void showAnswer(List<HelpAnswer> helpAnswer) {
        for (HelpAnswer helpAns : helpAnswer){
            System.out.println(helpAns.getAnswers().getOption() + ": " + helpAns.getAnswers().getAnswer() + "--->" + helpAns.getProbability() + "%");
        }

    }

    @Override
    public List<HelpAnswer> getHelpAnswers(Question question) {
        List<HelpAnswer>helpAnswers = new ArrayList<>();
        helpAnswers.add(new HelpAnswer(question.getCorrectAnswer(),randomPercentage().length + 1));
        helpAnswers.add(new HelpAnswer((Answer) question.getWrongAnswers(),randomPercentage().length));
        helpAnswers.add(new HelpAnswer((Answer) question.getWrongAnswers(),randomPercentage().length));
        helpAnswers.add(new HelpAnswer((Answer) question.getWrongAnswers(),randomPercentage().length));

        return helpAnswers;

    }

    public int[] randomPercentage() {
        int totalPercentage =100;
        int [] percentage = new int [4];
        for (int i=0; i<totalPercentage; i++){
            percentage[i]= random.nextInt(totalPercentage);
        }
        return percentage;
    }



}
