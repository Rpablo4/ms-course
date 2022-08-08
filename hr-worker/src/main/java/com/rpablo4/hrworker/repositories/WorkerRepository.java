package com.rpablo4.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rpablo4.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
