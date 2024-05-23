package may.ex_21052024.abstraction.abstractkeyword.interfaceKeyword;

public interface Engine {
    void startEngine();
    void stopEngine();

    default void haltingEngineJustStart(){
        System.out.println("Halt the Engine");
    }
    default void haltingEngineJustStop(){
        System.out.println("Halt the Engine");
    }
    static void M1(){
        System.out.println("M1");
    }
}
