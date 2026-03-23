package ru.labs.hm1;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemListener;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Main extends JFrame {
    private static int countMax  = 3;

    public static void main(String[] args) {
        JFrame frame = new JFrame("Заказ блюда");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 450);
        frame.setLayout(new GridLayout(6, 1));

        String[] items = {"огненный соус +10 септимов", "двойная порция оленины +20 септимов", "снежные ягоды +5 септимов", "нордская лепешка +7 септимов"};
        List<JCheckBox> checkBoxes = new ArrayList<>();
        List<String> logs = new ArrayList<>();

        ItemListener limitListener = e -> {
            long selectedCount = checkBoxes.stream().filter(AbstractButton::isSelected).count();
            for (JCheckBox checkBox : checkBoxes) {
                if (!checkBox.isSelected()) {
                    checkBox.setEnabled(selectedCount < countMax);
                }
            }
        };
        for (String text : items) {
            JCheckBox checkBox = new JCheckBox(text);
            checkBox.addItemListener(limitListener);
            checkBoxes.add(checkBox);
            frame.add(checkBox);
        }

        JButton addOrder = new JButton("Сделать заказ");
        addOrder.addActionListener(e -> {
            BaseDecorator dish = new BaseDishDecorator();
            for (JCheckBox checkBox : checkBoxes) {
                if (checkBox.isSelected()) {
                    switch (checkBox.getText()) {
                        case "огненный соус +10 септимов":
                            dish = new SousDecorator(dish);
                            break;
                        case "двойная порция оленины +20 септимов":
                            dish = new DeerDecorator(dish);
                            break;
                        case "снежные ягоды +5 септимов":
                            dish = new BerryDecorator(dish);
                            break;
                        case "нордская лепешка +7 септимов":
                            dish = new NordBreadDecorator(dish);
                            break;
                    }
                }
            }
            LocalTime time = LocalTime.now().withNano(0);
            String message = dish.getName() + " + цена " + dish.getPrice();
            logs.add(time + "|" + message);
            System.out.println(message);
        });
        frame.add(addOrder);

        JButton logButton = new JButton("Посмотреть логи");
        logButton.addActionListener(e -> {
            if (logs.isEmpty()) {
                System.out.println("нет логов");
            } else {
                logs.forEach(System.out::println);
            }
        });
        frame.add(logButton);

        frame.setVisible(true);
    }
}