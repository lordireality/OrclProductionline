/**
 * Шаг 10
 * Создайте управляющий класс для Screen, который будет проверять функционал класса Screen. 
 * 
 * @author (Зыкин Герман Леонидович)
 */
public class Test_Screen {

	public void test() {
		
		Screen testScreen = new Screen("1920x1080", 144, 5);
		System.out.println(testScreen.toString());
	}
}
