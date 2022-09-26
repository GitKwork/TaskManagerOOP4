import java.util.Date;
import java.util.Calendar;

public class HighPriority extends Task {

    public HighPriority(String name) {
        super(name);
        priority = "Важно !!!";
    }

    @Override
    public Date ExecuteTo() {
        cal.roll(Calendar.DAY_OF_YEAR, 0 );
        Date executeTo = cal.getTime();
        return executeTo;
    }

    
    
}
