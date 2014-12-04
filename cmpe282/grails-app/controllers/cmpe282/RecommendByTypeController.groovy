package cmpe282

import org.apache.hadoop.conf.*;
import org.apache.hadoop.fs.Path
import org.apache.hadoop.mapred.*;
import org.codehaus.groovy.grails.web.json.JSONArray
import com.mysql.jdbc.jdbc2.optional.MysqlConnectionPoolDataSource

class RecommendByTypeController {
	def sessionFactory
    def index() { }
	
	def topartist = {
		println "top artist"
		def session = sessionFactory.getCurrentSession()
		def query = session.createSQLQuery("select * from topnartist order by count desc limit 50")
		List result = query.list();
		def resultArray = result.toArray()
		[data:resultArray]
	
			
	}
	
	def topalbum = {
		def session = sessionFactory.getCurrentSession()
		def query = session.createSQLQuery("select * from topnalbum order by count desc limit 50")
		List result = query.list();
		def resultArray = result.toArray()
		[data:resultArray]
	
			
	}
	
	def topgenre = {
		def session = sessionFactory.getCurrentSession()
		def query = session.createSQLQuery("select * from topngenre order by count desc limit 50")
		List result = query.list();
		def resultArray = result.toArray()
		[data:resultArray]
	
			
	}
	
	def toptrack = {
		def session = sessionFactory.getCurrentSession()
		def query = session.createSQLQuery("select * from topntrack order by count desc limit 50")
		List result = query.list();
		def resultArray = result.toArray()
		[data:resultArray]
	
			
	}
}
