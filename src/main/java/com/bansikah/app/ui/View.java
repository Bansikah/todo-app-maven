package com.bansikah.app.ui;

import java.util.Scanner;
import com.bansikah.app.TodoList;
import com.bansikah.app.Todo;

public class View {
    private TodoList todoList;
    private Scanner scanner;

    public View() {
        todoList = new TodoList();
        scanner = new Scanner(System.in);
    }

    public void run() {
        promptAddTodo();
        displayTodos();
        promptDeleteTodo();
        // Continue with any other functionality you need
    }

    public void displayTodos() {
        for (int i = 0; i < todoList.size(); i++) {
            Todo todo = todoList.get(i);
            System.out.println("[" + i + "] " + todo.getTitle() + ": " + todo.getDecription());
        }

    }

    private void promptAddTodo() {
        System.out.print("Enter todo title (or 'quit' to exit): ");
        String title = scanner.nextLine();

        while (!title.equalsIgnoreCase("quit")) {
            System.out.print("Enter todo description: ");
            String description = scanner.nextLine();

            Todo todo = new Todo(title, description);
            todoList.addTodo(todo);

            System.out.println("Todo added successfully!");

            System.out.print("Enter todo title (or 'quit' to exit): ");
            title = scanner.nextLine();
        }
    }

  
    private void promptDeleteTodo() {
        System.out.print("Enter the index of the todo to delete: ");
        int index = scanner.nextInt();

        boolean deleted = todoList.deleteTodo(index);
        if (deleted) {
            System.out.println("Todo deleted successfully!");
        } else {
            System.out.println("Invalid index. Todo not deleted.");
        }
    }
}