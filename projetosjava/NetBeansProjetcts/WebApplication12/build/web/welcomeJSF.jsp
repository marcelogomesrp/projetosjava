<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>
<%@taglib prefix="tr" uri="http://myfaces.apache.org/trinidad"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<%--
    This file is an entry point for JavaServer Faces application.
--%>
<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>JSP Page</title>
        </head>
        <body>
            <h1><h:outputText value="JavaServer Faces2"/></h1>
            <tr:form>
                <tr:outputText value="ok" />
                <h:outputText value="#{arquivo.nome}" />
                <br />
                <h:commandButton value="ok" />
                <br />
                <tr:inputFile id="imagem" value="#{arquivo.arquivo}" rendered="true"/>
                <h:message for="imagem" />
                <h:commandButton value="ok" action="#{arquivo.doDownload}" id="botaoOk" />
            </tr:form>
        </body>
    </html>
</f:view>
