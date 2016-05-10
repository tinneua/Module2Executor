import implementations.*;
import interfaces.*;
import students.*;

public class ExecutorTest {

    public static void main(String[] args) {


        Executor<Student> examExecutor = new ExecutorImpl<>();
        Validator<Student> validator = new ValidatorImpl();

        Task<Student> task1 = new TaskImpl(new Linguist("Ivan", 20, 10, 10, 10));
        Task<Student> task2 = new TaskImpl(new Engineer("Petr", 22, 5, 10, 10));
        Task<Student> task3 = new TaskImpl(new Economist("Kolya", 18, 12, 10, 15));
        Task<Student> task4 = new TaskImpl(new Linguist("", 20, 10, 10, 10));

        examExecutor.addTask(task1);
        examExecutor.addTask(task2);
        examExecutor.addTask(task3, validator);
        examExecutor.addTask(task4);


        examExecutor.execute();

        System.out.println("Valid results:");
        examExecutor.getValidResults().forEach(System.out::println);
        System.out.println("Invalid results:");
        examExecutor.getInvalidResults().forEach(System.out::println);
    }
}
