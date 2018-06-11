// File name: GUIApplicationFrame.java
// Written by: Yuriy Kuptsov
// Description: This program allows the user to select a shapeChoice from a
//              drop-down menue, and enter parameters for the shape to calculate
//              area and perimeter.
// Time Spent: About 9 hours
//           
// Date created: 11/03/2017
// ---------------------------------------------------------------------------

package chapter22.gui;

import chapter22.shapes.*;

public class GUIApplicationFrame extends javax.swing.JFrame {

    public GUIApplicationFrame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        inputDataPanel = new javax.swing.JPanel();
        inputDataLabel = new javax.swing.JLabel();
        radiusInputField = new javax.swing.JTextField();
        radiusLabel = new javax.swing.JLabel();
        widthTextField = new javax.swing.JTextField();
        widthLabel = new javax.swing.JLabel();
        sideLabel = new javax.swing.JLabel();
        sideTextField = new javax.swing.JTextField();
        heightLabel = new javax.swing.JLabel();
        heightTextField = new javax.swing.JTextField();
        side1Lable = new javax.swing.JLabel();
        side1TextField = new javax.swing.JTextField();
        side2Label = new javax.swing.JLabel();
        side2TextField = new javax.swing.JTextField();
        side3Label = new javax.swing.JLabel();
        side3TextField = new javax.swing.JTextField();
        shapePickerComboBox = new javax.swing.JComboBox<>();
        shapePickerLabel = new javax.swing.JLabel();
        resultPanel = new javax.swing.JPanel();
        inputDataLabel1 = new javax.swing.JLabel();
        shapeLabel = new javax.swing.JLabel();
        areaLabel = new javax.swing.JLabel();
        perimiterLabel = new javax.swing.JLabel();
        perimeterTextField = new javax.swing.JTextField();
        shapeTextField = new javax.swing.JTextField();
        areaTextField = new javax.swing.JTextField();
        getButton = new javax.swing.JButton();
        clearButton = new javax.swing.JButton();
        exitButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("GUI Application");
        setMinimumSize(new java.awt.Dimension(600, 695));
        setPreferredSize(new java.awt.Dimension(600, 457));

        inputDataPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        inputDataLabel.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        inputDataLabel.setText("Input Data:");

        radiusInputField.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        radiusLabel.setText("radius:");

