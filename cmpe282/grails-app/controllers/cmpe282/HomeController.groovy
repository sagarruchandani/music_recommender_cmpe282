package cmpe282

class HomeController {
	def sessionFactory
	
    def index() { }
	
def homepage = {
	println "eshan is inside"
	def session = sessionFactory.getCurrentSession()
	def query = session.createSQLQuery("select * from displayindex")
	List result = query.list();
	def resultArray = result.toArray()
	
	println resultArray
	//JSONArray mJSONArray = new JSONArray(Arrays.asList(resultArray));
	render(view:"index",model:[data:resultArray])
}
}