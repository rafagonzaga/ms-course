package com.rafagonzaga.hrworker.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rafagonzaga.hrworker.entities.Worker;

public interface WorkerRepository extends JpaRepository<Worker, Long> {

}
