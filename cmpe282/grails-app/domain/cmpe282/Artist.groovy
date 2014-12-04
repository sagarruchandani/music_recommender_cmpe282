package cmpe282
import grails.rest.*

@Resource(uri='/genreratings')
class Artist {
	Integer userid
	Integer itemid
	Double rating
	
	static mapping = {
		version false
		table "artistrecommendation1"
		id generator: 'assigned', name:'userid'
		}
    static constraints = {
    }
}
