public class TvDecVol implements Command{
    private Tv tv;

    public TvDecVol(Tv tv){
        this.tv = tv;
    }

    @Override
    public String execute() {
        return tv.decVolume();
    }
    
}