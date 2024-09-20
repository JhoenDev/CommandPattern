public class LSwitchOff implements Command{
    private Light light;

    public LSwitchOff(Light light){
        this.light = light;
    }

    @Override
    public String execute() {
        return light.switchOff();
    }
    
}