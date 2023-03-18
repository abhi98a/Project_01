package com.projects.todoapp.tasks;

import com.projects.todoapp.notes.NoteEntity;
import lombok.*;

import java.util.Date;
import java.util.List;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class TaskEntity {
    Integer id;
    String name;
    Date dueDate;

    Boolean completed;

    List<NoteEntity> notes;

}
