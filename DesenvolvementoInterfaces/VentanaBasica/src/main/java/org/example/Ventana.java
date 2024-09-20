package org.example;
import javax.swing.*;


public class Ventana extends JFrame {

    public Ventana() {
        super();
        configurarVentana();
        inicializarComponentes();
    }

    private void configurarVentana() {

        this.setTitle("Ventana Básica");
        this.setSize(450, 300);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void inicializarComponentes() {
        JLabel texto1 = new JLabel();
        JLabel texto2 = new JLabel();
        JTextField caja1 = new JTextField();
        JTextField caja2 = new JTextField();
        JButton boton = new JButton();

        texto1.setText("Inserte mail");
        texto2.setText("Inserte contraseña");

        texto1.setBounds(100, 50, 150, 25);
        caja1.setBounds(250, 50, 100, 25);
        texto2.setBounds(100, 150, 150, 25);
        caja2.setBounds(250, 150, 100, 25);

        boton.setText("Registrarse");
        boton.setBounds(200, 200, 200, 30);

        this.add(texto1);
        this.add(caja1);
        this.add(texto2);
        this.add(caja2);
        this.add(boton);
    }

    public static void main(String[] args) {
        Ventana V = new Ventana();      // creamos una ventana
        V.setVisible(true);             // hacemos visible la ventana creada
    }
}