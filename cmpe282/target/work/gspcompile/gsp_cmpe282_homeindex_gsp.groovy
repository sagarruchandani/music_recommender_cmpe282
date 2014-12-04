import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_cmpe282_homeindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/home/index.gsp" }
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
createClosureForHtmlPart(13, 2)
invokeTag('link','g',55,['controller':("UserLogin"),'action':("login")],2)
printHtmlPart(14)
for( d in (data) ) {
printHtmlPart(15)
expressionOut.print(d[0])
printHtmlPart(16)
expressionOut.print(d[1])
printHtmlPart(16)
expressionOut.print(d[2])
printHtmlPart(16)
expressionOut.print(d[3])
printHtmlPart(17)
}
printHtmlPart(18)
invokeTag('createLinkTo','g',103,['dir':("jquery"),'file':("jquery.js")],-1)
printHtmlPart(19)
invokeTag('createLinkTo','g',104,['dir':("jquery"),'file':("jRating.jquery.js")],-1)
printHtmlPart(19)
invokeTag('createLinkTo','g',105,['dir':("js"),'file':("bootstrap.min.js")],-1)
printHtmlPart(19)
invokeTag('createLinkTo','g',106,['dir':("jquery"),'file':("jquery.tablesorter.pager.js")],-1)
printHtmlPart(20)
})
invokeTag('captureBody','sitemesh',135,[:],1)
printHtmlPart(21)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1417441545000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
