<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : Page1
    Created on : Aug 4, 2009, 9:21:42 AM
    Author     : marcelo
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:jsp="http://java.sun.com/JSP/Page" xmlns:webuijsf="http://www.sun.com/webui/webuijsf">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <webuijsf:page id="page1">
            <webuijsf:html id="html1">
                <webuijsf:head id="head1">
                    <webuijsf:link id="link1" url="/resources/stylesheet.css"/>
                </webuijsf:head>
                <webuijsf:body id="body1" style="-rave-layout: grid">
                    <webuijsf:form id="form1">
                        <h:panelGrid columns="3" id="gridPanel1" style="height: 218px; left: 120px; top: 72px; position: absolute" width="432">
                            <h:outputText id="outputText1" value="Nome"/>
                            <h:inputText binding="#{Page1.textField1}" id="textField1" required="true" size="60"/>
                            <h:message errorClass="errorMessage" fatalClass="fatalMessage" for="textField1" id="inlineMessage1" infoClass="infoMessage"
                                showDetail="false" showSummary="true" warnClass="warnMessage"/>
                            <h:outputText id="outputText2" value="Senha"/>
                            <h:inputSecret binding="#{Page1.secretField1}" id="secretField1" required="true" size="60"/>
                            <h:message errorClass="errorMessage" fatalClass="fatalMessage" for="secretField1" id="inlineMessage2" infoClass="infoMessage"
                                showDetail="false" showSummary="true" warnClass="warnMessage"/>
                            <h:commandButton action="#{Page1.button1_action}" id="button1" value="Entrar"/>
                        </h:panelGrid>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
