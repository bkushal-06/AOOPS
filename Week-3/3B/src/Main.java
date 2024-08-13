public class Main {
    public static void main(String[] args) {
        // Adapter Pattern
        MusicSource localFile = new LocalFile();
        MusicSource onlineStreaming = new OnlineStreaming();
        MusicSource radioStation = new RadioStation();

        MusicSourceAdapter localFileAdapter = new MusicSourceAdapter(localFile);
        MusicSourceAdapter onlineStreamingAdapter = new MusicSourceAdapter(onlineStreaming);
        MusicSourceAdapter radioStationAdapter = new MusicSourceAdapter(radioStation);

        localFileAdapter.play();
        onlineStreamingAdapter.play();
        radioStationAdapter.play();
    }
}
