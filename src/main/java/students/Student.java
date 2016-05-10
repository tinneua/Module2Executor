package students;

public abstract class Student {
    private String name;
    private int age;
    private int examScore;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getExamScore() {
        return examScore;
    }

    @Override
    public String toString() {
        return "Student: " +
                this.getName() +
                "; ExamScore: " +
                this.getExamScore();
    }

    public void examScoreCalculator() {

    }
}
