public class ThSwitchOff implements Command{
    private Thermostat thermostat;

    public ThSwitchOff(Thermostat thermostat){
        this.thermostat = thermostat;
    }

    @Override
    public String execute() {
        return thermostat.switchOff();
    }
    
}