/*
 * calculoCDC.java
 *
 * Created on 14/01/2010, 16:22:47
 * Copyright Usuario
 */
package calculosweb.paginas;

import calculos.Formatador;
import com.icesoft.faces.component.dragdrop.DragEvent;
import com.icesoft.faces.component.ext.HtmlCommandButton;
import com.icesoft.faces.component.ext.HtmlInputText;
import com.icesoft.faces.component.ext.HtmlInputTextarea;
import com.icesoft.faces.component.ext.HtmlOutputText;
import com.icesoft.faces.component.ext.HtmlPanelGroup;
import com.icesoft.faces.component.ext.HtmlSelectBooleanCheckbox;
import com.icesoft.faces.component.ext.HtmlSelectOneRadio;
import com.icesoft.faces.component.jsfcl.data.DefaultSelectedData;
import com.icesoft.faces.component.jsfcl.data.DefaultSelectionItems;
import com.sun.rave.web.ui.appbase.AbstractPageBean;
import javax.faces.FacesException;
import calculosweb.RequestBean1;
import calculosweb.ApplicationBean1;
import calculosweb.SessionBean1;
import javax.faces.event.ValueChangeEvent;
import calculos.Validador;

/**
 * <p>Page bean that corresponds to a similarly named JSP page.  This
 * class contains component definitions (and initialization code) for
 * all components that you have defined on this page, as well as
 * lifecycle methods and event handlers where you may add behavior
 * to respond to incoming events.</p>
 */
public class calculoCDC extends AbstractPageBean {
    // <editor-fold defaultstate="collapsed" desc="Managed Component Definition">

    private int __placeholder;

    /**
     * <p>Automatically managed component initialization.  <strong>WARNING:</strong>
     * This method is automatically generated, so any user-specified code inserted
     * here is subject to being replaced.</p>
     */
    private void _init() throws Exception {
    }
    private HtmlCommandButton bcalcularJurosCDC = new HtmlCommandButton();

    public HtmlCommandButton getBcalcularJurosCDC() {
        return bcalcularJurosCDC;
    }

    public void setBcalcularJurosCDC(HtmlCommandButton hcb) {
        this.bcalcularJurosCDC = hcb;
    }
    private HtmlInputText labelCapital = new HtmlInputText();

    public HtmlInputText getLabelCapital() {
        return labelCapital;
    }

    public void setLabelCapital(HtmlInputText hit) {
        this.labelCapital = hit;
    }
    private HtmlInputText labelJuros = new HtmlInputText();

    public HtmlInputText getLabelJuros() {
        return labelJuros;
    }

    public void setLabelJuros(HtmlInputText hit) {
        this.labelJuros = hit;
    }
    private HtmlInputText labelParcelas = new HtmlInputText();

    public HtmlInputText getLabelParcelas() {
        return labelParcelas;
    }

    public void setLabelParcelas(HtmlInputText hit) {
        this.labelParcelas = hit;
    }
    private HtmlInputTextarea taSaida = new HtmlInputTextarea();

    public HtmlInputTextarea getTaSaida() {
        return taSaida;
    }

    public void setTaSaida(HtmlInputTextarea hit) {
        this.taSaida = hit;
    }
    private HtmlPanelGroup panelFundo = new HtmlPanelGroup();

    public HtmlPanelGroup getPanelFundo() {
        return panelFundo;
    }

    public void setPanelFundo(HtmlPanelGroup hpg) {
        this.panelFundo = hpg;
    }
    private DefaultSelectedData defaultSelectedData1 = new DefaultSelectedData();

    public DefaultSelectedData getDefaultSelectedData1() {
        return defaultSelectedData1;
    }

    public void setDefaultSelectedData1(DefaultSelectedData dsd) {
        this.defaultSelectedData1 = dsd;
    }
    private DefaultSelectedData selectBooleanCheckbox1Bean = new DefaultSelectedData();

    public DefaultSelectedData getSelectBooleanCheckbox1Bean() {
        return selectBooleanCheckbox1Bean;
    }

    public void setSelectBooleanCheckbox1Bean(DefaultSelectedData dsd) {
        this.selectBooleanCheckbox1Bean = dsd;
    }
    private DefaultSelectedData defaultSelectedData3 = new DefaultSelectedData();

    public DefaultSelectedData getDefaultSelectedData3() {
        return defaultSelectedData3;
    }

    public void setDefaultSelectedData3(DefaultSelectedData dsd) {
        this.defaultSelectedData3 = dsd;
    }
    private DefaultSelectedData selectOneRadio1Bean = new DefaultSelectedData();

    public DefaultSelectedData getSelectOneRadio1Bean() {
        return selectOneRadio1Bean;
    }

