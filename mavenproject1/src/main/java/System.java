public class System {
    static Handler hand;
    
    public System(){
        hand = new Handler();
    }
    
    public static void main(String[] args) {
        hand.run();
    }
}
