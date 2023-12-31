package com.example.ticketmybatis;


import com.example.ticketmybatis.repository.BuyTicketRepository;
import com.example.ticketmybatis.repository.MyTicketRepository;
import com.example.ticketmybatis.repository.JpaTicketRepository;
import com.example.ticketmybatis.repository.TicketRepository;
import com.example.ticketmybatis.service.BuyTicketService;
import com.example.ticketmybatis.service.MyTicketService;
import com.example.ticketmybatis.service.TicketService;
import jakarta.persistence.EntityManager;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@MapperScan("com.example.ticketmybatis.repository")
@EnableJpaRepositories("com.example.ticketmybatis.repository")
public class SpringConfig {
    private EntityManager em; // JPA용
    @Autowired
    public SpringConfig(EntityManager em){
        this.em = em;
    }

    @Bean
    public MyTicketService myTicketService(){
        return new MyTicketService(ticketRepository());
    }
    @Bean
    public BuyTicketService buyTicketService(){
        return new BuyTicketService((BuyTicketRepository) ticketRepository());
    }
    @Bean
    public TicketService TicketService(){
        return new TicketService((TicketRepository) ticketRepository());
    }
    @Bean
    public MyTicketRepository ticketRepository() {
        return new JpaTicketRepository(em);
    }

}
