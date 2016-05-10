package students;


public class Engineer extends Student {
    private int mathScore;
    private int nanotechnologyScore;
    private int chemicalScore;
    private int examScore;

    public int getExamScore() {
        return examScore;
    }

    public Engineer(String name, int age, int mathScore, int nanotechnologyScore, int chemicalScore) {
        super(name, age);
        this.mathScore = mathScore;
        this.nanotechnologyScore = nanotechnologyScore;
        this.chemicalScore = chemicalScore;
        examScoreCalculator();
    }
    @Override
    public void examScoreCalculator() {
        this.examScore = mathScore + nanotechnologyScore + chemicalScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public int getNanotechnologyScore() {
        return nanotechnologyScore;
    }

    public int getChemicalScore() {
        return chemicalScore;
    }
}
