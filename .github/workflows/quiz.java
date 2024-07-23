public class QuizQuestion {
    private String question;
    private String[] options;
    private char correctAnswer;

    public QuizQuestion(String question, String[] options, char correctAnswer) {
        this.question = question;
        this.options = options;
        this.correctAnswer = correctAnswer;
    }

    public String getQuestion() {
        return question;
    }

    public String[] getOptions() {
        return options;
    }

    public char getCorrectAnswer() {
        return correctAnswer;
    }

    public boolean isCorrect(char answer) {
        return correctAnswer == answer;
    }
}
