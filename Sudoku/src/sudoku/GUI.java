package sudoku;

import javax.swing.JDialog;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 * @author CERVANTES OLIVARES MARÍA FERNANDA
 * @author LÓPEZ CORDERO CAROLINA CRISPINA
 * @author SÁNCHEZ AGUILAR JOSÉ DE JESÚS
 * @author SORIA MARROQUÍN GABRIELA  
 */

/**
 * <pre>
 * Clase GUI
 * 
 * Interfaz gráfica. Clase con los métodos para trabajar con cada una de las 81
 * celdas del sudoku
 * </pre>
 */

public class GUI extends javax.swing.JFrame {

    /**
     * Creates new form GUI
     */
    private SoluciónSudoku su;
    private JTextField[][] campos;
    
/**
 * Constructor por omisión, instancia un nuevo sudoku
 */    
    public GUI() {
        initComponents();
        su = new SoluciónSudoku();
    }
    
/**
 * Método que busca en un TextField si el usuario ingresó un dato en la cela
 * de lo contrario agrega un cero para su posterior resolución.
 * @param celda Una de las 81 celdas
 * @param ren Renglón de la matriz
 * @param col Columna de la matriz
 * @return Booleano según sea el caso (éxito || fracaso)
 */
    public boolean llena(JTextField celda, int ren, int col){
        boolean res = false;
        int num;
        if(!celda.getText().isEmpty()){
            try{
                num = Integer.parseInt(celda.getText());
                if(validaDato(num))
                    if(su.agregaDato(num, ren, col))
                        res = true;
                    else {
                        JOptionPane.showMessageDialog(new JDialog(),"Error en reglon: " + (ren+1) + ", columna: " + (col+1) +  ". No se pueden repetir los números." ,"Error", JOptionPane.ERROR_MESSAGE);
                        su = new SoluciónSudoku();
                    }
                else{
                    JOptionPane.showMessageDialog(new JDialog(),"Error en reglon: " + (ren+1) + ", columna: " + (col+1) + ". Ingrese un valor numerico del 1 al 9." ,"Error", JOptionPane.ERROR_MESSAGE);
                        su = new SoluciónSudoku();                    
                }
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(new JDialog(), "Error en reglon: " + (ren+1) + ", columna: " + (col+1) + ". Ingrese un valor numerico del 1 al 9." ,"Error", JOptionPane.ERROR_MESSAGE);
                su = new SoluciónSudoku();
            }
        }
        else
            res = su.agregaMat(0, ren, col);
        return res;            
    }

/**
 * Método que valida que el dato se pueda ingresar de acuerdo a las reglas del sudoku
 * @param num Número a ingresar
 * @return Booleano según sea el caso: (se puede || no se puede) agregar
 */
    public boolean validaDato(int num){
        return num > 0 && num < 10;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Principal = new javax.swing.JPanel();
        bloque6 = new javax.swing.JPanel();
        R6C1 = new javax.swing.JTextField();
        R6C2 = new javax.swing.JTextField();
        R6C0 = new javax.swing.JTextField();
        R7C2 = new javax.swing.JTextField();
        R7C1 = new javax.swing.JTextField();
        R7C0 = new javax.swing.JTextField();
        R8C2 = new javax.swing.JTextField();
        R8C1 = new javax.swing.JTextField();
        R8C0 = new javax.swing.JTextField();
        bloque7 = new javax.swing.JPanel();
        R6C4 = new javax.swing.JTextField();
        R6C5 = new javax.swing.JTextField();
        R6C3 = new javax.swing.JTextField();
        R7C5 = new javax.swing.JTextField();
        R7C4 = new javax.swing.JTextField();
        R7C3 = new javax.swing.JTextField();
        R8C5 = new javax.swing.JTextField();
        R8C4 = new javax.swing.JTextField();
        R8C3 = new javax.swing.JTextField();
        bloque2 = new javax.swing.JPanel();
        R0C7 = new javax.swing.JTextField();
        R0C8 = new javax.swing.JTextField();
        R0C6 = new javax.swing.JTextField();
        R1C8 = new javax.swing.JTextField();
        R1C7 = new javax.swing.JTextField();
        R1C6 = new javax.swing.JTextField();
        R2C8 = new javax.swing.JTextField();
        R2C7 = new javax.swing.JTextField();
        R2C6 = new javax.swing.JTextField();
        bloque8 = new javax.swing.JPanel();
        R6C7 = new javax.swing.JTextField();
        R6C8 = new javax.swing.JTextField();
        R6C6 = new javax.swing.JTextField();
        R7C8 = new javax.swing.JTextField();
        R7C7 = new javax.swing.JTextField();
        R7C6 = new javax.swing.JTextField();
        R8C8 = new javax.swing.JTextField();
        R8C7 = new javax.swing.JTextField();
        R8C6 = new javax.swing.JTextField();
        bloque1 = new javax.swing.JPanel();
        R0C4 = new javax.swing.JTextField();
        R0C5 = new javax.swing.JTextField();
        R0C3 = new javax.swing.JTextField();
        R1C5 = new javax.swing.JTextField();
        R1C4 = new javax.swing.JTextField();
        R1C3 = new javax.swing.JTextField();
        R2C5 = new javax.swing.JTextField();
        R2C4 = new javax.swing.JTextField();
        R2C3 = new javax.swing.JTextField();
        bloque3 = new javax.swing.JPanel();
        R3C1 = new javax.swing.JTextField();
        R3C2 = new javax.swing.JTextField();
        R3C0 = new javax.swing.JTextField();
        R4C2 = new javax.swing.JTextField();
        R4C1 = new javax.swing.JTextField();
        R4C0 = new javax.swing.JTextField();
        R5C2 = new javax.swing.JTextField();
        R5C1 = new javax.swing.JTextField();
        R5C0 = new javax.swing.JTextField();
        bloque4 = new javax.swing.JPanel();
        R3C4 = new javax.swing.JTextField();
        R3C5 = new javax.swing.JTextField();
        R3C3 = new javax.swing.JTextField();
        R4C5 = new javax.swing.JTextField();
        R4C4 = new javax.swing.JTextField();
        R4C3 = new javax.swing.JTextField();
        R5C5 = new javax.swing.JTextField();
        R5C4 = new javax.swing.JTextField();
        R5C3 = new javax.swing.JTextField();
        resuelve = new javax.swing.JButton();
        bloque0 = new javax.swing.JPanel();
        R1C2 = new javax.swing.JTextField();
        R1C1 = new javax.swing.JTextField();
        R2C2 = new javax.swing.JTextField();
        R2C1 = new javax.swing.JTextField();
        R2C0 = new javax.swing.JTextField();
        R0C0 = new javax.swing.JTextField();
        R0C1 = new javax.swing.JTextField();
        R1C0 = new javax.swing.JTextField();
        R0C2 = new javax.swing.JTextField();
        bloque5 = new javax.swing.JPanel();
        R3C7 = new javax.swing.JTextField();
        R3C8 = new javax.swing.JTextField();
        R3C6 = new javax.swing.JTextField();
        R4C8 = new javax.swing.JTextField();
        R4C7 = new javax.swing.JTextField();
        R4C6 = new javax.swing.JTextField();
        R5C8 = new javax.swing.JTextField();
        R5C7 = new javax.swing.JTextField();
        R5C6 = new javax.swing.JTextField();
        limpia = new javax.swing.JButton();
        Título = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Sudoku"); // NOI18N
        setBackground(new java.awt.Color(255, 255, 255));
        setBounds(new java.awt.Rectangle(0, 0, 569, 645));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(569, 645));
        setPreferredSize(new java.awt.Dimension(569, 625));

