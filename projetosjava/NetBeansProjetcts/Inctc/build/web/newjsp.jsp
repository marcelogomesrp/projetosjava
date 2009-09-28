<%-- 
    Document   : newjsp
    Created on : Jul 29, 2009, 1:21:14 PM
    Author     : marcelo
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib uri="http://java.sun.com/jsf/core" prefix="f" %>
<%@ taglib uri="http://java.sun.com/jsf/html" prefix="h" %>
<%@ taglib uri="http://richfaces.org/a4j" prefix="a4j"%>
<%@ taglib uri="http://richfaces.org/rich" prefix="rich"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>

    </head>
    <body>
        <h1>Hello World!</h1>
        <h:outputText value="arquivo x"/>
        <h:form>
            
                    <rich:fileUpload
                        immediateUpload="true"
                        addControlLabel="Enviar imagem"
                        listHeight="50"               
                        fileUploadListener="#{uploadMB.fileUploadListener}" />
            
            
            <!-- rich:fileUpload fileUploadListener="{uploadMB.upload}" -->


        </h:form>
    </body>
</html>
