package edu.java8.datetime;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.Period;

public class InstantDurantionPeriodSample {
	public static void main(String[] args) {
		System.out.println("******************** instant Start************************");
		instant();
		System.out.println("******************** instant End************************");

		System.out.println("******************** duration Start************************");
		duration();
		System.out.println("******************** duration End************************");

		System.out.println("******************** period Start************************");
		period();
		System.out.println("******************** period End************************");

	}

	public static void instant() {
		Instant instant = Instant.now();
		System.out.println(instant.toString()); // 2013-05-15T05:20:08.145Z
		System.out.println(instant.plus(Duration.ofMillis(5000)).toString()); // 2013-05-15T05:20:13.145Z
		System.out.println(instant.minus(Duration.ofMillis(5000)).toString()); // 2013-05-15T05:20:03.145Z
		System.out.println(instant.minusSeconds(10).toString()); // 2013-05-15T05:19:58.145Z
	}

	public static void duration() {
		Duration duration = Duration.ofMillis(5000);
		System.out.println(duration.toString()); // PT5S

		duration = Duration.ofSeconds(60);
		System.out.println(duration.toString()); // PT1M

		duration = Duration.ofMinutes(10);
		System.out.println(duration.toString()); // PT10M

		duration = Duration.ofHours(2);
		System.out.println(duration.toString()); // PT2H

		duration = Duration.between(Instant.now(), Instant.now().plus(Duration.ofMinutes(10)));
		System.out.println(duration.toString()); // PT10M
	}

	public static void period() {
		Period period = Period.ofDays(6);
		System.out.println(period.toString()); // P6D

		period = Period.ofMonths(6);
		System.out.println(period.toString()); // P6M

		period = Period.between(LocalDate.now(), LocalDate.now().plusDays(60));
		System.out.println(period.toString()); // P1M29D
	}
}
