package btu.edu.ge.demo.controller;

import btu.edu.ge.demo.dto.*;
import btu.edu.ge.demo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/task")
public class TaskController {

    @Autowired
    TaskService taskService;

    @PostMapping("getTasks")
    public GetTaskOutput getTasks(@RequestBody GetTaskInput getTaskInput) {
        return taskService.getTask(getTaskInput);
    }

    @PostMapping("addTASK")
    public AddTaskOutput addTask(@RequestBody AddTaskInput addTaskInput) {
        return taskService.addTask(addTaskInput);
    }

    @DeleteMapping("delete/{id}")
    public void deletePost(@PathVariable DeleteTaskInput id) {
        taskService.deleteTask(id);
    }
}
