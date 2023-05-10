package com.example.demo.util

import java.util.*


fun uuid(): UUID = UUID.randomUUID()


fun <T> Optional<T>.unwrap(): T? = orElse(null)