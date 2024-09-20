public class TvIncVol implements Command{
    private Tv tv;

    public TvIncVol(Tv tv){
        this.tv = tv;
    }

    @Override
    public String execute() {
        return tv.incVolume();
    }
    
}