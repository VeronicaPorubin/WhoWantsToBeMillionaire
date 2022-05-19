package help;

import questionAnswer.Question;

import java.util.List;
import java.util.Random;


public abstract class HelpOption implements Invokable{
    private boolean isUsed = false;

    public boolean isUsed() {
        return isUsed;
    }

    public void setUsed(boolean used) {
        isUsed = used;
    }



}
