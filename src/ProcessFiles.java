import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.io.FileWriter;


/**
 * OraclProduction Ltd требует сохранять результаты испытаний и сотрудника, который их провел,
в файл для последующего использования. Для этого создайте новый класс с именем ProcessFiles,
который будет создавать директорию и набор файлов, объединяя путь и имя файла. В нем будут
хранится данные о продукте и сотруднике, поэтому создайте два метода, которые будут
перегружать друг друга, которые могут принимать как объект employee, так и коллекцию
products.
Директория и файл должны создаваться при создании объекта.
В классе будет три поля:
• private Path p;
• private Path p2;
• private Path p3;
Должны быть объявлены следующие методы:
• private void CreateDirectory()
• public void WriteFile(EmployeeInfo emp) throws IOException
• public void WriteFile(ArrayList<Product> products) throws IOException
Если файл или директория не существуют, их необходимо создать. Директория должна быть
создана в корне диска C и иметь имя LineTests(p). Файл должен называться TestResults.txt(p2) и
создаваться в директории LineTests. Поле p3 нужно использовать для хранения разрешенного
(resolved) пути, объединяющего пути p и p2.
Обновите класс TestProductionLine и используйте метод WriteFile(), чтобы сохранить в файл
информацию о продукте и сотруднике. Информация должна дописываться в файл, чтобы
избежать потери истории.
Протестируйте вывод в файл, чтобы убедиться, что формат вывода такой же, как и в консоли.

@author (Зыкин Герман Леонидович)
*/

public class ProcessFiles {

  private Path p;
  private Path p2;
  private Path p3;

  public ProcessFiles() {
    p = Paths.get("D:\\LineTests");
    p2 = Paths.get("TestResults.txt");
    p3 = p.resolve(p2);

    CreateDirectory();
  }

  private void CreateDirectory() {
    try {
      Files.createDirectories(p);
    } catch (Exception ex) {
      System.out.println("Невозможно создать директорию");
    }

  }

  public void WriteFile(EmployeeInfo emp) throws IOException {
    FileWriter writer = new FileWriter(p3.toString(), true);
    PrintWriter printWriter = new PrintWriter(writer);

    printWriter.print(emp.toString());
    printWriter.close();
  }

  public void WriteFile(ArrayList<Product> products) throws IOException {
  }


}