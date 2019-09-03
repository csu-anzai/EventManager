package com.example.eventmanager.Service.DefinedList;

import com.example.eventmanager.Model.DefinedList;
import java.util.List;

public interface IDefinedListService {
  boolean save(DefinedList definedList);
  boolean saveAll(List<DefinedList> definedList);
  boolean update(DefinedList task);
  boolean delete(Long id);
  List<DefinedList> findAll();
  DefinedList findById(Long id);

}
