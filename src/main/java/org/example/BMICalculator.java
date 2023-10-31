package org.example;

public class BMICalculator {
  private double height;
  private double weight;

  public BMICalculator(double height, double weight) {
    this.height = height;
    this.weight = weight;
    if(height <= 0 || weight <= 0){
      try {
        throw new BMICalculatorException("height or weight must bigger than 0");
      } catch (BMICalculatorException e) {
        throw new RuntimeException(e);
      }
    }

  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public double getWeight() {
    return weight;
  }

  public void setWeight(double weight) {
    this.weight = weight;
  }

  public double getBmi() {
    double bmi = height / (weight * weight);
    return bmi;
  }
}

class BMICalculatorException extends Exception{
  public BMICalculatorException(String title){
    super(title);
  }
}
