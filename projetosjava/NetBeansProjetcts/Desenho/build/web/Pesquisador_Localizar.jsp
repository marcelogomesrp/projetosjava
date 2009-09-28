<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : Pesquisador_Localizar
    Created on : Aug 3, 2009, 9:49:03 AM
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
                        <webuijsf:staticText id="staticText1" style="left: 48px; top: 72px; position: absolute" text="Nome do Arquivo"/>
                        <webuijsf:staticText id="staticText2" style="left: 552px; top: 72px; position: absolute" text="Tipo"/>
                        <webuijsf:staticText id="staticText3" style="left: 48px; top: 120px; position: absolute" text="Pesquisador"/>
                        <webuijsf:textField columns="50" id="textField1" style="left: 144px; top: 72px; position: absolute"/>
                        <webuijsf:dropDown id="dropDown1" items="#{Pesquisador_Localizar.dropDown1DefaultOptions.options}" style="left: 600px; top: 72px; position: absolute"/>
                        <webuijsf:dropDown id="dropDown2" items="#{Pesquisador_Localizar.dropDown2DefaultOptions.options}" style="left: 144px; top: 120px; position: absolute"/>
                        <webuijsf:table augmentTitle="false" id="table1" style="left: 48px; top: 192px; position: absolute; width: 648px" title="Table" width="648">
                            <webuijsf:tableRowGroup id="tableRowGroup1" rows="10" sourceData="#{Pesquisador_Localizar.defaultTableDataProvider}" sourceVar="currentRow">
                                <webuijsf:tableColumn headerText="column1" id="tableColumn1" sort="column1">
                                    <webuijsf:staticText id="staticText4" text="#{currentRow.value['column1']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="column2" id="tableColumn2" sort="column2">
                                    <webuijsf:staticText id="staticText5" text="#{currentRow.value['column2']}"/>
                                </webuijsf:tableColumn>
                                <webuijsf:tableColumn headerText="column3" id="tableColumn3" sort="column3" width="143">
                                    <webuijsf:staticText id="staticText6" text="#{currentRow.value['column3']}"/>
                                </webuijsf:tableColumn>
                            </webuijsf:tableRowGroup>
                        </webuijsf:table>
                        <div style="left: 24px; top: 0px; position: absolute; width: 694px">
                            <jsp:directive.include file="Menu.jspf"/>
                        </div>
                    </webuijsf:form>
                </webuijsf:body>
            </webuijsf:html>
        </webuijsf:page>
    </f:view>
</jsp:root>
