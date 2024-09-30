import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class belajarDesktop {
    public static void main(String[] args) {

        // Membuat frame (jendela)
        JFrame mywindow = new JFrame();

        mywindow.setTitle("Jendela Program");

        // tentukan ukuran jendela
        mywindow.setSize(400, 200);

        // tampilkan layer jendela
        mywindow.setVisible(true);

        // Menambahkan button 1
        Button B1 = new Button("OK");
        B1.setBounds(100, 50, 50, 50);
        mywindow.add(B1);
  }
}


