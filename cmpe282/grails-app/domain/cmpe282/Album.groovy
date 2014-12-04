package cmpe282

import grails.rest.*

@Resource(uri='/albumratings')
class Album {
    Integer userid
	Integer itemid
	Double rating
	
	static mapping = {
		version false
		table "albumrecommendation"
		id generator: 'assigned', name:'userid'
		//
		}
    static constraints = {
		
    }
}
