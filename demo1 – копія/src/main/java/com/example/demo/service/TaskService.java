package com.example.demo.service;

import com.example.demo.entity.Task;
import com.example.demo.repository.TaskRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class TaskService {
    private final TaskRepository taskRepository;

    public TaskService(TaskRepository taskRepository){
        this.taskRepository = taskRepository;
    }

    public List<Task> findAll(){
        return taskRepository.findAll();
    }

    public Optional<Task> findById(Long id){
        return taskRepository.findById(id);
    }

    public Task save(Task task){
        return taskRepository.save(task);
    }

    public void deleteById(Long id){
        taskRepository.deleteById(id);
    }

    // Метод для получения всех задач
    public List<Task> getAllTasks() {
        return taskRepository.findAll();
    }

    // Метод для сохранения задачи
    public Task saveTask(Task task) {
        return taskRepository.save(task);
    }
}
