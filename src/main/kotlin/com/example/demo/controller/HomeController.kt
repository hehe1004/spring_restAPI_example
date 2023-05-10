package com.example.demo.controller

import com.example.demo.entity.Todo
import com.example.demo.repository.TodoRepository
import com.example.demo.service.TodoService
import org.springframework.http.HttpStatus
import org.springframework.web.bind.annotation.*
import java.util.*

@RestController
@RequestMapping("/todos")
class HomeController(val todoService: TodoService) {

//
//    @RequestMapping("/")
//    fun index(): String {
//        return "hello world"
//    }

    @GetMapping
    fun getTodos() = todoService.getTodos()

    @GetMapping(("/{todoId}"))
    fun getTodo(@PathVariable("todoId"){
        return todoService.getTodo(todoId)
    }

    @PostMapping
    fun newTodo(@RequestBody todo: Todo): Todo {
        todoRepository.save(todo)
        return todo
    }


    @RequestMapping(path = ["/{todoId}"], method = [RequestMethod.PUT])
    @ResponseStatus(HttpStatus.OK)
    fun updateTodo(@RequestBody todo: Todo, @PathVariable("todoId") todoId: Long) {
        var target: Todo = todoRepository.findById(todoId).get()
        target.title = todo.title
        target.description = todo.description
        target.finished = todo.finished
        todoRepository.save(target)
    }

    @RequestMapping(path = ["/{todoId}"], method = [RequestMethod.DELETE])
    fun deleteTodo(@PathVariable("todoId") todoId: Long) {
        todoRepository.deleteById(todoId)
    }
}