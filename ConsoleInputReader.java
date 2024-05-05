import java.util.Scanner;
interface InputReader {
    int nextInt();
    String next();
    String nextLine();
}

public class ConsoleInputReader implements InputReader {
    Scanner scanner;

    public ConsoleInputReader() {
        this.scanner = new Scanner(System.in);
    }

    @Override
    public int nextInt() {
        return scanner.nextInt();
    }

    @Override
    public String next() {
        return scanner.next();
    }

    @Override
    public String nextLine() {
        return scanner.nextLine();
    }
}