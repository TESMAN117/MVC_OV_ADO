/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

/**
 *
 * @author jesus
 */
public class Figuras extends javax.swing.JFrame {

    /**
     * Creates new form Figuras
     */
    public Figuras() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_titulo = new javax.swing.JLabel();
        panal = new javax.swing.JPanel();
        lbl_lado_a = new javax.swing.JLabel();
        lbl_lado_b = new javax.swing.JLabel();
        lbl_lado_h = new javax.swing.JLabel();
        lbl_largo = new javax.swing.JLabel();
        lbl_ancho = new javax.swing.JLabel();
        txt_lado_b = new javax.swing.JTextField();
        txt_lado_a = new javax.swing.JTextField();
        txt_lado_h = new javax.swing.JTextField();
        txt_ancho = new javax.swing.JTextField();
        txt_largo = new javax.swing.JTextField();
        CBM_Figura = new javax.swing.JComboBox<>();
        lbl_foto_figura = new javax.swing.JLabel();
        btn_Calcular = new javax.swing.JButton();
        btn_Limpiar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txt_Respuesta = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lbl_titulo.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        lbl_titulo.setText("Figuras");

        panal.setBackground(new java.awt.Color(255, 153, 153));

        lbl_lado_a.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_lado_a.setText("Lado A");

        lbl_lado_b.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_lado_b.setText("Lado B");

        lbl_lado_h.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_lado_h.setText("Lado H");

        lbl_largo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_largo.setText("Largo");

        lbl_ancho.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_ancho.setText("Ancho");

        CBM_Figura.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        CBM_Figura.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleciona una figura", "Triangulo", "Cuadrado", "Rectangulo" }));

        lbl_foto_figura.setBackground(new java.awt.Color(204, 204, 204));
        lbl_foto_figura.setForeground(new java.awt.Color(255, 204, 255));

        btn_Calcular.setText("Calcular");

        btn_Limpiar.setText("Limpiar");

        txt_Respuesta.setColumns(20);
        txt_Respuesta.setRows(5);
        jScrollPane1.setViewportView(txt_Respuesta);

        javax.swing.GroupLayout panalLayout = new javax.swing.GroupLayout(panal);
        panal.setLayout(panalLayout);
        panalLayout.setHorizontalGroup(
            panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panalLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lbl_lado_h)
                    .addComponent(lbl_lado_b)
                    .addComponent(lbl_largo)
                    .addComponent(lbl_ancho)
                    .addComponent(lbl_lado_a))
                .addGap(35, 35, 35)
                .addGroup(panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_ancho, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_lado_b, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_lado_h, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_largo, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txt_lado_a, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addComponent(lbl_foto_figura, javax.swing.GroupLayout.PREFERRED_SIZE, 421, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                .addGroup(panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CBM_Figura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(panalLayout.createSequentialGroup()
                        .addComponent(btn_Calcular)
                        .addGap(32, 32, 32)
                        .addComponent(btn_Limpiar))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18))
        );
        panalLayout.setVerticalGroup(
            panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panalLayout.createSequentialGroup()
                .addGroup(panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panalLayout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txt_lado_a, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(CBM_Figura, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(lbl_lado_a))
                        .addGroup(panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panalLayout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addGroup(panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(btn_Calcular)
                                    .addComponent(btn_Limpiar))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(panalLayout.createSequentialGroup()
                                .addGap(27, 27, 27)
                                .addGroup(panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(lbl_lado_h)
                                    .addGroup(panalLayout.createSequentialGroup()
                                        .addGroup(panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(txt_lado_b, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(lbl_lado_b))
                                        .addGap(20, 20, 20)
                                        .addComponent(txt_lado_h, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txt_largo, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lbl_largo))
                                .addGap(18, 18, 18)
                                .addGroup(panalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lbl_ancho)
                                    .addComponent(txt_ancho, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(41, 41, 41))))
                    .addGroup(panalLayout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(lbl_foto_figura, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(385, 385, 385)
                .addComponent(lbl_titulo)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(panal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JComboBox<String> CBM_Figura;
    public javax.swing.JButton btn_Calcular;
    public javax.swing.JButton btn_Limpiar;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JLabel lbl_ancho;
    public javax.swing.JLabel lbl_foto_figura;
    public javax.swing.JLabel lbl_lado_a;
    public javax.swing.JLabel lbl_lado_b;
    public javax.swing.JLabel lbl_lado_h;
    public javax.swing.JLabel lbl_largo;
    public javax.swing.JLabel lbl_titulo;
    public javax.swing.JPanel panal;
    public javax.swing.JTextArea txt_Respuesta;
    public javax.swing.JTextField txt_ancho;
    public javax.swing.JTextField txt_lado_a;
    public javax.swing.JTextField txt_lado_b;
    public javax.swing.JTextField txt_lado_h;
    public javax.swing.JTextField txt_largo;
    // End of variables declaration//GEN-END:variables
}
