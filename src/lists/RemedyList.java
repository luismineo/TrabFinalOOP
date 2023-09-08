package lists;

public class RemedyList {
    //dipirona 20mg/kg humano - 25mg/kg cães/gatos
    //paracetamol 10mg/kg humano - 15mg/kg cães - não indicado para felinos
    //ivermectina 0,2mg/kg humano - 0,4mg/kg cães/gatos

    //humanos
    private float dipironaH = 20;
    private float paracetamolH = 15;
    private float ivermectinaH = 0.2F;
    //animais
    private float dipironaA = 25;
    private float paracetamolA = 10;
    private float ivermectinaA = 0.4F;

    //humanos
    public float getDipironaH() {
        return dipironaH;
    }

    public float getParacetamolH() {
        return paracetamolH;
    }

    public float getIvermectinaH() {
        return ivermectinaH;
    }

    //animais
    public float getDipironaA() {
        return dipironaA;
    }

    public float getParacetamolA() {
        return paracetamolA;
    }

    public float getIvermectinaA() {
        return ivermectinaA;
    }
}