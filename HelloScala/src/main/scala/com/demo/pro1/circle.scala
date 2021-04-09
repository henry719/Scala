package com.demo.pro1

import scala.math._

case class Circle(radius: Double) {
    import Circle._
    def area: Double = calculateArea(radius)
}

object Circle {
    private def calculateArea(radius: Double): Double = Pi * pow(radius, 2.0)
}

object a extends App {
    val circle = Circle(5.0)
    println(circle.area)

import scala.util.matching.Regex

val numberPattern: Regex = "[0-9]".r 

numberPattern.findFirstMatchIn("343awesomepassword") match {
    case Some(_) => println("Password ok")
    case None => println("error")
}



}