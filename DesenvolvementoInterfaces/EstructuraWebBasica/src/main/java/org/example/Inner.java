package org.example;

import javax.swing.*;
import java.awt.*;

public class Inner extends JPanel {
    public Inner(BorderLayout borderLayout) {
        super();
        configurarVentana();
        inicializarComponentes();
    }

    private void configurarVentana() {

        this.setSize(330, 400);
        this.setLayout(new BorderLayout(10, 10));
    }

    private void inicializarComponentes() {
        JPanel header = new JPanel(new BorderLayout());
        JPanel article = new JPanel(new BorderLayout());
        JPanel footer = new JPanel(new BorderLayout());

        header.setBackground(new Color(0xbdb76b));
        article.setBackground(new Color(0xbdb76b));
        footer.setBackground(new Color(0xbdb76b));

        JLabel hs = new JLabel("<header>", SwingConstants.CENTER);
        hs.setFont(new Font("Arial", Font.BOLD, 20));
        hs.setForeground(Color.WHITE);
        JLabel as = new JLabel("<article>", SwingConstants.CENTER);
        as.setFont(new Font("Arial", Font.BOLD, 20));
        as.setForeground(Color.WHITE);
        JLabel fs = new JLabel("<footer>", SwingConstants.CENTER);
        fs.setFont(new Font("Arial", Font.BOLD, 20));
        fs.setForeground(Color.WHITE);



        header.add(hs, BorderLayout.CENTER);
        article.add(as, BorderLayout.CENTER);
        footer.add(fs, BorderLayout.CENTER);

        header.setPreferredSize(new Dimension(330, 75));
        article.setPreferredSize(new Dimension(330, 200));
        footer.setPreferredSize(new Dimension(330, 75));

        this.add(header, BorderLayout.NORTH);
        this.add(article, BorderLayout.CENTER);
        this.add(footer, BorderLayout.SOUTH);
    }
}
