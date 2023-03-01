package org.example.movie_not_oop;



public class ReservationAgency {

    public Reservation reserve(Screening screening, Customer customer, int audienceCount) {
        Money fee = screening.calcuateFee(audienceCount);
        return new Reservation(customer, screening, fee, audienceCount);
    }
}
