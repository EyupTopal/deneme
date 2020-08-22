package Composition;

public class PC {
    private Case theCase;
    private Monitor monitor;
    private MotorBoard motorBoard;

    public PC(Case theCase, Monitor monitor, MotorBoard motorBoard) {
        this.theCase = theCase;
        this.monitor = monitor;
        this.motorBoard = motorBoard;
    }
public void powerUp(){
        theCase.pressPowerButton ();
        drawLogo();
}
private void drawLogo(){
        monitor.drawPixelAt (1200,50,"yellow");

}


}
