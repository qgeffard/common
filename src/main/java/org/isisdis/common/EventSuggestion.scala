package org.isisdis.common

import java.util.Date
import scala.collection.mutable.SortedSet

class EventSuggestion {
  var startDate : Date = null
  var endDate : Date = null
	var description : String = null
	var contacts  = SortedSet[Long]()
  var collaborator : Int = 0
  var address : String = null
  
  def this(startDate: Date, endDate : Date, description : String, contacts : SortedSet[Long], collaborator : Int, address : String ) {
    this()
    this.startDate = startDate
    this.endDate = endDate
    this.description = description
    this.contacts = contacts
    this.collaborator = collaborator
    this.address = address
  }
  
  
}