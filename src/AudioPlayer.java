public class AudioPlayer extends Product implements MultimediaControl  {
    private String audioSpecification;
    private ItemType mediaType; // Предполагаем, что ItemType – это перечисление или класс

    public AudioPlayer(String name, String audioSpecification) {
        super(name); // Вызов конструктора родителя
        this.audioSpecification = audioSpecification;
        this.mediaType = ItemType.Audio; // Предположим, что тип медиа – AUDIO
    }

    @Override
    public void play() {
        System.out.println("Playing");
    }

    @Override
    public void stop() {
        System.out.println("Stopped");
    }

    @Override
    public void previous() {
        System.out.println("Playing previous track");
    }

    @Override
    public void next() {
        System.out.println("Playing next track");
    }

    @Override
    public String toString() {
        return super.toString() + "\nAudio Spec : " + audioSpecification + "\nType : " + mediaType;
    }
}