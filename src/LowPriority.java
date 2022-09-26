import java.util.Date;
import java.util.Calendar;

public class LowPriority extends Task{

    public LowPriority(String task) {
        super(task);
        priority = "Повседневная";
    }

    @Override
    public Date ExecuteTo() {
        cal.roll(Calendar.MONTH, 1);
        Date executeTo = cal.getTime();
        return executeTo;
    }
    
}
