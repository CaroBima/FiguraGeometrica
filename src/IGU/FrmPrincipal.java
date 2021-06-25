package IGU;

import Logica.Controladora;

public class FrmPrincipal extends javax.swing.JFrame {

    public FrmPrincipal() {
        initComponents();
        btnGrupo.add(rbtnCirculo);
        btnGrupo.add(rbtnCuadrado);
        btnGrupo.add(rbtnTriangulo);
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnGrupo = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jSeparatorSup = new javax.swing.JSeparator();
        rbtnCuadrado = new javax.swing.JRadioButton();
        rbtnCirculo = new javax.swing.JRadioButton();
        rbtnTriangulo = new javax.swing.JRadioButton();
        jSeparatorInf = new javax.swing.JSeparator();
        lblLado1 = new javax.swing.JLabel();
        txtLado1 = new javax.swing.JTextField();
        lblLado2 = new javax.swing.JLabel();
        txtLado2 = new javax.swing.JTextField();
        lblLado3 = new javax.swing.JLabel();
        txtLado3 = new javax.swing.JTextField();
        lblRadio = new javax.swing.JLabel();
        txtRadio = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        btnArea = new javax.swing.JButton();
        btnPerimetro = new javax.swing.JButton();
        txtResultado = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(""));

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTitulo.setText("Área y perímetro");

        jSeparatorSup.setBackground(new java.awt.Color(255, 0, 51));
        jSeparatorSup.setForeground(new java.awt.Color(255, 102, 102));

