package org.example;

import java.util.List;

public class User {
    int ID;
    String Name;
    List<Project> Projects ;

    public User(String Name){
        this.Name = Name;
    }

    public void UpdateUsername(String Name){
        this.Name = Name;
    }

    public void AddToProject(Project project){
        Projects.add(project);
    }

    public void RemoveFromProject(Project project){
        Projects.remove(project);
    }

}
