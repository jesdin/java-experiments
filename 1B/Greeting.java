public class Greeting {
    private final IWriter _writer;

    public Greeting(IWriter writer) {
        _writer = writer;
    }

    public Greeting() {
        _writer = new ConsoleWriter();
    }

    public void greet() {
        _writer.write("Hello world");
    }
}
