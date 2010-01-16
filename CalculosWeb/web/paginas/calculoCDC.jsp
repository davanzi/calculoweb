<?xml version="1.0" encoding="UTF-8"?>
<!-- 
    Document   : calculoCDC
    Created on : 14/01/2010, 16:22:47
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
                    <ice:panelGroup binding="#{paginas$calculoCDC.panelFundo}" dragListener="#{paginas$calculoCDC.panelFundo_processMyEvent}" id="panelFundo" style="height: 100%; left: 0px; top: 0px; position: absolute; width: 100%">
                        <ice:panelGroup dragListener="#{paginas$calculoCDC.panelCentral_processMyEvent}" id="panelCentral" style="top:30px; left:50%; position: absolute; border-width: 1px; border-style: dotted; background-color: rgb(204, 204, 204); height: 240px; margin-left: -192px; width: 384px">
                            <ice:commandButton action="#{paginas$calculoCDC.bcalcularJurosCDC_action}" binding="#{paginas$calculoCDC.bcalcularJurosCDC}"
                                id="bcalcularJurosCDC" style="left: 50%; margin-left:-41px; top: 192px; position: absolute; width: 82px" value="CALCULAR"/>
                            <ice:inputText binding="#{paginas$calculoCDC.labelCapital}" id="labelCapital" style="left: 167px; top: 49px; position: absolute"/>
                            <ice:inputText binding="#{paginas$calculoCDC.labelJuros}" id="labelJuros" style="left: 167px; top: 80px; position: absolute"/>
                            <ice:inputText binding="#{paginas$calculoCDC.labelParcelas}" id="labelParcelas" style="left: 167px; top: 112px; position: absolute"/>
                            <ice:outputLabel id="outCapital" style="left: 102px; top: 50px; position: absolute" value="Capital:">
                                <ice:outputLabel id="outCapital1"/>
                            </ice:outputLabel>
                            <ice:outputLabel id="outJuros" style="left: 102px; top: 80px; position: absolute" value="Juros:"/>
                            <ice:outputLabel id="outParcelas" style="left: 102px; top: 112px; position: absolute" value="Parcelas:"/>
                            <ice:outputLabel id="outTipoJuros" style="left: 103px; top: 143px; position: absolute" value="Tipo:"/>
                            <ice:selectBooleanCheckbox binding="#{paginas$calculoCDC.cbSimples}" id="cbSimples" label="Simples" partialSubmit="true"
                                style="left: 166px; top: 142px; position: absolute" title="Simples" valueChangeListener="#{paginas$calculoCDC.cbSimples_processValueChange}"/>
                            <ice:selectBooleanCheckbox binding="#{paginas$calculoCDC.cbComposto}" id="cbComposto" label="Composto" partialSubmit="true"
                                style="left: 166px; top: 166px; position: absolute" title="Composto" valueChangeListener="#{paginas$calculoCDC.cbComposto_processValueChange}"/>
                            <ice:outputText id="tsimples" style="font-size: 10px; left: 186px; top: 145px; position: absolute" value="simples"/>
                            <ice:outputText id="tcomposto" style="font-size: 10px; left: 186px; top: 169px; position: absolute" value="composto"/>
                            <ice:outputText id="tmensal" style="font-size: 10px; left: 258px; top: 145px; position: absolute" value="mensal"/>
                            <ice:outputText id="tanual" style="font-size: 10px; left: 258px; top: 169px; position: absolute" value="anual"/>
                            <ice:selectBooleanCheckbox binding="#{paginas$calculoCDC.cbMensal}" id="cbMensal" partialSubmit="true"
                                style="left: 238px; top: 142px; position: absolute" value="#{paginas$calculoCDC.defaultSelectedData6.selectedBoolean}" valueChangeListener="#{paginas$calculoCDC.cbMensal_processValueChange}"/>
                            <ice:selectBooleanCheckbox binding="#{paginas$calculoCDC.cbAnual}" id="cbAnual" partialSubmit="true"
                                style="left: 238px; top: 166px; position: absolute" value="#{paginas$calculoCDC.defaultSelectedData7.selectedBoolean}" valueChangeListener="#{paginas$calculoCDC.cbAnual_processValueChange}"/>
                            <ice:outputText binding="#{paginas$calculoCDC.outErro}" id="outErro" style="color: red; font-weight: bold; left: 50%; top: 216px; position: absolute; text-align: center; width: 384px; margin-left:-192px;"/>
                        </ice:panelGroup>
                        <ice:inputTextarea binding="#{paginas$calculoCDC.taSaida}" id="taSaida" style="height: 250px; left:50%; margin-left: -192px; top: 300px; position: absolute; width: 384px"/>
                    </ice:panelGroup>
                </ice:form>
            </body>
        </html>
    </f:view>
</jsp:root>
