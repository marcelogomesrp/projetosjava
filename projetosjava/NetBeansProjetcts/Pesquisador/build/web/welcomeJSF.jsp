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
            <title>JSP Page</title>
        </head>
        <body>
            <h1><h:outputText value="Pesquisador"/></h1>

            <h:form>
                <h:messages id="mensagens" />
                <h:panelGrid columns="2" >
                    <h:outputLabel value="Id" for="idInput"/>
                    <h:inputText value="#{PesquisadorManagedBean.id}" id="idInput">
                        <f:convertNumber />
                    </h:inputText>
                    <h:outputLabel value="Nome" for="nomeInput"/>
                    <h:inputText value="#{PesquisadorManagedBean.nome}" id="nomeInput" />
                    <h:commandButton value="Cadastrar" action="#{PesquisadorManagedBean.doGravar}" />
                    <h:commandButton value="Remover" action="#{PesquisadorManagedBean.doExcluir}" />
                </h:panelGrid>

            </h:form>
        </body>
    </html>
</f:view>
