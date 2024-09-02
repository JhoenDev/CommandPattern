public interface Command {
    boolean status = false;

    public void on();

    public void off();
}
