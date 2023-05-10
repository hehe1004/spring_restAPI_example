package com.example.demo.service

import com.example.demo.entity.Todo
import com.example.demo.repository.TodoRepository
import com.example.demo.util.unwrap
import org.springframework.data.repository.findByIdOrNull
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class TodoService(val todoRepository: TodoRepository) {

    fun getTodos() = todoRepository.findAll()

    fun getTodo(todoId: Long) = todoRepository
        .findById(todoId)


}