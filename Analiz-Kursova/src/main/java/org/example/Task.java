package org.example;

import java.util.List;

public class Task {

    int ID;
    String Name;
    String Description;
    List<Task> SubTasks;
    User Asignee;
    enum Statuses {NEW,InProgress,Done,Rejected};
    Statuses currentStatus = Statuses.NEW;
    String StatusMessage;
    boolean isComplete = false;
    public Task(String Name,String Description){
        this.Name = Name;
        this.Description = Description;
    }

    public void AddSubtask(Task task){
        SubTasks.add(task);
    }
    public void RemoveSubtask(Task task){
        SubTasks.remove(task);
    }

    public void ChangeTaskState(int state,String StatusMessage){
        if(isComplete)return;
        currentStatus = Statuses.values()[state];
        if(state == 2){
            isComplete=true;
        }
        this.StatusMessage = StatusMessage;
    }

    public void AssignTo(User user){
        Asignee = user;
    }
}
