/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import chart.ModelChart;
import controladores.ControladorClientes;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicLabelUI;
import javax.swing.plaf.basic.BasicTableUI;

/**
 *
 * @author Ubaldo
 */
public class UsuariosRegistrados extends javax.swing.JFrame {

    /**
     * Creates new form UsuariosRegistrados
     */
    public UsuariosRegistrados() {
        initComponents();
        personalizarTablaClientes();
        llenarJtable();
        llenarGraficaBarras();

    }

    public void llenarGraficaBarras() {
        int valorColor1, valorColor2, valorColor3;
        valorColor1 = (int) (Math.random()*200+1);
        valorColor2 = (int) (Math.random()*200+1);
        valorColor3 = (int) (Math.random()*200+1);
        System.out.println("Valor color 1: " + valorColor1);
        System.out.println("Valor color 2: " + valorColor2);
        System.out.println("Valor color 3: " + valorColor3);
        graficaBarras.addLegend("Eddy", new Color(valorColor1, valorColor2, valorColor3));

        graficaBarras.addData(new ModelChart("Lunes", new double[]{3, 5, 2}));
        graficaBarras.addData(new ModelChart("Martes", new double[]{2, 1, 6}));
        graficaBarras.addData(new ModelChart("Miercoles", new double[]{5, 1, 6}));
        graficaBarras.addData(new ModelChart("Jueves", new double[]{2, 5, 6}));
        graficaBarras.addData(new ModelChart("Viernes", new double[]{3, 1, 6}));
        graficaBarras.addData(new ModelChart("Sábado", new double[]{4, 6, 5}));
        graficaBarras.addData(new ModelChart("Domingo", new double[]{3, 3, 6}));

    }
    
    
  

    public void personalizarTablaClientes() {
        tabla_clientes.setUI(new BasicTableUI() {

        });
    }

    public void llenarJtable() {
        ControladorClientes controladorC = new ControladorClientes();
        tabla_clientes.setModel(controladorC.llenarJTable());
    }

    public JPanel getFondo() {
        return fondo;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        txt_estadisticas = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_clientes = new javax.swing.JTable();
        txt_usuarios_registrados = new javax.swing.JLabel();
        graficaBarras = new chart.Chart();
        txt_horas_conectadas = new javax.swing.JLabel();
        titulo_sistema = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo.setBackground(new java.awt.Color(239, 233, 233));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_estadisticas.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        txt_estadisticas.setForeground(new java.awt.Color(102, 102, 102));
        txt_estadisticas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_estadisticas.setText("Estadisticas de esta semana");
        fondo.add(txt_estadisticas, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 380, 300, -1));

        tabla_clientes.setBackground(new java.awt.Color(255, 255, 255));
        tabla_clientes.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        tabla_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tabla_clientes);

        fondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 130, 480, 210));

        txt_usuarios_registrados.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        txt_usuarios_registrados.setForeground(new java.awt.Color(102, 102, 102));
        txt_usuarios_registrados.setText("Usuarios registrados");
        fondo.add(txt_usuarios_registrados, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 100, -1, -1));
        fondo.add(graficaBarras, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 410, 630, 310));

        txt_horas_conectadas.setForeground(new java.awt.Color(102, 102, 102));
        txt_horas_conectadas.setText("Horas conectadas");
        fondo.add(txt_horas_conectadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 550, -1, -1));

        titulo_sistema.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 36)); // NOI18N
        titulo_sistema.setText("Sistema de control clientes");
        fondo.add(titulo_sistema, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, 67));

        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 750));

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
            java.util.logging.Logger.getLogger(UsuariosRegistrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsuariosRegistrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsuariosRegistrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsuariosRegistrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsuariosRegistrados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel fondo;
    private chart.Chart graficaBarras;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_clientes;
    private javax.swing.JLabel titulo_sistema;
    private javax.swing.JLabel txt_estadisticas;
    private javax.swing.JLabel txt_horas_conectadas;
    private javax.swing.JLabel txt_usuarios_registrados;
    // End of variables declaration//GEN-END:variables
}
