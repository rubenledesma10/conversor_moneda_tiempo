package conversor_monedas.igu;

import javax.swing.JDialog;
import javax.swing.JOptionPane;

public class OpcionTemperatura extends javax.swing.JFrame {

    public OpcionTemperatura() {
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
        txtTemperatura = new javax.swing.JTextField();
        btnSalir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Seleccione una opción de conversión:");

        cmbTipoCambio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Celsius a Fahrenheit", "Celsius a Kelvin", "Fahrenheit a Celsius", "Fahrenheit a Kelvin", "Kelvin a Celsius", "Kelvin a Fahrenheit" }));

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

        jLabel2.setText("Ingrese la temperatura:");

        jLabel3.setIcon(new javax.swing.ImageIcon("C:\\Users\\ledes\\OneDrive\\Escritorio\\Facultad\\Programacion\\ONE\\2. Java\\conversor_monedas\\Recursos\\temperatura.png")); // NOI18N

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
                        .addComponent(txtTemperatura)
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
                        .addGap(0, 22, Short.MAX_VALUE))))
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
                    .addComponent(txtTemperatura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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

        String tipoTemperatura = (String) cmbTipoCambio.getSelectedItem();

        if (tipoTemperatura.equalsIgnoreCase("Celsius a Fahrenheit")) {

            double temperatura = Double.parseDouble(txtTemperatura.getText());
            double fahrenheit = temperatura * 9 / 5 + 32;

            mostrarMensaje("La temperatura en Celsius que usted ingreso convertida en Fahrenheit es " + fahrenheit,
                    "Info", "Exito al realizar la conversión");
            txtTemperatura.setText("");

            VentanaConfirmacion ventana = new VentanaConfirmacion();
            ventana.setVisible(true);
            ventana.setLocationRelativeTo(null);

        } else if (tipoTemperatura.equalsIgnoreCase("Celsius a Kelvin")) {

            double temperatura = Double.parseDouble(txtTemperatura.getText());
            double kelvin = temperatura + 273.15;

            mostrarMensaje("La temperatura en Celsius que usted ingreso convertida en Kelvin es " + kelvin,
                    "Info", "Exito al realizar la conversión");

            txtTemperatura.setText("");

            VentanaConfirmacion ventana = new VentanaConfirmacion();
            ventana.setVisible(true);
            ventana.setLocationRelativeTo(null);

        } else if (tipoTemperatura.equalsIgnoreCase("Fahrenheit a Celsius")) {

            double temperatura = Double.parseDouble(txtTemperatura.getText());
            double celsius = (temperatura - 32) * 5 / 9;

            mostrarMensaje("La temperatura en Fahrenheit que usted ingreso convertida en Celsius es " + celsius,
                    "Info", "Exito al realizar la conversión");
            txtTemperatura.setText("");

            VentanaConfirmacion ventana = new VentanaConfirmacion();
            ventana.setVisible(true);
            ventana.setLocationRelativeTo(null);

        } else if (tipoTemperatura.equalsIgnoreCase("Fahrenheit a Kelvin")) {

            double temperatura = Double.parseDouble(txtTemperatura.getText());
            double kelvin = (temperatura + 459.67) * 5 / 9;

            mostrarMensaje("La temperatura en Fahrenheit que usted ingreso convertida en kelvin es " + kelvin,
                    "Info", "Exito al realizar la conversión");
            txtTemperatura.setText("");

            VentanaConfirmacion ventana = new VentanaConfirmacion();
            ventana.setVisible(true);
            ventana.setLocationRelativeTo(null);

        } else if (tipoTemperatura.equalsIgnoreCase("Kelvin a Celsius")) {

            double temperatura = Double.parseDouble(txtTemperatura.getText());
            double celsius = temperatura - 273.15;

            mostrarMensaje("La temperatura en Kevin que usted ingreso convertida en celsius es " + celsius,
                    "Info", "Exito al realizar la conversión");
            txtTemperatura.setText("");

            VentanaConfirmacion ventana = new VentanaConfirmacion();
            ventana.setVisible(true);
            ventana.setLocationRelativeTo(null);

        } else if (tipoTemperatura.equalsIgnoreCase("Kelvin a Fahrenheit")) {

            double temperatura = Double.parseDouble(txtTemperatura.getText());
            double fahrenheit = 1.8 * (temperatura - 273.15) + 32;

            mostrarMensaje("La temperatura en Kevin que usted ingreso convertida en celsius es " + fahrenheit,
                    "Info", "Exito al realizar la conversión");
            txtTemperatura.setText("");

            VentanaConfirmacion ventana = new VentanaConfirmacion();
            ventana.setVisible(true);
            ventana.setLocationRelativeTo(null);

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
    private javax.swing.JTextField txtTemperatura;
    // End of variables declaration//GEN-END:variables
}
