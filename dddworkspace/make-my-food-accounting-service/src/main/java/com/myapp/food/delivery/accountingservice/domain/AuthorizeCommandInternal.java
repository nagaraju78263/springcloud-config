package com.myapp.food.delivery.accountingservice.domain;

import com.myapp.food.delivery.common.Money;

import io.eventuate.tram.commands.common.Command;

public class AuthorizeCommandInternal implements AccountCommand, Command {
  private String consumerId;
  private String orderId;
  private Money orderTotal;

  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public AuthorizeCommandInternal(String consumerId, String orderId, Money orderTotal) {
    this.consumerId = consumerId;
    this.orderId = orderId;
    this.orderTotal = orderTotal;
  }

  private AuthorizeCommandInternal() {
  }

  public String getConsumerId() {
    return consumerId;
  }

  public void setConsumerId(String consumerId) {
    this.consumerId = consumerId;
  }

  public Money getOrderTotal() {
    return orderTotal;
  }

  public void setOrderTotal(Money orderTotal) {
    this.orderTotal = orderTotal;
  }
}
