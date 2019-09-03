package com.example.eventmanager.Repository;

import com.example.eventmanager.Model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ITaskRepo extends JpaRepository<Task,Long> {

}
