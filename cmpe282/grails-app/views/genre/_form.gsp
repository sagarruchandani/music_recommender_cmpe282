<%@ page import="cmpe282.Genre" %>



<div class="fieldcontain ${hasErrors(bean: genreInstance, field: 'itemid', 'error')} required">
	<label for="itemid">
		<g:message code="genre.itemid.label" default="Itemid" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="itemid" type="number" value="${genreInstance.itemid}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: genreInstance, field: 'rating', 'error')} required">
	<label for="rating">
		<g:message code="genre.rating.label" default="Rating" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="rating" type="number" value="${genreInstance.rating}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: genreInstance, field: 'userid', 'error')} required">
	<label for="userid">
		<g:message code="genre.userid.label" default="Userid" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="userid" type="number" value="${genreInstance.userid}" required=""/>

</div>

