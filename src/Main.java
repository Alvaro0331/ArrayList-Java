
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Alvaro Davila Gomez
 */
public class Main extends javax.swing.JFrame {
    private Nodo nodo;
    private Lista lista;
    private ArrayList<Nodo> list;
    
    public Main() {
        initComponents();
        this.list= new ArrayList<>();
        lista= new Lista(this.list);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbBuscar = new javax.swing.JLabel();
        lbId = new javax.swing.JLabel();
        lbNombre = new javax.swing.JLabel();
        txId = new javax.swing.JTextField();
        txNombre = new javax.swing.JTextField();
        btNuevo = new javax.swing.JButton();
        btGuardar = new javax.swing.JButton();
        btCancelar = new javax.swing.JButton();
        btEditar = new javax.swing.JButton();
        btRemover = new javax.swing.JButton();
        txBuscar = new javax.swing.JTextField();
        btBuscar = new javax.swing.JButton();
        lbPeso = new javax.swing.JLabel();
        txPeso = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Actividad ArrayList");

        lbBuscar.setText("Ingresa nodo a buscar:");

        lbId.setText("ID:");

        lbNombre.setText("Nombre:");

        txId.setEditable(false);
        txId.setBackground(new java.awt.Color(245, 245, 245));

        txNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txNombreActionPerformed(evt);
            }
        });

        btNuevo.setText("Nuevo");
        btNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btNuevoActionPerformed(evt);
            }
        });

        btGuardar.setText("Guardar");
        btGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btGuardarActionPerformed(evt);
            }
        });

        btCancelar.setText("Cancelar");
        btCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCancelarActionPerformed(evt);
            }
        });

        btEditar.setText("Editar");
        btEditar.setEnabled(false);
        btEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btEditarActionPerformed(evt);
            }
        });

        btRemover.setText("Remover");
        btRemover.setEnabled(false);
        btRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btRemoverActionPerformed(evt);
            }
        });

        btBuscar.setText("Buscar");
        btBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btBuscarActionPerformed(evt);
            }
        });

        lbPeso.setText("Peso:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(72, Short.MAX_VALUE)
                .addComponent(lbBuscar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btBuscar)
                .addContainerGap(80, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbNombre)
                                    .addComponent(lbPeso, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(15, 15, 15))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lbId, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                            .addComponent(txPeso)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btNuevo)
                        .addGap(18, 18, 18)
                        .addComponent(btGuardar)
                        .addGap(18, 18, 18)
                        .addComponent(btCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(btEditar)
                        .addGap(18, 18, 18)
                        .addComponent(btRemover)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbBuscar)
                    .addComponent(txBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btBuscar))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbId)
                    .addComponent(txId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbNombre)
                    .addComponent(txNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbPeso)
                    .addComponent(txPeso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btNuevo)
                    .addComponent(btGuardar)
                    .addComponent(btCancelar)
                    .addComponent(btEditar)
                    .addComponent(btRemover))
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btNuevoActionPerformed
        txId.setText(String.valueOf(lista.getNuevoId()));
    }//GEN-LAST:event_btNuevoActionPerformed

    private void btGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btGuardarActionPerformed
        //Validar campos vacios
        if(!this.txNombre.getText().equals("")&&!this.txId.getText().equals("")&&!this.txPeso.getText().equals("")){
            nodo=new Nodo();
            nodo.setID(Integer.parseInt(txId.getText()));
            nodo.setNombre(txNombre.getText());
            nodo.setPeso(Double.parseDouble(txPeso.getText()));
            lista.agregarLista(nodo);
            this.list=lista.getActualizar();
            txId.setText("");
            txNombre.setText("");
            txPeso.setText("");
        }
        else{
            JOptionPane.showMessageDialog(null, "Faltan campos por llenar");
        }
        
    }//GEN-LAST:event_btGuardarActionPerformed

    private void btBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btBuscarActionPerformed
        nodo=new Nodo();
        nodo.setID(Integer.parseInt(txBuscar.getText()));
        nodo=lista.Buscar(nodo);
        if(nodo!=null){
            btEditar.setEnabled(true);
            btRemover.setEnabled(true);
            txId.setText(String.valueOf(nodo.getID()));
            txNombre.setText(nodo.getNombre());
            txPeso.setText(String.valueOf(nodo.getPeso()));
        }
        else{
            JOptionPane.showMessageDialog(null, "No se econtro el nodo");
        }
    }//GEN-LAST:event_btBuscarActionPerformed

    private void btCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCancelarActionPerformed
        txId.setText("");
        txNombre.setText("");
        txPeso.setText("");
    }//GEN-LAST:event_btCancelarActionPerformed

    private void txNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txNombreActionPerformed

    private void btEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btEditarActionPerformed
        //Validar campos
        if(!this.txNombre.getText().equals("")&&!this.txId.getText().equals("")&&!this.txPeso.getText().equals("")){
            int id=Integer.parseInt(txId.getText());
            String newNombre=txNombre.getText();
            double peso=Double.parseDouble(txPeso.getText());
            lista.editar(id, newNombre, peso);
            this.list=lista.getActualizar();
            JOptionPane.showMessageDialog(null, "Nodo modificado correctamente");
            
        }
        else{
            JOptionPane.showMessageDialog(null, "Faltan campos por llenar");
        }
    }//GEN-LAST:event_btEditarActionPerformed

    private void btRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btRemoverActionPerformed
        int id=Integer.parseInt(txId.getText());
        if(!this.txId.getText().equals("")){
            //Limpiar cajas
            txId.setText("");
            txNombre.setText("");
            txPeso.setText("");
            this.list=lista.getActualizar();
            lista.remover(id);
            JOptionPane.showMessageDialog(null, "Nodo eliminado");
        }
        else{
            JOptionPane.showMessageDialog(null, "Error, no has buscado el nodo a eliminar");
        }
        
        
        
    }//GEN-LAST:event_btRemoverActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btBuscar;
    private javax.swing.JButton btCancelar;
    private javax.swing.JButton btEditar;
    private javax.swing.JButton btGuardar;
    private javax.swing.JButton btNuevo;
    private javax.swing.JButton btRemover;
    private javax.swing.JLabel lbBuscar;
    private javax.swing.JLabel lbId;
    private javax.swing.JLabel lbNombre;
    private javax.swing.JLabel lbPeso;
    private javax.swing.JTextField txBuscar;
    private javax.swing.JTextField txId;
    private javax.swing.JTextField txNombre;
    private javax.swing.JTextField txPeso;
    // End of variables declaration//GEN-END:variables
}
