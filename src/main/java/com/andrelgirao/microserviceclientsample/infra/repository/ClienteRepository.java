package com.andrelgirao.microserviceclientsample.infra.repository;

import com.andrelgirao.microserviceclientsample.domain.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}