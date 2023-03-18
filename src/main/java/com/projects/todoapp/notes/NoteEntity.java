package com.projects.todoapp.notes;

import lombok.*;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
public class NoteEntity {
    Integer id;
    String title;
    String body;

}
