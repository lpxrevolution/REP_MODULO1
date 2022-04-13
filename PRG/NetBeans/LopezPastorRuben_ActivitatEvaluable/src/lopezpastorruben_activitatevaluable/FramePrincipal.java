/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package lopezpastorruben_activitatevaluable;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.util.Arrays;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author rbnre
 */
public class FramePrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FramePrincipal
     */
    public FramePrincipal() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTipus = new javax.swing.JLabel();
        lblDescripcio = new javax.swing.JLabel();
        lblImport = new javax.swing.JLabel();
        comboBoxCompraVenda = new javax.swing.JComboBox<>();
        textFieldDescripcio = new javax.swing.JTextField();
        textFieldImport = new javax.swing.JTextField();
        btnAfegir = new javax.swing.JButton();
        lblTotal = new javax.swing.JLabel();
        lblNumTotal = new javax.swing.JLabel();
        scrollPanel = new javax.swing.JScrollPane();
        tabla = new javax.swing.JTable();
        jMenuBar1 = new javax.swing.JMenuBar();
        menuArxiu = new javax.swing.JMenu();
        menuObrir = new javax.swing.JMenuItem();
        menuGuardar = new javax.swing.JMenuItem();
        menuEsborrar = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Llista D'Operacions");

        lblTipus.setText("Tipus");

        lblDescripcio.setText("Descripció: ");

        lblImport.setText("Import:");

        comboBoxCompraVenda.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Compra", "Venda" }));
        comboBoxCompraVenda.setSelectedItem(null);
        comboBoxCompraVenda.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxCompraVendaActionPerformed(evt);
            }
        });

        textFieldDescripcio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldDescripcioActionPerformed(evt);
            }
        });

        textFieldImport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textFieldImportActionPerformed(evt);
            }
        });

        btnAfegir.setText("Afegir");
        btnAfegir.setSelected(true);
        btnAfegir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAfegirActionPerformed(evt);
            }
        });

        lblTotal.setText("Total:");

        lblNumTotal.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lblNumTotal.setText("0");

        tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tipus", "Descripció", "Import"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tabla.setToolTipText("");
        tabla.setEnabled(false);
        tabla.setFocusable(false);
        scrollPanel.setViewportView(tabla);

        menuArxiu.setText("Arxiu");

        menuObrir.setText("Obrir Arxiu");
        menuObrir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuObrirActionPerformed(evt);
            }
        });
        menuArxiu.add(menuObrir);

        menuGuardar.setText("Guardar Arxiu");
        menuGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuGuardarActionPerformed(evt);
            }
        });
        menuArxiu.add(menuGuardar);

        menuEsborrar.setText("Esborrar Tabla");
        menuEsborrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuEsborrarActionPerformed(evt);
            }
        });
        menuArxiu.add(menuEsborrar);

        jMenuBar1.add(menuArxiu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(scrollPanel)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTipus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(comboBoxCompraVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblDescripcio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldDescripcio, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblImport)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(textFieldImport, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAfegir, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblTotal)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblNumTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipus)
                    .addComponent(comboBoxCompraVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDescripcio)
                    .addComponent(textFieldDescripcio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblImport)
                    .addComponent(textFieldImport, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAfegir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTotal)
                    .addComponent(lblNumTotal))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void comboBoxCompraVendaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxCompraVendaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_comboBoxCompraVendaActionPerformed

    private void textFieldImportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldImportActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldImportActionPerformed

    private void textFieldDescripcioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textFieldDescripcioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textFieldDescripcioActionPerformed

    private void btnAfegirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAfegirActionPerformed
        String tipus = "" , descripcio = "";
        int varimport = 0;
        try
        {
            try
            {
                tipus = (String)comboBoxCompraVenda.getSelectedItem();
                if (tipus.equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Error al seleccioar opció compra/venta.", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Error al seleccioar opció compra/venda.", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            try
            {
                descripcio = textFieldDescripcio.getText();
                if (descripcio.equals(""))
                {
                    JOptionPane.showMessageDialog(null, "Error text incorrecte en el camp Descripció", "Error", JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Error text incorrecte en el camp Descripció", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            try
            {
                varimport = (int)Integer.parseInt(textFieldImport.getText());
                if (tipus.equals("Venda") && varimport >0)
                {
                    JOptionPane.showMessageDialog(null, "Al seleccionar Venda, el import deu ser negatiu", "Avis", JOptionPane.WARNING_MESSAGE);
                    return;
                }
                else if (tipus.equals("Compra") && varimport <0)
                {
                    JOptionPane.showMessageDialog(null, "Al seleccionar Compra, el import deu ser positiu", "Avis", JOptionPane.WARNING_MESSAGE);
                    return;
                }
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Error cantitat erronea en el camp Import", "Error", JOptionPane.ERROR_MESSAGE);
                return;
            }
            almacenarDades(tipus, descripcio,varimport);
            esborrarElements();
            sumarTotal();
        }
        catch(Exception e)
        {
            System.out.println(e);
            JOptionPane.showMessageDialog(null, "Error al crear la línea ¿Dades correctes?");
            esborrarElements();
        }
    }//GEN-LAST:event_btnAfegirActionPerformed

    private void menuGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuGuardarActionPerformed
        DefaultTableModel dm;
        dm = (DefaultTableModel) tabla.getModel();
        javax.swing.JFileChooser arxiu = new javax.swing.JFileChooser();
        String ruta = "";
     try{
        if(arxiu.showSaveDialog(null)==arxiu.APPROVE_OPTION)
        {
            File f = new File (arxiu.getSelectedFile().getAbsolutePath());
            FileWriter fw = new FileWriter(f);
            for (int i = 0 ; i<dm.getRowCount(); i ++)
            {
                fw.write(""+ dm.getValueAt(i, 0));
                fw.write("|");
                fw.write(""+ dm.getValueAt(i, 1));
                fw.write("|");
                fw.write(""+ dm.getValueAt(i, 2));
                fw.write("\n-----\n");
            }
            fw.close();
        }
      }catch (Exception e){
        JOptionPane.showMessageDialog(null, arxiu.getName() + " (acceso denegado)" , "Error al guardar el archiu", JOptionPane.ERROR_MESSAGE);
      }        
    }//GEN-LAST:event_menuGuardarActionPerformed

    private void menuObrirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuObrirActionPerformed
        javax.swing.JFileChooser arxiu = new javax.swing.JFileChooser();
        try{
            if(arxiu.showOpenDialog(null)==arxiu.APPROVE_OPTION)
            {
                DefaultTableModel dm = esborrarTabla();
                Object[] obj = new Object[3];
                File f = new File (arxiu.getSelectedFile().getAbsolutePath());
                Scanner sc = new Scanner(f);
                while(sc.hasNext())
                {
                    String linea = sc.nextLine();
                    if (linea.charAt(0)!='-')
                    {
                        String datos[] = linea.split("\\|");
                        obj[0] = datos[0];
                        obj[1] = datos[1];
                        obj[2] = datos[2];
                        dm.addRow(obj);
                        tabla.setModel(dm);
                    }
                }
                sc.close();
                sumarTotalLoad();
            }
        }catch (FileNotFoundException e){
          JOptionPane.showMessageDialog(null, arxiu.getName() + " (acceso denegado)" , "Error al obrir el archiu", JOptionPane.ERROR_MESSAGE);
        }
        
    }//GEN-LAST:event_menuObrirActionPerformed

    private void menuEsborrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuEsborrarActionPerformed
        tabla.setModel(esborrarTabla());
    }//GEN-LAST:event_menuEsborrarActionPerformed

    private void esborrarElements()
    {
        comboBoxCompraVenda.setSelectedIndex(-1);
        textFieldDescripcio.setText("");
        textFieldImport.setText("");
    }
    private void almacenarDades(String itipus, String idescripcio, int ivarimport)
    {
        DefaultTableModel dm;
        dm = (DefaultTableModel) tabla.getModel();
        Object[] obj = new Object[3];
        obj[0] = itipus;
        obj[1] = idescripcio;
        obj[2] = ivarimport;
        dm.addRow(obj);
        tabla.setModel(dm);
    }
    private void sumarTotal()
    {
        int total = 0;
        for (int i = 1 ; i<tabla.getRowCount()+1 ; i++)
        {
            System.out.println("Estoy en la fila " + i);
        }
    }
        private void sumarTotalLoad()
    {
        int total = 0;
        String stvalor = "";
        for (int i = 1 ; i<tabla.getRowCount(); i++)
        {
            stvalor = (String)tabla.getValueAt(i, 2);
            total = total + Integer.valueOf(stvalor);
        }
        lblNumTotal.setText(""+total);
    }
        private DefaultTableModel esborrarTabla()
        {
            DefaultTableModel dm = new DefaultTableModel();
            dm.addColumn("Tipus");
            dm.addColumn("Descripcio");
            dm.addColumn("Import");
            lblNumTotal.setText("0");
            return dm;
        }
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
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FramePrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new FramePrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAfegir;
    private javax.swing.JComboBox<String> comboBoxCompraVenda;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JLabel lblDescripcio;
    private javax.swing.JLabel lblImport;
    private javax.swing.JLabel lblNumTotal;
    private javax.swing.JLabel lblTipus;
    private javax.swing.JLabel lblTotal;
    private javax.swing.JMenu menuArxiu;
    private javax.swing.JMenuItem menuEsborrar;
    private javax.swing.JMenuItem menuGuardar;
    private javax.swing.JMenuItem menuObrir;
    private javax.swing.JScrollPane scrollPanel;
    private javax.swing.JTable tabla;
    private javax.swing.JTextField textFieldDescripcio;
    private javax.swing.JTextField textFieldImport;
    // End of variables declaration//GEN-END:variables
}
