package com.java.creational.factory;

public class PricedProduct extends Product {
  @Override
  public long order(long amount) {
    return price * amount;
  }
}