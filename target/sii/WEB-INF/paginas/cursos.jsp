<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<div class="card card-container">
	<h3>Cursos Registrados Nuevo</h3>
</div> <!-- /card-container -->
	<table class="table">
		<caption><a href="#>">Agregar nuevo Curso</a></caption>
		<thead>
		<tr>
			<th colspan=2></th>
			<th>Curso</th>
			<th>Cupo</th>
			<th>Profesor</th>
		</tr>
		</thead>
		<tbody>
		<!--<c:forEach items="${cursos}" var="curso">
			<tr>
				<td><a href="#">Editar</a></td>
				<td><a href="#">Eliminar</a></td>
				<td>${curso.cnombrecurso}</td>
				<td>${curso.cupo}</td>
				<td>678</td>
			</tr>
		</c:forEach> -->
		</tbody>
	</table>