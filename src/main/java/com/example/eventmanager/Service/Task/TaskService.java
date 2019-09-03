package com.example.eventmanager.Service.Task;

import com.example.eventmanager.Model.Task;
import com.example.eventmanager.Repository.ITaskRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TaskService implements ITaskService {

  @Autowired
  private ITaskRepo taskRepo;

  @Override
  public boolean save(Task task) {
    Task tmp = taskRepo.save(task);
    return tmp!=null? true: false;
  }

  @Override
  public boolean saveAll(List<Task> tasks) {
    return false;
  }

  @Override
  public boolean update(Task task) {
    return false;
  }

  @Override
  public boolean delete(Long id) {
    return false;
  }

  @Override
  public List<Task> findAll() {
    return taskRepo.findAll();
  }

  @Override
  public Task findById(Long id) {
    Task task = taskRepo.findById(id).get();
    return task;
  }
}
