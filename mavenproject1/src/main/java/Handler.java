public class Handler {
    Displayer disp;
    
    public Handler(){
        disp = new Displayer();
    }
    
    public void run() {
        if (isChanged()) {
            disp.draw();
        } else if (!isChanged()) {
            reset();
        }
        
    } 
    
    public Object getDetail() {
        return new Object();
    }

    private boolean isChanged() {
        return true;
    }

    private void reset() {
       
    }
}
