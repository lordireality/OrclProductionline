import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Шаг 18:
Для тестрирования качества производства необходима программа испытаний, которая должна
хранить данные о сотруднике, который проводил испытание. Для реализации этого вам
потребуется создать класс с именем EmployeeInfo, который позволит пользователю ввести имя, а
затем создать id для пользователя, состоящий из первой буквы имени и фамилии.
В этом классе будет 2 поля
• StringBuilder name;
• String code;
В классе будут определены следующие методы:
• public StringBuilder getName()
• public String getCode()
• private void setName()
• private void createEmployeeCode(StringBuilder name)
• private String inputName()
• private boolean checkName(StringBuilder name)
Метод setName() будет вызываться из конструктора, который будет использовать inputName() для
получения имени (имени и фамилией) в виде единого ввода пользователя, перед тем как
вызывается метод checkName() для проверки наличия пробела во введенном имени.
Если введенное имя корректно, то вызывается метод createEmployeeCode(), который берет первую
букву имени и добавляет к фамилии для создания кода (id). Если пробела нет, то в качестве кода
будет использоваться значение guest.
Создайте в классе TestProductionLine объект employee, используя класс EmployeeInfo. Используйте
метод getCode() чтобы вывести код сотрудника в конце вывода данных о продукте.
Шаг 19:
Для провдения испытаний требуется дополнительная информация о подразделении сотрудника.
Код подразделения состоит из четырех букв и двух цифр. Формат кода подразделения: первая
буква заглавная, три последующих - строчные, и среди них не должно быть пробелов.
В класс EmployeeInfo нужно добавить три поля:
• String deptId;
• Pattern p;
• Scanner in;
Необходимо определить следующие методы:
• public String getDeptId()
• private void setDeptId()
• private String getId()
• private boolean validId(String id)

@author (Зыкин Герман Леонидович)
 */

public class EmployeeInfo {

  StringBuilder name = new StringBuilder();
  String code;
  String deptId;
  Pattern p;
  Scanner in;

  /**
   * Шаг 20
   * Чтобы предотвратить утечку информации, необходимо шифровать данные, сохраняемые в файл.
Чтобы выполнить это требование добавьте новый метод в класс EmployeeInfo, который будет
"переворачивать" текст, хранящийся в department id. Это нужно сделать рекурсивно с
использованием метода reverseString().

Нужно объявить следующий метод:
• public String reverseString(String id)
Если предоставлен корректный код подразделения (department id), то, перед тем как полю
deptId присваивается значение, вызывается reverseString().

   */
  public String reverseString(String id) {
    char letter = id.charAt(id.length() - 1);

    if (id.length() == 1) {
      return Character.toString(letter);

    } else {

      return letter + reverseString(id.substring(0, id.length() - 1));
    }

  }

  public String getDeptId() {
    System.out.println("Введите номер отдела:");
    String input2 = in.nextLine();
    return input2;

  }

  private void setDeptId() {
    String inputId = getDeptId();
    if (validId(inputId)) {
      deptId = reverseString(inputId);
      deptId = inputId;

    } else {
      deptId = "none";
    }


  }

  private String getId() {
    return deptId;
  }

  private boolean validId(String id) {
    Boolean matches = false;

    Matcher matcher = p.matcher(id);
    matches = matcher.matches();


    return matches;

  }

  public StringBuilder getName() {
    return name;
  }

  public String getCode() {
    return code;
  }

  private void setName() {
    name.append(inputName());
  }

  private void createEmployeeCode(StringBuilder name) {
    Boolean containsSpace = name.toString().contains(" ");
    if (containsSpace) {
      code = name.toString().substring(0, 1);
      int spot = name.toString().indexOf(" ");
      int spot1 = spot;
      code += name.toString().substring(++spot, name.length());

    } else {
      code = "гость";
    }

  }

  private String inputName() {
    System.out.print("Введите ваше ФИО: ");
    String input1 = in.nextLine();
    return input1;
  }

  private boolean checkName(StringBuilder name) {
    Boolean validInput = false;
    Boolean containsSpace = name.toString().contains(" ");
    if (containsSpace) {
      validInput = true;
    }
    return validInput;
  }

  public EmployeeInfo() {
    in = new Scanner(System.in);

    setName();
    checkName(name);
    createEmployeeCode(name);
    String patternString = "([A-Z])[a-z][a-z][a-z]\\d\\d";
    p = Pattern.compile(patternString);
    setDeptId();
    in.close();


  }

  @Override
  public String toString() {
    return "Номер сотрудника : " + code + "\n" +
        "\nНомер отдела : " + deptId;
  }
}