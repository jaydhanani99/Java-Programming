import java.io.IOException;
import java.text.ParseException;

public class MultipleExceptions {
    public void start() throws IOException, ParseException {
        // throw new IOException();

        throw new ParseException("Error at line 10", 2);
    }
}
