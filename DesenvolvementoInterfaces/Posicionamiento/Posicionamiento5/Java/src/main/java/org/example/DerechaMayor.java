package org.example;

import javax.swing.*;
import java.awt.*;

public class DerechaMayor extends JPanel {
    public DerechaMayor(BorderLayout borderLayout) {
        super();
        configurarVentana();
        inicializarComponentes();
    }

    private void configurarVentana() {

        this.setSize(250, 600);
        this.setLayout(new BorderLayout(10, 10));
    }

    private void inicializarComponentes() {
        JPanel verde = new JPanel();
        JPanel azul = new JPanel();
        JPanel marron = new JPanel();

        verde.setBackground(Color.GREEN);
        azul.setBackground(Color.BLUE);
        marron.setBackground(Color.BLACK);

        verde.setPreferredSize(new Dimension(250, 150));
        azul.setPreferredSize(new Dimension(250, 370));
        marron.setPreferredSize(new Dimension(250, 80));

        this.add(verde, BorderLayout.NORTH);
        this.add(azul, BorderLayout.CENTER);
        this.add(marron, BorderLayout.SOUTH);
    }
}
