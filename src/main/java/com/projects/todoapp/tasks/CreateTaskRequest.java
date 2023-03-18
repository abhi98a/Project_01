package com.projects.todoapp.tasks;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CreateTaskRequest {
    String name;
    String dueDate;
}
