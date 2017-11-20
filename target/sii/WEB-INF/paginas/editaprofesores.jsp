<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<div class="card card-container">
	<h3>Alta Profesores</h3>
	<s:form action="modificaProfesor" namespace="/" method="POST" class="form-signin">
		<span id="reauth-email" class="reauth-email"></span>
		<s:fielderror/>
		<s:textfield name="profesor.nidprofesor" class="form-control" enabled="false">${profesor.nidprofesor}</s:textfield>
		<s:textfield name="profesor.cnombre" class="form-control" placeholder="Nombre">${profesor.cnombre}</s:textfield>
		<s:textfield name="profesor.capp" class="form-control" placeholder="Primer Apellido" >${profesor.capp}</s:textfield>
		<s:textfield name="profesor.capm" class="form-control" placeholder="Segundo Apellido">${profesor.capm}</s:textfield>
		<s:textfield name="profesor.cdireccion" class="form-control" placeholder="Dirección">${profesor.cdireccion}</s:textfield>
		<s:textfield name="profesor.ctelefono" class="form-control" placeholder="Teléfono">${profesor.ctelefono}</s:textfield>
		<button class="btn btn-lg btn-primary btn-block btn-signin"
			type="submit">Modificar</button>
	</s:form>
</div>