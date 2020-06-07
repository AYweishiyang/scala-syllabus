package com.ay.chapter17.decorator.coffeebar.mydecorator

import com.ay.chapter17.decorator.coffeebar.Drink


class Milk(obj: Drink) extends Decorator(obj) {

  setDescription("Milk")
  setPrice(2.0f)
}
