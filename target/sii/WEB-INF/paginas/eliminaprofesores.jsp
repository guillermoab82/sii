<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri="http://java.sun.com/jsp/jstl/core"  %>
<%@ taglib prefix="s" uri="/struts-tags" %>
<div class="card card-container">
	<s:form action="delProfesor" namespace="/admin" method="post" class="form-signin">
		<h3>¿Seguro que desea eliminar al profesor ${profesor.cnombre} ${profesor.capp} ${profesor.capm} ?</h3>
		<s:submit value="Eliminar" class="btn btn-lg btn-primary btn-block btn-signin"></s:submit>
		<s:submit value="Cancelar" action="cancelDelProfesor" class="btn btn-lg btn-primary btn-block btn-signin"></s:submit>
	</s:form>
</div>