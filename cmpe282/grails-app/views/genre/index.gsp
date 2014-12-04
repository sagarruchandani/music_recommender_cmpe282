
<%@ page import="cmpe282.Genre" %>
<!DOCTYPE html>
<html>
	<head>
		<meta name="layout" content="main">
		<g:set var="entityName" value="${message(code: 'genre.label', default: 'Genre')}" />
		<title><g:message code="default.list.label" args="[entityName]" /></title>
	</head>
	<body>
		<a href="#list-genre" class="skip" tabindex="-1"><g:message code="default.link.skip.label" default="Skip to content&hellip;"/></a>
		<div class="nav" role="navigation">
			<ul>
				<li><a class="home" href="${createLink(uri: '/')}"><g:message code="default.home.label"/></a></li>
				<li><g:link class="create" action="create"><g:message code="default.new.label" args="[entityName]" /></g:link></li>
			</ul>
		</div>
		<div id="list-genre" class="content scaffold-list" role="main">
			<h1><g:message code="default.list.label" args="[entityName]" /></h1>
			<g:if test="${flash.message}">
				<div class="message" role="status">${flash.message}</div>
			</g:if>
			<table>
			<thead>
					<tr>
					
						<g:sortableColumn property="itemid" title="${message(code: 'genre.itemid.label', default: 'Itemid')}" />
					
						<g:sortableColumn property="rating" title="${message(code: 'genre.rating.label', default: 'Rating')}" />
					
						<g:sortableColumn property="userid" title="${message(code: 'genre.userid.label', default: 'Userid')}" />
					
					</tr>
				</thead>
				<tbody>
				<g:each in="${genreInstanceList}" status="i" var="genreInstance">
					<tr class="${(i % 2) == 0 ? 'even' : 'odd'}">
					
						<td><g:link action="show" id="${genreInstance.id}">${fieldValue(bean: genreInstance, field: "itemid")}</g:link></td>
					
						<td>${fieldValue(bean: genreInstance, field: "rating")}</td>
					
						<td>${fieldValue(bean: genreInstance, field: "userid")}</td>
					
					</tr>
				</g:each>
				</tbody>
			</table>
			<div class="pagination">
				<g:paginate total="${genreInstanceCount ?: 0}" />
			</div>
		</div>
	</body>
</html>
