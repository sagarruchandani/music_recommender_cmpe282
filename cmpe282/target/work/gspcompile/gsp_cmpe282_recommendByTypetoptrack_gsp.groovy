import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_cmpe282_recommendByTypetoptrack_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/recommendByType/toptrack.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
expressionOut.print(resource(dir: 'css', file: 'bootstrap.min.css'))
printHtmlPart(2)
expressionOut.print(resource(dir: 'css', file: 'bootstrap.css'))
printHtmlPart(2)
expressionOut.print(resource(dir: 'css', file: 'shop-homepage.css'))
printHtmlPart(3)
invokeTag('captureMeta','sitemesh',9,['gsp_sm_xmlClosingForEmptyTag':(""),'charset':("utf-8")],-1)
printHtmlPart(4)
invokeTag('captureMeta','sitemesh',10,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(4)
invokeTag('captureMeta','sitemesh',11,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("viewport"),'content':("widtd=device-widtd, initial-scale=1")],-1)
printHtmlPart(4)
invokeTag('captureMeta','sitemesh',12,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("description"),'content':("")],-1)
printHtmlPart(4)
invokeTag('captureMeta','sitemesh',13,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("autdor"),'content':("")],-1)
printHtmlPart(5)
invokeTag('createLinkTo','g',15,['dir':("jquery"),'file':("jRating.jquery.css")],-1)
printHtmlPart(6)
createTagBody(2, {->
createClosureForHtmlPart(7, 3)
invokeTag('captureTitle','sitemesh',16,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',16,[:],2)
printHtmlPart(8)
invokeTag('createLinkTo','g',17,['dir':("css"),'file':("style.css")],-1)
printHtmlPart(9)
invokeTag('createLinkTo','g',21,['dir':("css"),'file':("bootstrap.min.css")],-1)
printHtmlPart(10)
invokeTag('createLinkTo','g',23,['dir':("css"),'file':("shop-homepage.css")],-1)
printHtmlPart(11)
})
invokeTag('captureHead','sitemesh',30,[:],1)
printHtmlPart(4)
createTagBody(1, {->
printHtmlPart(12)
if(true && (session?.user)) {
printHtmlPart(13)
createTagBody(3, {->
printHtmlPart(14)
expressionOut.print(session?.user.username)
printHtmlPart(15)
})
invokeTag('link','g',50,['controller':("UserLogin"),'action':("profile")],3)
printHtmlPart(16)
createClosureForHtmlPart(17, 3)
invokeTag('link','g',51,['controller':("UserLogin"),'action':("logout")],3)
printHtmlPart(18)
}
else {
printHtmlPart(19)
createClosureForHtmlPart(20, 3)
invokeTag('link','g',54,['controller':("UserLogin"),'action':("login")],3)
printHtmlPart(21)
}
printHtmlPart(22)
createClosureForHtmlPart(23, 2)
invokeTag('link','g',61,['controller':("MyRecommender"),'action':("myRecommenderByGenre")],2)
printHtmlPart(24)
createClosureForHtmlPart(25, 2)
invokeTag('link','g',62,['controller':("MyRecommender"),'action':("myRecommenderByAlbum")],2)
printHtmlPart(24)
createClosureForHtmlPart(26, 2)
invokeTag('link','g',63,['controller':("MyRecommender"),'action':("myRecommenderByArtist")],2)
printHtmlPart(24)
createClosureForHtmlPart(27, 2)
invokeTag('link','g',64,['controller':("MyRecommender"),'action':("myRecommenderByTrack")],2)
printHtmlPart(28)
for( d in (data) ) {
printHtmlPart(29)
expressionOut.print(d[0])
printHtmlPart(30)
expressionOut.print(d[2])
printHtmlPart(31)
}
printHtmlPart(32)
invokeTag('createLinkTo','g',118,['dir':("jquery"),'file':("jquery.js")],-1)
printHtmlPart(33)
invokeTag('createLinkTo','g',119,['dir':("jquery"),'file':("jRating.jquery.js")],-1)
printHtmlPart(33)
invokeTag('createLinkTo','g',120,['dir':("js"),'file':("bootstrap.min.js")],-1)
printHtmlPart(33)
invokeTag('createLinkTo','g',121,['dir':("jquery"),'file':("jquery.tablesorter.pager.js")],-1)
printHtmlPart(34)
})
invokeTag('captureBody','sitemesh',130,[:],1)
printHtmlPart(35)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1417446076000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
