public class TvSwitchOff implements Command{
    private Tv tv;

    public TvSwitchOff(Tv tv){
        this.tv = tv;
    }

    @Override
    public String execute() {
        return tv.switchOff();
    }
    
}