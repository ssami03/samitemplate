package edu.ncl.csc1035.referenceTypes;

public class Button {
    String label;
    public Button(String label) {
        this.label = label;
    }
    public Button() {
    }
    public String getLabel() {
        return label;
    }
    public void setLabel(String label) {
        this.label = label;
    }
    @Override
    public String toString() {
        return "Button{" +
                "label='" + label + '\'' +
                '}';
    }
}
