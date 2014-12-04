package cmpe282

import grails.rest.*

@Resource(uri='/genreratings')
class Genre {
    Integer userid
	Integer itemid
	Double rating
	
	static mapping = {
		version false
    	table "genrerecommendation"
		id generator: 'assigned', name:'userid'
		}
    static constraints = {
    }
}
