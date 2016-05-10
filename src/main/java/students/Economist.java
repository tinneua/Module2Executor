package students;


public class Economist extends Student {
    private int marketingScore;
    private int managementScore;
    private int econometrixScore;
    private int examScore;

    public int getExamScore() {
        return examScore;
    }

    public Economist(String name, int age, int marketingScore, int managementScore, int econometrixScore) {
        super(name, age);
        this.marketingScore = marketingScore;
        this.managementScore = managementScore;
        this.econometrixScore = econometrixScore;
        examScoreCalculator();
    }
    @Override
    public void examScoreCalculator() {
        this.examScore = marketingScore + managementScore + econometrixScore;
    }

    public int getMarketingScore() {
        return marketingScore;
    }

    public int getManagementScore() {
        return managementScore;
    }

    public int getEconometrixScore() {
        return econometrixScore;
    }
}
