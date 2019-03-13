package com.myapp.food.delivery.restaurantservice.events;

import io.eventuate.tram.events.common.DomainEvent;

public class RestaurantMenuRevised implements DomainEvent {

  private RestaurantMenu menu;

  public RestaurantMenu getRevisedMenu() {
    return menu;
  }
}
