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
import java.sql.Array;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Vector;
import static ITPM.complexityInheritance.jTable12;
/**
 *
 * @author Chanuka
 */
public class WeightInheritance extends javax.swing.JFrame {

    /**
     * Creates new form WeightVariable
     */
    public WeightInheritance() {
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

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"A class with no inheritance (direct or indirect)", "0"},
                {"A class inheriting (directly or indirectly) from one user-defined class", "1"},
                {"A class inheriting (directly or indirectly) from two user-defined classes ", "2"},
                {"A class inheriting (directly or indirectly) from three user-defined classes", "3"},
                {"A class inheriting (directly or indirectly) from more than three user-defined classes", "4"}
            },
            new String [] {
                "Inherited Pattern ", "Weight"
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
        jLabel1.setText("Weights related to the inheritance factor");

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
                                        .addComponent(jLabelChange, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jTextChange, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButtonChange)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(119, 119, 119))))
            .addGroup(layout.createSequentialGroup()
                .addGap(256, 256, 256)
                .addComponent(jButton2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextChange)
                    .addComponent(jButtonChange, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabelChange, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
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
        }  
        

    //DefaultTableModel model = (DefaultTableModel)jTable.getModel();
   




// TODO add your handling code here:
    }//GEN-LAST:event_jButtonChangeActionPerformed
//Indeirect Inheritance 
     public  int indeirectInheritance(String extendclass,String classname) {
		  String line = null;  
		 int indirect=0;
		
		try {  
                    Reader inputString = new StringReader(Dash_UploadSpace.getText().toString());
           
           BufferedReader breader = new BufferedReader(inputString);
			
			//reading lines
                         while ((line = breader.readLine()) != null) { 
				  		
					  	String[] words1 = line.split("\\s+");
					
					  	int di = 0 ;
					  	// for (int x =0; x < words1.length ; x++) {
					  		// ArrayList<String> di =  directInheritance(classname);
                                                        //check class  and  add values
					  		 if(directInheritance(classname)==0) {
					  			 indirect = 0;
					  		 }
					  		 if(directInheritance(classname)>=1) {
					  			 
					  			 if(directInheritance(extendclass)==0) {
					  				 indirect=0;
					  			 }else {
					  				 indirect=1;
					  			 }
					  		
					  		 }
					  			 
					  			 
					  			 
					  						 
					  				//1	 }
					  			 
					  		// }
					  		 
					  		 
							//1 if("class".equals(words1[x])) {
								// System.out.println(word[x+1]);
						//1	  if(words1.length > 4) {
								 // System.out.println("have 4 words");
							//1	  if(classname.equals(words1[x+3])) {
							//1		  di++;
							//		  if ([directInheritance == word x+1]==1 ){ 
									  	// indi++;
									  // if (    )
									  //
									  //
									  //} 
									  // else  indi = 0
								  //}
							 //1 } 
							//1 }
						  
						 //1 }
					  	
					  	
			  }
	
		

		}catch (Exception e) {
			e.printStackTrace();
		}
		return  indirect;
	  }
    
    //find Indirect Inheritance 
     public  int directInheritance(String classname) {
           
         ArrayList<String> al = new ArrayList<String>();
		  int di=0;int indirect =0;
		  try {
		  Reader inputString = new StringReader(Dash_UploadSpace.getText().toString());
           
           BufferedReader breader11 = new BufferedReader(inputString);
			 // File file = new File("D:\\lectures @SLIIT\\3rd year\\ds\\2020\\DaysPerMonth.java");  
			  //BufferedReader breader11 = new BufferedReader(new FileReader(file)); 
			  String line1; String IClass;
		  //read lines
			  while ((line1 = breader11.readLine()) != null) {
				  String[] word = line1.split("\\s+");
				  for (int x =0; x < word.length ; x++) {
					  if("class".equals(word[x])) {
						  if(word.length > 4) {
							  if(classname.equals(word[x+1])) {
								  di++;
                                                                  
							  }
						  }
					  }
				  } 
			  } breader11.close();
		  }catch (Exception e) {
				  e.printStackTrace();
			  }
		
				  
		  return di;
	  }
     //get values for array
   public class Inheritance {
       public int rowNo,direct,indirect,total,CI;
       public String cName;
     public Inheritance(String cName,int direct ,int indirect ,int total,int CI){
        this.cName = cName;
          this.direct = direct;
            this.indirect = indirect;
              this.total = total;
                this.CI = CI;
                
                
        
    }
   }
    
    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
