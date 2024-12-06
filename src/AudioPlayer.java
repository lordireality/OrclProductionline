/**
 * Шаг - 5 
Нам необходим конкретный класс, который позволит получить данные об аудиоплеере.
Создайте класс AudioPlayer, который является подклассом Product и реализует интерфейс
MultimediaControl.
В классе будут 2 поля
• String audioSpecification
• ItemType mediaType
Создайте конструктор с двумя параметрами – name и audioSpecification.
Конструктор также должен вызывать конструктор родителя и задавать media type
Реализуйте методы из интерфейса MultimediaControl, выводя в консоль сообщение о
соответствующем действии. Например, для play выведите System.out.println("Playing"); Обычно
нам приходится программировать инструкции для медиаплеера, но в этом задании просто будем
выводить сообщение.
Создайте метод toString, который будет вызывать метод toString родительского класса и добавит
вывод полей Audio Spec и Type.

 * 
 @author (Зыкин Герман Леонидович)
 */

public class AudioPlayer extends Product implements MultimediaControl  {
    private String audioSpecification; /
    private ItemType mediaType; //тип из ItemType

    public AudioPlayer(String name, String audioSpecification) {
        super(name); // Вызов конструктора родителя
        this.audioSpecification = audioSpecification;
        this.mediaType = ItemType.Audio; // Предположим, что тип медиа – AUDIO по умолчанию
    }

    @Override
    public void play() {
        System.out.println("Играет");
    }

    @Override
    public void stop() {
        System.out.println("Остановлено");
    }

    @Override
    public void previous() {
        System.out.println("Предыдущий трек");
    }

    @Override
    public void next() {
        System.out.println("Следующий трек");
    }

    @Override
    public String toString() {
        return super.toString() + "\nСпецификация : " + audioSpecification + "\nТип : " + mediaType;
    }
}