
public class Main {

    public static void main(String[] args) {

        Interface<HighPriority> hp = new Interface<>();
        hp.addTask(new HighPriority("task 1"));
        hp.addTask(new HighPriority("task 2"));
        hp.addTask(new HighPriority("task 3"));

        Interface<MediumPriority> mp = new Interface<>();
        mp.addTask(new MediumPriority("task 1"));
        mp.addTask(new MediumPriority("task 2"));
        mp.addTask(new MediumPriority("task 3"));

        Interface<LowPriority> lp = new Interface<>();
        lp.addTask(new LowPriority("task 1"));
        lp.addTask(new LowPriority("task 1"));
        lp.addTask(new LowPriority("task 1"));

        
        lp.PrintTaskList();
        lp.saveToCSV();
 
    }
}
