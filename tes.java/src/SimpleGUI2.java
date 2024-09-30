import javax.swing.JFrame;
import javax.swing.JButton;

public class SimpleGUI2 {
    
    public static void main(String[] args) {

        // Metode membuat frame jendela
        JFrame frame = new JFrame("Latihan membuat GUI dengan Java");

        // Menentukan ukuran dari frame
        frame.setSize(900, 300);

        // Dapat menutup jendela
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Memanggil button dengan JButton
        JButton button = new JButton("Finish");
        frame.add(button);

        JButton tombol = new JButton("Click");
        frame.add(tombol);

        // Menampilkan frame
        frame.setVisible(true);

    }
}
