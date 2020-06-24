package btu.edu.ge.demo.dto;

import java.util.List;

public class GetTaskOutput {
    List<TaskDTO> taskDTOS;

    public List<TaskDTO> getTaskDTOS() {
        return taskDTOS;
    }

    public void setTaskDTOS(List<TaskDTO> taskDTOS) {
        this.taskDTOS = taskDTOS;
    }
}
