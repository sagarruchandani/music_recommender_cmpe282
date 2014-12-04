package cmpe282

import grails.rest.*
@Resource(uri='/userdata')

class Userdata {
   
	String username
	String fname
	String lname
	String email
	String address
	String password
	
	Integer id
	
    static constraints = {
    		username unique:true
			password nullable: false
			 id autoincrement : true
		}
	static mapping = {
		version false
		
		//id defaultValue: 123
		//id false
		//id generator:'assigned', column:'Student_id', type:'integer'
		//id name: 'id'
	}
	
}
