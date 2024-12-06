import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class EmployeeInfo {

  StringBuilder name = new StringBuilder();
  String code;
  String deptId;
  Pattern p;
  Scanner in;

  public String reverseString(String id) {
    char letter = id.charAt(id.length() - 1);

    if (id.length() == 1) {
      return Character.toString(letter);

    } else {

      return letter + reverseString(id.substring(0, id.length() - 1));
    }

  }

  public String getDeptId() {
    System.out.println("Please enter the department ID:");
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
      code = "guest";
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
      // Returns true is string isn't empty + has the space
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
    return "Employee Code : " + code + "\n" +
        "\nDepartment Number : " + deptId;
  }
}