import cmpe282.Genre
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_cmpe282_genre_form_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/genre/_form.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
expressionOut.print(hasErrors(bean: genreInstance, field: 'itemid', 'error'))
printHtmlPart(1)
invokeTag('message','g',7,['code':("genre.itemid.label"),'default':("Itemid")],-1)
printHtmlPart(2)
invokeTag('field','g',10,['name':("itemid"),'type':("number"),'value':(genreInstance.itemid),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: genreInstance, field: 'rating', 'error'))
printHtmlPart(4)
invokeTag('message','g',16,['code':("genre.rating.label"),'default':("Rating")],-1)
printHtmlPart(2)
invokeTag('field','g',19,['name':("rating"),'type':("number"),'value':(genreInstance.rating),'required':("")],-1)
printHtmlPart(3)
expressionOut.print(hasErrors(bean: genreInstance, field: 'userid', 'error'))
printHtmlPart(5)
invokeTag('message','g',25,['code':("genre.userid.label"),'default':("Userid")],-1)
printHtmlPart(2)
invokeTag('field','g',28,['name':("userid"),'type':("number"),'value':(genreInstance.userid),'required':("")],-1)
printHtmlPart(6)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1417336340000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
