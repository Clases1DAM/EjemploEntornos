/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenev1;

import java.awt.Image;
import java.awt.Toolkit;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Felix
 */
public class JCronometro extends javax.swing.JFrame {

    /**
     * Creates new form JCronometro
     */
    public JCronometro() {
        initComponents();
    }

    private boolean suspendido = false;//para saber si el hilo esta suspendido o pausado
    private int hora = 0;//unidades de medida
    private int min = 0;//unidades de medida
    private int seg = 0;//unidades de medida
    private int ds = 0;//unidades de medida

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDisplay = new javax.swing.JLabel();
        btnPause = new javax.swing.JButton();
        btnInicio = new javax.swing.JButton();
        btnStop = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        btnHijo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblSuma = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImage(getIconImage());

        jDisplay.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jDisplay.setText("00:00:00:00");

        btnPause.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/pause.png"))); // NOI18N
        btnPause.setEnabled(false);
        btnPause.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPauseActionPerformed(evt);
            }
        });

        btnInicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/play.png"))); // NOI18N
        btnInicio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInicioActionPerformed(evt);
            }
        });

        btnStop.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/stop.png"))); // NOI18N
        btnStop.setEnabled(false);
        btnStop.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStopActionPerformed(evt);
            }
        });

        btnHijo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/procesos.png"))); // NOI18N
        btnHijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHijoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Suma de Primos");

        lblSuma.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                .addComponent(btnPause, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(41, 41, 41)
                .addComponent(btnStop, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(layout.createSequentialGroup()
                .addGap(183, 183, 183)
                .addComponent(jDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 223, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHijo, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(lblSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPause, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnStop))
                .addGap(47, 47, 47)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnHijo, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(lblSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInicioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInicioActionPerformed
        // TODO add your handling code here:
        btnInicio.setEnabled(false);
        btnStop.setEnabled(true);
        btnPause.setEnabled(true);
        if (!suspendido) {//si no esta suspendido o pausado
            crhilo.start();//el hilo empieza

        } else {//de lo contrario
            crhilo.resume();//el hilo se reanuda
            suspendido = false;//el hilo ya no esta suspendido

        }

    }//GEN-LAST:event_btnInicioActionPerformed

    private void btnPauseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPauseActionPerformed
        // TODO add your handling code here:
        crhilo.suspend();//se suspende o pausa el hilo
        suspendido = true;//el hilo esta suspendido
        btnInicio.setEnabled(true);
        btnPause.setEnabled(false);
    }//GEN-LAST:event_btnPauseActionPerformed

    private void btnStopActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStopActionPerformed
        // TODO add your handling code here:
        crhilo.suspend();//se suspende el hilo.. (NO utilizamos hilo.stop() porque si lo usamos, el hilo se "muere")
        crhilo.setDs(0);
        crhilo.setSeg(0);
        crhilo.setMin(0);
        crhilo.setHora(0);
        jDisplay.setText("00:00:00:00");//cronometro en cero
        suspendido = true;//el hilo esta suspendido
        btnInicio.setEnabled(true);
        btnStop.setEnabled(false);
        btnPause.setEnabled(false);
    }//GEN-LAST:event_btnStopActionPerformed

    private void btnHijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHijoActionPerformed
        // TODO add your handling code here:
        try {
            Runtime rt = Runtime.getRuntime();
            Process p = rt.exec("java JHijo");

            Date fecha1 = new Date();
            Calendar cal1 = Calendar.getInstance();
            int mes = cal1.get(Calendar.MONTH);
            String cron = jDisplay.getText();
            String argumento = fecha1.toLocaleString() + "_" + (mes + 1) + "_" + cron;

            int posicion = argumento.indexOf(" ");
            String hora = argumento.substring(posicion + 1, posicion + 9);
            int posicioniniciomes = argumento.indexOf("_");
            String mesinicio = argumento.substring(posicioniniciomes + 1);
            int posicionfinalmes = mesinicio.indexOf("_") - 1;
            int m = Integer.parseInt(mesinicio.substring(0, posicionfinalmes + 1));
            String crono = mesinicio.substring(posicionfinalmes + 1);
            int posicioncrono = crono.indexOf("_");
            crono = crono.substring(posicioncrono + 1);

            java.io.OutputStream os = p.getOutputStream();
            os.write(argumento.getBytes());
            os.close();
            p.waitFor();

            InputStream is = p.getInputStream();
            InputStreamReader isr = new InputStreamReader(is);
            BufferedReader br = new BufferedReader(isr);
            String line = br.readLine();
            lblSuma.setText(line);
        } catch (Exception e) {
        }

    }//GEN-LAST:event_btnHijoActionPerformed

    public Image getIconImage() {
        Image retValue = Toolkit.getDefaultToolkit().
                getImage(ClassLoader.getSystemResource("imagenes/iconoprin.png"));

        return retValue;
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
            java.util.logging.Logger.getLogger(JCronometro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JCronometro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JCronometro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JCronometro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JCronometro cronometro = new JCronometro();
                cronometro.setTitle("Examen Felix Reyes Fernandez");
                cronometro.setLocationRelativeTo(null);
                cronometro.setVisible(true);
                crhilo = new CronometroHilo(cronometro);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHijo;
    private javax.swing.JButton btnInicio;
    private javax.swing.JButton btnPause;
    private javax.swing.JButton btnStop;
    private javax.swing.JLabel jDisplay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel lblSuma;
    // End of variables declaration//GEN-END:variables
    private static CronometroHilo crhilo;

    /**
     * @return the suspendido
     */
    public boolean isSuspendido() {
        return suspendido;
    }

    /**
     * @param suspendido the suspendido to set
     */
    public void setSuspendido(boolean suspendido) {
        this.suspendido = suspendido;
    }

    /**
     * @return the jDisplay
     */
    public javax.swing.JLabel getjDisplay() {
        return jDisplay;
    }

    /**
     * @param jDisplay the jDisplay to set
     */
    public void setjDisplay(javax.swing.JLabel jDisplay) {
        this.jDisplay = jDisplay;
    }
}
