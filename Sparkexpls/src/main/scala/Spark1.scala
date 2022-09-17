package com.kiran.expls

import org.apache.spark.sql.SparkSession

object Spark1 {
  def main(args:Array[String]): Unit = {


    val spark = SparkSession.builder()
      .master("local[1]")
      .appName("SparkByExample")
      .getOrCreate();
    spark.sparkContext.setLogLevel("ERROR");
    println("First SparkContext:")
    println("APP Name :" + spark.sparkContext.appName);
    println("Deploy Mode :" + spark.sparkContext.deployMode);
    println("Master :" + spark.sparkContext.master);
    val df1 = spark.read.format("csv").load("src/test1.csv")
    df1.show()
  }
}