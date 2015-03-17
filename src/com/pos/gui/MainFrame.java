package com.pos.gui;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class MainFrame extends JFrame {

    /*
    JPANELS
     */
    private JPanel globalPanel;
    private JPanel productPanel;
    private JPanel midAreaPanel;
    private JPanel directExchangePanel;
    private JPanel directExchangePanel_box_1;
    private JPanel exchangePanel;
    private JPanel exchangePanel_box_1;
    private JPanel priceOffPanel;
    private JPanel priceOffPanel_Box_1;
    private JPanel subTotalPanel;
    private JPanel subTotalPanel_Box_1;
    private JPanel subTotalPanel_Box_2;
    private JPanel totalPanel;
    private JPanel validPanel;

    /*
    MAIN MENU BAR
     */
    private JMenuBar mainMenuBar = new JMenuBar();
    private JMenu reportMenu = new JMenu("Rapports");

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

    /*
    SUB TOTAL ZONE
     */
    private JComboBox paymentTypeCombo;
    private JTextField discountValue;
    private JTextField couponValue;
    private JTextField priceOffValue;
    private JTextField paymentValue;
    private JTextField couponValueToReturn;
    private JTextField cashValueToReturn;
    private JComboBox paymentTypeToReturn;

    /*
    JTables
     */
    private JTable productTable;
    String  productTableTitle[] = {"Prix", "Code", "Type", "Titre", "Auteur", "Editeur", "Edition"};
    private JTable directExchangeTable;
    String  directExchangeTableTitle[] = {"Valeur", "Nom client"};
    private JTable discountTable;
    String  discountTableTitle[] = {"Valeur", "Nom"};
    private JTable couponTable;
    String  couponTableTitle[] = {"No", "Valeur", "Magasin"};

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
        initializeMainMenuBar();

        this.setVisible(true);
    }

    private void initializeMainMenuBar() {

        mainMenuBar.add(reportMenu);

        this.setJMenuBar(mainMenuBar);
    }

    private void initializePanels() {

        globalPanel = new JPanel();
        productPanel = new JPanel();

        midAreaPanel = new JPanel();
        directExchangePanel = new JPanel();
        exchangePanel = new JPanel();
        priceOffPanel = new JPanel();

        totalPanel = new JPanel();
        validPanel = new JPanel();

        directExchangePanel_box_1 = new JPanel();
        exchangePanel_box_1 = new JPanel();
        priceOffPanel_Box_1 = new JPanel();

        productPanel.setLayout(new FlowLayout());
        productPanel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        midAreaPanel.add(directExchangePanel, BorderLayout.EAST);
        midAreaPanel.add(exchangePanel, BorderLayout.CENTER);
        midAreaPanel.add(priceOffPanel, BorderLayout.WEST);

        globalPanel.add(productPanel, BorderLayout.NORTH);
        globalPanel.add(midAreaPanel, BorderLayout.CENTER);
        globalPanel.add(totalPanel, BorderLayout.SOUTH);

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

        directExchangeTable = new JTable();
        directExchangeAmountField = new JTextField();
        directExchangeAmountField.setColumns(7);
        directExchangeAmountField.setBorder(new TitledBorder("Valeur"));
        directExchangeClientField = new JTextField();
        directExchangeClientField.setColumns(7);
        directExchangeClientField.setBorder(new TitledBorder("Client"));

        directExchangePanel.setBorder(new TitledBorder("Echange Direct"));

        directExchangePanel_box_1.setLayout(new BoxLayout(directExchangePanel_box_1, BoxLayout.Y_AXIS));
        directExchangePanel_box_1.add(directExchangeAmountField);
        directExchangePanel_box_1.add(directExchangeClientField);

        directExchangePanel.add(directExchangePanel_box_1, BorderLayout.WEST);
    }

    private void initializePurchaseInputZone() {

        couponTable = new JTable();
        couponAmountField = new JTextField();
        couponAmountField.setColumns(7);
        couponAmountField.setBorder(new TitledBorder("Valeur"));
        couponIdField = new JTextField();
        couponIdField.setColumns(7);
        couponIdField.setBorder(new TitledBorder("Numero"));
        couponStoreCombo = new JComboBox();
        couponStoreCombo.setBorder(new TitledBorder("Magasin"));

        exchangePanel.setBorder(new TitledBorder("Echange / Achat"));

        exchangePanel_box_1.setLayout(new BoxLayout(exchangePanel_box_1, BoxLayout.Y_AXIS));
        exchangePanel_box_1.add(couponAmountField);
        exchangePanel_box_1.add(couponIdField);
        exchangePanel_box_1.add(couponStoreCombo);

        exchangePanel.add(exchangePanel_box_1, BorderLayout.EAST);
    }

    private void initializeDiscountInputZone() {

        discountTable = new JTable();
        discountAmountField = new JTextField();
        discountAmountField.setColumns(7);
        discountAmountField.setBorder(new TitledBorder("Valeur"));
        discountAmountTypeCombo = new JComboBox();
        discountAmountTypeCombo.setBorder(new TitledBorder("Type"));
        discountClientField = new JTextField();
        discountClientField.setColumns(7);
        discountClientField.setBorder(new TitledBorder("Client"));

        priceOffPanel.setComponentOrientation(ComponentOrientation.LEFT_TO_RIGHT);
        priceOffPanel.setBorder(new TitledBorder("Remise"));

        priceOffPanel_Box_1.setLayout(new BoxLayout(priceOffPanel_Box_1, BoxLayout.Y_AXIS));
        priceOffPanel_Box_1.add(discountAmountField);
        priceOffPanel_Box_1.add(discountAmountTypeCombo);
        priceOffPanel_Box_1.add(discountClientField);

        priceOffPanel.add(priceOffPanel_Box_1, BorderLayout.WEST);
    }

}