import java.util.Scanner;

public class MusicPlaylistMain {
    public static void main(String[] args) {
        MusicPlaylist playlist = new MusicPlaylist();
        Scanner scanner = new Scanner(System.in);
        int choice;
        
        do {
            System.out.println("\nMusic Playlist:");
            System.out.println("1. Add Song");
            System.out.println("2. Remove Song");
            System.out.println("3. Move Song");
            System.out.println("4. Display Playlist");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();  // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter song name: ");
                    String song = scanner.nextLine();
                    playlist.addSong(song);
                    break;
                case 2:
                    System.out.print("Enter song name to remove: ");
                    String songToRemove = scanner.nextLine();
                    playlist.removeSong(songToRemove);
                    break;
                case 3:
                    System.out.print("Enter current song index: ");
                    int fromIndex = scanner.nextInt();
                    System.out.print("Enter new song index: ");
                    int toIndex = scanner.nextInt();
                    playlist.moveSong(fromIndex, toIndex);
                    break;
                case 4:
                    playlist.displayPlaylist();
                    break;
                case 5:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
}
