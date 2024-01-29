package ua.lviv.lga.Less12.task01;

public class HelmList {
    private int diameter;
    private HelmMaterial helmMaterials;

    public HelmList(int diameter, HelmMaterial helmMaterials) {
        this.diameter = diameter;
        this.helmMaterials = helmMaterials;
    }

    public int getDiameter() {
        return diameter;
    }

    public HelmMaterial getHelmMaterials() {
        return helmMaterials;
    }

    public void setHelmMaterials(HelmMaterial helmMaterials) {
        this.helmMaterials = helmMaterials;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    @Override
    public String toString() {
        return "Helm{" +
                "diameter=" + diameter +
                ", helmMaterials=" + helmMaterials +
                '}';
    }
}
