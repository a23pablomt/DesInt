package org.example;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class Outer2 extends JFrame{
    public Outer2() {
        super();
        configurarVentana();
        inicializarComponentes();
    }

    private void configurarVentana() {

        this.setTitle("Ventana Básica");
        this.setSize(620, 670);
        this.setLocationRelativeTo(null);
        this.setLayout(new BorderLayout(10, 10));
        this.setResizable(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    private void inicializarComponentes() {
        JPanel header = new JPanel(new BorderLayout());
        JPanel nav = new JPanel(new BorderLayout());
        JPanel section = new JPanel(new BorderLayout(10, 10));
        JPanel aside = new JPanel(new BorderLayout());
        JPanel footer = new JPanel(new BorderLayout());
        Inner innit = new Inner(new BorderLayout(10, 10));

        JLabel hh = new JLabel("<header>", SwingConstants.CENTER);
        hh.setFont(new Font("Arial", Font.BOLD, 20));
        hh.setForeground(Color.WHITE);
        JLabel nh = new JLabel("<nav>", SwingConstants.CENTER);
        nh.setFont(new Font("Arial", Font.BOLD, 20));
        nh.setForeground(Color.WHITE);
        JLabel sh = new JLabel("<section>", SwingConstants.CENTER);
        sh.setFont(new Font("Arial", Font.BOLD, 20));
        sh.setForeground(Color.WHITE);
        JLabel ah = new JLabel("<aside>", SwingConstants.CENTER);
        ah.setFont(new Font("Arial", Font.BOLD, 20));
        ah.setForeground(Color.WHITE);
        JLabel fh = new JLabel("<footer>", SwingConstants.CENTER);
        fh.setFont(new Font("Arial", Font.BOLD, 20));
        fh.setForeground(Color.WHITE);

        header.setBackground(new Color(0xcd5c5c));
        nav.setBackground(new Color(0xcd5c5c));
        section.setBackground(new Color(0xcd5c5c));
        aside.setBackground(new Color(0xcd5c5c));
        footer.setBackground(new Color(0xcd5c5c));
        innit.setBackground(new Color(0xcd5c5c));

        header.setPreferredSize(new Dimension(720,50));
        nav.setPreferredSize(new Dimension(125,500));
        section.setPreferredSize(new Dimension(350,500));
        aside.setPreferredSize(new Dimension(125,500));
        footer.setPreferredSize(new Dimension(720,50));
        innit.setPreferredSize(new Dimension(330, 450));

        section.setBorder(new EmptyBorder(10, 10, 10, 10));

        header.add(hh, BorderLayout.CENTER);
        nav.add(nh, BorderLayout.CENTER);
        section.add(sh, BorderLayout.CENTER);
        section.add(innit, BorderLayout.SOUTH);
        aside.add(ah, BorderLayout.CENTER);
        footer.add(fh, BorderLayout.CENTER);

        this.add(header, BorderLayout.NORTH);
        this.add(nav, BorderLayout.WEST);
        this.add(section, BorderLayout.CENTER);
        this.add(aside, BorderLayout.EAST);
        this.add(footer, BorderLayout.SOUTH);

    }
}
