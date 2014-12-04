package cmpe282
import org.apache.hadoop.conf.*;
import org.apache.hadoop.fs.Path
import org.apache.hadoop.mapred.*;
import org.codehaus.groovy.grails.web.json.JSONArray
import com.mysql.jdbc.jdbc2.optional.MysqlConnectionPoolDataSource
class UserLoginController {
	def sessionFactory
    def index() { 
		
	}
	
	
	def login = {
		//validate student login
		if(session.user==null)
		{
		println params.username
		def s = Userdata.findByUsername(params.username)
		if (s) {
			// username and password match -> log in
			session.user = s
			println "user id:"+session.user.id 
			
			//def display = Indexdata.list()
			def session = sessionFactory.getCurrentSession()
			def query = session.createSQLQuery("select * from displayindex")
			List result = query.list();
			def resultArray = result.toArray()
			
			println resultArray
			//JSONArray mJSONArray = new JSONArray(Arrays.asList(resultArray));
			render(view:"index",model:[data:resultArray])
			//redirect(uri:"/",params:[data:mJSONArray])
			
			//redirect(controller:'main')
					
		} else {
		
			render (view : "login")
			
		}
		}
		else
		{
			def session = sessionFactory.getCurrentSession()
			def query = session.createSQLQuery("select * from displayindex")
			List result = query.list();
			def resultArray = result.toArray()
			
			println resultArray
			//JSONArray mJSONArray = new JSONArray(Arrays.asList(resultArray));
			render(view:"index",model:[data:resultArray])
		}
	}
	
	def register= {
		println "inside register"
		Random randomGenerator = new Random();
		int randomInt = randomGenerator.nextInt(1000);
		//def newUser = new User(id:params.id,age:params.age,sex:params.sex,occupation:params.occupation,password:params.password)
		def newuser = new Userdata(username:params.username,fname:params.fname,lname:params.lname,email:params.email,address:params.address,password:params.password)
		println params.username
		//def session  = sessionFactory.getCurrentSession()
		
		//def query = session.createSQLQuery("insert into  userdata values('"+params.username+"','"+params.fname+"','"+params.lname+"','"+params.email+"','"+params.address+"','"+params.password+"',"+ randomInt+")")
		//println query;
		//query.executeUpdate()
		//List result = query.list();
		newuser.save(flush:true)
		//def s = Userdata.findByUsername(params.username)
		//session = session.i
		
		if(!newuser.save())
		{
			render(view : "login")
		}
		else
		{
			session.user = newuser
			forward controller: "UserLogin", action: "login"
		}
		
		
	
		}
	
	def logout ={
		session.user = null
		redirect (uri:"/")
		}
	
	}
