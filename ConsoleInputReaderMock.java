import java.util.Scanner;

public class ConsoleInputReaderMock extends ConsoleInputReader {
    

    

    @Override
    public int nextInt() {
        return 1;
    }

    @Override
    public String next() {
        return "A";
    }

    @Override
    public String nextLine() {
        return "A";
    }
}