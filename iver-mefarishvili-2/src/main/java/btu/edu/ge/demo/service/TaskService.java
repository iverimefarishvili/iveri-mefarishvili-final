package btu.edu.ge.demo.service;

import btu.edu.ge.demo.dto.*;

public interface TaskService {
    // taskis წამოღება
    GetTaskOutput getTask(GetTaskInput getTaskInput);

    // taskis დამატება
    AddTaskOutput addTask(AddTaskInput addTaskInput);

    // taskis წაშლა
    DeleteTaskOutput deleteTask(DeleteTaskInput deleteTaskInput);
}
