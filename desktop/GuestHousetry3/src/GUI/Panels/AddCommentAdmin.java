/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Panels;

import GUI.Dialogs.CommentReportDialog;
import entities.Comment;
import entities.User;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author dell
 */
public class AddCommentAdmin extends javax.swing.JPanel {

    private User u;
    private Comment c;
    private JFrame parent;
    private boolean isReported;
    public AddCommentAdmin(JFrame p,User u, Comment c, boolean b) {
        initComponents();
        this.parent=parent;
        isReported=b;
        this.u=u;
        this.c=c;
        
        if (b) {
            text.setBackground(new java.awt.Color(255, 0, 51));
        }
        if(u.getPicture()!=null)
                pic.setIcon(new ImageIcon(u.getPicture().getScaledInstance(50,50, 4)));
        firstname.setText(u.getFirstName());
        lastname.setText(u.getLastName());
        text.setText(c.getComment());

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jToolBar1 = new javax.swing.JToolBar();
        pic = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        firstname = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        lastname = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        text = new javax.swing.JTextArea();

        jToolBar1.setRollover(true);

        pic.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/UserMiniImage.png"))); // NOI18N
        jToolBar1.add(pic);

        jPanel1.setMaximumSize(new java.awt.Dimension(100, 100));

        firstname.setText("name");

        lastname.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(firstname)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lastname))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(firstname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lastname)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jToolBar1.add(jPanel1);

        text.setEditable(false);
        text.setColumns(20);
        text.setRows(5);
        text.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                textMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(text);

        jToolBar1.add(jScrollPane1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 593, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_textMouseClicked
        if(isReported)
            new CommentReportDialog(parent, true, u, c).setVisible(true);  
    }//GEN-LAST:event_textMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel firstname;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JLabel lastname;
    private javax.swing.JLabel pic;
    private javax.swing.JTextArea text;
    // End of variables declaration//GEN-END:variables
}
