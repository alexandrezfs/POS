package com.pos.gui;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private JPanel globalPanel;
    private JPanel productPanel;
    private JPanel directExchangePanel;
    private JPanel exchangePanel;
    private JPanel priceOffPanel;
    private JPanel totalPanel;
    private JPanel validPanel;

    private JTextField priceField;
    private JTextField ibanField;
    private JTextField productTitleField;
    private JTextField productAuthorField;
    private JTextField productEditorField;
    private JButton submitButton;
    private JComboBox productTypeCombo;

    public MainFrame() {

        this.setTitle("Logiciel de caisse v2.0");
        this.setSize(new Dimension(1300, 800));
        this.setVisible(true);

        globalPanel = new JPanel();
        productPanel = new JPanel();
        directExchangePanel = new JPanel();
        exchangePanel = new JPanel();
        priceOffPanel = new JPanel();
        totalPanel = new JPanel();
        validPanel = new JPanel();

        this.setContentPane(globalPanel);

        initializeProductInputZone();
    }

    private void initializeProductInputZone() {

        priceField = new JTextField();
        ibanField = new JTextField();
        productTitleField = new JTextField();
        productAuthorField = new JTextField();
        productEditorField = new JTextField();
        submitButton = new JButton();
        productTypeCombo = new JComboBox();

    }

}
