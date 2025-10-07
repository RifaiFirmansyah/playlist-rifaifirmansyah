import java.util.Scanner;

public class Playlist {
    private Song head;

    public Playlist() {
        this.head = null;
    }

    // tambah lagu di akhir playlist
    public void addSong(String title) {
        Song newSong = new Song(title);
        if (head == null) {
            head = newSong;
        } else {
            Song temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newSong;
        }
    }

    // tampilkan semua lagu
    public void displayPlaylist() {
        if (head == null) {
            System.out.println("Playlist masih kosong!");
            return;
        }
        System.out.println("Daftar Lagu dalam Playlist:");
        Song temp = head;
        while (temp != null) {
            System.out.println("- " + temp.title);
            temp = temp.next;
        }
    }

    // Program utama
    public static void main(String[] args) {
        Playlist myPlaylist = new Playlist();
        myPlaylist.addSong("i love you but im letting go - pamungkas");
        myPlaylist.addSong("tampar - juicy luicy");
        myPlaylist.addSong("Bohemian Rhapsody");
        myPlaylist.displayPlaylist();

        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan judul lagu baru untuk ditambahkan: ");
        String newTitle = scanner.nextLine();
        myPlaylist.addSong(newTitle);
        myPlaylist.displayPlaylist();
        scanner.close();
    }
}
