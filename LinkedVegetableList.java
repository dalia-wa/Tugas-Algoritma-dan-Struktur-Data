// Kelas Node untuk membungkus objek sayur
class NodeVeg {
    Vegetable vegetable; // Data yang disimpan berupa objek Vegetable/LeafyVegetable
    NodeVeg next;        // Pointer ke node berikutnya

    public NodeVeg(Vegetable vegetable) {
        this.vegetable = vegetable;
        this.next = null;
    }

    public Vegetable getVegetable() {
        return this.vegetable;
    }
}

// Kelas Utama Single Linked List untuk Sayuran
public class LinkedVegetableList {
    NodeVeg head;

    public boolean isEmpty() {
        return head == null;
    }

    // 1. Tambah di depan (Add First)
    public void addFirst(Vegetable veg) {
        NodeVeg newNode = new NodeVeg(veg);
        if (isEmpty()) {
            head = newNode;
        } else {
            newNode.next = head;
            head = newNode;
        }
        System.out.println("[Berhasil tambah di depan]: " + veg.getName());
    }

    // 2. Tambah di belakang (Add Last)
    public void addLast(Vegetable veg) {
        NodeVeg newNode = new NodeVeg(veg);
        if (isEmpty()) {
            head = newNode;
        } else {
            NodeVeg current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
        System.out.println("[Berhasil tambah di belakang]: " + veg.getName());
    }

    // 3. Hapus di depan (Delete First)
    public void deleteFirst() {
        if (isEmpty()) {
            System.out.println("Linked List kosong, tidak ada sayur yang dihapus!");
            return;
        }
        System.out.println("[Menghapus dari depan]: " + head.getVegetable().getName());
        head = head.next;
    }

    // 4. Menampilkan seluruh isi list menggunakan toString()
    public void displayList() {
        if (isEmpty()) {
            System.out.println("Daftar sayur kosong!");
            return;
        }

        NodeVeg current = head;
        int index = 1;
        while (current != null) {
            System.out.println(index + ". " + current.getVegetable().toString());
            current = current.next;
            index++;
        }
    }

    // Main Method untuk menjalankan program & pengujian
    public static void main(String[] args) {
        System.out.println("=== PROGRAM SINGLE LINKED LIST - TOKO SAYUR ==_\n");

        LinkedVegetableList marketList = new LinkedVegetableList();

        // Membuat beberapa objek sayuran (menggunakan kelas induk dan kelas turunan)
        Vegetable bayam = new LeafyVegetable("Bayam Hijau", "Hijau", 5000, 9);
        Vegetable wortel = new Vegetable("Wortel", "Oranye", 12000);
        Vegetable kangkung = new LeafyVegetable("Kangkung", "Hijau", 4500, 8);

        // Uji coba method Linked List
        marketList.addLast(wortel);     // Masuk ke belakang
        marketList.addLast(kangkung);    // Masuk ke belakang
        marketList.addFirst(bayam);     // Masuk ke depan

        System.out.println("\n--- DAFTAR SAYUR DI KERANJANG ---");
        marketList.displayList();

        System.out.println("\n--- MELAKUKAN PENGHAPUSAN (DELETE FIRST) ---");
        marketList.deleteFirst();

        System.out.println("\n--- DAFTAR SAYUR SETELAH DIHAPUS ---");
        marketList.displayList();
    }
}