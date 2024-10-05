package Tugas;


import javax.swing.*;
import java.awt.*;

public class ModifHelloWordSwing {
    private static void createAndShowGUI() {
        // Membuat JFrame
        JFrame frame = new JFrame("HelloWorldSwing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Menambahkan JLabel dengan teks yang diperbarui
        JLabel label = new JLabel("Hello Akbar Nur Iman", SwingConstants.CENTER);
        label.setFont(new Font("Arial", Font.BOLD, 24)); // Mengubah font
        label.setForeground(Color.black); // Mengubah warna teks
        
        // Mengatur layout dan menambahkan label
        frame.getContentPane().setLayout(new BorderLayout());
        frame.getContentPane().add(label, BorderLayout.CENTER);
        
        // Mengatur ukuran frame
        frame.setSize(300, 200);
        frame.setLocationRelativeTo(null); // Memposisikan di tengah layar
        frame.setVisible(true);
    }
    
    public static void main(String[] args) {
        // Menjalankan GUI di thread yang benar
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
