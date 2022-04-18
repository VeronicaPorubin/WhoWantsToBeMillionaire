package help;

import questionAnswer.Question;

 abstract class HelpOption {
    private boolean isUsed;


  abstract   HelpAnswer [] getHelpAnswers (Question question) ;

}
