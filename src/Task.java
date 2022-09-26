import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public abstract class Task {
    
    protected static Calendar cal = new GregorianCalendar();
    public String priority;
    protected String task;

    public Task(String task) {
        this.task = task;
    }

    public Date TaskCreation() {
        Date taskCreation = cal.getTime();
        return taskCreation;
    }

    public Date ExecuteTo() {
        cal.roll(Calendar.DAY_OF_YEAR, 0 );
        Date executeTo = cal.getTime();
        return executeTo;
    }

    @Override
    public String toString() {
        return String.format("Приоритет: %s \nЗадача: %s \nДата создания: %s \nВыполнить до: %s \n\n", priority, task, TaskCreation(), ExecuteTo());
    }
}