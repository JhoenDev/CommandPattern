public class TvIncBright implements Command{
    private Tv tv;

    public TvIncBright(Tv tv){
        this.tv = tv;
    }

    @Override
    public String execute() {
        return tv.incBrightness();
    }
    
}