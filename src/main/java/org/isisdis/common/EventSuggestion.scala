package org.isisdis.common

import java.util.Date
import scala.collection.mutable.SortedSet

class EventSuggestion {
  private var _startDate : Date = null
  private var _endDate : Date = null
	private var _description : String = null
	private var _contacts  = SortedSet[Long]()
  private var _collaborator : Int = 0
  private var _address : String = null
  
  def this(startDate: Date, endDate : Date, description : String, contacts : SortedSet[Long], collaborator : Int, address : String ) {
    this()
    this._startDate = startDate
    this._endDate = endDate
    this._description = description
    this._contacts = contacts
    this._collaborator = collaborator
    this._address = address
  }
  
  // Getters 
  def startDate = _startDate 
  def endDate = _endDate 
	def description = _description 
  def contacts = _contacts 
	def collaborator = _collaborator
  def address = _address 

  // Setters
  def startDate_= (value:Date):Unit = _startDate = value 
  def endDate_= (value:Date):Unit = _endDate = value 
  def description_= (value:String):Unit = _description = value 
  def contacts_= (value:SortedSet[Long]):Unit = _contacts = value 
  def collaborator_= (value:Int):Unit = _collaborator = value 
  def address_= (value:String):Unit = _address = value 
  
}