// testing the HelloWorld class
package helloworld

import org.scalatest.funsuite.AnyFunSuite
import org.apache.spark.sql.{DataFrame, SparkSession}

class HelloWorldTest extends AnyFunSuite {
  test("Testing main method") {
    val test = HelloWorld.main(Array())
  }
}
