/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package forms;

import entity.Car;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;

/**
 *
 * @author user
 */
public class MainForm extends javax.swing.JFrame {

    /**
     * Creates new form MainForm
     */
    public MainForm() {
        initComponents();

    }

    
     private List<Car> getProducts(){
        List<Car>productList=new ArrayList();
        Car car=new Car();
        car.setCarName("Ferrari_488GTB");
        car.setCarPrice(256550);
        car.setCarDescription("With a twin-turbo 3.9-liter V-8 located just behind the "
                + "driver’s seat, the 488GTB generates a sonorous wail and ferocious acceleration"
                + " all the way to 8000 rpm, where it makes 661 hp.");
        car.setPhotoPath("/images/Ferrari_488GTB.jpg");
        productList.add(car);
        
        car=new Car();
        car.setCarName("Spyker_C8");
        car.setCarPrice(350000);
        car.setCarDescription("You’ll probably never see one on the road, yet "
                + "the C8 Preliator still fires the imaginations of hopeful enthusiasts everywhere.");
        car.setPhotoPath("/images/Spyker_C8.jpg");
        productList.add(car);
        
        car=new Car();
        car.setCarName("Aston_Martin_Vanquish");
        car.setCarPrice(290475);
        car.setCarDescription("Aston Martin calls the Vanquish a “super grand "
                + "touring” machine, not a super sports car, but it’s so beautiful "
                + "that we don’t care what Aston calls it.");
        car.setPhotoPath("/images/Aston_Martin Vanquish.jpg");
        productList.add(car);
        
        car=new Car();
        car.setCarName("McLaren_720S");
        car.setCarPrice(288845);
        car.setCarDescription("McLaren’s know-how with lightweight, aerodynamic, "
                + "ferocious supercars is undeniable, and the 720S is proof.");
        car.setPhotoPath("/images/McLaren_720S.jpg");
        productList.add(car);
        
        car=new Car();
        car.setCarName("Bugatti_Chiron");
        car.setCarPrice(2998000);
        car.setCarDescription("Leaving the 99.99 percent in its dust, the Chiron is a "
                + "1500-hp smackdown of every hypercar ever produced.");
        car.setPhotoPath("/images/Bugatti_Chiron.jpg");
        productList.add(car);
        
        car=new Car();
        car.setCarName("Porsche_911_GT2_R");
        car.setCarPrice(294250);
        car.setCarDescription("The brutal GT2 RS is the chainsaw of the 911 lineup"
                + "compared with the scalpel-like GT3.");
        car.setPhotoPath("/images/Porsche_911_GT2_R.jpg");
        productList.add(car);
        
        car=new Car();
        car.setCarName("Lamborghini_Aventador ");
        car.setCarPrice(494195);
        car.setCarDescription("Brutally powerful and obscenely flamboyant, "
                + "the Aventador is unburdened by reality.");
        car.setPhotoPath("/images/Lamborghini_Aventador.jpg");
        productList.add(car);
        
        car=new Car();
        car.setCarName("Chevrolet_Corvette");
        car.setCarPrice(56445);
        car.setCarDescription("The mighty Corvette truly competes with the world’s "
                + "greatest sports cars, no excuses required.");
        car.setPhotoPath("/images/Chevrolet_Corvette.jpg");
        productList.add(car);
        
        car=new Car();
        car.setCarName("Audi_R8 ");
        car.setCarPrice(166150);
        car.setCarDescription("Audi’s luscious R8 is beautiful to behold,"
                + " easy to live with, and simply marvelous to drive—everything you’d want in a sports car.");
        car.setPhotoPath("/images/Audi_R8.jpg");
        productList.add(car);
        
        car=new Car();
        car.setCarName("Koenigsegg_Regera ");
        car.setCarPrice(1900000);
        car.setCarDescription("In Swedish, “Regera” means “to reign,” "
                + "and with 1500+ hp and a price of around $1.9 million, "
                + "the Regera is truly a member of hypercar royalty.");
        car.setPhotoPath("/images/Koenigsegg_Regera.jpg");
        productList.add(car);
        
        car=new Car();
        car.setCarName("Mercedes-AMG_GT_C");
        car.setCarPrice(145995);
        car.setCarDescription("Sporting an adaptive adjustable suspension, "
                + "active aerodynamics, and trick rear-axle steering, the track-focused variants of the GT are mesmerizing and marvelous machines.");
        car.setPhotoPath("/images/Mercedes-AMG_GT_C.jpg");
        productList.add(car);
 
        car=new Car();
        car.setCarName("Acura_NSX");
       
        car.setCarPrice(156940);
        car.setCarDescription("If you’ve been dreaming of the next NSX, it’s "
                + "time to wake up: It’s here in the form of a highly technical and utterly thrilling supercar.");
        car.setPhotoPath("/images/Acura_NSX.jpg");
        productList.add(car);
        
        car=new Car();
        car.setCarName("Maserati_GranTurismo");
        car.setCarPrice(134625);
        car.setCarDescription("Maserati’s GranTurismo offers something "
                + "extraordinary in a high-performance, six-figure coupe or convertible, one that embodies all that is compelling and irresistible about Italian cars.");
        car.setPhotoPath("/images/Maserati_GranTurismo.jpg");
        productList.add(car);

        return productList;
    }
     
     
      void defaultValues()
    {
         DefaultListModel fListModel=new DefaultListModel();
        for(int i=0; i < getProducts().size();i++){
            fListModel.addElement(getProducts().get(i).getCarName());
        }
        productLister.setModel(fListModel);
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        productLister = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        initialPrice = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        finalPrice = new javax.swing.JTextField();
        quantitySpinner = new javax.swing.JSpinner();
        jScrollPane2 = new javax.swing.JScrollPane();
        productDescription = new javax.swing.JTextArea();
        jButton1 = new javax.swing.JButton();
        carPhotoLabel = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        productLister.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                productListerMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(productLister);

        jLabel1.setText("Car Photo");

        jLabel2.setText("Unit Cost:");

        initialPrice.setEditable(false);

        jLabel3.setText("Quantity:");

        jLabel4.setText("Total Cost:");

        finalPrice.setEditable(false);

        quantitySpinner.setModel(new javax.swing.SpinnerNumberModel(1, 1, 10, 1));

        productDescription.setColumns(20);
        productDescription.setLineWrap(true);
        productDescription.setRows(5);
        jScrollPane2.setViewportView(productDescription);

        jButton1.setText("Calculate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        jMenu2.setText("Inventory");

        jMenu3.setText("Load inventory");
        jMenu3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jMenu3MousePressed(evt);
            }
        });
        jMenu3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenu3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(finalPrice))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(quantitySpinner))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(initialPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jButton1)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(60, 60, 60)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(carPhotoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(254, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(carPhotoLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 195, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(initialPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(finalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(quantitySpinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(jButton1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
     double price;
     
    private void productListerMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_productListerMousePressed
        // TODO add your handling code here:
          String productName=productLister.getSelectedValue();
        for(int i=0; i<getProducts().size();i++){
            if(getProducts().get(i).getCarName().equals(productName)){
                price=getProducts().get(i).getCarPrice();
                String prodDescript=getProducts().get(i).getCarDescription();
                
                Double doubleInstance = new Double(price);      
                String doubleAsString = doubleInstance.toString();            
                 
               String path=getProducts().get(i).getPhotoPath();
               carPhotoLabel.setIcon(new ImageIcon(getClass().getResource(path)));
                
               DecimalFormat dc = new DecimalFormat("0.00");
                 String formattedText = "$"+dc.format(price);
                initialPrice.setText(formattedText);
                productDescription.setText(prodDescript);
            }
        }
    }//GEN-LAST:event_productListerMousePressed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
          double finalCost;
               Integer quantity = (Integer) quantitySpinner.getValue();
               finalCost=price*quantity;   
                Double doubleInstance = new Double(finalCost);      
                String doubleAsString = doubleInstance.toString();
                DecimalFormat dc = new DecimalFormat("0.00");
               String formattedText = "$"+dc.format(finalCost);
              finalPrice.setText(formattedText); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jMenu3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu3ActionPerformed
        // TODO add your handling code here:
     
    }//GEN-LAST:event_jMenu3ActionPerformed

    private void jMenu3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu3MousePressed
        // TODO add your handling code here:
           defaultValues();
    }//GEN-LAST:event_jMenu3MousePressed

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
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel carPhotoLabel;
    private javax.swing.JTextField finalPrice;
    private javax.swing.JTextField initialPrice;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextArea productDescription;
    private javax.swing.JList<String> productLister;
    private javax.swing.JSpinner quantitySpinner;
    // End of variables declaration//GEN-END:variables
}
