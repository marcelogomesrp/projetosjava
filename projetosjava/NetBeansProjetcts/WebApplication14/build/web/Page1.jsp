<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : Page1
    Created on : Aug 2, 2009, 1:40:12 PM
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
                        <webuijsf:upload binding="#{Page1.noia}" id="noia" style="left: 192px; top: 120px; position: absolute"/>
                        <webuijsf:button actionExpression="#{Page1.button1_action}" id="button1" style="left: 191px; top: 168px; position: absolute" text="OK"/>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
