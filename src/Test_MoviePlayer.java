
/**
 * Шаг 12
Создайте управляющий класс, чтобы проверить функционал видеоплеера
@author (Зыкин Герман Леонидович)
 */ 

public class Test_MoviePlayer {
	public void test() {
		Screen testScreen = new Screen("1920x1080", 144, 5);
		MoviePlayer moviePlayer = new MoviePlayer("TestMoviePlayer", testScreen, MonitorType.LED);
		 // Использование методов управления медиа
		moviePlayer.play();
		moviePlayer.next();
		moviePlayer.previous();
		moviePlayer.stop();
	    // Вывод информации о плеере
	    System.out.println(moviePlayer.toString());
	}
}
