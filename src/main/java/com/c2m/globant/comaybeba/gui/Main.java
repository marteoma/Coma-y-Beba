/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.c2m.globant.comaybeba.gui;

import java.awt.Color;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import com.c2m.globant.comaybeba.objects.Lugar;
import com.c2m.globant.comaybeba.objects.Mesa;
import com.c2m.globant.comaybeba.objects.Platillo;

/**
 *
 * @author hhade
 */
public class Main extends javax.swing.JFrame {

    
    /**
     * Tamaño máximo para la imagen del platillo
     */
    private final int SIZE = 150;
    
    private final int MESA = 1;
    //Tipo mesa y general para la creación de estas
    private final int GENERAL = 2;
    
    private ArrayList<Mesa> mesas;
    
    private ArrayList<Lugar> lugares;
    
    private ArrayList<Platillo> platillos;
    
    private ImageIcon img;//Imagen seleccionada para el platillo
    
    
    /**
     * Creates new form NewJFrame
     */
    public Main() {
        this.platillos = new ArrayList<>();
        this.mesas = new ArrayList<>();
        this.lugares = new ArrayList<>();
        initComponents();
        this.getContentPane().setBackground(Color.BLACK);
        jtpDatos.setForeground(Color.red);
        btnMesa.setToolTipText("Añadir Mesa");
        btnGeneral.setToolTipText("Añadir Lugar General");
        
        DefaultListModel<String> model = new DefaultListModel<>(); 
        platillos.forEach((platillo) -> {
             model.addElement(platillo.ToString());
        });
        jList1.setModel(model); 
    }
    
