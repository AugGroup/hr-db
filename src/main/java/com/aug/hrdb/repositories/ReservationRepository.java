package com.aug.hrdb.repositories;

import java.util.List;

import com.aug.hrdb.dto.ReportReservationDto;
import com.aug.hrdb.dto.ReservationDto;
import com.aug.hrdb.entities.Reservation;

public interface ReservationRepository extends GenericRepository<Reservation, Integer> {

  List<ReservationDto> findByDateRange(String start, String end);

  ReservationDto findReservationById(Integer id);

  List<ReservationDto> searchReservation(String reservation, Integer masDivision, Integer masReservationType);

  List<ReservationDto> findByTimestamp(String newTime, Integer roomId);

  List<ReservationDto> findByBetween(String start, String end, Integer roomId);

  List<ReportReservationDto> findReservation(Integer roomId, Integer reservationTypeId, Integer divisionId, String reservationBy);

  List<ReservationDto> filterReservation(String start, String end, Integer roomId, Integer reservationTypeId, Integer divisionId, String reserveBy);

}