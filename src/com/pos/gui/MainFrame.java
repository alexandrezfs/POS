package com.pos.gui;

import javafx.scene.control.ComboBox;

import javax.swing.*;
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
        this.setSize(new Dimension(1300, 800));
        this.setVisible(true);
        this.initializePanels();

        initializeProductInputZone();
        initializeDirectExchangeInputZone();
        initializePurchaseInputZone();
        initializeDiscountInputZone();
    }

    private void initializePanels() {

        globalPanel = new JPanel();
        productPanel = new JPanel();
        directExchangePanel = new JPanel();
        exchangePanel = new JPanel();
        priceOffPanel = new JPanel();
        totalPanel = new JPanel();
        validPanel = new JPanel();

        this.setContentPane(globalPanel);
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