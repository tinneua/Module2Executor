package students;


public class Linguist extends Student {
    private int englishScore;
    private int frenchScore;
    private int latinScore;
    private int examScore;

    public int getExamScore() {
        return examScore;
    }

    public Linguist(String name, int age, int englishScore, int frenchScore, int latinScore) {
        super(name, age);
        this.englishScore = englishScore;
        this.frenchScore = frenchScore;
        this.latinScore = latinScore;
        examScoreCalculator();
    }
    @Override
    public void examScoreCalculator() {
        this.examScore = englishScore + frenchScore + latinScore;
    }

    public int getEnglishScore() {
        return englishScore;
    }

    public int getFrenchScore() {
        return frenchScore;
    }

    public int getLatinScore() {
        return latinScore;
    }
}
