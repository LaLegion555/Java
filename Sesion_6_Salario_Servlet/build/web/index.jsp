<%-- 
    Document   : index
    Created on : 21/06/2020, 05:16:33 PM
    Author     : Martin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Salario</title>
    </head>
    <body>
        <center><h1>Calculo del Salario de un Trabajador</h1>
        <br><br>
        <form name="form_calcula" action="Calcula" method="POST">
            <table align="center" bgcolor="#FAAC58">
                <tr><td>Nombre: </td><td><input type="text" name="nombre" value="" size="50" /></td></tr>
                <tr><td>Direccion: </td><td><input type="text" name="direccion" value="" size="50" /></td></tr>
                <tr><td>Telefono: </td><td><input type="text" name="telefono" value="" /></td></tr>
                <tr><td>Días trabajados: </td><td><input type="text" name="dias" value="" /></td></tr>
                <tr><td>Pago por día: </td><td><input type="text" name="sueldo" value="" /></td></tr>
                <tr><td></td><td><input type="submit" name="calcular" value="Calcular" /></td></tr>
            </table>    
        </form>
    </body>
</html>
