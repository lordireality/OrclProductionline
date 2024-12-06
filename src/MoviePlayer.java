import java.util.Date;

public class MoviePlayer extends Product implements MultimediaControl {
    private Screen screen;
    private MonitorType monitorType;
          
    public MoviePlayer(String name, Screen screen, MonitorType monitorType) {
    	super(name); // Вызов конструктора родителя
        this.screen = screen;
        this.monitorType = monitorType;
        
    }

    @Override
    public void play() {
        System.out.println("Playing");
    }

    @Override
    public void stop() {
        System.out.println("Stopped");
    }

    @Override
    public void previous() {
        System.out.println("Playing previous track");
    }

    @Override
    public void next() {
        System.out.println("Playing next track");
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nScreen Details: " + screen.toString() +
                "\nMonitor Type: " + monitorType;
    }
}