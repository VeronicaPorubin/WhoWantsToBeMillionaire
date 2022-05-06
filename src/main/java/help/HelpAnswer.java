package help;

import questionAnswer.Answer;

public class HelpAnswer {
   Answer answers;
   private double probability;

   public Answer getAnswers() {
      return answers;
   }
   public HelpAnswer(Answer answers, double probability) {
      this.answers = answers;
      this.probability = probability;
   }
   public void setAnswers(Answer answers) {
      this.answers = answers;
   }

   public double getProbability() {
      return probability;
   }

   public void setProbability(double probability) {
      this.probability = probability;
   }


}
