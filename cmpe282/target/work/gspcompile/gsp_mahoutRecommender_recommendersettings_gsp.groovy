import org.grails.mahout.recommender.MahoutRecommenderConstants
import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

@GrailsPlugin(name='mahout-recommender', version='0.5.2')
class gsp_mahoutRecommender_recommendersettings_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/plugins/mahout-recommender-0.5.2/grails-app/views/recommender/settings.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
printHtmlPart(0)
invokeTag('set','g',5,['var':("conf"),'value':(grailsApplication.config)],-1)
printHtmlPart(0)
invokeTag('set','g',6,['var':("mode"),'value':(conf.mahout.recommender.mode?:MahoutRecommenderConstants.DEFAULT_MODE)],-1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',11,['gsp_sm_xmlClosingForEmptyTag':("/"),'http-equiv':("Content-Type"),'content':("text/html; charset=UTF-8")],-1)
printHtmlPart(0)
invokeTag('captureMeta','sitemesh',12,['gsp_sm_xmlClosingForEmptyTag':("/"),'name':("layout"),'content':("main")],-1)
printHtmlPart(0)
createTagBody(2, {->
createClosureForHtmlPart(2, 3)
invokeTag('captureTitle','sitemesh',13,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',13,[:],2)
printHtmlPart(3)
})
invokeTag('captureHead','sitemesh',21,[:],1)
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(4)
expressionOut.print(createLink(uri: '/'))
printHtmlPart(5)
invokeTag('message','g',23,['code':("default.home.label")],-1)
printHtmlPart(6)
if(true && (flash.errors)) {
printHtmlPart(7)
expressionOut.print(flash.errors)
printHtmlPart(8)
}
printHtmlPart(9)
invokeTag('textField','g',28,['name':("userID"),'value':(params.userID)],-1)
printHtmlPart(10)
invokeTag('textField','g',34,['name':("howMany"),'value':(params.howMany?:MahoutRecommenderConstants.DEFAULT_HOW_MANY)],-1)
printHtmlPart(11)
if(true && (mode == 'input')) {
printHtmlPart(12)
invokeTag('set','g',37,['var':("yesAndNo"),'value':(['true':'Yes', 'false':'No'].entrySet())],-1)
printHtmlPart(12)
invokeTag('select','g',41,['name':("p"),'from':(yesAndNo),'value':(params.p),'optionKey':("key"),'optionValue':("value")],-1)
printHtmlPart(13)
}
else {
printHtmlPart(14)
expressionOut.print(conf.mahout.recommender.hasPreference)
printHtmlPart(15)
}
printHtmlPart(16)
if(true && (mode != 'class')) {
printHtmlPart(17)
if(true && (mode == 'input')) {
printHtmlPart(12)
invokeTag('select','g',55,['name':("r"),'from':([1:'1. User-based recommender', 2:'2. Item-based recommender', 3:'3. Slope-one recommender'].entrySet()),'value':(params.r),'optionKey':("key"),'optionValue':("value")],-1)
printHtmlPart(13)
}
else {
printHtmlPart(14)
expressionOut.print(conf.mahout.recommender.selected)
printHtmlPart(15)
}
printHtmlPart(18)
if(true && (mode == 'input')) {
printHtmlPart(12)
invokeTag('select','g',72,['name':("s"),'from':([PearsonCorrelation:'Pearson correlation', EuclideanDistance:'Euclidean distance', LogLikelihood:'Log-likelihood', TanimotoCoefficient:'Tanimoto coefficient'].entrySet()),'value':(params.s),'optionKey':("key"),'optionValue':("value")],-1)
printHtmlPart(13)
}
else {
printHtmlPart(14)
expressionOut.print(conf.mahout.recommender.similarity)
printHtmlPart(15)
}
printHtmlPart(19)
if(true && (mode == 'input')) {
printHtmlPart(12)
invokeTag('select','g',79,['name':("w"),'from':(yesAndNo),'value':(params.w),'optionKey':("key"),'optionValue':("value")],-1)
printHtmlPart(13)
}
else {
printHtmlPart(14)
expressionOut.print(conf.mahout.recommender.withWeighting)
printHtmlPart(15)
}
printHtmlPart(20)
if(true && (mode == 'input')) {
printHtmlPart(12)
invokeTag('textField','g',87,['name':("n"),'value':(params.n)],-1)
printHtmlPart(13)
}
else {
printHtmlPart(14)
expressionOut.print(conf.mahout.recommender.neighborhood)
printHtmlPart(15)
}
printHtmlPart(21)
}
else {
printHtmlPart(22)
expressionOut.print(conf.mahout.recommender.builderClass)
printHtmlPart(23)
}
printHtmlPart(24)
invokeTag('checkBox','g',99,['name':("debug")],-1)
printHtmlPart(25)
invokeTag('submitButton','g',103,['name':("create"),'class':("save"),'value':("Submit")],-1)
printHtmlPart(26)
})
invokeTag('captureBody','sitemesh',107,[:],1)
printHtmlPart(27)
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
