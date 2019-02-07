/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Articulos;
import modelo.control_articulos;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ANDRES
 */
public final class interfaz_buscararticulos extends javax.swing.JInternalFrame {

    /**
     * Creates new form interfaz_buscararticulos
     */
    private Object[][] datostabla; 
    private boolean oculto = true;
    public interfaz_buscararticulos() {
        initComponents();
        mostrar_tabla();
        ocultarOnOff();
    }
    
    public void mostrar_tabla(){
        control_articulos ctr;       
        ctr = new control_articulos();
        String[] columnas = {"Codigo_articulo","Descripcion","Precio_venta","Precio_costo","stock","Tipo_de_articulo","Proveedor", "Fecha_ingreso"};
        datostabla = ctr.consulta_articulos();
        DefaultTableModel datos = new DefaultTableModel(datostabla,columnas);
        jTable1.setModel(datos);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        BtnActualizarPrecios = new javax.swing.JButton();
        ComboActualizarPrecios = new javax.swing.JComboBox<>();
        BotonActualizarPrecios = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        CheckActualizarUnitario = new javax.swing.JCheckBox();
        ChecActualizarTodo = new javax.swing.JCheckBox();
        TextoBuscarArticulo = new javax.swing.JTextField();
        LNomArt = new javax.swing.JLabel();
        BotonBuscarArticulo = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        jTable1 = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Salir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        BtnActualizarPrecios.setText("Actualizar Precios");
        BtnActualizarPrecios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                BtnActualizarPreciosMouseClicked(evt);
            }
        });

        ComboActualizarPrecios.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "10", "15", "20", "25", "30", "25", "40", "45", "50", "55", "60", "65", "70", "75", "80", "85", "90", "95", "100" }));

        BotonActualizarPrecios.setText("Aceptar");
        BotonActualizarPrecios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonActualizarPreciosActionPerformed(evt);
            }
        });

        CheckActualizarUnitario.setText("Actualizar articulo unitario");
        CheckActualizarUnitario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CheckActualizarUnitarioMouseClicked(evt);
            }
        });
        CheckActualizarUnitario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CheckActualizarUnitarioActionPerformed(evt);
            }
        });
        CheckActualizarUnitario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                CheckActualizarUnitarioKeyPressed(evt);
            }
        });

        ChecActualizarTodo.setText("Actualizar todo el inventario");
        ChecActualizarTodo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ChecActualizarTodoMouseClicked(evt);
            }
        });

        TextoBuscarArticulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextoBuscarArticuloActionPerformed(evt);
            }
        });

        LNomArt.setText("Nombre del articulo:");

        BotonBuscarArticulo.setText("Buscar");

        btnCancelar.setText("Cancelar");
        btnCancelar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCancelarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CheckActualizarUnitario)
                            .addComponent(ChecActualizarTodo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(LNomArt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ComboActualizarPrecios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BtnActualizarPrecios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(TextoBuscarArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BotonBuscarArticulo))
                            .addComponent(BotonActualizarPrecios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(430, 430, 430)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 200, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jLabel3)
                    .addComponent(CheckActualizarUnitario)
                    .addComponent(LNomArt)
                    .addComponent(TextoBuscarArticulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BotonBuscarArticulo))
                .addGap(11, 11, 11)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChecActualizarTodo)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ComboActualizarPrecios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BotonActualizarPrecios)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(BtnActualizarPrecios))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void CheckActualizarUnitarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CheckActualizarUnitarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CheckActualizarUnitarioActionPerformed

    private void TextoBuscarArticuloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextoBuscarArticuloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextoBuscarArticuloActionPerformed

    private void CheckActualizarUnitarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CheckActualizarUnitarioKeyPressed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_CheckActualizarUnitarioKeyPressed

    private void ChecActualizarTodoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ChecActualizarTodoMouseClicked
        // TODO add your handling code here:
        if (this.ChecActualizarTodo.isSelected() == true) {
            this.CheckActualizarUnitario.setSelected(false);
            this.revalidate();
            this.checkTodo();
            this.BotonActualizarPrecios.setVisible(true);
            this.ComboActualizarPrecios.setVisible(true);
            
        }
    }//GEN-LAST:event_ChecActualizarTodoMouseClicked

    private void CheckActualizarUnitarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CheckActualizarUnitarioMouseClicked
        // TODO add your handling code here:
        if (this.CheckActualizarUnitario.isSelected() == true) {
            this.ChecActualizarTodo.setSelected(false);
            this.revalidate();
            this.activarCampoActualizar();  
        }
    }//GEN-LAST:event_CheckActualizarUnitarioMouseClicked

    private void BtnActualizarPreciosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnActualizarPreciosMouseClicked
        // TODO add your handling code here:
        this.ChecActualizarTodo.setVisible(true);
        this.CheckActualizarUnitario.setVisible(true);
        this.BtnActualizarPrecios.setVisible(false);
        this.btnCancelar.setVisible(true);
    }//GEN-LAST:event_BtnActualizarPreciosMouseClicked

    private void btnCancelarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCancelarMouseClicked
        // TODO add your handling code here:
        this.ocultarCampoActualizar();
        this.btnCancelar.setVisible(false);
        this.BtnActualizarPrecios.setVisible(true);
        checksNull();
        
    }//GEN-LAST:event_btnCancelarMouseClicked

    private void BotonActualizarPreciosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonActualizarPreciosActionPerformed
        // TODO add your handling code here:
        control_articulos ctr;
        int precioAumento = 0, nuevoPrecio=0;
        ctr = new control_articulos();
        
        Articulos[] Art = ctr.datos_articulos();
        for (int i = 0; i < Art.length; i++) {
            precioAumento = (Art[i].getPrecio_venta()*Integer.parseInt((String) this.ComboActualizarPrecios.getSelectedItem())/100);
            nuevoPrecio = Art[i].getPrecio_venta()+precioAumento;
            ctr.actualizar_articulos_pre(Art[i].getId_articulo(), nuevoPrecio);
            precioAumento = 0;
            nuevoPrecio = 0;
            this.revalidate();
        }
        
        
        
    }//GEN-LAST:event_BotonActualizarPreciosActionPerformed
    private void checkTodo(){
        this.LNomArt.setVisible(false);
        this.TextoBuscarArticulo.setVisible(false);
        this.BotonBuscarArticulo.setVisible(false);
    }
    private void ocultarCampoActualizar(){
        this.ChecActualizarTodo.setVisible(false);
        this.CheckActualizarUnitario.setVisible(false);
        this.BotonBuscarArticulo.setVisible(false);
        this.BotonActualizarPrecios.setVisible(false);
        this.ComboActualizarPrecios.setVisible(false);
        this.LNomArt.setVisible(false);
        this.TextoBuscarArticulo.setVisible(false);
        this.btnCancelar.setVisible(false);
    }
    private void activarCampoActualizar(){
        
        this.BotonBuscarArticulo.setVisible(true);
        this.BotonActualizarPrecios.setVisible(true);
        this.ComboActualizarPrecios.setVisible(true);
        this.LNomArt.setVisible(true);
        this.TextoBuscarArticulo.setVisible(true);
    }
    private void ocultarOnOff(){
        if (this.oculto == true) {
            ocultarCampoActualizar();
        }
    }
    private void checksNull(){
        this.CheckActualizarUnitario.setSelected(false);
        this.ChecActualizarTodo.setSelected(false);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton BotonActualizarPrecios;
    public javax.swing.JButton BotonBuscarArticulo;
    public javax.swing.JButton BtnActualizarPrecios;
    public javax.swing.JCheckBox ChecActualizarTodo;
    public javax.swing.JCheckBox CheckActualizarUnitario;
    public javax.swing.JComboBox<String> ComboActualizarPrecios;
    public javax.swing.JLabel LNomArt;
    public javax.swing.JTextField TextoBuscarArticulo;
    public javax.swing.JButton btnCancelar;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}