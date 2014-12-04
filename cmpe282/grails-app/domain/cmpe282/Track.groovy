package cmpe282

import grails.rest.*
@Resource(uri='/trackratings')

class Track {
	Integer userid
	Integer itemid
	Double rating
	
	static mapping = {
		version false
		table "trackrecommendation"
		id generator: 'assigned', name:'userid'
		}
    static constraints = {
    }
}
