import org.codehaus.groovy.grails.plugins.metadata.GrailsPlugin
import org.codehaus.groovy.grails.web.pages.GroovyPage
import org.codehaus.groovy.grails.web.taglib.*
import org.codehaus.groovy.grails.web.taglib.exceptions.GrailsTagException
import org.springframework.web.util.*
import grails.util.GrailsUtil

class gsp_cmpe282_userLoginlogin_gsp extends GroovyPage {
public String getGroovyPageFileName() { "/WEB-INF/grails-app/views/userLogin/login.gsp" }
public Object run() {
Writer out = getOut()
Writer expressionOut = getExpressionOut()
registerSitemeshPreprocessMode()
printHtmlPart(0)
createTagBody(1, {->
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',4,['gsp_sm_xmlClosingForEmptyTag':(""),'charset':("utf-8")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',5,['gsp_sm_xmlClosingForEmptyTag':(""),'http-equiv':("X-UA-Compatible"),'content':("IE=edge")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',6,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("viewport"),'content':("widtd=device-widtd, initial-scale=1")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',7,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("description"),'content':("")],-1)
printHtmlPart(1)
invokeTag('captureMeta','sitemesh',8,['gsp_sm_xmlClosingForEmptyTag':(""),'name':("autdor"),'content':("")],-1)
printHtmlPart(2)
invokeTag('createLinkTo','g',11,['dir':("jquery"),'file':("jRating.jquery.css")],-1)
printHtmlPart(3)
createTagBody(2, {->
createClosureForHtmlPart(4, 3)
invokeTag('captureTitle','sitemesh',13,[:],3)
})
invokeTag('wrapTitleTag','sitemesh',13,[:],2)
printHtmlPart(5)
expressionOut.print(resource(dir: 'css', file: 'bootstrap.min.css'))
printHtmlPart(6)
expressionOut.print(resource(dir: 'css', file: 'bootstrap.css'))
printHtmlPart(7)
expressionOut.print(resource(dir: 'css', file: 'shop-homepage.css'))
printHtmlPart(8)
invokeTag('javascript','g',19,['src':("jquery.js")],-1)
printHtmlPart(1)
invokeTag('javascript','g',20,['src':("bootstrap.js")],-1)
printHtmlPart(1)
invokeTag('javascript','g',21,['src':("bootstrap.min.js")],-1)
printHtmlPart(9)
})
invokeTag('captureHead','sitemesh',23,[:],1)
printHtmlPart(1)
createTagBody(1, {->
printHtmlPart(10)
createTagBody(2, {->
printHtmlPart(11)
invokeTag('textField','g',49,['type':("text"),'id':("username"),'name':("username"),'class':("input-xlarge")],-1)
printHtmlPart(12)
invokeTag('passwordField','g',59,['name':("password"),'id':("password"),'class':("input-xlarge")],-1)
printHtmlPart(13)
invokeTag('submitButton','g',67,['value':("Login"),'name':("Login"),'class':("btn btn-success")],-1)
printHtmlPart(14)
})
invokeTag('form','g',71,['url':([controller:'UserLogin',action:'login']),'class':("form-horizontal"),'method':("POST")],2)
printHtmlPart(15)
createTagBody(2, {->
printHtmlPart(16)
invokeTag('textField','g',76,['type':("text"),'id':("username"),'name':("username"),'class':("input-xlarge")],-1)
printHtmlPart(17)
invokeTag('textField','g',78,['type':("text"),'id':("fname"),'name':("fname"),'class':("input-xlarge")],-1)
printHtmlPart(18)
invokeTag('textField','g',80,['type':("text"),'id':("lname"),'name':("lname"),'class':("input-xlarge")],-1)
printHtmlPart(19)
invokeTag('textField','g',82,['type':("text"),'id':("email"),'name':("email"),'class':("input-xlarge")],-1)
printHtmlPart(20)
invokeTag('textField','g',84,['type':("text"),'id':("address"),'name':("address"),'class':("input-xlarge")],-1)
printHtmlPart(21)
invokeTag('passwordField','g',87,['name':("password"),'id':("password"),'placeholder':(""),'class':("input-xlarge")],-1)
printHtmlPart(22)
invokeTag('submitButton','g',89,['value':("create"),'name':("Create Account"),'class':("btn btn-primary")],-1)
printHtmlPart(23)
})
invokeTag('form','g',91,['url':([controller:'UserLogin',action:'register']),'class':("form-horizontal"),'method':("POST"),'id':("tab")],2)
printHtmlPart(24)
})
invokeTag('captureBody','sitemesh',102,[:],1)
printHtmlPart(25)
}
public static final Map JSP_TAGS = new HashMap()
protected void init() {
	this.jspTags = JSP_TAGS
}
public static final String CONTENT_TYPE = 'text/html;charset=UTF-8'
public static final long LAST_MODIFIED = 1417446938000L
public static final String EXPRESSION_CODEC = 'html'
public static final String STATIC_CODEC = 'none'
public static final String OUT_CODEC = 'html'
public static final String TAGLIB_CODEC = 'none'
}
