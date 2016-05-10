package implementations;

import interfaces.Task;
import students.Student;

public class TaskImpl implements Task<Student> {
    public TaskImpl(Student student) {
        this.student = student;
    }

    private Student student;
    @Override
    public void execute() {
        student.getExamScore();
    }

    @Override
    public Student getResult() {
        return student;
    }
}
