import java.util.Date;

/**
 * Создайте класс с именем MoviePlayer который наследует класс Product и реализует
MultimediaControl.
Добавьте в этот класс два поля с именами screen и monitor type и присвойте им соответствующие
значения.
Реализуйте методы из интерфейса MultimediaControl по аналогии с аудиоплеером.
Создайте метод toString, который вызывает метод toString класса product и вывдоит детали о мониторе и экране.

@author (Зыкин Герман Леонидович)
 */

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