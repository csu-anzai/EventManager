package com.example.eventmanager.Service.Task;

import com.example.eventmanager.Model.Task;
import java.util.List;

public interface ITaskService {
  boolean save(Task task);
  boolean saveAll(List<Task> tasks);
  boolean update(Task task);
  boolean delete(Long id);
  List<Task> findAll();
  Task findById(Long id);
}
