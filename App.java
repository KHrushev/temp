/**
 * Created by klass on 28.11.2019.
 */
public class App {
    public static void main(String[] args) {
        AbstractTask myTask = new Task(3);

        System.out.println(myTask.doWork());
    }
}
