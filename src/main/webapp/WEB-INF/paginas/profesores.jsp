<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<div class="card card-container">
	<h3>Profesores registrados</h3>

</div><!-- /card-container -->
	<table class="table">
		<caption><a href="<s:url action="showProfesorRegister"/>">Agregar nuevo Profesor</a></caption>
		<thead>
		<tr>
			<th colspan=2></th>
			<th>Nombre Completo</th>
			<th>Dirección</th>
			<th>Teléfono</th>
		</tr>
		</thead>
		<tbody>
		<c:forEach items="${profesores}" var="profesor">
			<tr>
				<td><a href="<s:url action="showEditProfesorForm"/>?id=${profesor.nidprofesor}">Editar</a></td>
				<td><a href="<s:url action="showDelProfesorForm"/>?id=${profesor.nidprofesor}">Eliminar</a></td>
				<td>${profesor.cnombre} ${profesor.capp} ${profesor.capm}</td>
				<td>${profesor.cdireccion}</td>
				<td>${profesor.ctelefono}</td>
			</tr>
		</c:forEach>
		</tbody>
	</table>