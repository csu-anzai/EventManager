package com.example.eventmanager.Service.DefinedList;

import com.example.eventmanager.Model.DefinedList;
import com.example.eventmanager.Repository.IDefinedListRepo;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DefinedListService implements IDefinedListService {

  @Autowired
  IDefinedListRepo definedListRepo;

  @Override
  public boolean save(DefinedList definedList) {
    definedListRepo.save(definedList);
    return false;
  }

  @Override
  public boolean saveAll(List<DefinedList> definedList) {
    return false;
  }

  @Override
  public boolean update(DefinedList task) {
    return false;
  }

  @Override
  public boolean delete(Long id) {
    return false;
  }

  @Override
  public List<DefinedList> findAll() {
    return null;
  }

  @Override
  public DefinedList findById(Long id) {
    return definedListRepo.findById(id).get();
  }
}
