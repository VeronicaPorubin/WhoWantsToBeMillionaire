package main.java.help;

import main.java.questionAnswer.Question;


abstract class HelpOption {
    private boolean isUsed;


  abstract   HelpAnswer[] getHelpAnswers (Question question) ;

}
