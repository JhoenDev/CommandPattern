public class ViewerApp {

    public static void main(String[] args) {
        
        CentralHub ch = new CentralHub();

        //Light
        Light light = new Light();

        LSwitchOn lSwitchOn = new LSwitchOn(light);
        LSwitchOff lSwitchOff = new LSwitchOff(light);
        LIncBrightness lIncBrightness = new LIncBrightness(light);
        LDecBrightness lDecBrightness = new LDecBrightness(light);
        
        System.out.println(lSwitchOn.execute());
        System.out.println(lSwitchOff.execute());
        System.out.println(lIncBrightness.execute());
        System.out.println(lDecBrightness.execute());

        //Tv
        Tv tv = new Tv();

        TvSwitchOn tvSwitchOn = new TvSwitchOn(tv);
        TvSwitchOff tvSwitchOff = new TvSwitchOff(tv);
        TvIncVol tvIncVol = new TvIncVol(tv);
        TvDecVol tvDecVol = new TvDecVol(tv);
        TvIncBright tvIncBright = new TvIncBright(tv);
        TvDecBright tvDecBright = new TvDecBright(tv);

        System.out.println(tvSwitchOn.execute());
        System.out.println(tvSwitchOff.execute());
        System.out.println(tvIncVol.execute());
        System.out.println(tvDecVol.execute());
        System.out.println(tvIncBright.execute());
        System.out.println(tvDecBright.execute());

        //Thermostat
    }

}