package com.example.ticketmybatis.domain;

import com.example.ticketmybatis.entity.JourneyEntity;

import lombok.Data;

public class Reservation {

    @Data
    public static class Create{
        private Long reservation_id;
        private String reservation_name;
        private String passport;
    }

    @Data
    public static class Update{
        private Long reservation_id;
        private String reservation_name;
        private String passport;
    }

    @Data
    public static class Simple{
        private Long reservation_id;
        private String reservation_name;
        private String passport;
        private String seat;
        private Long journey_id;
    }

}
