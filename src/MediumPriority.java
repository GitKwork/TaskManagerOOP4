import java.util.Date;
import java.util.Calendar;

public class MediumPriority extends Task {

    public MediumPriority(String task) {
        super(task);
        priority = "Средняя важность";
    }

    @Override
    public Date ExecuteTo() {
        cal.roll(Calendar.DAY_OF_YEAR, 7);
        Date executeTo = cal.getTime();
        return executeTo;
    }
    
}
