import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

@GrailsPlugin(name='mahout-recommender', version='0.5.2')
class gsp_mahoutRecommender_recommenderevaluator_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/plugins/mahout-recommender-0.5.2/grails-app/views/recommender/evaluator.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
invokeTag('set','g',4,['var':("grailsMajorVersion"),'value':(grailsApplication.metadata['app.grails.version'].charAt(0) as Integer)],-1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',8,['gsp_sm_xmlClosingForEmptyTag':("/"),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',10,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(0)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',12,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',12,[:],2)
printHtmlPart(0)
if(true && (grailsMajorVersion == 2)) {
printHtmlPart(3)
invokeTag('require','r',13,['module':("jquery")],-1)
printHtmlPart(3)
invokeTag('layoutResources','r',14,[:],-1)
printHtmlPart(0)
}
else {
printHtmlPart(3)
invokeTag('javascript','g',16,['library':("jquery"),'plugin':("jquery")],-1)
printHtmlPart(0)
}
printHtmlPart(4)
})
invokeTag('captureHead','sitemesh',26,[:],1)
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(5)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(6)
invokeTag('message','g',28,['code':("default.home.label")],-1)
printHtmlPart(7)
invokeTag('set','g',52,['var':("error"),'value':(grailsApplication.mainContext.mahoutRecommenderSupport.validateEnvironmentSetup())],-1)
printHtmlPart(0)
if(true && (error)) {
printHtmlPart(8)
expressionOut.print(error)
printHtmlPart(9)
}
printHtmlPart(10)
if(true && (grailsMajorVersion == 2)) {
printHtmlPart(3)
invokeTag('layoutResources','r',435,[:],-1)
printHtmlPart(0)
}
printHtmlPart(11)
})
invokeTag('captureBody','sitemesh',595,[:],1)
printHtmlPart(12)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1324494484000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
