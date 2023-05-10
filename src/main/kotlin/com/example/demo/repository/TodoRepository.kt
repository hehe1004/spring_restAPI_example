package com.example.demo.repository

import com.example.demo.entity.Todo
import org.springframework.data.jpa.repository.JpaRepository

interface TodoRepository:JpaRepository<Todo, Long> {
}