/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cellbank;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import java.util.Date.*;
import java.util.*;

/**
 *
 * @author rayo
 */
public class Micuenta extends javax.swing.JFrame {
Sistema sis=new Sistema();
Sistema2 sis2=new Sistema2();
int posicion;
String nombre;
String pos="00";
String lista="";
    /**
     * Creates new form Micuenta
     */
    public Micuenta(String name,String password) {
        initComponents();
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        setBounds(1,1, 363,654);
        setLocationRelativeTo(null);
     b1.setOpaque(false);
     nombre=name;
        b1.setContentAreaFilled(false);
        b2.setOpaque(false);
        b2.setContentAreaFilled(false);
        b3.setOpaque(false);
        b3.setContentAreaFilled(false);
        ocultar();
         p1.setVisible(true);
         p1.setOpaque(false);
       t_tipo.setText(sis.get_Tipo(nombre));
       pos=pos.concat(String.valueOf((sis.get_posicion(nombre)+1000)));
       t_nom.setText(nombre);
       t_pass.setText(password);
       t_telf.setText(sis.get_telefono(nombre));
       t_num.setText(pos);
       posicion=sis.get_posicion(nombre);
       lista=sis2.imprimirRegistro(posicion);
        //System.out.println(posicion);
        txt_lista.setText(lista);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        p3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txt_lista = new javax.swing.JTextArea();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        txt_list = new javax.swing.JLabel();
        p2 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        t_ingreso = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        t_ingreso2 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        p1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        t_nom = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        t_telf = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        t_tipo = new javax.swing.JLabel();
        t_num = new javax.swing.JLabel();
        t_pass = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        b1 = new javax.swing.JButton();
        b2 = new javax.swing.JButton();
        b3 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton2.setText("Volver");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2);
        jButton2.setBounds(10, 510, 73, 23);

        p3.setLayout(null);

        jScrollPane2.setBorder(null);

        txt_lista.setEditable(false);
        txt_lista.setColumns(20);
        txt_lista.setRows(5);
        jScrollPane2.setViewportView(txt_lista);

        p3.add(jScrollPane2);
        jScrollPane2.setBounds(10, 80, 320, 390);

        jLabel7.setText("Descripcion");
        p3.add(jLabel7);
        jLabel7.setBounds(70, 40, 70, 14);

        jLabel13.setText("Valor");
        p3.add(jLabel13);
        jLabel13.setBounds(190, 40, 40, 14);

        jLabel14.setText("Saldo");
        p3.add(jLabel14);
        jLabel14.setBounds(260, 40, 50, 14);

        txt_list.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cellbank/fondos/usuario.png"))); // NOI18N
        p3.add(txt_list);
        txt_list.setBounds(0, 10, 350, 510);

        getContentPane().add(p3);
        p3.setBounds(0, 50, 350, 570);

        p2.setLayout(null);

        jLabel9.setText("Valor a Ingresar");

