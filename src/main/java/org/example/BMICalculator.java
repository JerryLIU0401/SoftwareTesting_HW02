package org.example;

public class BMICalculator {
  private double height;
  private double weight;

  public BMICalculator(double height, double weight) {
    this.height = height;
    this.weight = weight;
    // 身高體重小於等於零的例外處理
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
  // 回傳BMI
  public double getBmi() {
    double bmi = height / (weight * weight);
    return bmi;
  }
}
// BMI計算的例外
class BMICalculatorException extends Exception{
  public BMICalculatorException(String title){
    super(title);
  }
}
