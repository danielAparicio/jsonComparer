package jsonComparer

import org.junit.runner.RunWith
import org.scalatest.junit.JUnitRunner
import org.scalatest.exceptions.TestFailedException
import org.scalatest.FunSuite


@RunWith(classOf[JUnitRunner])
class jsonComparerSuite extends FunSuite{

      
  test("json duplicated and differences 1") {
    val tuple1 = jsonComparer.compare(jsonComparerData.jsonA1, jsonComparerData.jsonB1)
    assert(tuple1._1 === jsonComparerData.jsonRA1, "A1 is equal")
    assert(tuple1._2 === jsonComparerData.jsonRB1, "B1 is equal")
  } 
  
  test("json duplicated and differences 2") {
    val tuple2 = jsonComparer.compare(jsonComparerData.jsonA2, jsonComparerData.jsonB2)
    assert(tuple2._1 === jsonComparerData.jsonRA2, "A2 is equal")
    assert(tuple2._2 === jsonComparerData.jsonRB2, "B2 is equal")
  } 
  
  test("json duplicated and differences 3") {
    val tuple3 = jsonComparer.compare(jsonComparerData.jsonA3, jsonComparerData.jsonB3)
    assert(tuple3._1 === jsonComparerData.jsonRA3, "A3 is equal")
    assert(tuple3._2 === jsonComparerData.jsonRB3, "B3 is equal")
  } 

}