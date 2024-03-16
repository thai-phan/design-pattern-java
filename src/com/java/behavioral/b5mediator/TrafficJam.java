package com.java.behavioral.b5mediator;

import lombok.Getter;

public class TrafficJam {
  @Getter
  public static class Lane {
    private int vehicleCount;
    private final int number;

    public Lane(int number) {
      this.number = number;
    }

    public synchronized void increaseVehicleCount() {
      ++vehicleCount;
    }

    public synchronized void decreaseVehicleCount() {
      --vehicleCount;
    }
  }

}
