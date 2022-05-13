package help;

import questionAnswer.Question;

import java.util.List;
import java.util.Random;


public abstract class HelpOption {
    private boolean isUsed;

    public boolean isUsed() {return isUsed;}

    public void setUsed(boolean used) {isUsed = used;}


    public abstract List<HelpAnswer> getHelpAnswers(Question question) ;
    public abstract void showAnswer(List<HelpAnswer> helpAnswer);

}
