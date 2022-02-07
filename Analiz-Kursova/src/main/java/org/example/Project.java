package org.example;

import java.util.List;

public class Project {
    int ID;
    String Name;
    String Description;
    int[] Members = new int[30];
    int[] Subprojects = new int[30];
    int totalMembers = 0;
    int totalSubProjects = 0;

    List<Task> Tasks;
    List<User> admin;
    List<User> programmer;

    public Project(String Name,String description,int ID){
        this.Name = Name;
        this.Description = description;
        this.ID = ID;

    }

    public void AddMember(int ID){
        if(totalMembers >=29){return;}
        Members[totalMembers] = ID;
        totalMembers++;
    }

    public void RemoveMember(int ID){
        for(int i =0 ;i<totalMembers;i++){
            if(Members[i] == ID){
                Members[i] = 0;
                break;
            }
        }

        totalSubProjects--;

    }

    public void AddSubProject(int ID) {
        if(totalSubProjects>=29){
            return;
        }
        Subprojects[totalSubProjects]=ID;
        totalSubProjects++;
    }

    public void RemoveSubProject(int ID){
        for(int i =0;i<totalSubProjects;i++){
            if(Subprojects[i]==ID){
                Subprojects[i]=0;
                break;
            }
        }
        totalSubProjects--;
    }

    public void AddTask(String Name,String Description){
        Task newTask = new Task(Name,Description);
        Tasks.add(newTask);
    }

    public Task[] ReturnAllTasks(){
        Task[] allTasks = (Task[]) Tasks.toArray();
        return allTasks;
    }


    public void addAdmin(User user){
        admin.add(user);
    }

    public void addProgrammer(User user){
        programmer.add(user);
    }

    public void removeAdmin(User user){
        admin.remove(user);
    }

    public void removeProgrammer(User user){
        programmer.remove(user);
    }




}
