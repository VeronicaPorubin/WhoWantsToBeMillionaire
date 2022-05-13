package enums;

public class Generate {
   private AnswerSequence answerSequence;
   private HelpSequence helpSequence;

    public Generate(AnswerSequence answerSequence, HelpSequence helpSequence) {
        this.answerSequence = answerSequence;
        this.helpSequence = helpSequence;
    }

    public AnswerSequence getAnswerSequence() {
        return answerSequence;
    }

    public void setAnswerSequence(AnswerSequence answerSequence) {
        this.answerSequence = answerSequence;
    }

    public HelpSequence getHelpSequence() {
        return helpSequence;
    }

    public void setHelpSequence(HelpSequence helpSequence) {
        this.helpSequence = helpSequence;
    }

    }
