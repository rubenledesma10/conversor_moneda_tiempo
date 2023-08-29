package conversor_monedas.igu;

import java.text.DecimalFormat;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class OpcionConversion extends javax.swing.JFrame {

    public OpcionConversion() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cmbTipoCambio = new javax.swing.JComboBox<>();
        btnContinuar = new javax.swing.JButton();
        btnVolver = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtMonto = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Seleccione una opción de conversión:");

        cmbTipoCambio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Pesos a Dólar", "Pesos a Euro", "Pesos a Libras", "Pesos a Yen", "Pesos a Won Coreano", "Dólar a Pesos", "Euro a Pesos", "Libras a Pesos", "Yen a Pesos", "Won Coreano a Pesos" }));

        btnContinuar.setText("Continuar");
        btnContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContinuarActionPerformed(evt);
            }
        });

        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        jLabel2.setText("Ingrese el monto:");

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\ledes\\OneDrive\\Escritorio\\Facultad\\Programacion\\ONE\\2. Java\\conversor_monedas\\Recursos\\billete.png")); // NOI18N

        btnSalir.setText("Salir");
        btnSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                            .addComponent(cmbTipoCambio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtMonto)
                        .addGap(40, 40, 40))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 11, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(cmbTipoCambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(txtMonto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnContinuar, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void btnContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContinuarActionPerformed

        String tipoCambio = (String) cmbTipoCambio.getSelectedItem();

        if (tipoCambio.equalsIgnoreCase("Pesos a Dólar")) {

            double dolar = 365.50;
            double monto = Double.parseDouble(txtMonto.getText());
            double total = dolar * monto;
            DecimalFormat df = new DecimalFormat("0.00");
            String resultado = df.format(total);

            mostrarMensaje("Usted tiene " + resultado + " dolares", "Info", "Conversión realizada exitosamente");
            txtMonto.setText("");
            VentanaConfirmacion ventana = new VentanaConfirmacion();
            ventana.setVisible(true);
            ventana.setLocationRelativeTo(null);

        } else if (tipoCambio.equalsIgnoreCase("Pesos a Euro")) {

            double euro = 399.33;
            double monto = Double.parseDouble(txtMonto.getText());
            double total = euro * monto;
            DecimalFormat df = new DecimalFormat("0.00");
            String resultado = df.format(total);

            mostrarMensaje("Usted tiene " + resultado + " euros", "Info", "Conversión realizada exitosamente");
            txtMonto.setText("");
            VentanaConfirmacion ventana = new VentanaConfirmacion();
            ventana.setVisible(true);
            ventana.setLocationRelativeTo(null);

        } else if (tipoCambio.equalsIgnoreCase("Pesos a Libras")) {

            double libras = 446.92;
            double monto = Double.parseDouble(txtMonto.getText());
            double total = libras*monto;
            DecimalFormat df = new DecimalFormat("0.00");
            String resultado = df.format(total);

            mostrarMensaje("Usted tiene " + resultado + " libras", "Info", "Conversión realizada exitosamente");
            txtMonto.setText("");
            VentanaConfirmacion ventana = new VentanaConfirmacion();
            ventana.setVisible(true);
            ventana.setLocationRelativeTo(null);

        } else if (tipoCambio.equalsIgnoreCase("Pesos a Yen")) {

            double yen = 145.89;
            double monto = Double.parseDouble(txtMonto.getText());
            double total = yen*monto;
            DecimalFormat df = new DecimalFormat("0.00");
            String resultado = df.format(total);

            mostrarMensaje("Usted tiene " + resultado + " yen", "Info", "Conversión realizada exitosamente");
            txtMonto.setText("");
            VentanaConfirmacion ventana = new VentanaConfirmacion();
            ventana.setVisible(true);
            ventana.setLocationRelativeTo(null);

        } else if (tipoCambio.equalsIgnoreCase("Pesos a Won Coreano")) {

            double won = 3.83;
            double monto = Double.parseDouble(txtMonto.getText());
            double total = won*monto;
            DecimalFormat df = new DecimalFormat("0.00");
            String resultado = df.format(total);

            mostrarMensaje("Usted tiene " + resultado + " won coreanos", "Info", "Conversión realizada exitosamente");
            txtMonto.setText("");
            VentanaConfirmacion ventana = new VentanaConfirmacion();
            ventana.setVisible(true);
            ventana.setLocationRelativeTo(null);

        } else if (tipoCambio.equalsIgnoreCase("Dólar a Pesos")) {

            double pesos = 0.0029;
            double dolar = Double.parseDouble(txtMonto.getText());
            double total = pesos * dolar;
            DecimalFormat df = new DecimalFormat("0.0000");
            String resultado = df.format(total);

            if (dolar == 0) {
                mostrarMensaje("Usted tiene 0 pesos", "Error", "Conversión realizada exitosamente");
                txtMonto.setText("");
                VentanaConfirmacion ventana = new VentanaConfirmacion();
                ventana.setVisible(true);
                ventana.setLocationRelativeTo(null);
            } else {
                mostrarMensaje("Usted tiene " + resultado + " pesos", "Info", "Conversión realizada exitosamente");
                txtMonto.setText("");
                VentanaConfirmacion ventana = new VentanaConfirmacion();
                ventana.setVisible(true);
                ventana.setLocationRelativeTo(null);
            }

        } else if (tipoCambio.equalsIgnoreCase("Euro a Pesos")) {

            double pesos = 0.0026;
            double euro = Double.parseDouble(txtMonto.getText());
            double total = pesos * euro;
            DecimalFormat df = new DecimalFormat("0.0000");
            String resultado = df.format(total);

            if (euro == 0) {
                mostrarMensaje("Usted tiene 0 pesos", "Error", "Conversión realizada exitosamente");
                txtMonto.setText("");
                VentanaConfirmacion ventana = new VentanaConfirmacion();
                ventana.setVisible(true);
                ventana.setLocationRelativeTo(null);
            } else {
                mostrarMensaje("Usted tiene " + resultado + " pesos", "Info", "Conversión realizada exitosamente");
                txtMonto.setText("");
                VentanaConfirmacion ventana = new VentanaConfirmacion();
                ventana.setVisible(true);
                ventana.setLocationRelativeTo(null);
            }

        } else if (tipoCambio.equalsIgnoreCase("Libras a Pesos")) {

            double pesos = 0.0022;
            double libras = Double.parseDouble(txtMonto.getText());
            double total = pesos * libras;
            DecimalFormat df = new DecimalFormat("0.0000");
            String resultado = df.format(total);

            if (libras == 0) {
                mostrarMensaje("Usted tiene 0 pesos", "Error", "Conversión realizada exitosamente");
                txtMonto.setText("");
                VentanaConfirmacion ventana = new VentanaConfirmacion();
                ventana.setVisible(true);
                ventana.setLocationRelativeTo(null);
            } else {
                mostrarMensaje("Usted tiene " + resultado + " pesos", "Info", "Conversión realizada exitosamente");
                txtMonto.setText("");
                VentanaConfirmacion ventana = new VentanaConfirmacion();
                ventana.setVisible(true);
                ventana.setLocationRelativeTo(null);
            }

        } else if (tipoCambio.equalsIgnoreCase("Yen a Pesos")) {

            double pesos = 0.42;
            double yen = Double.parseDouble(txtMonto.getText());
            double total = pesos * yen;
            DecimalFormat df = new DecimalFormat("0.0000");
            String resultado = df.format(total);

            if (yen == 0) {
                mostrarMensaje("Usted tiene 0 pesos", "Error", "Conversión realizada exitosamente");
                txtMonto.setText("");
                VentanaConfirmacion ventana = new VentanaConfirmacion();
                ventana.setVisible(true);
                ventana.setLocationRelativeTo(null);
            } else {
                mostrarMensaje("Usted tiene " + resultado + " pesos", "Info", "Conversión realizada exitosamente");
                txtMonto.setText("");
                VentanaConfirmacion ventana = new VentanaConfirmacion();
                ventana.setVisible(true);
                ventana.setLocationRelativeTo(null);
            }

        } else if (tipoCambio.equalsIgnoreCase("Won Coreano a Pesos")) {

            double pesos = 0.26;
            double won = Double.parseDouble(txtMonto.getText());
            double total = pesos * won;
            DecimalFormat df = new DecimalFormat("0.0000");
            String resultado = df.format(total);

            if (won == 0) {
                mostrarMensaje("Usted tiene 0 pesos", "Error", "Conversión realizada exitosamente");
                txtMonto.setText("");
                VentanaConfirmacion ventana = new VentanaConfirmacion();
                ventana.setVisible(true);
                ventana.setLocationRelativeTo(null);
            } else {
                mostrarMensaje("Usted tiene " + resultado + " pesos", "Info", "Conversión realizada exitosamente");
                txtMonto.setText("");
                VentanaConfirmacion ventana = new VentanaConfirmacion();
                ventana.setVisible(true);
                ventana.setLocationRelativeTo(null);
            }
        }
    }//GEN-LAST:event_btnContinuarActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_btnSalirActionPerformed

    public void mostrarMensaje(String mensaje, String tipo, String titulo) {
        JOptionPane optionPane = new JOptionPane(mensaje);
        if (tipo.equals("Info")) {
            optionPane.setMessageType(JOptionPane.INFORMATION_MESSAGE);

        } else if (tipo.equals("Error")) {
            optionPane.setMessageType(JOptionPane.ERROR_MESSAGE);
        }
        JDialog dialogo = optionPane.createDialog(titulo);
        dialogo.setAlwaysOnTop(true);
        dialogo.setVisible(true);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnContinuar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cmbTipoCambio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtMonto;
    // End of variables declaration//GEN-END:variables
}
