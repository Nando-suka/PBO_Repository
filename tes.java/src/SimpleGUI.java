import javax.swing.JFrame;
import javax.swing.JButton;

public class SimpleGUI {
    public static void main(String[] args) {
        // Membuat frame (jendela)
        JFrame frame = new JFrame("Contoh GUI Sederhana");
        
        // Menentukan ukuran frame
        frame.setSize(400, 300);
        
        // Menambahkan tombol (button) ke dalam frame
        JButton button = new JButton("Klik Saya");
        frame.add(button);
        
        // Mengatur agar program berhenti saat jendela ditutup
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Menampilkan frame
        frame.setVisible(true);
    }
}
