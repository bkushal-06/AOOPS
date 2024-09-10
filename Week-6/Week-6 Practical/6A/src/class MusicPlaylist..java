import java.util.LinkedList;

class MusicPlaylist {
    private LinkedList<String> playlist;

    public MusicPlaylist() {
        playlist = new LinkedList<>();
    }

    public void addSong(String song) {
        playlist.add(song);
        System.out.println("Song added: " + song);
    }

    public void removeSong(String song) {
        if (playlist.remove(song)) {
            System.out.println("Song removed: " + song);
        } else {
            System.out.println("Song not found in the playlist.");
        }
    }

    public void moveSong(int fromIndex, int toIndex) {
        if (fromIndex >= 0 && fromIndex < playlist.size() && toIndex >= 0 && toIndex < playlist.size()) {
            String song = playlist.remove(fromIndex);
            playlist.add(toIndex, song);
            System.out.println("Moved song to position: " + toIndex);
        } else {
            System.out.println("Invalid indices.");
        }
    }

    public void displayPlaylist() {
        System.out.println("Music Playlist:");
        for (int i = 0; i < playlist.size(); i++) {
            System.out.println(i + ": " + playlist.get(i));
        }
    }
}
