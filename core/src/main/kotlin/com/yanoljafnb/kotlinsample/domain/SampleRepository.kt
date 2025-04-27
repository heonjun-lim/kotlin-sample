package com.yanoljafnb.kotlinsample.domain

import org.springframework.data.jpa.repository.JpaRepository

interface SampleRepository : JpaRepository<SampleEntity, Long> {
    fun findByName(name: String): SampleEntity?
}
