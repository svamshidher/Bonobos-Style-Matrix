package view;

import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;
import javax.faces.event.ValueChangeEvent;

import oracle.adf.view.rich.component.rich.input.RichInputText;

import oracle.adf.view.rich.context.AdfFacesContext;




public class ItemCreation {
    private RichInputText masterSKU;
    private RichInputText size1;
    private RichInputText code;

    public ItemCreation() {
    }

    public void setMasterSKU(RichInputText masterSKU) {
        this.masterSKU = masterSKU;
    }

    public RichInputText getMasterSKU() {
        return masterSKU;
    }

    public void setSize1(RichInputText size1) {
        this.size1 = size1;
    }

    public RichInputText getSize1() {
        return size1;
    }


    public void setCode(RichInputText code) {
        this.code = code;
    }

    public RichInputText getCode() {
        return code;
    }

    public void CodeValueChangeListner(ValueChangeEvent valueChangeEvent) {
        RichInputText code = getCode();
        RichInputText masterSKU=getMasterSKU();
        RichInputText input=  getSize1();
        String value=""+masterSKU.getValue()+"-"+code.getValue()+"-"+input.getLabel();
        input.setValue(value);
        AdfFacesContext.getCurrentInstance().addPartialTarget(input);
    }
}
