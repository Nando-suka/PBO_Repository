import javax.swing.*;

public class DesktopPaneExample {
    public static void main(String[] args) {
        // Membuat frame utama
        JFrame mainFrame = new JFrame("Contoh JDesktopPane");
        mainFrame.setSize(800, 600);
        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Membuat JDesktopPane
        JDesktopPane desktopPane = new JDesktopPane();
        
        // Membuat JInternalFrame pertama
        JInternalFrame internalFrame1 = new JInternalFrame("Jendela Internal 1", true, true, true, true);
        internalFrame1.setSize(300, 200);
        internalFrame1.setVisible(true);  // Perlu dipanggil untuk menampilkan internal frame
        
        // Membuat JInternalFrame kedua
        JInternalFrame internalFrame2 = new JInternalFrame("Jendela Internal 2", true, true, true, true);
        internalFrame2.setSize(300, 200);
        internalFrame2.setLocation(50, 50); // Mengatur posisi
        internalFrame2.setVisible(true);
        
        // Menambahkan JInternalFrame ke JDesktopPane
        desktopPane.add(internalFrame1);
        desktopPane.add(internalFrame2);
        
        // Menambahkan JDesktopPane ke frame utama
        mainFrame.add(desktopPane);
        
        // Menampilkan frame utama
        mainFrame.setVisible(true);
    }
}
