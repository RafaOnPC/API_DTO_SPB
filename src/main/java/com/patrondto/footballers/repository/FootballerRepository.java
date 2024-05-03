package com.patrondto.footballers.repository;

import com.patrondto.footballers.model.Footballer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FootballerRepository extends JpaRepository<Footballer, Integer> {
}