        widthTextField.setEnabled(false);
        widthTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                widthTextFieldActionPerformed(evt);
            }
        });

        widthLabel.setText("width:");

        sideLabel.setText("side:");

        sideTextField.setEnabled(false);

        heightLabel.setText("height:");

        heightTextField.setEnabled(false);
        heightTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                heightTextFieldActionPerformed(evt);
            }
        });

        side1Lable.setText("side 1:");

        side1TextField.setEnabled(false);

        side2Label.setText("side 2:");

        side2TextField.setEnabled(false);

        side3Label.setText("side 3:");

        side3TextField.setEnabled(false);

        javax.swing.GroupLayout inputDataPanelLayout = new javax.swing.GroupLayout(inputDataPanel);
        inputDataPanel.setLayout(inputDataPanelLayout);
        inputDataPanelLayout.setHorizontalGroup(
            inputDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputDataPanelLayout.createSequentialGroup()
                .addComponent(inputDataLabel)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(inputDataPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(inputDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inputDataPanelLayout.createSequentialGroup()
                        .addComponent(widthLabel)
                        .addGap(18, 18, 18)
                        .addComponent(widthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(heightLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(heightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(inputDataPanelLayout.createSequentialGroup()
                        .addGroup(inputDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(inputDataPanelLayout.createSequentialGroup()
                                .addGroup(inputDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sideLabel)
                                    .addComponent(side1Lable))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(inputDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sideTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(inputDataPanelLayout.createSequentialGroup()
                                        .addComponent(side1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(side2Label)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(side2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(side3Label)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(side3TextField, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(inputDataPanelLayout.createSequentialGroup()
                                .addComponent(radiusLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(radiusInputField, javax.swing.GroupLayout.PREFERRED_SIZE, 358, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        inputDataPanelLayout.setVerticalGroup(
            inputDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(inputDataPanelLayout.createSequentialGroup()
                .addComponent(inputDataLabel)
                .addGap(18, 18, 18)
                .addGroup(inputDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(radiusInputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(radiusLabel))
                .addGap(18, 18, 18)
                .addGroup(inputDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(widthTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(widthLabel)
                    .addComponent(heightLabel)
                    .addComponent(heightTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(inputDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sideLabel)
                    .addComponent(sideTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(inputDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(inputDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(side3Label)
                        .addComponent(side3TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(inputDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(side2Label)
                        .addComponent(side2TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(inputDataPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(side1Lable)
                        .addComponent(side1TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 74, Short.MAX_VALUE))
        );

        shapePickerComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "CIRCLE", "RECTANGLE", "SQUARE", "TRIANGLE" }));
        shapePickerComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shapePickerComboBoxActionPerformed(evt);
            }
        });

        shapePickerLabel.setText("Pick up one shape:");

        resultPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(204, 204, 204)));

        inputDataLabel1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        inputDataLabel1.setText("Result:");

        shapeLabel.setText("Shape is:");

        areaLabel.setText("Area is:");

        perimiterLabel.setText("Perimeter is:");

        perimeterTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perimeterTextFieldActionPerformed(evt);
            }
        });

        shapeTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shapeTextFieldActionPerformed(evt);
            }
        });

        areaTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaTextFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout resultPanelLayout = new javax.swing.GroupLayout(resultPanel);
        resultPanel.setLayout(resultPanelLayout);
        resultPanelLayout.setHorizontalGroup(
            resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultPanelLayout.createSequentialGroup()
                .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(resultPanelLayout.createSequentialGroup()
                        .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(areaLabel)
                            .addComponent(shapeLabel))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(shapeTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 414, Short.MAX_VALUE)
                            .addComponent(areaTextField)))
                    .addGroup(resultPanelLayout.createSequentialGroup()
                        .addComponent(inputDataLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(resultPanelLayout.createSequentialGroup()
                        .addComponent(perimiterLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(perimeterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        resultPanelLayout.setVerticalGroup(
            resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(resultPanelLayout.createSequentialGroup()
                .addComponent(inputDataLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(shapeLabel)
                    .addComponent(shapeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(areaLabel)
                    .addComponent(areaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(resultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(perimiterLabel)
                    .addComponent(perimeterTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 30, Short.MAX_VALUE))
        );

        getButton.setText("Get");
        getButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getButtonActionPerformed(evt);
            }
        });

        clearButton.setText("Clear");
        clearButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearButtonActionPerformed(evt);
            }
        });

        exitButton.setText("Exit");
        exitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                exitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(shapePickerLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(shapePickerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(inputDataPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(resultPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(getButton)
                        .addGap(71, 71, 71)
                        .addComponent(clearButton)
                        .addGap(79, 79, 79)
                        .addComponent(exitButton)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(shapePickerComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(shapePickerLabel))
                .addGap(48, 48, 48)
                .addComponent(inputDataPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(resultPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 81, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(getButton)
                    .addComponent(clearButton)
                    .addComponent(exitButton))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void heightTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_heightTextFieldActionPerformed

    }//GEN-LAST:event_heightTextFieldActionPerformed

    private void widthTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_widthTextFieldActionPerformed

    }//GEN-LAST:event_widthTextFieldActionPerformed

    private void shapePickerComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shapePickerComboBoxActionPerformed
        String selectedItem = (String) shapePickerComboBox.getSelectedItem();
        
        radiusInputField.setText("");
        heightTextField.setText("");
        widthTextField.setText("");
        sideTextField.setText("");
        side1TextField.setText("");
        side2TextField.setText("");
        side3TextField.setText("");
        
        //switch for the combo box
        switch (selectedItem) {
            case "CIRCLE":
                radiusInputField.setEnabled(true);
                heightTextField.setEnabled(false);
                widthTextField.setEnabled(false);
                sideTextField.setEnabled(false);
                side1TextField.setEnabled(false);
                side2TextField.setEnabled(false);
                side3TextField.setEnabled(false);
                break;
            case "RECTANGLE":
                radiusInputField.setEnabled(false);
                heightTextField.setEnabled(true);
                widthTextField.setEnabled(true);
                sideTextField.setEnabled(false);
                side1TextField.setEnabled(false);
                side2TextField.setEnabled(false);
                side3TextField.setEnabled(false);
                break;
            case "SQUARE":
                radiusInputField.setEnabled(false);
                heightTextField.setEnabled(false);
                widthTextField.setEnabled(false);
                sideTextField.setEnabled(true);
                side1TextField.setEnabled(false);
                side2TextField.setEnabled(false);
                side3TextField.setEnabled(false);
                break;
            case "TRIANGLE":
                radiusInputField.setEnabled(false);
                heightTextField.setEnabled(false);
                widthTextField.setEnabled(false);
                sideTextField.setEnabled(false);
                side1TextField.setEnabled(true);
                side2TextField.setEnabled(true);
                side3TextField.setEnabled(true);
                break;
            default:
                break;
        }
    }//GEN-LAST:event_shapePickerComboBoxActionPerformed

    private void perimeterTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perimeterTextFieldActionPerformed

    }//GEN-LAST:event_perimeterTextFieldActionPerformed

    private void clearButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearButtonActionPerformed
        //making all text fields to be empty
        radiusInputField.setText("");
        heightTextField.setText("");
        widthTextField.setText("");
        sideTextField.setText("");
        side1TextField.setText("");
        side2TextField.setText("");
        side3TextField.setText("");
        
        shapeTextField.setText("");
        areaTextField.setText("");
        perimeterTextField.setText("");
    }//GEN-LAST:event_clearButtonActionPerformed

    private void getButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getButtonActionPerformed
        // declaring inner variables for the get button action
        Shape selectedShape = null;
        String selectedItem = (String) shapePickerComboBox.getSelectedItem();
        String rawInput1 = "";
        String rawInput2 = "";
        String rawInput3 = "";
        double radius = 0.0;
        double width = 0.0, height = 0.0;
        double side1 = 0.0, side2 = 0.0, side3 = 0.0;
        boolean hasError = false;
        String errorMessage = "";
        double area = 0.0;
        //making sure that the user is entering valid information
        switch (selectedItem) {
            case "CIRCLE":
                rawInput1 = radiusInputField.getText().trim();
                try {
                    radius = Double.parseDouble(rawInput1);
                    selectedShape = new Circle(radius);
                } catch (NumberFormatException nfe) {
                    errorMessage = nfe.getMessage();
                    hasError = true;
                }
                break;
            case "RECTANGLE":
                rawInput1 = this.widthTextField.getText().trim();
                rawInput2 = this.heightTextField.getText().trim();
                try {
                    width = Double.parseDouble(rawInput1);
                    height = Double.parseDouble(rawInput2);
                    selectedShape = new Rectangle(width, height);
                } catch (NumberFormatException nfe) {
                    errorMessage = nfe.getMessage();
                    hasError = true;
                }
                break;
            case "SQUARE":
                rawInput1 = this.sideTextField.getText().trim();
                try {
                    width = Double.parseDouble(rawInput1);
                    selectedShape = new Rectangle(width, width);
                } catch (NumberFormatException nfe) {
                    errorMessage = nfe.getMessage();
                    hasError = true;
                }
                break;
            case "TRIANGLE":
                rawInput1 = this.side1TextField.getText().trim();
                rawInput2 = this.side2TextField.getText().trim();
                rawInput3 = this.side3TextField.getText().trim();
                try {
                    side1 = Double.parseDouble(rawInput1);
                    side2 = Double.parseDouble(rawInput2);
                    side3 = Double.parseDouble(rawInput3);
                    selectedShape = new TriangleWithException(side1, side2, side3);
                } catch (NumberFormatException nfe) {
                    errorMessage = "Invalid Input";
                    hasError = true;
                } catch (IllegalTriangleException nfe) {
                    errorMessage = "Illegal Triangle";
                    hasError = true;
                }
                break;
            default:
                break;
        }
        
        if (hasError) {
            shapeTextField.setText(errorMessage);
            areaTextField.setText("");
            perimeterTextField.setText("");
        } else {
            shapeTextField.setText(selectedShape.getName());
            areaTextField.setText("" + selectedShape.getArea());
            perimeterTextField.setText("" + selectedShape.getPerimeter());
        }
    }//GEN-LAST:event_getButtonActionPerformed

    private void exitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_exitButtonActionPerformed
        // action for exit button
        System.exit(0);
    }//GEN-LAST:event_exitButtonActionPerformed

    private void shapeTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shapeTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_shapeTextFieldActionPerformed

    private void areaTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_areaTextFieldActionPerformed


    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GUIApplicationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUIApplicationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUIApplicationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUIApplicationFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //editor-fold

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUIApplicationFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel areaLabel;
    private javax.swing.JTextField areaTextField;
    private javax.swing.JButton clearButton;
    private javax.swing.JButton exitButton;
    private javax.swing.JButton getButton;
    private javax.swing.JLabel heightLabel;
    private javax.swing.JTextField heightTextField;
    private javax.swing.JLabel inputDataLabel;
    private javax.swing.JLabel inputDataLabel1;
    private javax.swing.JPanel inputDataPanel;
    private javax.swing.JTextField perimeterTextField;
    private javax.swing.JLabel perimiterLabel;
    private javax.swing.JTextField radiusInputField;
    private javax.swing.JLabel radiusLabel;
    private javax.swing.JPanel resultPanel;
    private javax.swing.JLabel shapeLabel;
    private javax.swing.JComboBox<String> shapePickerComboBox;
    private javax.swing.JLabel shapePickerLabel;
    private javax.swing.JTextField shapeTextField;
    private javax.swing.JLabel side1Lable;
    private javax.swing.JTextField side1TextField;
    private javax.swing.JLabel side2Label;
    private javax.swing.JTextField side2TextField;
    private javax.swing.JLabel side3Label;
    private javax.swing.JTextField side3TextField;
    private javax.swing.JLabel sideLabel;
    private javax.swing.JTextField sideTextField;
    private javax.swing.JLabel widthLabel;
    private javax.swing.JTextField widthTextField;
    // End of variables declaration//GEN-END:variables
}
