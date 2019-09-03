package com.example.eventmanager.Controller;

import com.example.eventmanager.Service.DefinedList.IDefinedListService;
import com.example.eventmanager.Service.Task.ITaskService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
  @Autowired
  ITaskService taskService;
  @Autowired
  IDefinedListService definedListService;

  @GetMapping({"/",""})
  public String home(){

    return "TEST";
  }

}
