package jsonComparer

import org.json4s._
import org.json4s.jackson.JsonMethods._
import org.json4s.JsonDSL._

object jsonComparer {
  
  def compare (jsonA:JValue, jsonB:JValue):(JValue,JValue) = {
   
    val Diff(_, _, deletedA) = jsonA diff jsonB   
    val Diff(_, _, deletedB) = jsonB diff jsonA
    (deletedA,deletedB)
    
  }
  
}