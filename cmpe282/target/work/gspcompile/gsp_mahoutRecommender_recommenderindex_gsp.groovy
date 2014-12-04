import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

@GrailsPlugin(name='mahout-recommender', version='0.5.2')
class gsp_mahoutRecommender_recommenderindex_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/plugins/mahout-recommender-0.5.2/grails-app/views/recommender/index.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':("/"),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(1)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',10,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',10,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',11,[:],1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(4)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(5)
invokeTag('message','g',13,['code':("default.home.label")],-1)
printHtmlPart(6)
if(true && (params.debug)) {
printHtmlPart(7)
expressionOut.print(params.userID)
printHtmlPart(8)
expressionOut.print(recommender)
printHtmlPart(9)
expressionOut.print(numOfTopPrefs)
printHtmlPart(10)
for( i in ((0..<numOfTopPrefs)) ) {
printHtmlPart(11)
expressionOut.print((i % 2) == 0 ? 'odd' : 'even')
printHtmlPart(12)
expressionOut.print(prefs.get(i).itemID)
printHtmlPart(13)
expressionOut.print(prefs.get(i).value)
printHtmlPart(14)
}
printHtmlPart(15)
}
printHtmlPart(16)
loop:{
int i = 0
for( item in (items) ) {
printHtmlPart(17)
expressionOut.print((i % 2) == 0 ? 'odd' : 'even')
printHtmlPart(18)
expressionOut.print(item.itemID)
printHtmlPart(19)
expressionOut.print(fieldValue(bean: item, field: "value"))
printHtmlPart(20)
i++
}
}
printHtmlPart(21)
})
invokeTag('captureBody','sitemesh',43,[:],1)
printHtmlPart(22)
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
