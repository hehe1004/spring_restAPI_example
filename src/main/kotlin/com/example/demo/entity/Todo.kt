package com.example.demo.entity

import jakarta.persistence.*


@Entity
//@Table(name = "todo")
//생략가능 클레스 이름과 테이블 이름 다르게 하고싶을 때 설정
class Todo{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    var id: Long? =null

    var title: String? = null
    var description: String? = null
    var finished: Boolean? = false
}