DefaultTableModel model = (DefaultTableModel)jTable1.getModel();
        int selectedRow = jTable1.getSelectedRow();
        jLabelChange.setText(model.getValueAt(selectedRow,0).toString());
        jTextChange.setText(model.getValueAt(selectedRow,1).toString());        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       complexityInheritance cs = new complexityInheritance();
        cs.setVisible(true);
        // TODO add your handling code here:
      //  CIcheck(); 
        ArrayList<Inheritance> ci =CIcheck();
        DefaultTableModel dtable = (DefaultTableModel)jTable12.getModel();
         DefaultTableModel dtable1 = (DefaultTableModel)jTable1.getModel();
   // Object[] row = { "a", "as", "as", "ad" };
   // dtable.addRow(row);
   //dtable.setValueAt("assa", 2, 2);
    int count=0 ;int Ci =0;int totci=0;
    for(Inheritance str : ci ){
        int tot= str.direct+str.indirect; ; 
       
       
        //taking values from weight table
        if (tot ==0){
           Ci =  Integer.parseInt(dtable1.getValueAt(0, 1).toString());
       }
        else if(tot==1){
           // int a1 =Integer.parseInt(dtable1.getValueAt(1, 1).toString());
            Ci =  Integer.parseInt(dtable1.getValueAt(1, 1).toString());
        }else if (tot==2){
            Ci =  Integer.parseInt(dtable1.getValueAt(2, 1).toString());
        }else if (tot == 3){
            Ci = Integer.parseInt(dtable1.getValueAt(3, 1).toString());
        }
        else if(tot<=4){
           Ci = Integer.parseInt(dtable1.getValueAt(4, 1).toString());
       }
       
       totci =   totci +Ci ;
            System.out.println("cal "+str.cName +" d-"+str.direct+" i-"+str.indirect+" t-"+tot+" "+str.total);
          //set values to the table
            dtable.setValueAt(count+1, count, 0);
           dtable.setValueAt(str.cName, count, 1);
            dtable.setValueAt(str.direct, count, 2);
             dtable.setValueAt(str.indirect, count, 3);
              dtable.setValueAt(tot, count, 4);
              dtable.setValueAt(Ci, count, 5);
              
           count++;
        }
    dtable.setValueAt("Total Ci ", count+1, 1);
    dtable.setValueAt(totci, count+1, 5);
       
    
    
    
    
    }//GEN-LAST:event_jButton2ActionPerformed
//CIcheck array
    
    public  ArrayList<Inheritance> CIcheck(){
         int Ndi =0;
          ArrayList <Inheritance> in = new ArrayList<Inheritance>(); 
          ArrayList <Integer> inde = new ArrayList<Integer>(); 
         //  Array newa = new Array() {};
                  int NIndi =0;
                  int Ci=0;int lineno=0; 
                  int totCi = 0;int[] num= new int[5];
         try {      
    Reader inputString = new StringReader(Dash_UploadSpace.getText().toString());
           
           BufferedReader breader = new BufferedReader(inputString);
           
           	
	 //// File file = new File("D:\\lectures @SLIIT\\3rd year\\ds\\2020\\DaysPerMonth.java");  
	 // BufferedReader breader = new BufferedReader(new FileReader(file)); 
	  String line1; 
          
          //Find classes
	  while ((line1 = breader.readLine()) != null) {
		
		
		  String cname;
		  String[] words = line1.split("\\s+");
		  String[] words1 = line1.split("\\s+");
		lineno++;
		  String superclass;
		  for (int ii = 0; ii < words.length; ii++) {
			 //System.out.println(words[i]);
			 if( "class".equals(words[ii])) {
				cname = words[ii+1];
				 System.out.println( words[ii+1].toString()+" di ="+directInheritance(words[ii+1].toString()));
				Ndi = directInheritance(words[ii+1]);
				 superclass = words[ii+1].toString();
				 //System.out.println("1      "+superclass);
				 if(words.length>4) {
					 if ("extends".equals(words[ii+2])) {
						NIndi = indeirectInheritance(words[ii+3],words[ii+1]);
						System.out.println(words[ii+1] +" indi = "+ indeirectInheritance(words[ii+3],words[ii+1]));
					 }
				 }else {
                                     NIndi=0;
                                     System.out.println(" Indirect"+NIndi);
                                 }
                                         Ci =   NIndi +   Ndi;
                                         System.out.println("Ci ="+Ci);
                                         totCi = Ci + totCi;
				 //System.out.println("check "+superclass+" "+checker(superclass));
				  
        inde.add(Ndi);
        inde.add(NIndi);
        inde.add(Ci);
        inde.add(Ndi);
        inde.add(totCi);
        in.add(new Inheritance(cname,Ndi,NIndi,lineno,Ci));
			 }
		  }
		           
		  } System.out.println("Tot Ci ="+totCi);
	 
	  breader.close();
		}catch (Exception e) {
		  e.printStackTrace();
	  }
     
 
         
      
        
        return in;
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
            java.util.logging.Logger.getLogger(WeightInheritance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(WeightInheritance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(WeightInheritance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(WeightInheritance.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
       

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new WeightInheritance().setVisible(true);
            }
        });
    }

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
