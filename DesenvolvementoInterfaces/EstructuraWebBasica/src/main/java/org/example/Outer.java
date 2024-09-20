package org.example;

import javax.swing.*;
import java.awt.*;

public class Outer extends JFrame {

    public Outer() {
        super();
        configurarVentana();
        inicializarComponentes();
    }

    private void configurarVentana() {

        this.setTitle("Ventana Básica");
        this.setSize(520, 675);
        this.setLocationRelativeTo(null);
        this.setLayout(null);
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void inicializarComponentes() {
        JPanel header = new JPanel();
        JPanel nav = new JPanel();
        JPanel section = new JPanel();
        JPanel aside = new JPanel();
        JPanel footer = new JPanel();
        Inner innit = new Inner(new BorderLayout(10, 10));

        header.setBackground(Color.RED);
        nav.setBackground(Color.RED);
        section.setBackground(Color.RED);
        aside.setBackground(Color.RED);
        footer.setBackground(Color.RED);
        innit.setBackground(Color.RED);
        header.add(new JLabel("<header>"), BorderLayout.CENTER);
        nav.add(new JLabel("<nav>"), BorderLayout.CENTER);
        section.add(new JLabel("<section>"), BorderLayout.CENTER);
        aside.add(new JLabel("<aside>"), BorderLayout.CENTER);
        footer.add(new JLabel("<footer>"), BorderLayout.CENTER);

        innit.setBounds(200, 150,400, 400);
        header.setBounds(0,0,800, 50);
        nav.setBounds(0, 100, 150, 450);
        section.setBounds(200, 100,400, 450);
        aside.setBounds(650,100,150, 450);
        footer.setBounds(0,600 ,800, 50);

        this.add(header);
        this.add(nav);
        this.add(section);
        this.add(aside);
        this.add(footer);


    }
}
