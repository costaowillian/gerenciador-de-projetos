package com.mycompany.todoapp;

import controler.ProjectController;
import controler.TaskController;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.Date;
import java.util.List;
import util.ConnectionFactory;
import model.Project;
import model.Task;
/**
 *
 * @author Willian Costa
 */
public class TodoApp {
    
    public static void main (String[] args) throws SQLException {
        //Connection c = ConnectionFactory.getConnection();
        
        //ConnectionFactory.closeConnection(c);
        
        //Controller de projetos (funciona?)
        ProjectController projectController = new ProjectController();
        Project project = new Project();
        //project.setName("Projeto Teste 2");
        //project.setDescription("Descriçao");
        //projectController.save(project);
        
        //project.setId(3);
        //project.setName("novo nome do projeto");
        //projectController.update(project);
        
        //List<Project> projects = projectController.getAll();
        //System.out.println("Total de projetos " + projects.size());  
        
        //projectController.removeById(2);
        
        TaskController taskController = new TaskController();
        Task task = new Task();
        //task.setIdProject(3);
        //task.setName("Criar as telas da aplicação");
        //task.setDescription("Devem ser criadas telas para os cadastros");
        //task.setNotes("sem notas");
        //task.setIsCompleted(false);
        //task.setDeadline(new Date());
        //taskController.save(task);
        
        //task.setIdProject(3);
        //task.setId(5);
        //task.setName("Alterar telas de aplicação");
        //task.setDeadline(new Date());
        //taskController.update(task);
        
        //List<Task> tasks = taskController.getAll(3);
        //System.out.println("Total de tarefas: "  + tasks.size());  
    } 
}
