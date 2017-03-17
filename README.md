# CostCalculator documentaion

## Overview 

This README file explains how to use the CostCalculator library for NuPack Pricing Problem, which is freely available on the web at https://github.com/Lienita/ProjectCostCalculator

It includes Java source code files in a folder named [costcalculator](https://github.com/Lienita/ProjectCostCalculator/tree/master/src/costcalculator)


## Run in an IDE 

The library can be run in an IDE, such as Eclipse, by downloading and importing the solution provided.


## Run from the command line


## Code Example
  
 ```Java
package costcalculator;

public class DefaultCostCalculator implements CostCalculator {

  @Override
  public double getProjectCost(double basePrice, int peopleCount, String markup) {

    double flatMarkup, personMarkup, materialTypeMarkup, finalCost;
    Markup flat = new FlatMarkup();
    Markup person = new PersonMarkup();

    if(markup == null) {
      throw new CostCalculatorException("Markup is required");
    }
    
    Markup materialType = new MarkupBuilder().buildMarkup(markup);
    
    if (basePrice < 0 || peopleCount < 0) {
            throw new IllegalArgumentException("The base price and number of people should not be less than 0");
        }

        flatMarkup = basePrice * flat.getPercent();
        personMarkup = flatMarkup * peopleCount * person.getPercent();  
        materialTypeMarkup = flatMarkup * materialType.getPercent() ;
        finalCost = flatMarkup + personMarkup + materialTypeMarkup;

        return Math.round(finalCost * 100) / 100.00;
  }

}
```
## JUnit Tests

A variety of unit test were designed to test the class methods of the library. See the examples below:

```Java
@Test
  public void testFlatMarkupForExample1(){
    FlatMarkup flat = new FlatMarkup();
    
    double returnedValue = Math.round(1299.99 * flat.getPercent()*100.00)/100.00;
    
    Assert.assertEquals(1364.99, returnedValue, 0); 
  }
  
  @Test
  public void testFlatMarkupForExample2(){
    FlatMarkup flat = new FlatMarkup();
    
    double returnedValue = Math.round(5432.00 * flat.getPercent()*100.00)/100.00;
    
    Assert.assertEquals(5703.60, returnedValue, 0); 
    
  }
  
  @Test
  public void testFlatMarkupForExample3(){
    FlatMarkup flat = new FlatMarkup();
    
    double returnedValue = Math.round(12456.95 * flat.getPercent()*100.00)/100.00;
    
    Assert.assertEquals(13079.80, returnedValue, 0); 
  }
```

### Run the JUnit tests from Eclipse



### Run the JUnit tests from the command line






