<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<div class="card card-container">
	<h3>Profesores registrados</h3>
	<table style="width:100%">
		<caption><a href="<s:url action="showProfesorRegister"/>">Agregar nuevo Profesor</a></caption>
		<tr>
			<td colspan=2></td>
			<td>Nombre Completo</td>
			<td>Dirección</td>
			<td>Teléfono</td>
		</tr>
		<c:forEach items="${profesores}" var="profesor">
			
			<tr>
				<td><a href="<s:url action="showEditProfesorForm"/>?id=${profesor.nidprofesor}">Editar</a></td>
				<td><a href="<s:url action="delProfesor"/>?id=${profesor.nidprofesor}">Eliminar</a></td>
				<td>${profesor.cnombre}</td>
				<td>${profesor.cdireccion}</td>
				<td>${profesor.ctelefono}</td>
			</tr>
		</c:forEach>
	</table>
</div><!-- /card-container -->