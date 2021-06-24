package effectivejava.chapter2.item1;

public interface SFMInterface {
    public static SFMInterface getInstance(){
        return new SFMInterfaceImpl();
    }
}
