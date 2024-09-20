public class TvDecBright implements Command{
    private Tv tv;

    public TvDecBright(Tv tv){
        this.tv = tv;
    }

    @Override
    public String execute() {
        return tv.decBrightness();
    }
    
}