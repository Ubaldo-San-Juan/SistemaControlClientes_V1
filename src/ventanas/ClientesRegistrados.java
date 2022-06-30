package ventanas;

import chart.ModelChart;
import controladores.ControladorClientes;
import controladores.Fecha;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.plaf.basic.BasicLabelUI;
import javax.swing.plaf.basic.BasicTableUI;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Ubaldo
 */
public class ClientesRegistrados extends javax.swing.JFrame {

    /**
     * Creates new form UsuariosRegistrados
     */
    public ClientesRegistrados() {
        initComponents();
        setIconImage(new ImageIcon(getClass().getResource("/iconos/Icono.png")).getImage());
        llenarTabla();
        llenarGraficaBarras();
        agregarFechaALabel();
    }

    public ArrayList obtenerColorArbitrario() {
        ArrayList colorRGB = new ArrayList();

        int valorColor1 = 32, valorColor2 = 12, valorColor3 = 53;
        int numAleatorio;

        numAleatorio = (int) (Math.random() * 10);

        switch (numAleatorio) {
            case 1:
                valorColor1 = 124;
                valorColor2 = 174;
                valorColor3 = 230;

                colorRGB.add(0, valorColor1);
                colorRGB.add(1, valorColor2);
                colorRGB.add(2, valorColor3);
                break;
            case 2:
                valorColor1 = 50;
                valorColor2 = 98;
                valorColor3 = 153;

                colorRGB.add(0, valorColor1);
                colorRGB.add(1, valorColor2);
                colorRGB.add(2, valorColor3);
                break;
            case 3:
                valorColor1 = 153;
                valorColor2 = 111;
                valorColor3 = 15;
                colorRGB.add(0, valorColor1);
                colorRGB.add(1, valorColor2);
                colorRGB.add(2, valorColor3);
                break;
            case 4:
                valorColor1 = 235;
                valorColor2 = 219;
                valorColor3 = 90;

                colorRGB.add(0, valorColor1);
                colorRGB.add(1, valorColor2);
                colorRGB.add(2, valorColor3);
                break;
            case 6:
                valorColor1 = 153;
                valorColor2 = 98;
                valorColor3 = 24;
                colorRGB.add(0, valorColor1);
                colorRGB.add(1, valorColor2);
                colorRGB.add(2, valorColor3);
                break;
            case 7:
                valorColor1 = 235;
                valorColor2 = 161;
                valorColor3 = 162;
                colorRGB.add(0, valorColor1);
                colorRGB.add(1, valorColor2);
                colorRGB.add(2, valorColor3);
                break;
            case 8:
                valorColor1 = 18;
                valorColor2 = 179;
                valorColor3 = 128;
                colorRGB.add(0, valorColor1);
                colorRGB.add(1, valorColor2);
                colorRGB.add(2, valorColor3);
                break;
            case 9:
                valorColor1 = 117;
                valorColor2 = 126;
                valorColor3 = 204;
                colorRGB.add(0, valorColor1);
                colorRGB.add(1, valorColor2);
                colorRGB.add(2, valorColor3);
                break;
            case 10:
                valorColor1 = 204;
                valorColor2 = 80;
                valorColor3 = 85;
                colorRGB.add(0, valorColor1);
                colorRGB.add(1, valorColor2);
                colorRGB.add(2, valorColor3);
                break;
            default:
                colorRGB.add(0, 243);
                colorRGB.add(1, 156);
                colorRGB.add(2, 129);
                break;
        }

        System.out.println("Valor color 1: " + valorColor1);
        System.out.println("Valor color 2: " + valorColor2);
        System.out.println("Valor color 3: " + valorColor3);
        System.out.println("");
        System.out.println("Valor color [0]: " + colorRGB.get(0));
        System.out.println("Valor color [1]: " + colorRGB.get(1));
        System.out.println("Valor color [2]: " + colorRGB.get(2));

        return colorRGB;
    }

