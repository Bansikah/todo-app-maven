package com.bansikah.app;

import java.util.ArrayList;
import java.util.List;

public class TodoList {
    private List<Todo> todos;
    
     // Constructor and methods for adding and removing todos
    public TodoList() {
        this.todos = new ArrayList<>();
    }

    public void addTodo(Todo todo) {
        todos.add(todo);
    }

    public boolean deleteTodo(int index) {
        if (index >= 0 && index < todos.size()) {
            todos.remove(index);
            return true;
        }
        return false;
    }

        public int size() {
            return todos.size();
        }

        public Todo get(int i) {
            if (i >= 0 && i < todos.size()) {
                return todos.get(i);
            }
            throw new IndexOutOfBoundsException("Invalid index");
        }
}
