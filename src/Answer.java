public class Answer {
    private String answer;
    private boolean isCorrect;
     static String correctAnswer;


    public String getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(String correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public Answer(String answer, boolean isCorrect, String correctAnswer) {
        this.answer = answer;
        this.isCorrect = isCorrect;
        this.correctAnswer = correctAnswer;
    }


}
