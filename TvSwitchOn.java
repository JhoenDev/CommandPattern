public class TvSwitchOn implements Command{
    private Tv tv;

    public TvSwitchOn(Tv tv){
        this.tv = tv;
    }

    @Override
    public String execute() {
        return tv.switchOn();
    }
    
}