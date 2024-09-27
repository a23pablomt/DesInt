package org.example;

import javax.swing.*;
import java.awt.*;

public class IzquierdaMenor extends JPanel {
    public IzquierdaMenor(BorderLayout borderLayout) {
        super();
        configurarVentana();
        inicializarComponentes();
    }

    private void configurarVentana() {

        this.setSize(200, 300);
        this.setLayout(new BorderLayout(10, 10));
    }

    private void inicializarComponentes() {
        JPanel rojo = new JPanel();
        JPanel naranja = new JPanel();

        rojo.setBackground(Color.RED);
        naranja.setBackground(Color.ORANGE);

        rojo.setPreferredSize(new Dimension(250, 100));
        naranja.setPreferredSize(new Dimension(250, 200));

        this.add(rojo, BorderLayout.NORTH);
        this.add(naranja, BorderLayout.CENTER);
    }
}
