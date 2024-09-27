package org.example;

import javax.swing.*;
import java.awt.*;

public class Abajo extends JPanel {
    public Abajo(BorderLayout borderLayout) {
        super();
        configurarVentana();
        inicializarComponentes();
    }

    private void configurarVentana() {

        this.setSize(450, 300);
        this.setLayout(new BorderLayout(10, 10));
    }

    private void inicializarComponentes() {
        JPanel magenta = new JPanel();
        JPanel izq = new IzquierdaMenor(new BorderLayout(10, 10));

        magenta.setBackground(Color.MAGENTA);

        magenta.setPreferredSize(new Dimension(250, 300));
        izq.setPreferredSize(new Dimension(200, 300));

        this.add(magenta, BorderLayout.CENTER);
        this.add(izq, BorderLayout.WEST);
    }
}
