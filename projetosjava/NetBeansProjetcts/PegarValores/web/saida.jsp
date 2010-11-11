<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%@taglib prefix="f" uri="http://java.sun.com/jsf/core"%>
<%@taglib prefix="h" uri="http://java.sun.com/jsf/html"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
   "http://www.w3.org/TR/html4/loose.dtd">

<%--
    This file is an entry point for JavaServer Faces application.
--%>
<f:view>
    <html>
        <head>
            <meta http-equiv="Content-Type" content="text/html; charset=UTF-8"/>
            <title>Saida</title>
        </head>
        <body>
            <h1><h:outputText value="Saída"/></h1>
            <h:form>
                <h:inputText value="#{SaidaManagedBean.saida}" />
                <h:commandButton value="ver" action="#{SaidaManagedBean.doSaida}" />

            </h:form>
        </body>
    </html>
</f:view>