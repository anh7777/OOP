package adapter.media;

public class Mp4Player implements AdvancedMediaPlayer {
    @Override
    public void playVlc(String fileName) {
        // Không làm gì
    }

    @Override
    public void playMp4(String fileName) {
        System.out.println("Playing Mp4 file: " + fileName);
    }
}
