
public class Test_AudioPlayer {

	public void test() {
        // Создание экземпляра AudioPlayer
       AudioPlayer player = new AudioPlayer("iPod", "wav");
        // Использование методов управления медиа
       player.play();
       player.next();
       player.previous();
       player.stop();
        // Вывод информации о плеере
       System.out.println(player.toString());
	}
}
