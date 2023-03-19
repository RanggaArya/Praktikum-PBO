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

public class MenuForm extends JFrame {

    private JTextField tfNama;
    private JTextField tfNIM;
    private JButton btnSubmit;
    private JComboBox<String> cbKelas;
    private JButton btnLogout;

    public MenuForm() {
        setTitle("Menu Form");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        
        // membuat panel untuk menampung komponen form
        JPanel panel = new JPanel(new GridLayout(5, 2));
        
        // membuat text field untuk nama
        JLabel lbNama = new JLabel("Nama");
        tfNama = new JTextField();
        panel.add(lbNama);
        panel.add(tfNama);

        // membuat text field untuk NIM
        JLabel lbNIM = new JLabel("NIM");
        tfNIM = new JTextField();
        panel.add(lbNIM);
        panel.add(tfNIM);

        // membuat combo box untuk kelas
        JLabel lbKelas = new JLabel("Kelas");
        cbKelas = new JComboBox<>(new String[]{"IF-A", "IF-B", "IF-C", "IF-D", "IF-E"});
        panel.add(lbKelas);
        panel.add(cbKelas);

        // membuat button untuk menyimpan data
        btnSubmit = new JButton("Submit");
        btnSubmit.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(e.getSource()==btnSubmit){
                    String Nama = tfNama.getText();
                    String NIM = tfNIM.getText();
                    String Kelas = (String)cbKelas.getSelectedItem();
                    new HasilForm(Nama,NIM,Kelas);
                    dispose();
                }      
            }
        });
        panel.add(new JLabel());
        panel.add(btnSubmit);

        // membuat button untuk logout
        btnLogout = new JButton("Logout");
        btnLogout.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // kode untuk kembali ke halaman login
                dispose();
                new LoginForm();
            }
        });
        panel.add(new JLabel());
        panel.add(btnLogout);

        add(panel);
        setVisible(true);
    }

    public static void main(String[] args) {
        new MenuForm();
    }
}
