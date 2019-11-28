import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by klass on 28.11.2019.
 */
public class Task extends AbstractTask {
    Task(int action) {
        this.action = action;
    }

    @Override
    public int doWork() {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int result = 1;

        try {
            System.out.println("Enter number for factorial:");
            int value = Integer.parseInt(reader.readLine());
            if (value <= 0) {
                throw new IOException();
            } else {
                for (int i = 1; i <= value; i++) {
                    result *= i;
                }
            }
        } catch (IOException ioe) {
            System.out.println("Entered value has to be greater than zero");
        }

        return result == 0 ? -1 : result;
    }
}
