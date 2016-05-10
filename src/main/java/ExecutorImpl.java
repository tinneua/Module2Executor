import Module2.Exceptions.ExecutionAlreadyCalledException;
import Module2.Exceptions.ExecutionNotCalledException;

import java.util.ArrayList;
import java.util.List;

public class ExecutorImpl<T> implements MainClass.Executor<T> {
    private boolean tasksExecuted;
    private List<MainClass.Task<? extends T>> tasksCollection = new ArrayList<>();
    MainClass.Validator<T> validator;
    List<T> validResults = new ArrayList<>();
    List<T> invalidResults = new ArrayList<>();


    @Override
    public void addTask(MainClass.Task<? extends T> task) throws ExecutionNotCalledException {
        if (isExecutionAlreadyCalled(true)) throw new ExecutionNotCalledException();
        tasksCollection.add(task);
    }

    private boolean isExecutionAlreadyCalled(boolean expected) {
        return tasksExecuted == expected;
    }

    @Override
    public void addTask(MainClass.Task<? extends T> task, MainClass.Validator<T> validator) {
        if (isExecutionAlreadyCalled(true)) {
            throw new ExecutionNotCalledException();
        }
        this.validator = validator;
        tasksCollection.add(task);
    }

    @Override
    public void execute() {
        for (MainClass.Task<? extends T> i : tasksCollection) {
            T result = i.getResult();
            if (validator.isValid(result)) {
                validResults.add(result);
            } else {
                invalidResults.add(result);
            }
        }
        tasksExecuted = true;
    }

    @Override
    public List<T> getValidResults() {
        if (isExecutionAlreadyCalled(false)) {
            throw new ExecutionAlreadyCalledException();
        }
        return validResults;
    }

    @Override
    public List<T> getInvalidResults() throws ExecutionAlreadyCalledException {
        if (isExecutionAlreadyCalled(false)) {
            throw new ExecutionAlreadyCalledException();
        }
        return invalidResults;
    }
}