        Principal.setBackground(new java.awt.Color(234, 234, 234));
        Principal.setForeground(new java.awt.Color(255, 255, 255));
        Principal.setMinimumSize(new java.awt.Dimension(569, 645));
        Principal.setPreferredSize(new java.awt.Dimension(569, 645));

        bloque6.setBackground(new java.awt.Color(0, 169, 165));
        bloque6.setPreferredSize(new java.awt.Dimension(200, 200));

        R6C1.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R6C1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R6C1.setPreferredSize(new java.awt.Dimension(45, 45));

        R6C2.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R6C2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R6C2.setPreferredSize(new java.awt.Dimension(45, 45));

        R6C0.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R6C0.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R6C0.setPreferredSize(new java.awt.Dimension(45, 45));

        R7C2.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R7C2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R7C2.setPreferredSize(new java.awt.Dimension(45, 45));

        R7C1.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R7C1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R7C1.setPreferredSize(new java.awt.Dimension(45, 45));
        R7C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R7C1ActionPerformed(evt);
            }
        });

        R7C0.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R7C0.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R7C0.setPreferredSize(new java.awt.Dimension(45, 45));

        R8C2.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R8C2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R8C2.setPreferredSize(new java.awt.Dimension(45, 45));
        R8C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R8C2ActionPerformed(evt);
            }
        });

        R8C1.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R8C1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R8C1.setPreferredSize(new java.awt.Dimension(45, 45));
        R8C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R8C1ActionPerformed(evt);
            }
        });

        R8C0.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R8C0.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R8C0.setPreferredSize(new java.awt.Dimension(45, 45));
        R8C0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R8C0ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bloque6Layout = new javax.swing.GroupLayout(bloque6);
        bloque6.setLayout(bloque6Layout);
        bloque6Layout.setHorizontalGroup(
            bloque6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloque6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bloque6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bloque6Layout.createSequentialGroup()
                        .addComponent(R6C0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R6C1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R6C2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bloque6Layout.createSequentialGroup()
                        .addComponent(R7C0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R7C1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R7C2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bloque6Layout.createSequentialGroup()
                        .addComponent(R8C0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R8C1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R8C2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        bloque6Layout.setVerticalGroup(
            bloque6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloque6Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bloque6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R6C0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R6C1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R6C2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bloque6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R7C0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R7C1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R7C2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bloque6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R8C0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R8C1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R8C2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        bloque7.setBackground(new java.awt.Color(78, 128, 152));
        bloque7.setPreferredSize(new java.awt.Dimension(200, 200));

        R6C4.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R6C4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R6C4.setPreferredSize(new java.awt.Dimension(45, 45));

        R6C5.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R6C5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R6C5.setPreferredSize(new java.awt.Dimension(45, 45));
        R6C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R6C5ActionPerformed(evt);
            }
        });

        R6C3.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R6C3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R6C3.setPreferredSize(new java.awt.Dimension(45, 45));

        R7C5.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R7C5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R7C5.setPreferredSize(new java.awt.Dimension(45, 45));

        R7C4.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R7C4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R7C4.setPreferredSize(new java.awt.Dimension(45, 45));

        R7C3.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R7C3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R7C3.setPreferredSize(new java.awt.Dimension(45, 45));

        R8C5.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R8C5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R8C5.setPreferredSize(new java.awt.Dimension(45, 45));

        R8C4.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R8C4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R8C4.setPreferredSize(new java.awt.Dimension(45, 45));

        R8C3.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R8C3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R8C3.setPreferredSize(new java.awt.Dimension(45, 45));
        R8C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R8C3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bloque7Layout = new javax.swing.GroupLayout(bloque7);
        bloque7.setLayout(bloque7Layout);
        bloque7Layout.setHorizontalGroup(
            bloque7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloque7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bloque7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bloque7Layout.createSequentialGroup()
                        .addComponent(R6C3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R6C4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R6C5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bloque7Layout.createSequentialGroup()
                        .addComponent(R7C3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R7C4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R7C5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bloque7Layout.createSequentialGroup()
                        .addComponent(R8C3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R8C4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R8C5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        bloque7Layout.setVerticalGroup(
            bloque7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloque7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bloque7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R6C3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R6C4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R6C5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bloque7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R7C3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R7C4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R7C5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bloque7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R8C3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R8C4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R8C5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        bloque2.setBackground(new java.awt.Color(0, 169, 165));
        bloque2.setForeground(new java.awt.Color(255, 255, 255));
        bloque2.setPreferredSize(new java.awt.Dimension(200, 200));

        R0C7.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R0C7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R0C7.setPreferredSize(new java.awt.Dimension(45, 45));
        R0C7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R0C7ActionPerformed(evt);
            }
        });

        R0C8.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R0C8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R0C8.setPreferredSize(new java.awt.Dimension(45, 45));
        R0C8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R0C8ActionPerformed(evt);
            }
        });

        R0C6.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R0C6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R0C6.setPreferredSize(new java.awt.Dimension(45, 45));
        R0C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R0C6ActionPerformed(evt);
            }
        });

        R1C8.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R1C8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R1C8.setPreferredSize(new java.awt.Dimension(45, 45));

        R1C7.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R1C7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R1C7.setPreferredSize(new java.awt.Dimension(45, 45));

        R1C6.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R1C6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R1C6.setPreferredSize(new java.awt.Dimension(45, 45));

        R2C8.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R2C8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R2C8.setPreferredSize(new java.awt.Dimension(45, 45));

        R2C7.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R2C7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R2C7.setPreferredSize(new java.awt.Dimension(45, 45));

        R2C6.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R2C6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R2C6.setPreferredSize(new java.awt.Dimension(45, 45));

        javax.swing.GroupLayout bloque2Layout = new javax.swing.GroupLayout(bloque2);
        bloque2.setLayout(bloque2Layout);
        bloque2Layout.setHorizontalGroup(
            bloque2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloque2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bloque2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bloque2Layout.createSequentialGroup()
                        .addComponent(R0C6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R0C7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R0C8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bloque2Layout.createSequentialGroup()
                        .addComponent(R1C6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R1C7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R1C8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bloque2Layout.createSequentialGroup()
                        .addComponent(R2C6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R2C7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R2C8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        bloque2Layout.setVerticalGroup(
            bloque2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloque2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bloque2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R0C6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R0C7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R0C8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bloque2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R1C6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R1C7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R1C8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bloque2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R2C6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R2C7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R2C8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        bloque8.setBackground(new java.awt.Color(0, 169, 165));
        bloque8.setPreferredSize(new java.awt.Dimension(200, 200));

        R6C7.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R6C7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R6C7.setPreferredSize(new java.awt.Dimension(45, 45));

        R6C8.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R6C8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R6C8.setPreferredSize(new java.awt.Dimension(45, 45));

        R6C6.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R6C6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R6C6.setPreferredSize(new java.awt.Dimension(45, 45));

        R7C8.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R7C8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R7C8.setPreferredSize(new java.awt.Dimension(45, 45));

        R7C7.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R7C7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R7C7.setPreferredSize(new java.awt.Dimension(45, 45));

        R7C6.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R7C6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R7C6.setPreferredSize(new java.awt.Dimension(45, 45));

        R8C8.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R8C8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R8C8.setPreferredSize(new java.awt.Dimension(45, 45));

        R8C7.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R8C7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R8C7.setPreferredSize(new java.awt.Dimension(45, 45));

        R8C6.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R8C6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R8C6.setPreferredSize(new java.awt.Dimension(45, 45));
        R8C6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R8C6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout bloque8Layout = new javax.swing.GroupLayout(bloque8);
        bloque8.setLayout(bloque8Layout);
        bloque8Layout.setHorizontalGroup(
            bloque8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloque8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bloque8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bloque8Layout.createSequentialGroup()
                        .addComponent(R6C6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R6C7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R6C8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bloque8Layout.createSequentialGroup()
                        .addComponent(R7C6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R7C7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R7C8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bloque8Layout.createSequentialGroup()
                        .addComponent(R8C6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R8C7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R8C8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        bloque8Layout.setVerticalGroup(
            bloque8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloque8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bloque8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R6C6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R6C7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R6C8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bloque8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R7C6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R7C7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R7C8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bloque8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R8C6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R8C7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R8C8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        bloque1.setBackground(new java.awt.Color(78, 128, 152));
        bloque1.setPreferredSize(new java.awt.Dimension(200, 200));

        R0C4.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R0C4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R0C4.setPreferredSize(new java.awt.Dimension(45, 45));
        R0C4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R0C4ActionPerformed(evt);
            }
        });

        R0C5.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R0C5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R0C5.setPreferredSize(new java.awt.Dimension(45, 45));
        R0C5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R0C5ActionPerformed(evt);
            }
        });

        R0C3.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R0C3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R0C3.setPreferredSize(new java.awt.Dimension(45, 45));
        R0C3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R0C3ActionPerformed(evt);
            }
        });

        R1C5.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R1C5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R1C5.setPreferredSize(new java.awt.Dimension(45, 45));

        R1C4.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R1C4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R1C4.setPreferredSize(new java.awt.Dimension(45, 45));

        R1C3.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R1C3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R1C3.setPreferredSize(new java.awt.Dimension(45, 45));

        R2C5.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R2C5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R2C5.setPreferredSize(new java.awt.Dimension(45, 45));

        R2C4.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R2C4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R2C4.setPreferredSize(new java.awt.Dimension(45, 45));

        R2C3.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R2C3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R2C3.setPreferredSize(new java.awt.Dimension(45, 45));

        javax.swing.GroupLayout bloque1Layout = new javax.swing.GroupLayout(bloque1);
        bloque1.setLayout(bloque1Layout);
        bloque1Layout.setHorizontalGroup(
            bloque1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloque1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bloque1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bloque1Layout.createSequentialGroup()
                        .addComponent(R0C3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R0C4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R0C5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bloque1Layout.createSequentialGroup()
                        .addComponent(R1C3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R1C4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R1C5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bloque1Layout.createSequentialGroup()
                        .addComponent(R2C3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R2C4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R2C5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        bloque1Layout.setVerticalGroup(
            bloque1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloque1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bloque1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R0C3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R0C4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R0C5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bloque1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R1C3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R1C4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R1C5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bloque1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R2C3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R2C4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R2C5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        bloque3.setBackground(new java.awt.Color(78, 128, 152));
        bloque3.setPreferredSize(new java.awt.Dimension(200, 200));

        R3C1.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R3C1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R3C1.setPreferredSize(new java.awt.Dimension(45, 45));

        R3C2.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R3C2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R3C2.setPreferredSize(new java.awt.Dimension(45, 45));

        R3C0.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R3C0.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R3C0.setPreferredSize(new java.awt.Dimension(45, 45));
        R3C0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R3C0ActionPerformed(evt);
            }
        });

        R4C2.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R4C2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R4C2.setPreferredSize(new java.awt.Dimension(45, 45));
        R4C2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R4C2ActionPerformed(evt);
            }
        });

        R4C1.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R4C1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R4C1.setPreferredSize(new java.awt.Dimension(45, 45));
        R4C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R4C1ActionPerformed(evt);
            }
        });

        R4C0.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R4C0.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R4C0.setPreferredSize(new java.awt.Dimension(45, 45));

        R5C2.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R5C2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R5C2.setPreferredSize(new java.awt.Dimension(45, 45));

        R5C1.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R5C1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R5C1.setPreferredSize(new java.awt.Dimension(45, 45));
        R5C1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R5C1ActionPerformed(evt);
            }
        });

        R5C0.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R5C0.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R5C0.setPreferredSize(new java.awt.Dimension(45, 45));

        javax.swing.GroupLayout bloque3Layout = new javax.swing.GroupLayout(bloque3);
        bloque3.setLayout(bloque3Layout);
        bloque3Layout.setHorizontalGroup(
            bloque3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloque3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bloque3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bloque3Layout.createSequentialGroup()
                        .addComponent(R3C0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R3C1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R3C2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bloque3Layout.createSequentialGroup()
                        .addComponent(R4C0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R4C1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R4C2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bloque3Layout.createSequentialGroup()
                        .addComponent(R5C0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R5C1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R5C2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        bloque3Layout.setVerticalGroup(
            bloque3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloque3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bloque3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R3C0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R3C1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R3C2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bloque3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R4C0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R4C1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R4C2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bloque3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R5C0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R5C1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R5C2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        bloque4.setBackground(new java.awt.Color(0, 169, 165));
        bloque4.setPreferredSize(new java.awt.Dimension(200, 200));

        R3C4.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R3C4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R3C4.setPreferredSize(new java.awt.Dimension(45, 45));

        R3C5.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R3C5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R3C5.setPreferredSize(new java.awt.Dimension(45, 45));

        R3C3.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R3C3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R3C3.setPreferredSize(new java.awt.Dimension(45, 45));

        R4C5.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R4C5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R4C5.setPreferredSize(new java.awt.Dimension(45, 45));

        R4C4.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R4C4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R4C4.setPreferredSize(new java.awt.Dimension(45, 45));

        R4C3.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R4C3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R4C3.setPreferredSize(new java.awt.Dimension(45, 45));

        R5C5.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R5C5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R5C5.setPreferredSize(new java.awt.Dimension(45, 45));

        R5C4.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R5C4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R5C4.setPreferredSize(new java.awt.Dimension(45, 45));

        R5C3.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R5C3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R5C3.setPreferredSize(new java.awt.Dimension(45, 45));

        javax.swing.GroupLayout bloque4Layout = new javax.swing.GroupLayout(bloque4);
        bloque4.setLayout(bloque4Layout);
        bloque4Layout.setHorizontalGroup(
            bloque4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloque4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bloque4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bloque4Layout.createSequentialGroup()
                        .addComponent(R3C3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R3C4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R3C5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bloque4Layout.createSequentialGroup()
                        .addComponent(R4C3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R4C4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R4C5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bloque4Layout.createSequentialGroup()
                        .addComponent(R5C3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R5C4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R5C5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(12, Short.MAX_VALUE))
        );
        bloque4Layout.setVerticalGroup(
            bloque4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloque4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bloque4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R3C3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R3C4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R3C5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bloque4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R4C3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R4C4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R4C5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bloque4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R5C3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R5C4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R5C5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        resuelve.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        resuelve.setText("Resuelve");
        resuelve.setPreferredSize(new java.awt.Dimension(75, 25));
        resuelve.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resuelveActionPerformed(evt);
            }
        });

        bloque0.setBackground(new java.awt.Color(0, 169, 165));
        bloque0.setForeground(new java.awt.Color(255, 255, 255));
        bloque0.setPreferredSize(new java.awt.Dimension(200, 200));

        R1C2.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R1C2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R1C2.setPreferredSize(new java.awt.Dimension(45, 45));

        R1C1.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R1C1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R1C1.setPreferredSize(new java.awt.Dimension(45, 45));

        R2C2.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R2C2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R2C2.setPreferredSize(new java.awt.Dimension(45, 45));

        R2C1.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R2C1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R2C1.setPreferredSize(new java.awt.Dimension(45, 45));

        R2C0.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R2C0.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R2C0.setPreferredSize(new java.awt.Dimension(45, 45));

        R0C0.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R0C0.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R0C0.setPreferredSize(new java.awt.Dimension(45, 45));

        R0C1.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R0C1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R0C1.setPreferredSize(new java.awt.Dimension(45, 45));

        R1C0.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R1C0.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R1C0.setPreferredSize(new java.awt.Dimension(45, 45));

        R0C2.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R0C2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R0C2.setPreferredSize(new java.awt.Dimension(45, 45));

        javax.swing.GroupLayout bloque0Layout = new javax.swing.GroupLayout(bloque0);
        bloque0.setLayout(bloque0Layout);
        bloque0Layout.setHorizontalGroup(
            bloque0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloque0Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bloque0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bloque0Layout.createSequentialGroup()
                        .addComponent(R0C0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R0C1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(R0C2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bloque0Layout.createSequentialGroup()
                        .addGroup(bloque0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bloque0Layout.createSequentialGroup()
                                .addComponent(R1C0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(R1C1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(R1C2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bloque0Layout.createSequentialGroup()
                                .addComponent(R2C0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(R2C1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(R2C2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap(11, Short.MAX_VALUE))
        );
        bloque0Layout.setVerticalGroup(
            bloque0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloque0Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bloque0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R0C0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R0C1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R0C2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bloque0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R1C1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R1C2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R1C0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bloque0Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R2C0, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R2C1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R2C2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        bloque5.setBackground(new java.awt.Color(78, 128, 152));
        bloque5.setPreferredSize(new java.awt.Dimension(200, 200));

        R3C7.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R3C7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R3C7.setPreferredSize(new java.awt.Dimension(45, 45));

        R3C8.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R3C8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R3C8.setPreferredSize(new java.awt.Dimension(45, 45));

        R3C6.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R3C6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R3C6.setPreferredSize(new java.awt.Dimension(45, 45));

        R4C8.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R4C8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R4C8.setPreferredSize(new java.awt.Dimension(45, 45));

        R4C7.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R4C7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R4C7.setPreferredSize(new java.awt.Dimension(45, 45));

        R4C6.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R4C6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R4C6.setPreferredSize(new java.awt.Dimension(45, 45));

        R5C8.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R5C8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R5C8.setPreferredSize(new java.awt.Dimension(45, 45));

        R5C7.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R5C7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R5C7.setPreferredSize(new java.awt.Dimension(45, 45));

        R5C6.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        R5C6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        R5C6.setPreferredSize(new java.awt.Dimension(45, 45));

        javax.swing.GroupLayout bloque5Layout = new javax.swing.GroupLayout(bloque5);
        bloque5.setLayout(bloque5Layout);
        bloque5Layout.setHorizontalGroup(
            bloque5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloque5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bloque5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bloque5Layout.createSequentialGroup()
                        .addComponent(R3C6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R3C7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R3C8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bloque5Layout.createSequentialGroup()
                        .addComponent(R4C6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R4C7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R4C8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(bloque5Layout.createSequentialGroup()
                        .addComponent(R5C6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R5C7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R5C8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        bloque5Layout.setVerticalGroup(
            bloque5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bloque5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(bloque5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R3C6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R3C7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R3C8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bloque5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R4C6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R4C7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R4C8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bloque5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(R5C6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R5C7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R5C8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        limpia.setFont(new java.awt.Font("Segoe UI", 1, 15)); // NOI18N
        limpia.setText("Limpia");
        limpia.setPreferredSize(new java.awt.Dimension(75, 25));
        limpia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                limpiaActionPerformed(evt);
            }
        });

        Título.setBackground(new java.awt.Color(0, 0, 0));
        Título.setFont(new java.awt.Font("Segoe UI", 0, 48)); // NOI18N
        Título.setText("SUDOKU");

        javax.swing.GroupLayout PrincipalLayout = new javax.swing.GroupLayout(Principal);
        Principal.setLayout(PrincipalLayout);
        PrincipalLayout.setHorizontalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addContainerGap(25, Short.MAX_VALUE)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addComponent(bloque6, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bloque7, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bloque8, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addComponent(bloque3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bloque4, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bloque5, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(PrincipalLayout.createSequentialGroup()
                            .addComponent(resuelve, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(41, 41, 41)
                            .addComponent(Título)
                            .addGap(41, 41, 41)
                            .addComponent(limpia, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(PrincipalLayout.createSequentialGroup()
                            .addComponent(bloque0, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(bloque1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(bloque2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        PrincipalLayout.setVerticalGroup(
            PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PrincipalLayout.createSequentialGroup()
                        .addComponent(Título, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(5, 5, 5))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PrincipalLayout.createSequentialGroup()
                        .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(resuelve, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(limpia, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bloque2, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bloque1, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bloque0, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bloque5, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bloque4, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bloque3, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(PrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bloque8, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bloque7, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bloque6, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        getContentPane().add(Principal, java.awt.BorderLayout.CENTER);

        setSize(new java.awt.Dimension(585, 683));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
/**
 * Método que acciona el botón "Resuelve", que trabaja con la matriz una vez leidos los datos
 * que se le ingresaron.
 * @param evt 
 */   
    private void resuelveActionPerformed(java.awt.event.ActionEvent evt) {                                         
        boolean res = true; 
        campos = new JTextField[][]{{R0C0, R0C1, R0C2, R0C3, R0C4, R0C5, R0C6, R0C7, R0C8},
                                    {R1C0, R1C1, R1C2, R1C3, R1C4, R1C5, R1C6, R1C7, R1C8},
                                    {R2C0, R2C1, R2C2, R2C3, R2C4, R2C5, R2C6, R2C7, R2C8}, 
                                    {R3C0, R3C1, R3C2, R3C3, R3C4, R3C5, R3C6, R3C7, R3C8}, 
                                    {R4C0, R4C1, R4C2, R4C3, R4C4, R4C5, R4C6, R4C7, R4C8},
                                    {R5C0, R5C1, R5C2, R5C3, R5C4, R5C5, R5C6, R5C7, R5C8}, 
                                    {R6C0, R6C1, R6C2, R6C3, R6C4, R6C5, R6C6, R6C7, R6C8}, 
                                    {R7C0, R7C1, R7C2, R7C3, R7C4, R7C5, R7C6, R7C7, R7C8}, 
                                    {R8C0, R8C1, R8C2, R8C3, R8C4, R8C5, R8C6, R8C7, R8C8}};
        int i = 0;
        while(i < 9 && res) {
            int j = 0;
            while(j < 9 && res) {
                res = llena(campos[i][j], i, j);
                j++;
            }
            i++;
        }
        if(res) {
            res = su.resuelve();
            if(res) {
                for(i=0; i<9; i++)
                    for(int j=0; j<9; j++)
                        campos[i][j].setText(""+su.matriz[i][j]);
            }
        }

    }                                        
/**
 * Método que acciona el botón "Limpia"
 * @param evt Evento 
 */
    private void limpiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_limpiaActionPerformed
        for(int i=0; i<9; i++)
            for(int j=0; j<9; j++)
                campos[i][j].setText("");
        su = new SoluciónSudoku();
    }//GEN-LAST:event_limpiaActionPerformed

    private void R3C0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R3C0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R3C0ActionPerformed

    private void R4C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R4C1ActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_R4C1ActionPerformed

    private void R4C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R4C2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R4C2ActionPerformed

    private void R5C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R5C1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R5C1ActionPerformed

    private void R7C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R7C1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R7C1ActionPerformed

    private void R8C0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R8C0ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R8C0ActionPerformed

    private void R8C1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R8C1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R8C1ActionPerformed

    private void R8C2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R8C2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R8C2ActionPerformed

    private void R8C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R8C3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R8C3ActionPerformed

    private void R8C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R8C6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R8C6ActionPerformed

    private void R6C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R6C5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R6C5ActionPerformed

    private void R0C3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R0C3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R0C3ActionPerformed

    private void R0C4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R0C4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R0C4ActionPerformed

    private void R0C5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R0C5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R0C5ActionPerformed

    private void R0C6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R0C6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R0C6ActionPerformed

    private void R0C7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R0C7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R0C7ActionPerformed

    private void R0C8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R0C8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_R0C8ActionPerformed

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
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Principal;
    private javax.swing.JTextField R0C0;
    private javax.swing.JTextField R0C1;
    private javax.swing.JTextField R0C2;
    private javax.swing.JTextField R0C3;
    private javax.swing.JTextField R0C4;
    private javax.swing.JTextField R0C5;
    private javax.swing.JTextField R0C6;
    private javax.swing.JTextField R0C7;
    private javax.swing.JTextField R0C8;
    private javax.swing.JTextField R1C0;
    private javax.swing.JTextField R1C1;
    private javax.swing.JTextField R1C2;
    private javax.swing.JTextField R1C3;
    private javax.swing.JTextField R1C4;
    private javax.swing.JTextField R1C5;
    private javax.swing.JTextField R1C6;
    private javax.swing.JTextField R1C7;
    private javax.swing.JTextField R1C8;
    private javax.swing.JTextField R2C0;
    private javax.swing.JTextField R2C1;
    private javax.swing.JTextField R2C2;
    private javax.swing.JTextField R2C3;
    private javax.swing.JTextField R2C4;
    private javax.swing.JTextField R2C5;
    private javax.swing.JTextField R2C6;
    private javax.swing.JTextField R2C7;
    private javax.swing.JTextField R2C8;
    private javax.swing.JTextField R3C0;
    private javax.swing.JTextField R3C1;
    private javax.swing.JTextField R3C2;
    private javax.swing.JTextField R3C3;
    private javax.swing.JTextField R3C4;
    private javax.swing.JTextField R3C5;
    private javax.swing.JTextField R3C6;
    private javax.swing.JTextField R3C7;
    private javax.swing.JTextField R3C8;
    private javax.swing.JTextField R4C0;
    private javax.swing.JTextField R4C1;
    private javax.swing.JTextField R4C2;
    private javax.swing.JTextField R4C3;
    private javax.swing.JTextField R4C4;
    private javax.swing.JTextField R4C5;
    private javax.swing.JTextField R4C6;
    private javax.swing.JTextField R4C7;
    private javax.swing.JTextField R4C8;
    private javax.swing.JTextField R5C0;
    private javax.swing.JTextField R5C1;
    private javax.swing.JTextField R5C2;
    private javax.swing.JTextField R5C3;
    private javax.swing.JTextField R5C4;
    private javax.swing.JTextField R5C5;
    private javax.swing.JTextField R5C6;
    private javax.swing.JTextField R5C7;
    private javax.swing.JTextField R5C8;
    private javax.swing.JTextField R6C0;
    private javax.swing.JTextField R6C1;
    private javax.swing.JTextField R6C2;
    private javax.swing.JTextField R6C3;
    private javax.swing.JTextField R6C4;
    private javax.swing.JTextField R6C5;
    private javax.swing.JTextField R6C6;
    private javax.swing.JTextField R6C7;
    private javax.swing.JTextField R6C8;
    private javax.swing.JTextField R7C0;
    private javax.swing.JTextField R7C1;
    private javax.swing.JTextField R7C2;
    private javax.swing.JTextField R7C3;
    private javax.swing.JTextField R7C4;
    private javax.swing.JTextField R7C5;
    private javax.swing.JTextField R7C6;
    private javax.swing.JTextField R7C7;
    private javax.swing.JTextField R7C8;
    private javax.swing.JTextField R8C0;
    private javax.swing.JTextField R8C1;
    private javax.swing.JTextField R8C2;
    private javax.swing.JTextField R8C3;
    private javax.swing.JTextField R8C4;
    private javax.swing.JTextField R8C5;
    private javax.swing.JTextField R8C6;
    private javax.swing.JTextField R8C7;
    private javax.swing.JTextField R8C8;
    private javax.swing.JLabel Título;
    private javax.swing.JPanel bloque0;
    private javax.swing.JPanel bloque1;
    private javax.swing.JPanel bloque2;
    private javax.swing.JPanel bloque3;
    private javax.swing.JPanel bloque4;
    private javax.swing.JPanel bloque5;
    private javax.swing.JPanel bloque6;
    private javax.swing.JPanel bloque7;
    private javax.swing.JPanel bloque8;
    private javax.swing.JButton limpia;
    private javax.swing.JButton resuelve;
    // End of variables declaration//GEN-END:variables
}