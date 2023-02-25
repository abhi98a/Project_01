# Todo List Backend Service

## API Docs

**GET** `/tasks`
> get a list of all tasks
```json
[
  {
    "id" : 1
    "title" : "This is something i need to complete"
    "due_date" : 20230315
    "completed" : false
   },
   
  {
    "id" : 2
    "title" : "This is something i need to complete"
    "due_date" : 20230315
    "completed" : false
   }
 ]
 ```
  


**get** `/tasks/{id}`

>get tasks by id

```json
[
  {
    "id" : 1
    "title" : "This is something i need to complete"
    "due_date" : 20230315
    "completed" : false
   }
 ]
 ```
 
 |query param | definition |
 | -----------| ---------- |
 | `notes` | if true, include notes in results |
 
 examples -
 `tasks/4?notes =true` - fetch details of task id =4, including its notes 
 
 
**get** `/tasks/{id}/notes`

>get all notes inside a task

```json
[
  {
    
    "title" : "This is something i need to complete"
    "body" : "This is the explanation of a task"
   }
 ]
 ```
 
 

## Entities

![image](https://user-images.githubusercontent.com/126181847/221368373-20e970ac-b815-4c73-94cb-eac9101be3ed.png)