        rbtnCuadrado.setText("Cuadrado");
        rbtnCuadrado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnCuadradoActionPerformed(evt);
            }
        });

        rbtnCirculo.setText("Círculo");
        rbtnCirculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnCirculoActionPerformed(evt);
            }
        });

        rbtnTriangulo.setText("Tríangulo");
        rbtnTriangulo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbtnTrianguloActionPerformed(evt);
            }
        });

        jSeparatorInf.setBackground(new java.awt.Color(255, 0, 51));
        jSeparatorInf.setForeground(new java.awt.Color(255, 102, 102));

        lblLado1.setText("Lado 1:");

        txtLado1.setEditable(false);
        txtLado1.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtLado1.setText("0");
        txtLado1.setEnabled(false);

        lblLado2.setText("Lado 2:");

        txtLado2.setEditable(false);
        txtLado2.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtLado2.setText("0");
        txtLado2.setEnabled(false);

        lblLado3.setText("Lado 3:");

        txtLado3.setEditable(false);
        txtLado3.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtLado3.setText("0");
        txtLado3.setEnabled(false);

        lblRadio.setText("Radio:");

        txtRadio.setEditable(false);
        txtRadio.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtRadio.setText("0");
        txtRadio.setEnabled(false);

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnArea.setText("Área");
        btnArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAreaActionPerformed(evt);
            }
        });

        btnPerimetro.setText("Perímetro");
        btnPerimetro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPerimetroActionPerformed(evt);
            }
        });

        txtResultado.setEditable(false);
        txtResultado.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtResultado.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        txtResultado.setText("0");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(196, 196, 196)
                        .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jSeparatorInf, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jSeparatorSup, javax.swing.GroupLayout.PREFERRED_SIZE, 556, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(110, 110, 110)
                        .addComponent(rbtnCuadrado)
                        .addGap(77, 77, 77)
                        .addComponent(rbtnTriangulo)
                        .addGap(79, 79, 79)
                        .addComponent(rbtnCirculo))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(lblLado1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLado1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(39, 39, 39)
                                .addComponent(lblLado2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLado2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(42, 42, 42)
                                .addComponent(lblLado3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtLado3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtResultado, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(42, 42, 42)
                        .addComponent(lblRadio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtRadio, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(btnLimpiar)
                        .addGap(18, 18, 18)
                        .addComponent(btnArea, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnPerimetro)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparatorSup, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbtnCirculo)
                    .addComponent(rbtnTriangulo)
                    .addComponent(rbtnCuadrado))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparatorInf, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtLado1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLado1)
                    .addComponent(txtLado2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLado2)
                    .addComponent(lblLado3)
                    .addComponent(txtLado3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtRadio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblRadio))
                .addGap(30, 30, 30)
                .addComponent(txtResultado, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnArea)
                    .addComponent(btnPerimetro)
                    .addComponent(btnLimpiar))
                .addGap(25, 25, 25))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rbtnCuadradoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnCuadradoActionPerformed
      
        //habilito solo el lado1 para poder ingresar el lado del cuadrado
        txtResultado.setText("0");
        lblLado1.setText("Lado:   ");
        txtLado1.setEnabled(true);
        txtLado1.setEditable(true);
        txtLado2.setEnabled(false);
        txtLado2.setEditable(false);
        txtLado3.setEnabled(false);
        txtLado3.setEditable(false);
        txtRadio.setEnabled(false);
        txtRadio.setEditable(false);
       
    }//GEN-LAST:event_rbtnCuadradoActionPerformed

    private void rbtnTrianguloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnTrianguloActionPerformed
      
        //habilito para ingresar los tres lados del triangulo
        txtResultado.setText("0");
        this.limpiar();
        
        lblLado1.setText("Lado 1: ");
        txtLado1.setEnabled(true);
        txtLado1.setEditable(true);
        txtLado2.setEnabled(true);
        txtLado2.setEditable(true);
        txtLado3.setEnabled(true);
        txtLado3.setEditable(true);
        txtRadio.setEnabled(false);
        txtRadio.setEditable(false);
       
    }//GEN-LAST:event_rbtnTrianguloActionPerformed

    private void rbtnCirculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbtnCirculoActionPerformed
        //habilito solo el campo que permite ingresar el radio del circulo
        txtResultado.setText("0");
        this.limpiar();
        
        txtLado1.setEnabled(false);
        txtLado1.setEditable(false);
        txtLado2.setEnabled(false);
        txtLado2.setEditable(false);
        txtLado3.setEnabled(false);
        txtLado3.setEditable(false);
        txtRadio.setEnabled(true);
        txtRadio.setEditable(true);
    
    }//GEN-LAST:event_rbtnCirculoActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        this.limpiar();
        txtResultado.setText("0");
        btnGrupo.clearSelection();
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAreaActionPerformed
        
        if(rbtnTriangulo.isSelected()){
            
            Controladora control = new Controladora();
            double lado1;
            double lado2;
            double lado3;
            double areaTriangulo;
            
            lado1 =  Double.parseDouble(txtLado1.getText());
            lado2 =  Double.parseDouble(txtLado2.getText());
            lado3 =  Double.parseDouble(txtLado3.getText());
             
            areaTriangulo = control.calcularAreaTriangulo(lado1, lado2, lado3);
            
            txtResultado.setText(String.valueOf(areaTriangulo));
        }
        
    }//GEN-LAST:event_btnAreaActionPerformed

    private void btnPerimetroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPerimetroActionPerformed
       if(rbtnTriangulo.isSelected()){
           Controladora control = new Controladora();
           double lado1;
           double lado2;
           double lado3;
           double perimetroTriangulo;
           
           lado1 =  Double.parseDouble(txtLado1.getText());
           lado2 =  Double.parseDouble(txtLado2.getText());
           lado3 =  Double.parseDouble(txtLado3.getText());
           perimetroTriangulo = control.calcularPerimetroTriangulo(lado1, lado2, lado3);
           txtResultado.setText(String.valueOf(perimetroTriangulo));
       }
    }//GEN-LAST:event_btnPerimetroActionPerformed

    private void limpiar(){
        
        //seteo a 0 los textfield
        txtLado1.setText("0");
        txtLado2.setText("0");
        txtLado3.setText("0");
        txtRadio.setText("0");
        
        //desactivo los textfield para que se habiliten con una nueva seleccion de radio btn
        txtLado1.setEnabled(false);
        txtLado1.setEditable(false);
        txtLado2.setEnabled(false);
        txtLado2.setEditable(false);
        txtLado3.setEnabled(false);
        txtLado3.setEditable(false);
        txtRadio.setEnabled(false);
        txtRadio.setEditable(false);
       
    }
    /**
     * @param args the command line arguments
     */
  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnArea;
    private javax.swing.ButtonGroup btnGrupo;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnPerimetro;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparatorInf;
    private javax.swing.JSeparator jSeparatorSup;
    private javax.swing.JLabel lblLado1;
    private javax.swing.JLabel lblLado2;
    private javax.swing.JLabel lblLado3;
    private javax.swing.JLabel lblRadio;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JRadioButton rbtnCirculo;
    private javax.swing.JRadioButton rbtnCuadrado;
    private javax.swing.JRadioButton rbtnTriangulo;
    private javax.swing.JTextField txtLado1;
    private javax.swing.JTextField txtLado2;
    private javax.swing.JTextField txtLado3;
    private javax.swing.JTextField txtRadio;
    private javax.swing.JTextField txtResultado;
    // End of variables declaration//GEN-END:variables
}
