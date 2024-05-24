/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package calculator;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JList;
import java.text.DecimalFormat;
/**
 *
 * @author edangulo
 */

 /*
  * La siguiente clase representa la vista de la calculadora, se implementan todos los requisitos solicitados en el enunciado del proyecto.
  */
public class CalculatorFrame extends javax.swing.JFrame {
    
    private CalculatorController calculatorController;

    public JTextField getfirstNumberField() {
        return firstNumberField;
    }

    public JTextField getsecondNumberField() {
        return secondNumberField;
    }

    public JTextField getresultField() {
        return resultField;
    }

    public JList<String> gethistoryList() {
        return historyList;
    }
    

    /**
     * Creates new form Calculator
     */
    public CalculatorFrame() {
        this.calculatorController = new CalculatorController(this);
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    public void initComponents() {

        titleLabel = new javax.swing.JLabel();
        addButton = new javax.swing.JButton();
        subtractButton = new javax.swing.JButton();
        multiplyButton = new javax.swing.JButton();
        divideButton = new javax.swing.JButton();
        potencyButton = new javax.swing.JButton();
        clearNumbersButton = new javax.swing.JButton();
        updateHistoryButton = new javax.swing.JButton();
        firstNumberField = new javax.swing.JTextField();
        secondNumberField = new javax.swing.JTextField();
        firstNumberLabel = new javax.swing.JLabel();
        secondNumberLabel = new javax.swing.JLabel();
        resultLabel = new javax.swing.JLabel();
        historyScrollPanel = new javax.swing.JScrollPane();
        historyList = new javax.swing.JList<>();
        resultField = new javax.swing.JTextField();

        
        

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        titleLabel.setText("Calculator");

        addButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorController.addButtonAction(evt);
            }
        });

        subtractButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        subtractButton.setText("Subtract");
        subtractButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorController.subtractButtonAction(evt);
            }
        });

        multiplyButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        multiplyButton.setText("Multiply");
        multiplyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorController.multiplyButtonAction(evt);
            }
        });

        divideButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        divideButton.setText("Divide");
        divideButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorController.divideButtonAction(evt);
            }
        });

        potencyButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        potencyButton.setText("Potency");
        potencyButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorController.potencyButtonAction(evt);
            }
        });

        clearNumbersButton.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        clearNumbersButton.setText("Clear numbers");
        clearNumbersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorController.clearButtonAction(evt);
            }
        });

        updateHistoryButton.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        updateHistoryButton.setText("Update history");
        updateHistoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                calculatorController.updateHistoryButtonAction(evt);
            }
        });

        firstNumberField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        secondNumberField.setHorizontalAlignment(javax.swing.JTextField.CENTER);

        firstNumberLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        firstNumberLabel.setText("Number 1");

        secondNumberLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        secondNumberLabel.setText("Number 2");

        resultLabel.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        resultLabel.setText("Result");

        historyList.setFont(new java.awt.Font("Consolas", 0, 12)); // NOI18N
        historyList.setEnabled(false);
        historyScrollPanel.setViewportView(historyList);

        resultField.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        resultField.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        resultField.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(clearNumbersButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(resultLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(firstNumberLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(secondNumberLabel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(firstNumberField)
                            .addComponent(secondNumberField)
                            .addComponent(resultField, javax.swing.GroupLayout.DEFAULT_SIZE, 146, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(potencyButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(multiplyButton, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                            .addComponent(addButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(subtractButton, javax.swing.GroupLayout.DEFAULT_SIZE, 98, Short.MAX_VALUE)
                            .addComponent(divideButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(updateHistoryButton, javax.swing.GroupLayout.DEFAULT_SIZE, 224, Short.MAX_VALUE)
                    .addComponent(historyScrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(188, 188, 188)
                .addComponent(titleLabel)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(firstNumberLabel)
                    .addComponent(firstNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(updateHistoryButton))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(secondNumberLabel)
                            .addComponent(secondNumberField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(resultLabel)
                            .addComponent(resultField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addButton)
                            .addComponent(subtractButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(divideButton)
                            .addComponent(multiplyButton))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(potencyButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(clearNumbersButton))
                    .addComponent(historyScrollPanel))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


/*  La siguiente clase representa los controladores de la calculadora, se implementan todos los requisitos solicitados en el enunciado del proyecto.
 * Se muestra si la operación fue exitosa, pero debo ver si lo dejo en controlador o si lo muevo a vista(que es lo que se debería hacer según el proyecto)
 * 
 */
    public class CalculatorController {
    private Calculator calculator;
    private History history;
    private CalculatorFrame view;
    private DecimalFormat df;
    
    public CalculatorController(CalculatorFrame view) {
        this.calculator = new Calculator();
        this.history = new History();
        this.view = view;
        this.df = new DecimalFormat("#.###"); // Para limitar a 3 decimales
    }
    
     private void performOperation(java.awt.event.ActionEvent evt, String operator) {
        try {
            double number1 = Double.parseDouble(df.format(Double.parseDouble(view.getfirstNumberField().getText())));//Se limita a 3 decimales
            double number2 = Double.parseDouble(df.format(Double.parseDouble(view.getsecondNumberField().getText())));//Se limita a 3 decimales

            double result;
    
            switch (operator) {
                case "+":
                    result = calculator.add(number1, number2);
                    break;
                case "-":
                    result = calculator.subtract(number1, number2);
                    break;
                case "*":
                    result = calculator.multiply(number1, number2);
                    break;
                case "/":
                    result = calculator.divide(number1, number2);
                    break;
                default:
                    throw new UnsupportedOperationException("Operación no soportada");
            }
    
            result = Double.parseDouble(df.format(result));
            this.history.addOperation(new Operation(number1, number2, operator, result));
    
            view.getresultField().setText("" + result);
    
        JOptionPane.showMessageDialog(null, "Operación Exitosa", "Exito", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void addButtonAction(java.awt.event.ActionEvent evt) {
        performOperation(evt, "+");
    }
    
    public void subtractButtonAction(java.awt.event.ActionEvent evt) {
        performOperation(evt, "-");
    }
    
    public void multiplyButtonAction(java.awt.event.ActionEvent evt) {
        performOperation(evt, "*");
    }
    
    public void divideButtonAction(java.awt.event.ActionEvent evt) {
        performOperation(evt, "/");
    }
    
    public void potencyButtonAction(java.awt.event.ActionEvent evt) {
        JOptionPane.showMessageDialog(null, "Not Implemented", "Error", JOptionPane.ERROR_MESSAGE);
    }
    
    public void clearButtonAction(java.awt.event.ActionEvent evt) {
        view.getfirstNumberField().setText("");
        view.getsecondNumberField().setText("");
        view.getresultField().setText("");
    }
    
    public void updateHistoryButtonAction(java.awt.event.ActionEvent evt) {
        ArrayList<Operation> operationHistory = this.history.getOperations();
    
        DefaultListModel model = new DefaultListModel();
        model.addAll(operationHistory);
        view.gethistoryList().setModel(model);
    }
}

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CalculatorFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CalculatorFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton subtractButton;
    private javax.swing.JButton multiplyButton;
    private javax.swing.JButton divideButton;
    private javax.swing.JButton potencyButton;
    private javax.swing.JButton clearNumbersButton;
    private javax.swing.JButton updateHistoryButton;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel firstNumberLabel;
    private javax.swing.JLabel secondNumberLabel;
    private javax.swing.JLabel resultLabel;
    private javax.swing.JList<String> historyList;
    private javax.swing.JScrollPane historyScrollPanel;
    private javax.swing.JTextField firstNumberField;
    private javax.swing.JTextField secondNumberField;
    private javax.swing.JTextField resultField;
    // End of variables declaration//GEN-END:variables
}