        t_ingreso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t_ingresoActionPerformed(evt);
            }
        });
        t_ingreso.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                t_ingresoKeyTyped(evt);
            }
        });

        jButton3.setText("Ingresar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(82, 82, 82)
                        .addComponent(jLabel9))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3)
                            .addComponent(t_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(101, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel9)
                .addGap(18, 18, 18)
                .addComponent(t_ingreso, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(109, 109, 109)
                .addComponent(jButton3)
                .addContainerGap(204, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Ingreso", jPanel1);

        jLabel12.setText("Valor a Retirar");
        jLabel12.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jLabel12KeyTyped(evt);
            }
        });

        jButton4.setText("Retirar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel12))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(t_ingreso2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(86, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(131, 131, 131)
                    .addComponent(jButton4)
                    .addContainerGap(139, Short.MAX_VALUE)))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(117, 117, 117)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(t_ingreso2, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(298, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel3Layout.createSequentialGroup()
                    .addGap(239, 239, 239)
                    .addComponent(jButton4)
                    .addContainerGap(240, Short.MAX_VALUE)))
        );

        jTabbedPane1.addTab("Retiro", jPanel3);

        p2.add(jTabbedPane1);
        jTabbedPane1.setBounds(0, 30, 340, 530);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cellbank/fondos/blanco.png"))); // NOI18N
        p2.add(jLabel8);
        jLabel8.setBounds(0, 0, 340, 510);

        getContentPane().add(p2);
        p2.setBounds(0, 50, 340, 560);

        p1.setBackground(new java.awt.Color(255, 255, 255));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cellbank/fondos/imguser.jpg"))); // NOI18N
        jButton1.setBorder(null);

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cellbank/fondos/usuario.png"))); // NOI18N

        jLabel3.setText("No. de Cuenta:");

        jLabel4.setText("Nombre:");

        t_nom.setEditable(false);
        t_nom.setBackground(new java.awt.Color(255, 255, 255));
        t_nom.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        t_nom.setForeground(new java.awt.Color(0, 51, 204));

        jLabel5.setText("Telefono:");

        t_telf.setEditable(false);
        t_telf.setBackground(new java.awt.Color(255, 255, 255));
        t_telf.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        t_telf.setForeground(new java.awt.Color(0, 51, 204));

        jLabel6.setText("Contraseña:");

        jLabel2.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 51, 204));
        jLabel2.setText("Cuenta");

        t_tipo.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        t_tipo.setForeground(new java.awt.Color(0, 51, 204));
        t_tipo.setText("General");
        t_tipo.setToolTipText("");
        t_tipo.setMinimumSize(new java.awt.Dimension(72, 28));

        t_num.setFont(new java.awt.Font("Times New Roman", 3, 24)); // NOI18N
        t_num.setForeground(new java.awt.Color(0, 51, 204));
        t_num.setText("000000");

        t_pass.setEditable(false);
        t_pass.setBackground(new java.awt.Color(255, 255, 255));
        t_pass.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        t_pass.setForeground(new java.awt.Color(0, 51, 204));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cellbank/fondos/blanco.png"))); // NOI18N

        javax.swing.GroupLayout p1Layout = new javax.swing.GroupLayout(p1);
        p1.setLayout(p1Layout);
        p1Layout.setHorizontalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(p1Layout.createSequentialGroup()
                                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel6))
                                .addGap(88, 88, 88)))
                        .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(p1Layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(t_num, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(p1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(t_tipo, javax.swing.GroupLayout.DEFAULT_SIZE, 219, Short.MAX_VALUE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)))))
                    .addGroup(p1Layout.createSequentialGroup()
                        .addGap(98, 98, 98)
                        .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(t_nom)
                            .addComponent(t_telf)
                            .addComponent(t_pass, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, p1Layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap()))
            .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(p1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        p1Layout.setVerticalGroup(
            p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(p1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(p1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(t_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(t_num)))
                .addGap(40, 40, 40)
                .addComponent(jLabel4)
                .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(p1Layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(jLabel5))
                    .addGroup(p1Layout.createSequentialGroup()
                        .addGap(4, 4, 4)
                        .addComponent(t_nom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(14, 14, 14)
                .addComponent(t_telf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(17, 17, 17)
                .addComponent(jLabel6)
                .addGap(29, 29, 29)
                .addComponent(t_pass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(137, Short.MAX_VALUE))
            .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 560, Short.MAX_VALUE))
            .addGroup(p1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(p1Layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 510, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        getContentPane().add(p1);
        p1.setBounds(0, 50, 340, 560);

        b1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b1ActionPerformed(evt);
            }
        });
        getContentPane().add(b1);
        b1.setBounds(0, 0, 120, 50);

        b2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b2ActionPerformed(evt);
            }
        });
        getContentPane().add(b2);
        b2.setBounds(120, 0, 110, 50);

        b3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b3ActionPerformed(evt);
            }
        });
        getContentPane().add(b3);
        b3.setBounds(230, 0, 120, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/cellbank/fondos/usuario.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 344, 620);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b3ActionPerformed
        p3.setVisible(true);
        p3.setOpaque(false);
    }//GEN-LAST:event_b3ActionPerformed

    private void b2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b2ActionPerformed
       b1ActionPerformed(evt);
        p2.setVisible(true);
        p2.setOpaque(false);
    }//GEN-LAST:event_b2ActionPerformed

    private void b1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b1ActionPerformed
        ocultar();
        p1.setVisible(true);
        p1.setOpaque(false);

    }//GEN-LAST:event_b1ActionPerformed

    private void t_ingresoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t_ingresoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t_ingresoActionPerformed

    private void t_ingresoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_t_ingresoKeyTyped
        char c = evt.getKeyChar();
        if(!Character.isDigit(c))
        {
            getToolkit().beep();
            evt.consume();
        }
    }//GEN-LAST:event_t_ingresoKeyTyped

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
      Float saldo= sis2.get_Saldo(posicion);
        if(t_ingreso.getText().isEmpty()){
           System.out.println("Campo vacio");
       }else{
       // System.out.println("tenia :"+saldo);
       java.util.Date utilDate = new java.util.Date(); //********************************************fecha actual
        long lnMilisegundos = utilDate.getTime();
      //   java.sql.Date sqlDate = new java.sql.Date(lnMilisegundos);
        // java.sql.Time sqlTime = new java.sql.Time(lnMilisegundos);
        
         java.sql.Timestamp sqlTime = new java.sql.Timestamp(lnMilisegundos);
       
           float newsaldo=saldo+Float.parseFloat(t_ingreso.getText());
           float valor=Float.parseFloat(t_ingreso.getText());
           sis2.guardar(posicion,newsaldo, (sqlTime.toString()),valor,"Ingreso");
           
        t_ingreso.setText("");
       
         posicion=sis.get_posicion(nombre);
       lista=sis2.imprimirRegistro(posicion);
        //System.out.println(posicion);
        txt_lista.setText(lista);
        saldo= sis2.get_Saldo(posicion);
       }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Float saldo= sis2.get_Saldo(posicion);
        if(t_ingreso2.getText().isEmpty()){
           System.out.println("Campo vacio");
       }else{
       
       java.util.Date utilDate = new java.util.Date(); //********************************************fecha actual
        long lnMilisegundos = utilDate.getTime();
      //   java.sql.Date sqlDate = new java.sql.Date(lnMilisegundos);
        // java.sql.Time sqlTime = new java.sql.Time(lnMilisegundos);
        
          java.sql.Timestamp sqlTime = new java.sql.Timestamp(lnMilisegundos);
            //System.out.println("Saldo de la cuenta :"+saldo);
       if(saldo>Float.parseFloat(t_ingreso2.getText())){
           float newsaldo=saldo-Float.parseFloat(t_ingreso2.getText());
           float valor=Float.parseFloat(t_ingreso2.getText());
           sis2.guardar(posicion,newsaldo, (sqlTime.toString()),valor,"Retiro");
           lista=sis2.imprimirRegistro(posicion);
            txt_lista.setText(lista);
       }else if(saldo==Float.parseFloat(t_ingreso2.getText())){
           float newsaldo=0;
           float valor=Float.parseFloat(t_ingreso2.getText());
           sis2.guardar(posicion,newsaldo, (sqlTime.toString()),valor,"Retiro");
           lista=sis2.imprimirRegistro(posicion);
            txt_lista.setText(lista);
       }else{
           JOptionPane.showMessageDialog(null, "Saldo insuficiente");
       }
        t_ingreso2.setText("");
        
         posicion=sis.get_posicion(nombre);
       lista=sis2.imprimirRegistro(posicion);
        //System.out.println(posicion);
        txt_lista.setText(lista);
        saldo= sis2.get_Saldo(posicion);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jLabel12KeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jLabel12KeyTyped
         char c = evt.getKeyChar();
        if(!Character.isDigit(c))
        {
            getToolkit().beep();
            evt.consume();
        }
    
    }//GEN-LAST:event_jLabel12KeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        setVisible(false);
        new Index().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed
 private void ocultar(){
      jButton1.setOpaque(false);
      jButton1.setContentAreaFilled(false);
       p1.setVisible(false);
       p1.setOpaque(true);
        p2.setVisible(false);
        p2.setOpaque(true);
        p3.setVisible(false);
        p3.setOpaque(true);
        
    }
    /**
     * @param args the command line arguments
     */
   

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b1;
    private javax.swing.JButton b2;
    private javax.swing.JButton b3;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JPanel p1;
    private javax.swing.JPanel p2;
    private javax.swing.JPanel p3;
    private javax.swing.JTextField t_ingreso;
    private javax.swing.JTextField t_ingreso2;
    private javax.swing.JTextField t_nom;
    private javax.swing.JLabel t_num;
    private javax.swing.JTextField t_pass;
    private javax.swing.JTextField t_telf;
    private javax.swing.JLabel t_tipo;
    private javax.swing.JLabel txt_list;
    private javax.swing.JTextArea txt_lista;
    // End of variables declaration//GEN-END:variables
}
