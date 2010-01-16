<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : principal
    Created on : 14/01/2010, 17:45:56
    Author     : Usuario
-->
<jsp:root version="2.1" xmlns:f="http://java.sun.com/jsf/core" xmlns:h="http://java.sun.com/jsf/html" xmlns:ice="http://www.icesoft.com/icefaces/component" xmlns:jsp="http://java.sun.com/JSP/Page">
    <jsp:directive.page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"/>
    <f:view>
        <html id="outputHtml1">
            <head id="outputHead1">
                <ice:outputStyle href="./resources/stylesheet.css" id="outputStyle1"/>
                <ice:outputStyle href="./xmlhttp/css/xp/xp.css" id="outputStyle2"/>
            </head>
            <body id="outputBody1" style="-rave-layout: grid">
                <ice:form id="form1">
                    <ice:panelGroup id="panelGroup2" style="height: 100%; left: 0px; top: 0px; position: absolute; width: 100%">
                        <ice:panelGroup id="panelGroup1" style="top:30px; left:50%; position: absolute; border-width: 1px; border-style: dotted; background-color: rgb(204, 204, 204); height: 240px; margin-left: -192px; width: 384px">
                            <ice:commandButton action="#{paginas$principal.botaoJurosCDC_action}" binding="#{paginas$principal.botaoJurosCDC}"
                                id="botaoJurosCDC" style="left: 50%; margin-left:-100px; top: 30px; position: absolute; width: 200px" value="Juros de Crédito do Consumidor"/>
                        </ice:panelGroup>
                    </ice:panelGroup>
                </ice:form>
            </body>
        </html>
    </f:view>
</jsp:root>
