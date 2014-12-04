package cmpe282

import controllers.cmpe282.*;
	import grails.rest.*
	
	@Resource(uri='/index')
	class Indexdata {
     String album;
	 String artist;
	 String Track;
	 int rating;
		
		static mapping = {
			version false
			table 'displayindex'
			id generator: 'assigned' , name: 'rating'
			}
		static constraints = {
		}
}
