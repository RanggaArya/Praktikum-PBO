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
import java.awt.event.*;

public class LoginForm extends JFrame implements ActionListener {

    private JTextField tfUsername;
    private JPasswordField pfPassword;
    private JButton btnLogin;

    public LoginForm() {
        setTitle("Login Form");
        setSize(300, 150);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        // membuat panel untuk menampung komponen form
        JPanel panel = new JPanel(new GridLayout(3, 1));

        // membuat text field untuk username
        JLabel lbUsername = new JLabel("Username");
        tfUsername = new JTextField();
        panel.add(lbUsername);
        panel.add(tfUsername);

        // membuat text field untuk password
        JLabel lbPassword = new JLabel("Password");
        pfPassword = new JPasswordField();
        panel.add(lbPassword);
        panel.add(pfPassword);

        // membuat button login
        btnLogin = new JButton("Login");
        btnLogin.addActionListener(this);
        panel.add(btnLogin);

        add(panel);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = tfUsername.getText();
        String password = new String(pfPassword.getPassword());

        if (username.equals("admin") && password.equals("admin")) {
            JOptionPane.showMessageDialog(this, "Login berhasil!");
            // jika login berhasil, pindah ke halaman berikutnya
            new MenuForm();
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(this, "Username atau password salah!");
        }
    }

    public static void main(String[] args) {
        new LoginForm();
    }
}
