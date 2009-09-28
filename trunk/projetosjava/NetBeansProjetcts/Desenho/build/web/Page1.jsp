<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : Page1
    Created on : Aug 3, 2009, 9:15:12 AM
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
                        <h:panelGrid columns="3" id="gridPanel1" style="height: 144px; left: 48px; top: 120px; position: absolute" width="552">

                            
                            <webuijsf:label for="textField1" id="label1" text="Nome"/>
                            <webuijsf:textField id="textField1" required="true"/>
                            <webuijsf:message for="textField1" id="message1" showDetail="false" showSummary="true"/>
                            <webuijsf:label for="textField2" id="label2" text="Senha"/>
                            <webuijsf:textField id="textField2" required="true"/>
                            <webuijsf:message for="textField2" id="message2" showDetail="false" showSummary="true"/>
                            <webuijsf:button actionExpression="#{Page1.button1_action}" id="button1" text="Entrar"/>
                            <webuijsf:button id="button2" text="Limpar Dados"/>
                        </h:panelGrid>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
