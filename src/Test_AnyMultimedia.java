import java.util.ArrayList;

/**
 * Шаг 13
 * Аудиоплеер и видеоплеер имеют один и тот же управляющий интерфейс для физических
устройств. Управляющему интерфейсу неважен тип устройства, видео или аудио. Создайте
управляющий класс, который продемонстрирует, что для любого класса, реализующего интрефейс
MultimediaControl можно создать экземпляр и использовать его методы, независимо от того
является этот экземпляр аудио или видеоплеером.

@author (Зыкин Герман Леонидович)
 */

public class Test_AnyMultimedia {

	public void test() {
		
		ArrayList<MultimediaControl> devices = new ArrayList<MultimediaControl>();
		
		AudioPlayer player = new AudioPlayer("iPod", "wav");
		
		Screen testScreen = new Screen("1920x1080", 144, 5);
		MoviePlayer moviePlayer = new MoviePlayer("TestMoviePlayer", testScreen, MonitorType.LED);
		
		
		devices.add(player);
		devices.add(moviePlayer);
		for(MultimediaControl device : devices) {
			controlDevice(device);
		}
		
	}
	
	
	public void controlDevice(MultimediaControl device) {
		device.play();
		device.next();
		device.previous();
		device.stop();
    }
}
