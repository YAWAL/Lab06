package view;

import javax.swing.*;
import java.awt.*;

public class View extends JFrame {

    View() {
        init();
        setVisible(true);
    }


    private void init() {
        setSize(700, 500);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Лаб.роб.№6,ст. Яворський Валерій, гр. КН-22з, 2017 р.");

        JButton delete = new JButton("Видалити");
        JFileChooser chooseFile = new JFileChooser();
        JLabel northField = new JLabel("Видалення файлу або каталога");
        JTextField southField = new JTextField("Введіть ім'я файлу/каталога:");

        JPanel mainPanel = new JPanel();

        mainPanel.setLayout(new BorderLayout());

        JPanel northPanel = new JPanel();
        northPanel.add(northField, BorderLayout.CENTER);

        JPanel centerPanel = new JPanel();
        centerPanel.add(chooseFile, BorderLayout.CENTER);
        centerPanel.add(delete, BorderLayout.CENTER);

        JPanel southPanel = new JPanel();
        southPanel.add(southField, BorderLayout.CENTER);

        mainPanel.add(northPanel, BorderLayout.NORTH);
        mainPanel.add(centerPanel, BorderLayout.CENTER);
        mainPanel.add(southPanel, BorderLayout.SOUTH);

        add(mainPanel);
    }

}
