package com.engeto.computers;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Employee {
    private String name;
    private LocalDate birthDate;
    private Computer mainComputer;
    private List<Computer> otherComputers = new ArrayList<>();

    public Employee(String name, LocalDate birthDate,
                    Computer mainComputer) {
        this.name = name;
        this.birthDate = birthDate;
        this.mainComputer = mainComputer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    public Computer getMainComputer() {
        return mainComputer;
    }

    public void setMainComputer(Computer mainComputer) {
        this.mainComputer = mainComputer;
    }

    public void addOtherComputer(Computer computer){
        otherComputers.add(computer);/*ručně přidám*/
    }
}
