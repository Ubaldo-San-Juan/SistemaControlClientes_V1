package ventanas;

import com.formdev.flatlaf.FlatIntelliJLaf;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.control.ProgressBar;
import javax.swing.JComponent;
import javax.swing.UIManager;
import javax.swing.plaf.basic.BasicProgressBarUI;

/**
 *
 * @author Ubaldo
 */
public class BarraDeProgreso extends javax.swing.JFrame {

    /**
     * Creates new form BarraDeProgreso
     */
        
    public BarraDeProgreso() {
        initComponents();
        this.setLocationRelativeTo(null);
        
        bar_progreso.setForeground(new Color(0, 80, 115));
        bar_progreso.setUI(new BasicProgressBarUI(){
            /*          
            
            @Override
            protected void paintDeterminate(Graphics g, JComponent c) {
                Rectangle g = new Rectangle();
            }
            
            */
            
        });
        
        Thread hilo1 = new Thread(){
          @Override
          public void run(){
              for(int i=1; i<=100; i++){
                  bar_progreso.setValue(i);
                  txt_porcentaje.setText(Integer.toString(i) + "%");
                  if(i == 1){
                      txt_cargando.setText("Iniciando servicios...");
                  }else if(i == 35){
                      txt_cargando.setText("Conectando a la base de datos...");
                  }else if(i == 80){
                      txt_cargando.setText("Configuración completa");
                  }
                  
                  if(i ==100){
                      cerrarVentana();
                      abrirVentanaLogin();
                  }
                  try {
                      sleep(40);
                  } catch (InterruptedException ex) {
                      Logger.getLogger(BarraDeProgreso.class.getName()).log(Level.SEVERE, null, ex);
                  }
              }
          }  
        };hilo1.start();
        
         
    }

    public void cerrarVentana(){
        this.dispose();
    }
    
    public void abrirVentanaLogin(){
        IniciarSesion iniciarSesion1 = new IniciarSesion();
        iniciarSesion1.setVisible(true);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        fondo = new javax.swing.JPanel();
        txt_cargando = new javax.swing.JLabel();
        txt_inicio_sistema = new javax.swing.JLabel();
        bar_progreso = new javax.swing.JProgressBar();
        txt_porcentaje = new javax.swing.JLabel();
        icono_tiempo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        fondo.setBackground(new java.awt.Color(239, 233, 233));

        txt_cargando.setFont(new java.awt.Font("Microsoft YaHei UI", 0, 14)); // NOI18N
        txt_cargando.setForeground(new java.awt.Color(131, 111, 110));
        txt_cargando.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_cargando.setText("Cargando...");

        txt_inicio_sistema.setFont(new java.awt.Font("Microsoft New Tai Lue", 1, 24)); // NOI18N
        txt_inicio_sistema.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_inicio_sistema.setText("Iniciando sistema");

        bar_progreso.setBorder(null);
        bar_progreso.setBorderPainted(false);

        txt_porcentaje.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txt_porcentaje.setForeground(new java.awt.Color(131, 111, 110));
        txt_porcentaje.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_porcentaje.setText("0%");

        icono_tiempo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icono_tiempo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/iconos/RelojAnimado.gif"))); // NOI18N

        javax.swing.GroupLayout fondoLayout = new javax.swing.GroupLayout(fondo);
        fondo.setLayout(fondoLayout);
        fondoLayout.setHorizontalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_cargando, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bar_progreso, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txt_inicio_sistema, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(177, 177, 177))
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(297, 297, 297)
                .addComponent(txt_porcentaje, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(fondoLayout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addComponent(icono_tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 323, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(169, Short.MAX_VALUE))
        );
        fondoLayout.setVerticalGroup(
            fondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondoLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(txt_inicio_sistema)
                .addGap(18, 18, 18)
                .addComponent(icono_tiempo, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_porcentaje)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bar_progreso, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txt_cargando, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 660, 460));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

        try {
            UIManager.setLookAndFeel(new FlatIntelliJLaf());
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BarraDeProgreso().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar bar_progreso;
    private javax.swing.JPanel fondo;
    private javax.swing.JLabel icono_tiempo;
    private javax.swing.JLabel txt_cargando;
    private javax.swing.JLabel txt_inicio_sistema;
    private javax.swing.JLabel txt_porcentaje;
    // End of variables declaration//GEN-END:variables
}
