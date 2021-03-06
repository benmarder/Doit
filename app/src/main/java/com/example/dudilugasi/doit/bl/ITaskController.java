package com.example.dudilugasi.doit.bl;

import com.example.dudilugasi.doit.common.TaskItem;
import java.util.List;

public interface ITaskController {
    void SetTask(String task);
    List<TaskItem> GetTasks();
    void  SetTasks(List<TaskItem> tasks);
    TaskItem GetTaskById(String id);
    void  SetTask(TaskItem task);
}
