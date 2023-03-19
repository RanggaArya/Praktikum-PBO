/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Tugas1;

/**
 *
 * @author asus
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class HasilForm extends JFrame {

    private JLabel lbNama;
    private JLabel lbNIM;
    private JLabel lbKelas;
    private JButton btnBack;

    public HasilForm(String nama, String nim, String kelas) {
        setTitle("Hasil Form");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // membuat panel untuk menampung komponen form
        JPanel panel = new JPanel(new GridLayout(4, 2));

        // membuat label untuk nama
        JLabel lbNamaLabel = new JLabel("Nama    :");
        lbNama = new JLabel(nama);
        panel.add(lbNamaLabel);
        panel.add(lbNama);

        // membuat label untuk NIM
        JLabel lbNIMLabel = new JLabel("NIM      :");
        lbNIM = new JLabel(nim);
        panel.add(lbNIMLabel);
        panel.add(lbNIM);

        // membuat label untuk kelas
        JLabel lbKelasLabel = new JLabel("Kelas   :");
        lbKelas = new JLabel(kelas);
        panel.add(lbKelasLabel);
        panel.add(lbKelas);

        // membuat button untuk kembali ke halaman sebelumnya
        btnBack = new JButton("Back");
        btnBack.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // kode untuk kembali ke halaman menu form
                new MenuForm();
                dispose();
            }
        });
        panel.add(new JLabel());
        panel.add(btnBack);

        add(panel);
        setVisible(true);
    }

    public String getNama() {
        return lbNama.getText();
    }

    public void setNama(String nama) {
        lbNama.setText(nama);
    }

    public String getNIM() {
        return lbNIM.getText();
    }

    public void setNIM(String nim) {
        lbNIM.setText(nim);
    }

    public String getKelas() {
        return lbKelas.getText();
    }

    public void setKelas(String kelas) {
        lbKelas.setText(kelas);
    }

    public static void main(String[] args) {
        new HasilForm("-", "-", "-");
    }
}
