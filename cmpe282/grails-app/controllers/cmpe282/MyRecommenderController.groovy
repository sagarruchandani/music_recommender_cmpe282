package cmpe282

import org.apache.hadoop.conf.*;
import org.apache.hadoop.fs.Path
import org.apache.hadoop.mapred.*;
import org.codehaus.groovy.grails.web.json.JSONArray
import com.mysql.jdbc.jdbc2.optional.MysqlConnectionPoolDataSource

class MyRecommenderController {
	def sessionFactory
    def index() { }
	
	def myRecommenderByGenre = {
		
		String userid = session.user.id
		def session = sessionFactory.getCurrentSession()
		
		String temp = "select * from genreRecommendedItems where userid ="+userid+" limit 10";
		println temp;
		def query = session.createSQLQuery(temp)
		List result = query.list();
		def resultArray = result.toArray()
		println resultArray
		[data:resultArray]
		
	}
	
	def myRecommenderByArtist = {
		String userid = session.user.id
		def session = sessionFactory.getCurrentSession()
		String temp = "select * from artistRecommendedItems where userid ="+userid+" limit 10";
		println temp;
		def query = session.createSQLQuery(temp)
		List result = query.list();
		def resultArray = result.toArray()
		[data:resultArray]
		
	}
	
	def myRecommenderByAlbum = {
		String userid = session.user.id
		def session = sessionFactory.getCurrentSession()
		String temp = "select * from albumRecommendedItems where userid ="+userid+" limit 10";
		println temp;
		def query = session.createSQLQuery(temp)
		List result = query.list();
		def resultArray = result.toArray()
		[data:resultArray]
		
	}
	
	def myRecommenderByTrack = {
		String userid = session.user.id
		def session = sessionFactory.getCurrentSession()
		String temp = "select * from trackRecommendedItems where userid ="+userid+" limit 10";
		println temp;
		def query = session.createSQLQuery(temp)
		List result = query.list();
		def resultArray = result.toArray()
		[data:resultArray]
		
	}
	
}
