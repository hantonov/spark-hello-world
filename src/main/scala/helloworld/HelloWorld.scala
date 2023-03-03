package helloworld

import org.apache.spark.sql.{DataFrame, SparkSession}


object HelloWorld {
  def main(args: Array[String]): Unit = {
    val spark = SparkSession.builder()
        .appName("HelloWorld")
        // Connect to Spark cluster
        .master(sys.env.getOrElse("SPARK_MASTER", "local[*]"))
        .getOrCreate()
    import spark.implicits._

    // Create a DataFrame
    val df = List("hello", "world").toDF
    df.show()
  }
}
