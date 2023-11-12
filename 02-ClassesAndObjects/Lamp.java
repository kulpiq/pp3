public class Lamp {
    boolean ison = false;

    void switchon(){
        ison = true;
    }
    void switchoff(){
        ison = false;
    }
    public String iso(){ 
        return ison ? "ON" : "OFF";
    }
}
