public class LIncBrightness implements Command{
    private Light light;

    public LIncBrightness(Light light){
        this.light = light;
    }

    @Override
    public String execute() {
        return light.incBrightness();
    }
    
}