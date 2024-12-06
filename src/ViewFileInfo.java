import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileNotFoundException;
import java.io.IOException;


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
