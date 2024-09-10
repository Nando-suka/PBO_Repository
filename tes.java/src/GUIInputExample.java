import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUIInputExample {
    public static void main(String[] args) {
        // Membuat JFrame sebagai jendela utama
        JFrame frame = new JFrame("Input Form");
        frame.setSize(400, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);

        // Membuat JLabel untuk nama
        JLabel nameLabel = new JLabel("Masukkan Nama:");
        nameLabel.setBounds(10, 10, 120, 25);
        frame.add(nameLabel);

        // Membuat JTextField untuk input nama
        JTextField nameField = new JTextField();
        nameField.setBounds(150, 10, 200, 25);
        frame.add(nameField);

        // Membuat JLabel untuk umur
        JLabel ageLabel = new JLabel("Masukkan Umur:");
        ageLabel.setBounds(10, 50, 120, 25);
        frame.add(ageLabel);

        // Membuat JTextField untuk input umur
        JTextField ageField = new JTextField();
        ageField.setBounds(150, 50, 200, 25);
        frame.add(ageField);

        // Membuat JButton untuk submit
        JButton submitButton = new JButton("Submit");
        submitButton.setBounds(150, 90, 100, 25);
        frame.add(submitButton);

        // Menambahkan ActionListener ke button untuk mengambil input pengguna
        submitButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Mengambil input dari text fields
                String name = nameField.getText();
                String age = ageField.getText();

                // Menampilkan input di dialog box
                JOptionPane.showMessageDialog(frame, "Nama: " + name + "\nUmur: " + age);
            }
        });

        // Menampilkan jendela
        frame.setVisible(true);
    }
}
