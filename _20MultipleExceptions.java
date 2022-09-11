import java.text.ParseException;
import java.io.IOException;

public class _20MultipleExceptions {
    public static void main(String[] args) {
        MultipleExceptions m = new MultipleExceptions();

        try {
            m.start();
        } catch(IOException e) {

        } catch (ParseException e) {
            System.out.println(e);
        }
    }
}
