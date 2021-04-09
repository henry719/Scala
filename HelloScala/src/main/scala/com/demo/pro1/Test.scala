package com.demo.pro1

import com.demo.logging.Logger.info

class Project(name: String, daysToComplete: Int)

class Test1 {
  val project1 = new Project("TPS Reports", 1)
  val project2 = new Project("Website redesign", 5)
  println(project1)
  info("Created projects")  // Prints "INFO: Created projects"
  println(project2)
}

object Test extends App {
    val a = new Test1()
    println(a.project1)
    println(a)
}




