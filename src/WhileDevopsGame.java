public class WhileDevopsGame {
    public static void main(String[] args) {
        AllQuestions allQuestions = new AllQuestions();


        boolean answer = true;
        int level=1;
        while (answer == true || level <=10) {
            System.out.println(answer);
            answer = !answer;
            level++;
        }
    }
    public Question getQuestionByLevel(int level) {
        Question question = null;

        switch (level){
            case 1:
                Question question1 = new Question("Cine a scris poezia:'Fiind baiet, paduri cutreieram':",1,100, );
                break;
            case 2:
        }
        return question;
    }
}