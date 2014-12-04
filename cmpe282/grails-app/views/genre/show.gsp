
<%@ page import="cmpe282.Genre" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'genre.label', default: 'Genre')}" />
		<title><g:message code="default.show.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#show-genre" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="list" action="index"><g:message code="default.list.label" args="[entityName]" /></g:link></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="show-genre" class="content scaffold-show" role="main">
			<h1><g:message code="default.show.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
			<div class="message" role="status">${flash.message}</div>
			</g:if>
			<ol class="property-list genre">
			
				<g:if test="${genreInstance?.itemid}">
				<li class="fieldcontain">
					<span id="itemid-label" class="property-label"><g:message code="genre.itemid.label" default="Itemid" /></span>
					
						<span class="property-value" aria-labelledby="itemid-label"><g:fieldValue bean="${genreInstance}" field="itemid"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${genreInstance?.rating}">
				<li class="fieldcontain">
					<span id="rating-label" class="property-label"><g:message code="genre.rating.label" default="Rating" /></span>
					
						<span class="property-value" aria-labelledby="rating-label"><g:fieldValue bean="${genreInstance}" field="rating"/></span>
					
				</li>
				</g:if>
			
				<g:if test="${genreInstance?.userid}">
				<li class="fieldcontain">
					<span id="userid-label" class="property-label"><g:message code="genre.userid.label" default="Userid" /></span>
					
						<span class="property-value" aria-labelledby="userid-label"><g:fieldValue bean="${genreInstance}" field="userid"/></span>
					
				</li>
				</g:if>
			
			</ol>
			<g:form url="[resource:genreInstance, action:'delete']" method="DELETE">
				<fieldset class="buttons">
					<g:link class="edit" action="edit" resource="${genreInstance}"><g:message code="default.button.edit.label" default="Edit" /></g:link>
					<g:actionSubmit class="delete" action="delete" value="${message(code: 'default.button.delete.label', default: 'Delete')}" onclick="return confirm('${message(code: 'default.button.delete.confirm.message', default: 'Are you sure?')}');" />
				</fieldset>
			</g:form>
		</div>
	</body>
</html>