    private void updatePlati(){
        DefaultListModel<String> model = new DefaultListModel<>(); 
        platillos.forEach((platillo) -> {
             model.addElement(platillo.ToString());
        });
        jList1.setModel(model); 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jtpDatos = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnMesa = new javax.swing.JButton();
        btnGeneral = new javax.swing.JButton();
        panMapa = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        btnMostrarReservas = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jcReservas = new javax.swing.JComboBox<>();
        jPanel8 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNombrePlatillo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtDescripcionPlatillo = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnAgregarImg = new javax.swing.JButton();
        btnAgregarPlatillo = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        panelImagenMenu = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jcEstado = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        txtPrecio = new javax.swing.JTextField();
        jPanel9 = new javax.swing.JPanel();
        jPanel5 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel8 = new javax.swing.JLabel();
        jButton13 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jbVerdetalle = new javax.swing.JButton();
        lista = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setIconImages(null);

        jtpDatos.setBackground(new java.awt.Color(0, 0, 0));
        jtpDatos.setForeground(new java.awt.Color(255, 0, 0));
        jtpDatos.setFont(new java.awt.Font("Book Antiqua", 1, 11)); // NOI18N

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnMesa.setBackground(new java.awt.Color(255, 255, 255));
        btnMesa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/mesa.png"))); // NOI18N
        btnMesa.setBorder(null);
        btnMesa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMesaActionPerformed(evt);
            }
        });
        jPanel1.add(btnMesa, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 86, 104, 89));

        btnGeneral.setBackground(new java.awt.Color(255, 255, 255));
        btnGeneral.setIcon(new javax.swing.ImageIcon(getClass().getResource("/general.png"))); // NOI18N
        btnGeneral.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGeneralActionPerformed(evt);
            }
        });
        jPanel1.add(btnGeneral, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 186, 104, 95));

        panMapa.setBackground(new java.awt.Color(255, 255, 204));
        panMapa.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));

        javax.swing.GroupLayout panMapaLayout = new javax.swing.GroupLayout(panMapa);
        panMapa.setLayout(panMapaLayout);
        panMapaLayout.setHorizontalGroup(
            panMapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 439, Short.MAX_VALUE)
        );
        panMapaLayout.setVerticalGroup(
            panMapaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 327, Short.MAX_VALUE)
        );

        jPanel1.add(panMapa, new org.netbeans.lib.awtextra.AbsoluteConstraints(132, 35, -1, -1));

        btnGuardar.setBackground(new java.awt.Color(255, 204, 102));
        btnGuardar.setFont(new java.awt.Font("Lao UI", 0, 16)); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setBorder(null);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(303, 394, 90, 31));

        jtpDatos.addTab("Diseñar", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable2);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, -1, -1));

        btnMostrarReservas.setBackground(new java.awt.Color(255, 204, 102));
        btnMostrarReservas.setFont(new java.awt.Font("Lao UI", 0, 16)); // NOI18N
        btnMostrarReservas.setText("Mostrar");
        jPanel2.add(btnMostrarReservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 243, -1, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 153, 0));
        jLabel10.setText("Reservas");
        jPanel2.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 161, -1, -1));

        jcReservas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Activas", "Ocupadas", "Pendientes" }));
        jPanel2.add(jcReservas, new org.netbeans.lib.awtextra.AbsoluteConstraints(492, 193, 102, 32));

        jtpDatos.addTab("Reservas", jPanel2);

        jPanel8.setBackground(new java.awt.Color(255, 255, 255));
        jPanel8.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setText("Nombre: ");
        jPanel8.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 14, -1, -1));
        jPanel8.add(txtNombrePlatillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 300, 30));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 153, 0));
        jLabel4.setText("Estado, ¿Disponible? :");
        jPanel8.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 180, -1, -1));
        jPanel8.add(txtDescripcionPlatillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 294, 50));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 153, 0));
        jLabel7.setText("Imagen: ");
        jPanel8.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        btnAgregarImg.setBackground(new java.awt.Color(255, 204, 102));
        btnAgregarImg.setFont(new java.awt.Font("Lao UI", 0, 16)); // NOI18N
        btnAgregarImg.setText("Cargar Archivo");
        btnAgregarImg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarImgActionPerformed(evt);
            }
        });
        jPanel8.add(btnAgregarImg, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, -1, -1));

        btnAgregarPlatillo.setBackground(new java.awt.Color(255, 204, 102));
        btnAgregarPlatillo.setFont(new java.awt.Font("Lao UI", 0, 16)); // NOI18N
        btnAgregarPlatillo.setText("Agregar");
        btnAgregarPlatillo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPlatilloActionPerformed(evt);
            }
        });
        jPanel8.add(btnAgregarPlatillo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 380, -1, -1));

        jButton11.setBackground(new java.awt.Color(255, 204, 102));
        jButton11.setFont(new java.awt.Font("Lao UI", 0, 16)); // NOI18N
        jButton11.setText("Buscar");
        jPanel8.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 380, -1, -1));

        jButton12.setBackground(new java.awt.Color(255, 204, 102));
        jButton12.setFont(new java.awt.Font("Lao UI", 0, 16)); // NOI18N
        jButton12.setText("Modificar Estado");
        jPanel8.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, -1, -1));

        panelImagenMenu.setPreferredSize(new java.awt.Dimension(150, 150));

        javax.swing.GroupLayout panelImagenMenuLayout = new javax.swing.GroupLayout(panelImagenMenu);
        panelImagenMenu.setLayout(panelImagenMenuLayout);
        panelImagenMenuLayout.setHorizontalGroup(
            panelImagenMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        panelImagenMenuLayout.setVerticalGroup(
            panelImagenMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel8.add(panelImagenMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 210, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 153, 0));
        jLabel5.setText("Descripción: ");
        jPanel8.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        jcEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sí", "No" }));
        jPanel8.add(jcEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 170, 60, 30));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 153, 0));
        jLabel6.setText("Precio:");
        jPanel8.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, -1, -1));

        txtPrecio.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtPrecio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPrecioKeyTyped(evt);
            }
        });
        jPanel8.add(txtPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 130, 110, 30));

        jtpDatos.addTab("Crear Menú", null, jPanel8, "");

        jPanel9.setBackground(new java.awt.Color(255, 255, 255));
        jPanel9.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setForeground(new java.awt.Color(255, 204, 0));

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton1.setForeground(new java.awt.Color(255, 153, 0));
        jRadioButton1.setText("Clientes");

        jRadioButton2.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton2.setForeground(new java.awt.Color(255, 153, 0));
        jRadioButton2.setText("Mesas");

        jRadioButton3.setBackground(new java.awt.Color(255, 255, 255));
        jRadioButton3.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jRadioButton3.setForeground(new java.awt.Color(255, 153, 0));
        jRadioButton3.setText("Menú");
        jRadioButton3.setToolTipText("");
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 153, 0));
        jLabel8.setText("Reportes");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jRadioButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton3)
                            .addComponent(jRadioButton2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(18, 18, 18))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton1)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton2)
                .addGap(18, 18, 18)
                .addComponent(jRadioButton3)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jPanel9.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 22, -1, -1));

        jButton13.setBackground(new java.awt.Color(255, 204, 102));
        jButton13.setFont(new java.awt.Font("Lao UI", 0, 16)); // NOI18N
        jButton13.setText("Mostrar");
        jPanel9.add(jButton13, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 260, -1, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jPanel9.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 304, 241));

        jLabel9.setBackground(new java.awt.Color(204, 255, 204));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 153, 0));
        jLabel9.setText("Documento");
        jPanel9.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 291, -1));

        jtpDatos.addTab("Estadísticas", jPanel9);

        jbVerdetalle.setText("Ver detalles");
        jbVerdetalle.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVerdetalleActionPerformed(evt);
            }
        });

        lista.setViewportView(jList1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(lista, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(133, 133, 133)
                        .addComponent(jbVerdetalle)))
                .addContainerGap(264, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lista, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(jbVerdetalle)
                .addContainerGap(188, Short.MAX_VALUE))
        );

        jtpDatos.addTab("Menú", jPanel3);

        jLabel2.setFont(new java.awt.Font("Bodoni MT Black", 3, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText("Coma y Beba con Genoveva");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jtpDatos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jtpDatos))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void btnMesaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMesaActionPerformed
        // TODO add your handling code here:
        createSpace(MESA);
    }//GEN-LAST:event_btnMesaActionPerformed

    private void btnGeneralActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGeneralActionPerformed
        // TODO add your handling code here:
        createSpace(GENERAL);
    }//GEN-LAST:event_btnGeneralActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnAgregarImgActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarImgActionPerformed
        // TODO add your handling code here:
        JFileChooser chooser = new JFileChooser();
        int op = chooser.showOpenDialog(this);
        if(op == JFileChooser.APPROVE_OPTION){
            String ruta = chooser.getSelectedFile().toString();
            img = new ImageIcon(ruta);
            if (img.getIconHeight() <= this.SIZE && img.getIconWidth() <= this.SIZE){
                JLabel limg = new JLabel(img);
                limg.setSize(panelImagenMenu.getSize());
                panelImagenMenu.add(limg);
            }else{
                JOptionPane.showConfirmDialog(null, "El tamaño de la imagen debe ser menor a 150x150",
                    "Imágen demasiado grande", JOptionPane.OK_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnAgregarImgActionPerformed

    private void jbVerdetalleActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVerdetalleActionPerformed
        // TODO add your handling code here:
        if(!jList1.isSelectionEmpty()){
            Detalle d = new Detalle(platillos.get(jList1.getSelectedIndex()));
            d.setVisible(true);
        }else{
            JOptionPane.showConfirmDialog(null, "Seleccione un platillo",
                    "No hay platillo seleccionado", JOptionPane.OK_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);            
        }
    }//GEN-LAST:event_jbVerdetalleActionPerformed

    private void btnAgregarPlatilloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPlatilloActionPerformed
        // TODO add your handling code here:
        String nombre = txtNombrePlatillo.getText().trim();
        String desc = txtDescripcionPlatillo.getText().trim();
        boolean estado = jcEstado.getSelectedIndex() == 0;
        int precio = Integer.parseInt(txtPrecio.getText());
        if(img != null && nombre != null && desc != null){
            Platillo p = new Platillo(nombre, desc, precio, img, estado);
            platillos.add(p);
            updatePlati();
        }else{
            JOptionPane.showConfirmDialog(null, "Debe llenar todos los campos",
                    "Campos Vacíos", JOptionPane.OK_CANCEL_OPTION, JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_btnAgregarPlatilloActionPerformed

    private void txtPrecioKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPrecioKeyTyped
        // TODO add your handling code here:
        if(!Character.isDigit(evt.getKeyChar())){
            evt.consume();
        }
    }//GEN-LAST:event_txtPrecioKeyTyped

    private void createSpace(int tipo){
        if(tipo == MESA){
            int capacidad = Integer.parseInt(JOptionPane.showInputDialog(null, 
                    "Cuál es la capacidad de esta mesa", 
                    "Capacidad", 
                    JOptionPane.QUESTION_MESSAGE));
            Mesa m = new Mesa(capacidad);
            panMapa.add(m).repaint();
            mesas.add(m);
        }else if(tipo == GENERAL){
            String nombre = JOptionPane.showInputDialog(null, 
                    "Cuál es el nombre del objeto", 
                    "Objeto", 
                    JOptionPane.QUESTION_MESSAGE);
            Lugar l = new Lugar(nombre);
            panMapa.add(l).repaint();
            lugares.add(l);
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Main().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregarImg;
    private javax.swing.JButton btnAgregarPlatillo;
    private javax.swing.JButton btnGeneral;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnMesa;
    private javax.swing.JButton btnMostrarReservas;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JList<String> jList1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JButton jbVerdetalle;
    private javax.swing.JComboBox<String> jcEstado;
    private javax.swing.JComboBox<String> jcReservas;
    private javax.swing.JTabbedPane jtpDatos;
    private javax.swing.JScrollPane lista;
    private javax.swing.JPanel panMapa;
    private javax.swing.JPanel panelImagenMenu;
    private javax.swing.JTextField txtDescripcionPlatillo;
    private javax.swing.JTextField txtNombrePlatillo;
    private javax.swing.JTextField txtPrecio;
    // End of variables declaration//GEN-END:variables
}