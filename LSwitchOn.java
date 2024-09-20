public class LSwitchOn implements Command{
    private Light light;

    public LSwitchOn(Light light){
        this.light = light;
    }

    @Override
    public String execute() {
        return light.switchOn();
    }
    
}