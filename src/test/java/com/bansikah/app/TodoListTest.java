package com.bansikah.app;

import com.bansikah.app.Todo;
import com.bansikah.app.TodoList;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

@SuppressWarnings("unused")
public class TodoListTest {
    private TodoList todoList;

    @Before
    public void setUp() {
        todoList = new TodoList();
    }

    @Test
    public void testAddTodo() {
        Todo todo = new Todo("Buy groceries", "Buy milk, eggs, and bread");
        todoList.addTodo(todo);

        assertEquals(1, todoList.size());
        assertEquals(todo, todoList.get(0));
    }

    @Test
    public void testDeleteTodo() {
        Todo todo1 = new Todo("Buy groceries", "Buy milk, eggs, and bread");
        Todo todo2 = new Todo("Do laundry", "Wash clothes");

        todoList.addTodo(todo1);
        todoList.addTodo(todo2);

        assertTrue(todoList.deleteTodo(0));
        assertEquals(1, todoList.size());
        assertFalse(todoList.deleteTodo(1));
    }

    @Test(expected = IndexOutOfBoundsException.class)
    public void testGetInvalidIndex() {
        todoList.get(0);
    }
}