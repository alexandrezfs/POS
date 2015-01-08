package com.pos.gui;

import javafx.scene.control.ComboBox;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class MainFrame extends JFrame {

    /*
    JPANELS
     */
    private JPanel globalPanel;
    private JPanel productPanel;
    private JPanel directExchangePanel;
    private JPanel exchangePanel;
    private JPanel priceOffPanel;
    private JPanel totalPanel;
    private JPanel validPanel;

    /*
    PRODUCT INPUT ZONE
     */
    private JTextField priceField;
    private JTextField ibanField;
    private JTextField productTitleField;
    private JTextField productAuthorField;
    private JTextField productEditorField;
    private JButton submitButton;
    private JComboBox productTypeCombo;

    /*
    DIRECT EXCHANGE INPUT ZONE
     */
    private JTextField directExchangeAmountField;
    private JTextField directExchangeClientField;

    /*
    PURCHASE INPUT ZONE
     */
    private JTextField couponAmountField;
    private JComboBox couponStoreCombo;
    private JTextField couponIdField;

    /*
    DISCOUNT INPUT ZONE
     */
    private JTextField discountClientField;
    private JTextField discountAmountField;
    private JComboBox discountAmountTypeCombo;

    public MainFrame() {

        this.setTitle("Logiciel de caisse v2.0");
        this.setSize(new Dimension(1000, 800));
        this.setLocationRelativeTo(null);
        this.initializePanels();
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        initializeProductInputZone();
        initializeDirectExchangeInputZone();
        initializePurchaseInputZone();
        initializeDiscountInputZone();

        this.setVisible(true);
    }

    private void initializePanels() {

        globalPanel = new JPanel();
        productPanel = new JPanel();
        directExchangePanel = new JPanel();
        exchangePanel = new JPanel();
        priceOffPanel = new JPanel();
        totalPanel = new JPanel();
        validPanel = new JPanel();

        productPanel.setLayout(new FlowLayout());
        productPanel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        globalPanel.add(productPanel, BorderLayout.NORTH);

        this.setContentPane(globalPanel);
    }

    private void initializeProductInputZone() {

        priceField = new JTextField();
        priceField.setColumns(4);
        priceField.setBorder(new TitledBorder("Prix"));
        ibanField = new JTextField();
        ibanField.setColumns(13);
        ibanField.setBorder(new TitledBorder("EAN / ISBN / IBAN"));
        productTitleField = new JTextField();
        productTitleField.setColumns(13);
        productTitleField.setBorder(new TitledBorder("Titre"));
        productAuthorField = new JTextField();
        productAuthorField.setBorder(new TitledBorder("Auteur"));
        productAuthorField.setColumns(13);
        productEditorField = new JTextField();
        productEditorField.setBorder(new TitledBorder("Editeur"));
        productEditorField.setColumns(13);
        submitButton = new JButton("Valider");
        productTypeCombo = new JComboBox();
        productTypeCombo.setBorder(new TitledBorder("Type"));

        productPanel.setBorder(new TitledBorder("Ajouter produit"));
        productPanel.add(priceField);
        productPanel.add(ibanField);
        productPanel.add(productTypeCombo);
        productPanel.add(productTitleField);
        productPanel.add(productAuthorField);
        productPanel.add(productEditorField);
        productPanel.add(submitButton);
    }

    private void initializeDirectExchangeInputZone() {

        directExchangeAmountField = new JTextField();
        directExchangeClientField = new JTextField();
    }

    private void initializePurchaseInputZone() {

        couponAmountField = new JTextField();
        couponIdField = new JTextField();
        couponStoreCombo = new JComboBox();
    }

    private void initializeDiscountInputZone() {

        discountAmountField = new JTextField();
        discountAmountTypeCombo = new JComboBox();
        discountClientField = new JTextField();
    }

}