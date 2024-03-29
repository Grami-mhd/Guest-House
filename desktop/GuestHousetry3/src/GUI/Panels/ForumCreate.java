/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package GUI.Panels;

import entities.Forum;
import entities.User;
import entitiesDao.ForumDAO;

/**
 *
 * @author Mohamed
 */
public class ForumCreate extends javax.swing.JPanel {

    private User u;
    
    public ForumCreate(User u) {
        this.u=u;
        
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

        jToolBar1 = new javax.swing.JToolBar();
        jScrollPane2 = new javax.swing.JScrollPane();
        newForum = new javax.swing.JTextArea();
        createForum = new javax.swing.JButton();

        jToolBar1.setRollover(true);

        newForum.setColumns(20);
        newForum.setRows(5);
        jScrollPane2.setViewportView(newForum);

        jToolBar1.add(jScrollPane2);

        createForum.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/ForumCreate.png"))); // NOI18N
        createForum.setText("Create Forum");
        createForum.setFocusable(false);
        createForum.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        createForum.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        createForum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createForumActionPerformed(evt);
            }
        });
        jToolBar1.add(createForum);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.DEFAULT_SIZE, 832, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jToolBar1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void createForumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createForumActionPerformed
        
        new ForumDAO().add(new Forum(newForum.getText()),u.getId() );
        newForum.setText("");
        
        
    }//GEN-LAST:event_createForumActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createForum;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JToolBar jToolBar1;
    private javax.swing.JTextArea newForum;
    // End of variables declaration//GEN-END:variables
}
