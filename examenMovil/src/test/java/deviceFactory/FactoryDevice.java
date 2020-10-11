package deviceFactory;

public class FactoryDevice {
    public static IDevice make(String type){
        IDevice device;
        //instanciando un objeto dependiendo del tipo de SO que requerimos
        switch(type){
            case "android":
                device=new Android();
                break;
            case "ios":
                device=new IOS();
                break;
            case "windowsphone":
                device= new WindowsPhone();
                break;
            default:
                device= new Android();
                break;
        }
        return device;
    }

}
