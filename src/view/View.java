package view;

import javax.swing.*;
import java.awt.*;

public class View extends JFrame {

    JPanel mainPanel = new JPanel();
    private JButton delete = new JButton("Видалити");
    private JFileChooser chooseFile = new JFileChooser();
    private JLabel northField = new JLabel("Видалення файлу або каталога");
    private JTextField southField = new JTextField("Введіть ім'я файлу/каталога:");
    private JPanel northPanel = new JPanel();
    private JPanel southPanel = new JPanel();
    private JPanel centerPanel = new JPanel();

    View() {
        init();
        setVisible(true);
    }

    private void init() {
        setSize(700, 500);
        setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Лаб.роб.№6,ст. Яворський Валерій, гр. КН-22з, 2017 р.");

        northPanel.add(northField, BorderLayout.CENTER);

        centerPanel.add(chooseFile, BorderLayout.CENTER);
        centerPanel.add(delete, BorderLayout.CENTER);

        southPanel.add(southField, BorderLayout.CENTER);

        mainPanel.setLayout(new BorderLayout());
        mainPanel.add(northPanel, BorderLayout.NORTH);
        mainPanel.add(centerPanel, BorderLayout.CENTER);
        mainPanel.add(southPanel, BorderLayout.SOUTH);

        add(mainPanel);
    }

}
