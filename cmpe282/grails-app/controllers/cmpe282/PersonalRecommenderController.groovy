package cmpe282

import org.apache.hadoop.conf.*;
import org.apache.hadoop.fs.Path
import org.apache.hadoop.mapred.*;
import org.codehaus.groovy.grails.web.json.JSONArray
import com.mysql.jdbc.jdbc2.optional.MysqlConnectionPoolDataSource

class PersonalRecommenderController {
	def sessionFactory
    def index() { }
	
	def personalrecommend = {
		
		
		switch(params.hiddensearchtype.toString().toLowerCase())
		{
			case  "genre":
			def session = sessionFactory.getCurrentSession()
			String temp = "select * from genreRecommendedItems where itemid like '%"+params.key+"%' and rating >="+params.hiddenratingcount+" limit 30";
			println temp;
			def query = session.createSQLQuery(temp)
			List result = query.list();
			def resultArray = result.toArray()
			
			render(view:"RecommendByGenre",model:[data:resultArray])
			break;
			
			case  "artist":
			def session = sessionFactory.getCurrentSession()
			def query = session.createSQLQuery("select * from artistRecommendedItems where itemid like '%"+params.key+"%' and rating >="+params.hiddenratingcount+" limit 30")
			List result = query.list();
			def resultArray = result.toArray()
			render(view:"RecommendByArtist",model:[data:resultArray])
			break;
			
			case  "album":
			def session = sessionFactory.getCurrentSession()
			def query = session.createSQLQuery("select * from albumRecommendedItems where itemid like '%"+params.key+"%' and rating >="+params.hiddenratingcount+" limit 30")
			List result = query.list();
			def resultArray = result.toArray()
			render(view:"RecommendByAlbum",model:[data:resultArray])
			break;
			
			case  "track":
			def session = sessionFactory.getCurrentSession()
			def query = session.createSQLQuery("select * from trackRecommendedItems where itemid like '%"+params.key+"%' and rating >="+params.hiddenratingcount+" limit 30")
			List result = query.list();
			def resultArray = result.toArray()
			render(view:"RecommendByTrack",model:[data:resultArray])
			break;
		}
		
	}
}
