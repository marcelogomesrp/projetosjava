<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : MeusDados
    Created on : Aug 3, 2009, 9:58:07 AM
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
                        <webuijsf:label id="label1" style="left: 96px; top: 120px; position: absolute" text="Nome"/>
                        <webuijsf:textField columns="60" id="textField1" style="left: 192px; top: 120px; position: absolute" valueChangeListenerExpression="#{MeusDados.textField1_processValueChange}"/>
                        <webuijsf:label id="label2" style="left: 96px; top: 168px; position: absolute" text="Fone"/>
                        <webuijsf:textField columns="60" id="textField2" style="left: 192px; top: 168px; position: absolute"/>
                        <webuijsf:label id="label3" style="left: 96px; top: 216px; position: absolute" text="e-mail"/>
                        <webuijsf:textField columns="60" id="textField3" style="left: 192px; top: 216px; position: absolute"/>
                        <webuijsf:label id="label4" style="left: 96px; top: 264px; position: absolute" text="Senha"/>
                        <webuijsf:textField columns="60" id="textField4" style="left: 192px; top: 264px; position: absolute"/>
                        <webuijsf:textField columns="60" id="textField5" style="left: 192px; top: 312px; position: absolute"/>
                        <webuijsf:label id="label5" style="left: 96px; top: 312px; position: absolute" text="Confirmação"/>
                        <webuijsf:button id="button1" style="left: 95px; top: 360px; position: absolute" text="Atualizar"/>
                        <div style="left: 48px; top: 0px; position: absolute; width: 706px">
                            <jsp:directive.include file="Menu.jspf"/>
                        </div>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
