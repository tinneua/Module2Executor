package implementations;

import interfaces.Validator;
import students.Student;

import java.util.Objects;

public class ValidatorImpl implements Validator<Student> {

    @Override
    public boolean isValid(Student result) {
        return (result.getExamScore() > 29 && !Objects.equals(result.getName(), ""));
    }
}
