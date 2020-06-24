package btu.edu.ge.demo.service.Impl;

import btu.edu.ge.demo.dto.*;
import btu.edu.ge.demo.model.Task;
import btu.edu.ge.demo.repository.TaskRepository;
import btu.edu.ge.demo.service.TaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TaskServiceImpl implements TaskService {

    @Autowired
    TaskRepository taskRepository;

    @Override
    public GetTaskOutput getTask(GetTaskInput getTaskInput) {
        List<TaskDTO> taskDTOS = new ArrayList<>();
        for(Task task : taskRepository.findAll()) {
            TaskDTO taskDTO = new TaskDTO();
            taskDTO.setDescription(task.getDescription());
            taskDTO.setEndDate(task.getEndDate());
            taskDTO.setStartDate(task.getStartDate());
            taskDTO.setTitle(task.getTitle());

        }
        GetTaskOutput getTaskOutput = new GetTaskOutput();
        getTaskOutput.setTaskDTOS(taskDTOS);
        return getTaskOutput;
    }

    @Override
    public AddTaskOutput addTask(AddTaskInput addTaskInput) {
        Task task = new Task();
        task.setDescription(task.getDescription());
        task.setEndDate(task.getEndDate());
        task.setStartDate(task.getStartDate());
        task.setTitle(task.getTitle());
        taskRepository.save(task);

        AddTaskOutput addTaskOutput = new AddTaskOutput();
        addTaskOutput.setMsg("ტასკი წარმატებით დაემატა");
        return addTaskOutput;
    }

    @Override
    public DeleteTaskOutput deleteTask(DeleteTaskInput deleteTaskInput) {
        Task task = taskRepository.getOne(deleteTaskInput.getTaskId());
        taskRepository.delete(task);

        DeleteTaskOutput deleteTaskOutput = new DeleteTaskOutput();
        deleteTaskOutput.setMsg("ტასკი წარმატებით წაიშალა");
        return deleteTaskOutput;
    }
}
