/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;

/**
 *
 * @author Felix
 */
public class JHijo extends javax.swing.JFrame {

    /**
     * Creates new form JHijo
     */
    public JHijo() {
        initComponents();
        Scanner sc = new Scanner(System.in);
        String argumento = sc.nextLine();
        
        
        int posicion = argumento.indexOf(" ");
        String hora = argumento.substring(posicion + 1, posicion + 9);
        lblHora.setText(lblHora.getText() + " " + hora);
        int posicioniniciomes = argumento.indexOf("_");
        String mesinicio = argumento.substring(posicioniniciomes + 1);
        int posicionfinalmes = mesinicio.indexOf("_") - 1;
        int mes = Integer.parseInt(mesinicio.substring(0, posicionfinalmes + 1));
        int sumadeprimos = calculoPrimos(mes);
        System.out.println(sumadeprimos);
        String crono = mesinicio.substring(posicionfinalmes + 1);
        int posicioncrono = crono.indexOf("_");
        crono = crono.substring(posicioncrono + 1);
        lblCronometro.setText(lblCronometro.getText() + " " + crono);
    }

    private int calculoPrimos(int m) {
        int suma = 1;
        for (int i = 2; i <= m; i++) {
            if(!esPrimo(i))
                suma+=i;
        }
        return suma;
    }
    
     private boolean esPrimo(int y) {
        int divisor = 2;
        boolean encontrado = false; 

        while (!encontrado && divisor < y) 
        {
            if (y % divisor == 0) 
            {
                encontrado = true; 
            } else {
                divisor++; 
            }
        }
        return encontrado;
    }
    


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblHora = new javax.swing.JLabel();
        lblCronometro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Proceso Hijo");

        lblHora.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblHora.setText("La hora actual es: ");

        lblCronometro.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblCronometro.setText("Cronometro:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblCronometro, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHora, javax.swing.GroupLayout.PREFERRED_SIZE, 401, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(lblHora, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(lblCronometro, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(103, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(JHijo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JHijo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JHijo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JHijo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                JHijo hijo = new JHijo();
                hijo.setLocationRelativeTo(null);
                hijo.setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel lblCronometro;
    private javax.swing.JLabel lblHora;
    // End of variables declaration//GEN-END:variables
}
