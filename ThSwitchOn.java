public class ThSwitchOn implements Command{
    private Thermostat thermostat;

    public ThSwitchOn(Thermostat thermostat){
        this.thermostat = thermostat;
    }

    @Override
    public String execute() {
        return thermostat.switchOn();
    }
    
}