    public void setSelectOneRadio1Bean(DefaultSelectedData dsd) {
        this.selectOneRadio1Bean = dsd;
    }
    private DefaultSelectionItems selectOneRadio1DefaultItems = new DefaultSelectionItems();

    public DefaultSelectionItems getSelectOneRadio1DefaultItems() {
        return selectOneRadio1DefaultItems;
    }

    public void setSelectOneRadio1DefaultItems(DefaultSelectionItems dsi) {
        this.selectOneRadio1DefaultItems = dsi;
    }
    private HtmlSelectOneRadio cbJuros = new HtmlSelectOneRadio();

    public HtmlSelectOneRadio getCbJuros() {
        return cbJuros;
    }

    public void setCbJuros(HtmlSelectOneRadio hsor) {
        this.cbJuros = hsor;
    }
    private DefaultSelectedData selectOneMenu1Bean = new DefaultSelectedData();

    public DefaultSelectedData getSelectOneMenu1Bean() {
        return selectOneMenu1Bean;
    }

    public void setSelectOneMenu1Bean(DefaultSelectedData dsd) {
        this.selectOneMenu1Bean = dsd;
    }
    private DefaultSelectionItems selectOneMenu1DefaultItems = new DefaultSelectionItems();

    public DefaultSelectionItems getSelectOneMenu1DefaultItems() {
        return selectOneMenu1DefaultItems;
    }

    public void setSelectOneMenu1DefaultItems(DefaultSelectionItems dsi) {
        this.selectOneMenu1DefaultItems = dsi;
    }
    private DefaultSelectedData defaultSelectedData4 = new DefaultSelectedData();

    public DefaultSelectedData getDefaultSelectedData4() {
        return defaultSelectedData4;
    }

    public void setDefaultSelectedData4(DefaultSelectedData dsd) {
        this.defaultSelectedData4 = dsd;
    }
    private DefaultSelectedData defaultSelectedData5 = new DefaultSelectedData();

    public DefaultSelectedData getDefaultSelectedData5() {
        return defaultSelectedData5;
    }

    public void setDefaultSelectedData5(DefaultSelectedData dsd) {
        this.defaultSelectedData5 = dsd;
    }
    private HtmlSelectBooleanCheckbox cbSimples = new HtmlSelectBooleanCheckbox();

    public HtmlSelectBooleanCheckbox getCbSimples() {
        return cbSimples;
    }

    public void setCbSimples(HtmlSelectBooleanCheckbox hsbc) {
        this.cbSimples = hsbc;
    }
    private HtmlSelectBooleanCheckbox cbComposto = new HtmlSelectBooleanCheckbox();

    public HtmlSelectBooleanCheckbox getCbComposto() {
        return cbComposto;
    }

    public void setCbComposto(HtmlSelectBooleanCheckbox hsbc) {
        this.cbComposto = hsbc;
    }
    private DefaultSelectedData defaultSelectedData6 = new DefaultSelectedData();

    public DefaultSelectedData getDefaultSelectedData6() {
        return defaultSelectedData6;
    }

    public void setDefaultSelectedData6(DefaultSelectedData dsd) {
        this.defaultSelectedData6 = dsd;
    }
    private DefaultSelectedData defaultSelectedData7 = new DefaultSelectedData();

    public DefaultSelectedData getDefaultSelectedData7() {
        return defaultSelectedData7;
    }

    public void setDefaultSelectedData7(DefaultSelectedData dsd) {
        this.defaultSelectedData7 = dsd;
    }
    private HtmlSelectBooleanCheckbox cbMensal = new HtmlSelectBooleanCheckbox();

    public HtmlSelectBooleanCheckbox getCbMensal() {
        return cbMensal;
    }

    public void setCbMensal(HtmlSelectBooleanCheckbox hsbc) {
        this.cbMensal = hsbc;
    }
    private HtmlSelectBooleanCheckbox cbAnual = new HtmlSelectBooleanCheckbox();

    public HtmlSelectBooleanCheckbox getCbAnual() {
        return cbAnual;
    }

    public void setCbAnual(HtmlSelectBooleanCheckbox hsbc) {
        this.cbAnual = hsbc;
    }
    private HtmlOutputText outErro = new HtmlOutputText();

    public HtmlOutputText getOutErro() {
        return outErro;
    }

    public void setOutErro(HtmlOutputText hot) {
        this.outErro = hot;
    }

    // </editor-fold>
    /**
     * <p>Construct a new Page bean instance.</p>
     */
    public calculoCDC() {
    }

