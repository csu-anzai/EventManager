package com.example.eventmanager.Model;

import java.util.Set;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Table
@Entity
@Setter
@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class DefinedList {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  private String title;

  @ManyToMany
  @JoinTable(name = "defined_list__task", joinColumns = {
      @JoinColumn(name = "defined_list_id", referencedColumnName = "id")
      } ,inverseJoinColumns = {
          @JoinColumn(name = "task_id", referencedColumnName = "id")})
  Set<Task> tasksIncludedToList;


}
