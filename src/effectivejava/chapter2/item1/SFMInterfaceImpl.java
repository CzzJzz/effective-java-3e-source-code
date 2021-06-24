package effectivejava.chapter2.item1;

public class SFMInterfaceImpl implements SFMInterface {

    String name;
    String address;

    public SFMInterfaceImpl(){

    }

    public SFMInterfaceImpl(String name){
        this.name = name;
    }

    public static SFMInterfaceImpl withName(String name) {
        return new SFMInterfaceImpl(name);
    }

    public static SFMInterfaceImpl withAddress(String address) {
        SFMInterfaceImpl sfm = new SFMInterfaceImpl();
        sfm.address = address;
        return sfm;
    }


}