    /**
     * <p>Callback method that is called whenever a page is navigated to,
     * either directly via a URL, or indirectly via page navigation.
     * Customize this method to acquire resources that will be needed
     * for event handlers and lifecycle methods, whether or not this
     * page is performing post back processing.</p>
     * 
     * <p>Note that, if the current request is a postback, the property
     * values of the components do <strong>not</strong> represent any
     * values submitted with this request.  Instead, they represent the
     * property values that were saved for this view when it was rendered.</p>
     */
    @Override
    public void init() {

        // Perform initializations inherited from our superclass
        super.init();
        // Perform application initialization that must complete
        // *before* managed components are initialized
        // TODO - add your own initialiation code here

        // <editor-fold defaultstate="collapsed" desc="Managed Component Initialization">
        // Initialize automatically managed components
        // *Note* - this logic should NOT be modified
        try {
            _init();
        } catch (Exception e) {
            log("calculoCDC Initialization Failure", e);
            throw e instanceof FacesException ? (FacesException) e : new FacesException(e);
        }

        // </editor-fold>
        // Perform application initialization that must complete
        // *after* managed components are initialized
        // TODO - add your own initialization code here
        cbComposto.setSelected(true);
        cbSimples.setSelected(false);
        cbMensal.setSelected(false);
        cbAnual.setSelected(true);
        outErro.setValue("");
        //taSaida.setVisible(false);
    }

    /**
     * <p>Callback method that is called after the component tree has been
     * restored, but before any event processing takes place.  This method
     * will <strong>only</strong> be called on a postback request that
     * is processing a form submit.  Customize this method to allocate
     * resources that will be required in your event handlers.</p>
     */
    @Override
    public void preprocess() {
    }

    /**
     * <p>Callback method that is called just before rendering takes place.
     * This method will <strong>only</strong> be called for the page that
     * will actually be rendered (and not, for example, on a page that
     * handled a postback and then navigated to a different page).  Customize
     * this method to allocate resources that will be required for rendering
     * this page.</p>
     */
    @Override
    public void prerender() {
    }

    /**
     * <p>Callback method that is called after rendering is completed for
     * this request, if <code>init()</code> was called (regardless of whether
     * or not this was the page that was actually rendered).  Customize this
     * method to release resources acquired in the <code>init()</code>,
     * <code>preprocess()</code>, or <code>prerender()</code> methods (or
     * acquired during execution of an event handler).</p>
     */
    @Override
    public void destroy() {
    }

    /**
     * <p>Retornar uma referência para o Bean de dados limitados.</p>
     *
     * @retorna uma referência para o bean de dados limitados
     */
    protected RequestBean1 getRequestBean1() {
        return (RequestBean1) getBean("RequestBean1");
    }

    /**
     * <p>Retornar uma referência para o Bean de dados limitados.</p>
     *
     * @retorna uma referência para o bean de dados limitados
     */
    protected ApplicationBean1 getApplicationBean1() {
        return (ApplicationBean1) getBean("ApplicationBean1");
    }

    /**
     * <p>Retornar uma referência para o Bean de dados limitados.</p>
     *
     * @retorna uma referência para o bean de dados limitados
     */
    protected SessionBean1 getSessionBean1() {
        return (SessionBean1) getBean("SessionBean1");
    }

    public String bcalcularJurosCDC_action() {
        taSaida.setValue("");
        try {
            Validador v = new Validador();
            outErro.setValue(null);
            if (!v.isPreenchido(labelCapital.getValue().toString(), labelJuros.getValue().toString(), labelParcelas.getValue().toString())) {
                outErro.setValue("Preencha Todos os Campos");
            } else if (!v.isValido(labelJuros.getValue().toString())) {
                outErro.setValue("Utilize . (ponto) ao invés de , (virgula)");
            } else if (!v.isNumerico(labelCapital.getValue().toString(), labelJuros.getValue().toString(), labelParcelas.getValue().toString())) {
                outErro.setValue("Preencha os Campos com Números");
            } else {
                //taSaida.setVisible(true);
                Formatador f = new Formatador();
                taSaida.setValue(f.formatarSaidaCdc(labelCapital.getValue().toString(), labelJuros.getValue().toString(), labelParcelas.getValue().toString()));
            }
        } catch (Exception e) {
        }
        return null;
    }

    public void selectMenu_processValueChange(ValueChangeEvent vce) {
    }

    public void panelCentral_processMyEvent(DragEvent de) {
    }

    public void cbSimples_processValueChange(ValueChangeEvent vce) {
        cbSimples.setSelected(true);
        cbComposto.setSelected(false);
    }

    public void cbComposto_processValueChange(ValueChangeEvent vce) {
        cbComposto.setSelected(true);
        cbSimples.setSelected(false);
    }

    public void cbMensal_processValueChange(ValueChangeEvent vce) {
        cbMensal.setSelected(true);
        cbAnual.setSelected(false);
    }

    public void cbAnual_processValueChange(ValueChangeEvent vce) {
        cbMensal.setSelected(false);
        cbAnual.setSelected(true);
    }

    public void panelFundo_processMyEvent(DragEvent de) {
    }
}

