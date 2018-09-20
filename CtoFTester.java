class  CtoFTester{


  public static double celsiusToFahrenheit(double x){
   return 1.8*x+32;
  }
  public static double fahrenheitToCelsius(double y){
   return y/1.8-32/1.8;
  }
  public static void main(String[] args){
    int celsius=30;// variable that is converted to degrees fahreneit
    int fahrenheit=30;// variable that is converted to degrees celsius
    System.out.println(celsiusToFahrenheit(celsius)+" degrees fahrenheit");
    System.out.println(fahrenheitToCelsius(fahrenheit)+" degrees celsius");
  }
  }
