public class ThIncTemp implements Command{
    private Thermostat thermostat;

    public ThIncTemp(Thermostat thermostat){
        this.thermostat = thermostat;
    }

    @Override
    public String execute() {
        return thermostat.incTemp();
    }
    
}