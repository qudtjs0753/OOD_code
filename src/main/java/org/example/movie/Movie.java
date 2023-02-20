package org.example.movie;

import java.time.Duration;

public class Movie {
    private String title;
    private Duration runningTime;
    private Money fee;
    private DiscountPolicy discountPolicy;

    public Movie(String title, Duration runningTime, Money fee, DiscountPolicy discountPolicy) {
        this.title = title;
        this.runningTime = runningTime;
        this.fee = fee;
        this.discountPolicy = discountPolicy;
    }

    public Money getFee() {
        return fee;
    }

    public Money calculateMovieFee(Screening screening) {
        //discountPolicy는 두개이지만, 어떤 것을 사용할 지 결정하는 코드가 존재하지 않는다.
        return fee.minus(discountPolicy.calculateDiscountAmount(screening));
    }
}
