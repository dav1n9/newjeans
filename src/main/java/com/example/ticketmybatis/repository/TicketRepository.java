package com.example.ticketmybatis.repository;

import com.example.ticketmybatis.entity.TicketEntity;

import java.util.List;
import java.util.Optional;

public interface TicketRepository {
    void save(TicketEntity ticketEntity);

    List<TicketEntity> findAll();

    List<TicketEntity> findCond(TicketEntity ticketEntity);
    Optional<TicketEntity> findById(Long ticketId);

    void delete(TicketEntity ticketEntity);
}