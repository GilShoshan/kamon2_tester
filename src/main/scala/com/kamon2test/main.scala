package com.kamon2test

import kamon.Kamon
import kamon.instrumentation.futures.scala.ScalaFutureInstrumentation.{traceBody, traceFunc}
import scala.concurrent.Future
import scala.concurrent.ExecutionContext.Implicits.global





object main extends App {
  Kamon.init()
  println("Hello, world!")
  Future(traceBody("future-body") {

    // Here goes the actual future work, same as usual.
    "Hello Kamon"

  }).map(traceFunc("calculate-length")(_.length))
    .flatMap(traceFunc("to-string")(len => Future(len.toString)))
    .map(println)

}