    public void llenarGraficaBarras() {
        ArrayList ColorRGB = obtenerColorArbitrario();
        int valor1 = (int) ColorRGB.get(0);
        int valor2 = (int) ColorRGB.get(1);
        int valor3 = (int) ColorRGB.get(2);
        String nombre = tabla_clientes.getValueAt(0, 1).toString();
        graficaBarras.addLegend(nombre, new Color(valor1, valor2, valor3));
        graficaBarras.addData(new ModelChart("Lunes", new double[]{3}));
        graficaBarras.addData(new ModelChart("Martes", new double[]{2}));
        graficaBarras.addData(new ModelChart("Miercoles", new double[]{5}));
        graficaBarras.addData(new ModelChart("Jueves", new double[]{2}));
        graficaBarras.addData(new ModelChart("Viernes", new double[]{3}));
        graficaBarras.addData(new ModelChart("Sábado", new double[]{4}));
        graficaBarras.addData(new ModelChart("Domingo", new double[]{3}));

    }

    
    public void pintarGraficaNueva(String nombre) {
        ArrayList ColorRGB = obtenerColorArbitrario();
        int valor1 = (int) ColorRGB.get(0);
        int valor2 = (int) ColorRGB.get(1);
        int valor3 = (int) ColorRGB.get(2);
        
        graficaBarras.addLegend(nombre, new Color(valor1, valor2, valor3));
        graficaBarras.addData(new ModelChart("Lunes", new double[]{2}));
        graficaBarras.addData(new ModelChart("Martes", new double[]{0}));
        graficaBarras.addData(new ModelChart("Miercoles", new double[]{0}));
        graficaBarras.addData(new ModelChart("Jueves", new double[]{1}));
        graficaBarras.addData(new ModelChart("Viernes", new double[]{3}));
        graficaBarras.addData(new ModelChart("Sábado", new double[]{6}));
        graficaBarras.addData(new ModelChart("Domingo", new double[]{2}));

    }

    public void agregarGrafica() {
        graficaBarras = new chart.Chart();
        fondo.add(graficaBarras, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 630, 310));
    }

    public void llenarTabla() {
        ControladorClientes controladorC = new ControladorClientes();
        tabla_clientes.setModel(controladorC.llenarJTable());
    }

    public void agregarFechaALabel() {
        txt_fecha.setText(new Fecha().obtenerFecha());
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
        txt_fecha = new javax.swing.JLabel();
        txt_creditos = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo.setBackground(new java.awt.Color(239, 233, 233));
        fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_estadisticas.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        txt_estadisticas.setForeground(new java.awt.Color(102, 102, 102));
        txt_estadisticas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_estadisticas.setText("Estadisticas de esta semana");
        fondo.add(txt_estadisticas, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 370, 300, -1));

        tabla_clientes.setBackground(new java.awt.Color(255, 255, 255));
        tabla_clientes.setFont(new java.awt.Font("Microsoft New Tai Lue", 0, 12)); // NOI18N
        tabla_clientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tabla_clientes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla_clientesMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla_clientes);

        fondo.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 120, 480, 210));

        txt_usuarios_registrados.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 18)); // NOI18N
        txt_usuarios_registrados.setForeground(new java.awt.Color(102, 102, 102));
        txt_usuarios_registrados.setText("Usuarios registrados");
        fondo.add(txt_usuarios_registrados, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 90, -1, -1));
        fondo.add(graficaBarras, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 400, 630, 310));

        txt_horas_conectadas.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txt_horas_conectadas.setForeground(new java.awt.Color(102, 102, 102));
        txt_horas_conectadas.setText("Horas conectadas");
        fondo.add(txt_horas_conectadas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 540, -1, -1));

        titulo_sistema.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 36)); // NOI18N
        titulo_sistema.setText("Sistema de control clientes");
        fondo.add(titulo_sistema, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 20, -1, 67));

        txt_fecha.setFont(new java.awt.Font("Consolas", 1, 14)); // NOI18N
        txt_fecha.setForeground(new java.awt.Color(102, 102, 102));
        fondo.add(txt_fecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 200, 20));

        txt_creditos.setForeground(new java.awt.Color(153, 153, 153));
        txt_creditos.setText("Elaborado por: Ubaldo S.J");
        fondo.add(txt_creditos, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 730, 140, -1));

        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tabla_clientesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla_clientesMouseClicked

        //Obtenemos el nombre del cliente
        int filaSeleccionada;
        String nombre = "";
        try {
            filaSeleccionada = tabla_clientes.getSelectedRow();
            if (filaSeleccionada == -1) {
                JOptionPane.showMessageDialog(null, "No ha seleccionado ninguna fila.");
            } else {

                nombre = tabla_clientes.getValueAt(filaSeleccionada, 1).toString();
                System.out.println("Nombre: " + nombre);
            }
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Error: " + ex + "\nInténtelo nuevamente", " .::Error En la Operacion::.", JOptionPane.ERROR_MESSAGE);
        }

        //Llamamos la función para pintar el nuevo grafico 
        agregarGrafica();
        pintarGraficaNueva(nombre);
    }//GEN-LAST:event_tabla_clientesMouseClicked

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
            java.util.logging.Logger.getLogger(ClientesRegistrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ClientesRegistrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ClientesRegistrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ClientesRegistrados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ClientesRegistrados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel fondo;
    private chart.Chart graficaBarras;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla_clientes;
    private javax.swing.JLabel titulo_sistema;
    private javax.swing.JLabel txt_creditos;
    private javax.swing.JLabel txt_estadisticas;
    private javax.swing.JLabel txt_fecha;
    private javax.swing.JLabel txt_horas_conectadas;
    private javax.swing.JLabel txt_usuarios_registrados;
    // End of variables declaration//GEN-END:variables
}
