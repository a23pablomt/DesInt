package org.example;

import javax.swing.*;
import java.awt.*;

public class Contenedor extends JFrame {
    public Contenedor() {
        super();
        configurarVentana();
        inicializarComponentes();
    }

    private void configurarVentana() {

        this.setTitle("Ventana Básica");
        this.setSize(700, 600);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout(10, 10));
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void inicializarComponentes() {
        IzquierdaMayor izq = new IzquierdaMayor(new BorderLayout(10, 10));
        DerechaMayor der = new DerechaMayor(new BorderLayout(10, 10));

        this.add(izq, BorderLayout.CENTER);
        this.add(der, BorderLayout.EAST);
    }
}
