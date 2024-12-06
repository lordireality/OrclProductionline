/**
 * Шаг 9
Создайте класс с именем Screen, который реализует интрефейс ScreenSpec. Добавьте 3 поля:
String resolution
int refreshrate
int responsetime
Закончите методы из интерфейса ScreenSpec.
Добавьте метод toString, который будет выводить данные трех полей в том же формате, как и в
классе Product.

@author (Зыкин Герман Леонидович)
 */
public class Screen implements ScreenSpec {
    private String resolution;
    private int refreshRate;
    private int responseTime;

    public Screen(String resolution, int refreshRate, int responseTime) {
        this.resolution = resolution;
        this.refreshRate = refreshRate;
        this.responseTime = responseTime;
    }

    @Override
    public String getResolution() {
        return resolution;
    }

    @Override
    public int getRefreshRate() {
        return refreshRate;
    }

    @Override
    public int getResponseTime() {
        return responseTime;
    }

    @Override
    public String toString() {
        return "Разрешение: " + resolution + "\nЧастота обновления: " + refreshRate + " Гц.\nВремя отклика: " + responseTime + " мсек";
    }
}