/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ITPM;

import static ITPM.Dashboard.Dash_UploadSpace;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import static ITPM.complexityControlStructure.CSTableOutput;

/**
 *
 * @author Chanuka
 */
public class WeightControlStructure extends javax.swing.JFrame {

    /**
     * Creates new form WeightControlStructure
     */
    public WeightControlStructure() {
        initComponents();
        setResizable(false);
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabelChange = new javax.swing.JLabel();
        jTextChange = new javax.swing.JTextField();
        jButtonChange = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 102, 102));
        setMaximumSize(new java.awt.Dimension(660, 432));
        setMinimumSize(new java.awt.Dimension(660, 432));
        setPreferredSize(new java.awt.Dimension(660, 432));

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"A conditional control structure such as an ‘if’ or ‘else-if’ condition", "2"},
                {"An iterative control structure such as a ‘for’, ‘while’, or ‘do-while’ loop", "3"},
                {"The ‘switch’ statement in a ‘switch-case’ control structure", "2"},
                {"Each ‘case’ statement in a ‘switch-case’ control structure", "1"}
            },
            new String [] {
                "Control Structure Type", "Weight"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setRowHeight(24);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(1).setMaxWidth(150);
        }

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Weights related to the control structure factor");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("Change Weight :");

        jLabelChange.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jTextChange.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N

        jButtonChange.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButtonChange.setText("Change");
        jButtonChange.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonChangeActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jButton2.setText("Start Measuring");
        jButton2.setMaximumSize(new java.awt.Dimension(147, 25));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabelChange, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextChange, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(18, 18, 18)
                                .addComponent(jButtonChange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(50, 50, 50))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(252, 252, 252))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabelChange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jTextChange, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE))
                    .addComponent(jButtonChange, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonChangeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonChangeActionPerformed
DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        int i = jTable1.getSelectedRow();
        
        if(i >= 0){
            model.setValueAt(jTextChange.getText(),i,1);
        }else{
            JOptionPane.showMessageDialog(null,"Click on a row to change");
        }          // TODO add your handling code here:
    }//GEN-LAST:event_jButtonChangeActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        int selectedRow = jTable1.getSelectedRow();
        jLabelChange.setText(model.getValueAt(selectedRow,0).toString());
        jTextChange.setText(model.getValueAt(selectedRow,1).toString());        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        complexityControlStructure cs = new complexityControlStructure();
        cs.setVisible(true);
        
        //creating objects of tables
        DefaultTableModel model_input = (DefaultTableModel)jTable1.getModel();
        DefaultTableModel model_output = (DefaultTableModel)CSTableOutput.getModel();
        Reader inputString = new StringReader(Dash_UploadSpace.getText().toString());
        
        //creating an object of buffer reader
        BufferedReader br = new BufferedReader(inputString);
       
        
        //defining variables
        String text;
        
       int count_if = 0;
       int count_elseif = 0;
       int count_for = 0;
       int count_while = 0;
       int count_switch = 0;
       int count_case = 0;
       
       int weight = 0;
       
       int countLine = 0;
       
       String  previous_complexity ;
       String previous_complexityIF = null;
       String previousTextIF = null;
       String no_of_cs;
       String previousComplex;
       String wCs;
       
       String line60IF = null;
       int lineIF = 0;
       
       int countNC = 0;
       
       int pc = 0;
       
       int nc = 1;
       
       int Ccs = 0;
       
       int Wtcs = 0;
       
       int Ccspps = 0;
       
       int  CcsSwitch = 0;
       
       int OBrackets = 0;
       int CBrackets = 0;
       
       int previousCountLine = 0;
       
       String w;
       String previous = "";
        

        try{
            
            //Reading lines
            
            while((text = br.readLine()) != null){
                
                if(text.contains("if") || text.contains("for") || text.contains("while") || text.contains("do") || text.contains("switch")){
//                    if(!text.contains("{")){
//                       model_output.setValueAt(text,countLine,1);
//                       model_output.setValueAt(countLine+1,countLine,0); 
//                       countLine++;
//                       text = br.readLine();
//                    }
                    
                    Ccspps = Integer.parseInt(model_output.getValueAt(countLine-1,5).toString());
                    previous = text;
                    OBrackets++;
                    model_output.setValueAt(text,countLine,1);
                    model_output.setValueAt(countLine+1,countLine,0);
                    
                    //get weigths from weights table
                    if(text.contains("if")){
                        Wtcs = Integer.parseInt(model_input.getValueAt(0,1).toString());
                    }else if(text.contains("for") || text.contains("while") || text.contains("do")){
                        Wtcs = Integer.parseInt(model_input.getValueAt(1,1).toString());
                    }else if(text.contains("switch")){
                        Wtcs = Integer.parseInt(model_input.getValueAt(2,1).toString());
                            
                    }
                    //Search && in if
                    String[] newString = text.split("\\s+");
                    for(String ss : newString){
                        if(ss.contains("&&")){
                            nc++;
                        }
                    }
                   //Setting values to table 
                    model_output.setValueAt(Wtcs,countLine,2);
                    model_output.setValueAt(nc,countLine,3);
                    Ccs = (Wtcs * nc) + Ccspps;
                    model_output.setValueAt(Ccs,countLine,5);
                    model_output.setValueAt(Ccspps,countLine,4);
                    CcsSwitch = Integer.parseInt(model_output.getValueAt(countLine,5).toString());
                    model_output.setValueAt(text,countLine,1);
                    model_output.setValueAt(countLine+1,countLine,0);
                    countLine++;
                    nc = 1;
                    
                   
                    
                    
                    
                    text = br.readLine();
                    //Go inside
                    while(OBrackets != CBrackets){
                        
                        //Checking nested
                        
                        //for,while,do
                        if(text.contains("for") || text.contains("while") || text.contains("do")){
                            Ccspps = Integer.parseInt(model_output.getValueAt(countLine-1,5).toString());
                            if(previous.contains("for") && text.contains("for")){
                                Ccspps = Integer.parseInt(model_output.getValueAt(countLine-1,5).toString());
                            }if(previous.contains("while") && text.contains("while")){
                                Ccspps = Integer.parseInt(model_output.getValueAt(countLine-1,5).toString());
                            }if(previous.contains("do") && text.contains("do")){
                                Ccspps = Integer.parseInt(model_output.getValueAt(countLine-1,5).toString());
                            }
                            
                            String[] string = text.split("\\s+");
                            for(String ss : string){
                            if(ss.contains("&&")){
                            nc++;
                            }
                            }
                            
                            
                            //Setting values to table
                            OBrackets++;
                            model_output.setValueAt(nc,countLine,3);
                            Wtcs = Integer.parseInt(model_input.getValueAt(1,1).toString());
                            model_output.setValueAt(Wtcs,countLine,2);
                            Ccs = (Wtcs * nc) + Ccspps;
                            model_output.setValueAt(Ccs,countLine,5);
                            model_output.setValueAt(text,countLine,1);
                            model_output.setValueAt(countLine+1,countLine,0);
                            model_output.setValueAt(Ccspps,countLine,4);
                            
                            text = br.readLine();
                            previous = text;
                            countLine++;
                            
                        }
                        //if
                        else if(text.contains("if") && !text.contains("//")){
                            if(previous.contains("if") && text.contains("if")){
                                Ccspps = Integer.parseInt(model_output.getValueAt(countLine-1,5).toString());
                            }
                            String[] string = text.split("\\s+");
                            for(String ss : string){
                            if(ss.contains("&&")){
                            nc++;
                            }
                            }
                            //Setting values to table
                            OBrackets++;
                            model_output.setValueAt(nc,countLine,3);
                            Wtcs = Integer.parseInt(model_input.getValueAt(0,1).toString());
                            model_output.setValueAt(Wtcs,countLine,2);
                            Ccs = (Wtcs * nc) + Ccspps;
                            model_output.setValueAt(Ccs,countLine,5);
                            model_output.setValueAt(text,countLine,1);
                            model_output.setValueAt(countLine+1,countLine,0);
                            model_output.setValueAt(Ccspps,countLine,4);
                            text = br.readLine();
                            previous = text;
                            countLine++;
                            
                        }
                        //else if
                        else if(text.contains("else") && !text.contains("//")){
                            
                            OBrackets++;
                            Ccspps = Integer.parseInt(model_output.getValueAt(countLine-1,5).toString());
                            model_output.setValueAt(text,countLine,1);
                            model_output.setValueAt(countLine+1,countLine,0);
                            model_output.setValueAt(Ccs,countLine,5);
                            text = br.readLine();
                            countLine++;
                            
                        }
                        //Switch
                        else if(text.contains("switch") && !text.contains("//")){
                            Ccspps = Integer.parseInt(model_output.getValueAt(countLine-1,5).toString());
                            model_output.setValueAt(text,countLine,1);
                            model_output.setValueAt(countLine+1,countLine,0);
                            model_output.setValueAt(1,countLine,3);
                            Wtcs = Integer.parseInt(model_input.getValueAt(2,1).toString());
                            model_output.setValueAt(Ccspps,countLine,4);
                            model_output.setValueAt(Wtcs,countLine,2);
                            Ccs = (Wtcs * nc) + Ccspps;
                            model_output.setValueAt(Ccs,countLine,5);
                            text = br.readLine();
                            previous = text;
                            CcsSwitch = Integer.parseInt(model_output.getValueAt(countLine,5).toString());
                            countLine++;
                            
                        }
                        //Case
                        else if(text.contains("case") && !text.contains("//")){
                            
                            Ccspps = Integer.parseInt(model_output.getValueAt(countLine-1,5).toString());
                            model_output.setValueAt(text,countLine,1);
                            model_output.setValueAt(countLine+1,countLine,0);
                            model_output.setValueAt(1,countLine,3);
                            Wtcs = Integer.parseInt(model_input.getValueAt(3,1).toString());
                            model_output.setValueAt(CcsSwitch,countLine,4);
                            model_output.setValueAt(Wtcs,countLine,2);
                            Ccs = (Wtcs * nc) + CcsSwitch;
                            model_output.setValueAt(Ccs,countLine,5);
                            text = br.readLine();
                            countLine++;
                            
                        }else if(text.contains("}")){
                            CBrackets++;
                            
                        
                            if(OBrackets == CBrackets){
                            model_output.setValueAt(text,countLine,1);
                            model_output.setValueAt(countLine+1,countLine,0);
                            Ccs = (Wtcs * nc) + Ccspps;
                            model_output.setValueAt(Ccs,countLine,5);
                            //set wtcs,NC,CCspps,Ccs
                            //text = br.readLine();
                            countLine++;
                            }else{
                                model_output.setValueAt(text,countLine,1);
                                model_output.setValueAt(countLine+1,countLine,0);
                                Ccs = (Wtcs * nc) + Ccspps;
                                model_output.setValueAt(Ccs,countLine,5);
                            
                                text = br.readLine();
                                countLine++;
                                }
                            
                            
                        }else{
                            
                            Wtcs = 0;
                            Ccs = 0;
                            Ccspps = 0;
                            nc = 1;
                            
                            
                            model_output.setValueAt(text,countLine,1);
                            model_output.setValueAt(countLine+1,countLine,0);
                            Ccs = (Wtcs * nc) + Ccspps;
                            model_output.setValueAt(Ccs,countLine,5);
                            text = br.readLine();
                            countLine++;
                        }
                        
                          Wtcs = 0;
                          Ccs = 0;
                          Ccspps = 0;
                          nc = 1;
                    }
                   
                    Wtcs = 0;
                    Ccs = 0;
                    Ccspps = 0;
                    
                }
                //printing lines which are not containing any control structure
                else{
                    model_output.setValueAt(text,countLine,1);
                    model_output.setValueAt(countLine+1,countLine,0);
                    Ccs = (Wtcs * nc) + Ccspps;
                    model_output.setValueAt(Ccs,countLine,5);
                    countLine++;
                    Wtcs = 0;
                    Ccs = 0;
                    Ccspps = 0;
                }
                
            }
 
        }catch(IOException e){
            Logger.getLogger(WeightControlStructure.class.getName()).log(Level.SEVERE, null, e);
        }
//        
//        
    }//GEN-LAST:event_jButton2ActionPerformed

//    /**
//     * @param args the command line arguments
//     */
//    public static void main(String args[]) {
//        /* Set the Nimbus look and feel */
//        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
//        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
//         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
//         */
//        try {
//            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
//                if ("Nimbus".equals(info.getName())) {
//                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
//                    break;
//                }
//            }
//        } catch (ClassNotFoundException ex) {
//            java.util.logging.Logger.getLogger(WeightControlStructure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (InstantiationException ex) {
//            java.util.logging.Logger.getLogger(WeightControlStructure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (IllegalAccessException ex) {
//            java.util.logging.Logger.getLogger(WeightControlStructure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
//            java.util.logging.Logger.getLogger(WeightControlStructure.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
//        }
//        //</editor-fold>
//        //</editor-fold>
//
//        /* Create and display the form */
//        java.awt.EventQueue.invokeLater(new Runnable() {
//            public void run() {
//                new WeightControlStructure().setVisible(true);
//            }
//        });
//    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButtonChange;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelChange;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextChange;
    // End of variables declaration//GEN-END:variables
}
