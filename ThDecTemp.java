public class ThDecTemp implements Command{
    private Thermostat thermostat;

    public ThDecTemp(Thermostat thermostat){
        this.thermostat = thermostat;
    }

    @Override
    public String execute() {
        return thermostat.decTemp();
    }
    
}