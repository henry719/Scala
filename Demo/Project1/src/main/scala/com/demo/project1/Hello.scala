package com.demo.pro1

import com.demo.logging.Logger.info

class Hello(name: String, daysToComplete: Int)

class Test {
  val project1 = new Hello("TPS Reports", 1)
  val project2 = new Hello("Website redesign", 5)
  info("Created projects")  // Prints "INFO: Created projects"
}


object Main extends App {
  println("Hello, World!")
  val a = new Test()
  println(a)
}



