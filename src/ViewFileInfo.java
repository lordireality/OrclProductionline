import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;


/**
 * Шаг 22
 * Создайте управляющий класс с именем ViewFileInfo, который будет считывать информацию из
файла TestResults.txt file и выводить ее в консоль. Используйте try-блок, чтобы обрабатывать
ситуации, когда файл не существует.

@author (Зыкин Герман Леонидович)
 */

public class ViewFileInfo {
	
	public void view() {
		// Используем блок try-with-resources для автоматического закрытия ресурсов
        try (BufferedReader br = new BufferedReader(new FileReader("D:\\LineTests\\TestResults.txt"))) {
            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }
        } catch (FileNotFoundException e) {
            System.out.println("Файл не найден");
        } catch (IOException e) {
            System.out.println("Ошибка при чтении файла: " + e.getMessage());
        }
	}
}
