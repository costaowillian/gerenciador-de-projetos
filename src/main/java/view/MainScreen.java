package view;

import controler.ProjectControler;
import controler.TaskControler;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.List;
import javax.swing.DefaultListModel;
import model.Project;
import model.Task;
import util.ButtonColumnCellRenderer;
import util.DeadlineColumnCellRenderer;
import util.TaskTableModel;

/**
 *
 * @author Willian Costa
 */
public final class MainScreen extends javax.swing.JFrame {
    
    /**
     * Creates new form mainScreen
     */
    
    ProjectControler projectControler;
    TaskControler taskControler;
    
    DefaultListModel projectsModel;
    TaskTableModel tasksModel;
    
    
    public MainScreen() {
        initComponents();
        initDataController();
        initComponentsModel();
        decorateTableTasks();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTableTasks = new javax.swing.JTable();
        boxTop = new javax.swing.JPanel();
        logoTodoApp = new javax.swing.JLabel();
        subTittleLogo = new javax.swing.JLabel();
        midBoxLeft = new javax.swing.JPanel();
        projectLabel = new javax.swing.JLabel();
        addProjectButton = new javax.swing.JButton();
        midBoxRight = new javax.swing.JPanel();
        taskLabel = new javax.swing.JLabel();
        addTaskButton = new javax.swing.JButton();
        projectBox = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        projectsList = new javax.swing.JList<>();
        TaskBox = new javax.swing.JPanel();
        defaultBox = new javax.swing.JPanel();
        iconEnpty = new javax.swing.JLabel();
        noTasks = new javax.swing.JLabel();
        textDefault = new javax.swing.JLabel();

        jTableTasks.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTableTasks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "Descri????o", "Prazo", "Tarefa Conclu??da"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Boolean.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTableTasks.setGridColor(new java.awt.Color(255, 255, 255));
        jTableTasks.setRowHeight(40);
        jTableTasks.setSelectionBackground(new java.awt.Color(0, 102, 102));
        jTableTasks.setSelectionForeground(new java.awt.Color(255, 255, 255));
        jTableTasks.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTableTasks.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTableTasksMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTableTasks);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 800));

        boxTop.setBackground(new java.awt.Color(0, 102, 102));
        boxTop.setToolTipText("");
        boxTop.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        logoTodoApp.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        logoTodoApp.setForeground(new java.awt.Color(255, 255, 255));
        logoTodoApp.setIcon(new javax.swing.ImageIcon("D:\\Workspace\\Capgemini\\TodoApp\\src\\main\\resources\\check.png")); // NOI18N
        logoTodoApp.setText(" Todo App");
        logoTodoApp.setToolTipText("");

        subTittleLogo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        subTittleLogo.setForeground(new java.awt.Color(255, 255, 255));
        subTittleLogo.setText("Anote tudo, n??o esque??a de nada!");

        javax.swing.GroupLayout boxTopLayout = new javax.swing.GroupLayout(boxTop);
        boxTop.setLayout(boxTopLayout);
        boxTopLayout.setHorizontalGroup(
            boxTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boxTopLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(boxTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(logoTodoApp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(subTittleLogo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        boxTopLayout.setVerticalGroup(
            boxTopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(boxTopLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(logoTodoApp)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(subTittleLogo)
                .addContainerGap(32, Short.MAX_VALUE))
        );

        midBoxLeft.setBackground(new java.awt.Color(255, 255, 254));

        projectLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        projectLabel.setForeground(new java.awt.Color(0, 102, 102));
        projectLabel.setText("Projetos");

        addProjectButton.setIcon(new javax.swing.ImageIcon("D:\\Workspace\\Capgemini\\TodoApp\\src\\main\\resources\\add.png")); // NOI18N
        addProjectButton.setBorder(null);
        addProjectButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addProjectButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout midBoxLeftLayout = new javax.swing.GroupLayout(midBoxLeft);
        midBoxLeft.setLayout(midBoxLeftLayout);
        midBoxLeftLayout.setHorizontalGroup(
            midBoxLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(midBoxLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(projectLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(addProjectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        midBoxLeftLayout.setVerticalGroup(
            midBoxLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(midBoxLeftLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(midBoxLeftLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(midBoxLeftLayout.createSequentialGroup()
                        .addComponent(addProjectButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(projectLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        midBoxRight.setBackground(new java.awt.Color(255, 255, 254));

        taskLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        taskLabel.setForeground(new java.awt.Color(0, 102, 102));
        taskLabel.setText("Tarefas");
        taskLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        addTaskButton.setIcon(new javax.swing.ImageIcon("D:\\Workspace\\Capgemini\\TodoApp\\src\\main\\resources\\add.png")); // NOI18N
        addTaskButton.setBorder(null);
        addTaskButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addTaskButtonMouseClicked(evt);
            }
        });
        addTaskButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addTaskButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout midBoxRightLayout = new javax.swing.GroupLayout(midBoxRight);
        midBoxRight.setLayout(midBoxRightLayout);
        midBoxRightLayout.setHorizontalGroup(
            midBoxRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(midBoxRightLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(taskLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(addTaskButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        midBoxRightLayout.setVerticalGroup(
            midBoxRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(midBoxRightLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(midBoxRightLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(taskLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(addTaskButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        projectBox.setBackground(new java.awt.Color(255, 255, 255));

        projectsList.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        projectsList.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        projectsList.setFixedCellHeight(30);
        projectsList.setSelectionBackground(new java.awt.Color(0, 153, 153));
        projectsList.setSelectionForeground(new java.awt.Color(255, 255, 255));
        projectsList.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                projectsListMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(projectsList);

        javax.swing.GroupLayout projectBoxLayout = new javax.swing.GroupLayout(projectBox);
        projectBox.setLayout(projectBoxLayout);
        projectBoxLayout.setHorizontalGroup(
            projectBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(projectBoxLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        projectBoxLayout.setVerticalGroup(
            projectBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(projectBoxLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        TaskBox.setBackground(new java.awt.Color(255, 255, 255));
        TaskBox.setLayout(new java.awt.BorderLayout());

        defaultBox.setBackground(new java.awt.Color(255, 255, 255));

        iconEnpty.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        iconEnpty.setIcon(new javax.swing.ImageIcon("D:\\Workspace\\Capgemini\\TodoApp\\src\\main\\resources\\lists.png")); // NOI18N

        noTasks.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        noTasks.setForeground(new java.awt.Color(0, 102, 102));
        noTasks.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        noTasks.setText("Nenhuma tarefa por aqui! :)");

        textDefault.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        textDefault.setText("Clique no bot??o + para adicionar uma nova tarefa!");

        javax.swing.GroupLayout defaultBoxLayout = new javax.swing.GroupLayout(defaultBox);
        defaultBox.setLayout(defaultBoxLayout);
        defaultBoxLayout.setHorizontalGroup(
            defaultBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(defaultBoxLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(defaultBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(iconEnpty, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(noTasks, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(textDefault, javax.swing.GroupLayout.DEFAULT_SIZE, 829, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        defaultBoxLayout.setVerticalGroup(
            defaultBoxLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, defaultBoxLayout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(iconEnpty)
                .addGap(18, 18, 18)
                .addComponent(noTasks)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(textDefault)
                .addGap(147, 147, 147))
        );

        TaskBox.add(defaultBox, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(boxTop, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(midBoxLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(projectBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(midBoxRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TaskBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(boxTop, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(midBoxRight, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(midBoxLeft, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(projectBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(TaskBox, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addProjectButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addProjectButtonMouseClicked
        // TODO add your handling code here:
        ProjectDialogScreen projectDialogScreen = new ProjectDialogScreen(this, rootPaneCheckingEnabled);
        projectDialogScreen.setVisible(true);
        
        projectDialogScreen.addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                loadProjects();
            }
        });
    }//GEN-LAST:event_addProjectButtonMouseClicked

    private void addTaskButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addTaskButtonMouseClicked
        // TODO add your handling code here:
        TaskDialogScreen taskDialogScreen = new TaskDialogScreen(this, rootPaneCheckingEnabled);
        
        int projectIndex = projectsList.getSelectedIndex();
        Project project = (Project) projectsModel.get(projectIndex);
        taskDialogScreen.setProject(project);
        
        taskDialogScreen.setVisible(true);
        
        taskDialogScreen.addWindowListener(new WindowAdapter() {
            public void windowClosed(WindowEvent e) {
                int porjectIndex = projectsList.getSelectedIndex();
                Project project = (Project) projectsModel.get(porjectIndex);
                loadTasks(project.getId());
            }
        });
    }//GEN-LAST:event_addTaskButtonMouseClicked

    private void jTableTasksMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTableTasksMouseClicked
        // TODO add your handling code here:
        int rowIndex = jTableTasks.rowAtPoint(evt.getPoint());
        int columnIndex = jTableTasks.columnAtPoint(evt.getPoint());
        Task task = tasksModel.getTasks().get(rowIndex);
        
        int projectIndex = projectsList.getSelectedIndex();
        Project project = (Project) projectsModel.get(projectIndex);
        switch(columnIndex){
            case 3:
                taskControler.update(task);
                break;
            case 4:
                TaskDialogScreen taskDialogScreen = new TaskDialogScreen(this, rootPaneCheckingEnabled, task);
                taskDialogScreen.setProject(project);
                taskDialogScreen.setVisible(true);
                
                taskDialogScreen.addWindowListener(new WindowAdapter() {
                    public void windowClosed(WindowEvent e){
                        loadTasks(project.getId());
                    }
                }); 
                break;
            case 5:
                taskControler.removeById(task.getId());
                tasksModel.getTasks().remove(task);
                
                loadTasks(project.getId());
                break;
            default:{
            
            }
        }
    }//GEN-LAST:event_jTableTasksMouseClicked

    private void projectsListMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_projectsListMouseClicked
        // TODO add your handling code here:
        int projectIndex = projectsList.getSelectedIndex();
        Project project = (Project) projectsModel.get(projectIndex);
        loadTasks(project.getId());
    }//GEN-LAST:event_projectsListMouseClicked

    private void addTaskButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addTaskButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_addTaskButtonActionPerformed

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
                if ("Java swing".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel TaskBox;
    private javax.swing.JButton addProjectButton;
    private javax.swing.JButton addTaskButton;
    private javax.swing.JPanel boxTop;
    private javax.swing.JPanel defaultBox;
    private javax.swing.JLabel iconEnpty;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableTasks;
    private javax.swing.JLabel logoTodoApp;
    private javax.swing.JPanel midBoxLeft;
    private javax.swing.JPanel midBoxRight;
    private javax.swing.JLabel noTasks;
    private javax.swing.JPanel projectBox;
    private javax.swing.JLabel projectLabel;
    private javax.swing.JList<String> projectsList;
    private javax.swing.JLabel subTittleLogo;
    private javax.swing.JLabel taskLabel;
    private javax.swing.JLabel textDefault;
    // End of variables declaration//GEN-END:variables
    
    public void decorateTableTasks() {
        //Customizando o header da table de tarefas
        jTableTasks.getTableHeader().setFont(new Font("Segoe UI", 
                Font.BOLD, 14));
        jTableTasks.getTableHeader().setBackground(new Color(0,153,153));
        jTableTasks.getTableHeader().setForeground(new Color(255,255,255));
        jTableTasks.getColumnModel().getColumn(2).setCellRenderer(new DeadlineColumnCellRenderer());
        
        jTableTasks.getColumnModel().getColumn(4).setCellRenderer(new ButtonColumnCellRenderer("edit"));
        jTableTasks.getColumnModel().getColumn(5).setCellRenderer(new ButtonColumnCellRenderer("delete"));

    }
    
    public void initDataController() {
       projectControler = new ProjectControler();
       taskControler = new TaskControler();
    }
    
    public void initComponentsModel() {
        projectsModel = new DefaultListModel();
        loadProjects();
        
        tasksModel = new TaskTableModel();
        jTableTasks.setModel(tasksModel);
        
        if (!projectsModel.isEmpty()) {
            projectsList.setSelectedIndex(0);
            int projectIndex = projectsList.getSelectedIndex();
            Project project = (Project) projectsModel.get(projectIndex);
            loadTasks(project.getId());
        }
    }
    
    public void loadTasks(int idProject) {
        List<Task> tasks = taskControler.getAll(idProject);
        tasksModel.setTasks(tasks);
        showJTableTasks(!tasks.isEmpty());
    }
    
    public void showJTableTasks(boolean hasTasks) {
        if(hasTasks) {
            if(defaultBox.isVisible()) {
                defaultBox.setVisible(false);
                TaskBox.remove(defaultBox);    
            }
            
            TaskBox.add(jScrollPane2);
            jScrollPane2.setVisible(true);
            jScrollPane2.setSize(TaskBox.getWidth(), TaskBox.getHeight());
        } else {
            if (jScrollPane2.isVisible()) {
                jScrollPane2.setVisible(false);
                TaskBox.remove(jScrollPane2);
            }
            TaskBox.add(defaultBox);
            defaultBox.setVisible(true);
            defaultBox.setSize(TaskBox.getWidth(), TaskBox.getHeight());   
        }
    }
    
    public void loadProjects() {
        List<Project> projects = projectControler.getAll();
        
        projectsModel.clear();
        
        for (int i = 0; i < projects.size(); i++) {
            Project project = projects.get(i);
            projectsModel.addElement(project);
        }
        //carrega itens na tela
        projectsList.setModel(projectsModel);
    }
}
