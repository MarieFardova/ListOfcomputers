package com.engeto.computers;

public class Computer {
    private String model;
    private double weight;
    private double diagonalOfMonitor;
    private boolean isCompanyComputer;
    private boolean isLaptop;


    //VYGENERUJEME CONSTRUCTOR 1, přes pravé tlačítko, vždy je public
    public Computer(String model, double weight, double diagonalOfMonitor,
                    boolean isCompanyComputer, boolean isLaptop) {
        this.model = model;
        this.weight = weight;
        this.diagonalOfMonitor = diagonalOfMonitor;
        this.isCompanyComputer = isCompanyComputer;
        this.isLaptop = isLaptop;
    }
    //nový construktor 2- vytvořený a vyplněný ručně
    public Computer (String model, double weight) {
        this(model, weight,15.6, true,true);
        //this.model = model;
        //this.weight = weight;
        //this.diagonalOfMonitor = 15.6;
        //this.isCompanyComputer = true;
        //this.isLaptop = true;
    }

    //VYGENEROVANÝ GETTER A SETTER ,přes pravé tlačítko

    public String getModel() {
        return model;
    }
        //ručně si sama napíšu nový getter description
    public String getDescription() {
            System.out.println(getModel());
            return "Počítač " + model + " (" + diagonalOfMonitor + "\")";
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getDiagonalOfMonitor() {
        return diagonalOfMonitor;
    }

    public void setDiagonalOfMonitor(double diagonalOfMonitor) {
        this.diagonalOfMonitor = diagonalOfMonitor;
    }

    public boolean isCompanyComputer() {
        return isCompanyComputer;
    }

    public void setCompanyComputer(boolean companyComputer) {
        isCompanyComputer = companyComputer;
    }

    public boolean isLaptop() {
        return isLaptop;
    }

    public void setLaptop(boolean laptop) {
        isLaptop = laptop;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "model='" + model + '\'' +
                ", weight=" + weight +
                ", diagonalOfMonitor=" + diagonalOfMonitor +
                ", isCompanyComputer=" + isCompanyComputer +
                ", isLaptop=" + isLaptop +
                '}';
    }
}
