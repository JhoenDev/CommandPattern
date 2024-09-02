public interface Command {
    boolean status = false;

    public void execute();

    public void on();

    public void off();
}
