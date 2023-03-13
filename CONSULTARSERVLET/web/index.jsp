<%-- 
    Document   : index
    Created on : 26/10/2020, 10:51:53 PM
    Author     : ROMAN
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>CONSULTA LOS DATOS DEL ALUMNO</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        
    </head>
    <body>
        <form name="frmConsulta" action="Consulta" method="POST">
            <table>
                <tr>
                    <td width="130">Dato del alumno?</td>
                    <td width="84"><input name="NOMBRE" type="text" class="fieldEdit" id="NOMBRE" size="8" maxlength="8"></td>
                    <td width="124"><input type="submit" value="Consultar" name="consulta"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
