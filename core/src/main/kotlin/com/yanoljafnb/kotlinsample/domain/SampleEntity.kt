package com.yanoljafnb.kotlinsample.domain

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id
import jakarta.persistence.Table

@Table(name = "test")
@Entity
class SampleEntity(
    @Id @GeneratedValue val id: Long,
    @Column(name = "name") val name: String,
)
