package org.example;

import javax.swing.*;
import java.awt.*;

public class IzquierdaMayor extends JPanel {
    public IzquierdaMayor(BorderLayout borderLayout) {
        super();
        configurarVentana();
        inicializarComponentes();
    }

    private void configurarVentana() {

        this.setSize(450, 600);
        this.setLayout(new BorderLayout(10, 10));
    }

    private void inicializarComponentes() {
        JPanel turquesa = new JPanel();
        JPanel abajo = new Abajo(new BorderLayout(10, 10));

        turquesa.setBackground(Color.CYAN);

        turquesa.setPreferredSize(new Dimension(450, 300));
        abajo.setPreferredSize(new Dimension(450, 300));

        this.add(turquesa, BorderLayout.CENTER);
        this.add(abajo, BorderLayout.SOUTH);
    }
}
