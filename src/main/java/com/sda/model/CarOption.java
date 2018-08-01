package com.sda.model;


import javax.persistence.*;

@Entity
@Table(name = "car_options")
public class CarOption {

    @Id
    @Column(name = "option_code")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int optionCode;

    @Column(name = "option_name")
    private String optionName;

    @Column(name = "option_description")
    private String optionDescription;

    public int getOptionCode() {
        return this.optionCode;
    }

    public void setOptionCode(int optionCode) {
        this.optionCode = optionCode;
    }

    public String getOptionName() {
        return this.optionName;
    }

    public void setOptionName(String optionName) {
        this.optionName = optionName;
    }

    public String getOptionDescription() {
        return this.optionDescription;
    }

    public void setOptionDescription(String optionDescription) {
        this.optionDescription = optionDescription;
    }
}
