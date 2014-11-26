package com.pos.gui;

import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame {

    private JPanel globalPanel;

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

    public JTextField getPriceField() {
        return priceField;
    }

    public void setPriceField(JTextField priceField) {
        this.priceField = priceField;
    }

    public JTextField getIbanField() {
        return ibanField;
    }

    public void setIbanField(JTextField ibanField) {
        this.ibanField = ibanField;
    }

    public JTextField getProductTitleField() {
        return productTitleField;
    }

    public void setProductTitleField(JTextField productTitleField) {
        this.productTitleField = productTitleField;
    }

    public JTextField getProductAuthorField() {
        return productAuthorField;
    }

    public void setProductAuthorField(JTextField productAuthorField) {
        this.productAuthorField = productAuthorField;
    }

    public JTextField getProductEditorField() {
        return productEditorField;
    }

    public void setProductEditorField(JTextField productEditorField) {
        this.productEditorField = productEditorField;
    }

    public JButton getSubmitButton() {
        return submitButton;
    }

    public void setSubmitButton(JButton submitButton) {
        this.submitButton = submitButton;
    }

    public JComboBox getProductTypeCombo() {
        return productTypeCombo;
    }

    public void setProductTypeCombo(JComboBox productTypeCombo) {
        this.productTypeCombo = productTypeCombo;
    }

}
