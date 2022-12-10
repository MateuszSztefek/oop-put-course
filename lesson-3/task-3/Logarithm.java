public class Logarithm implements Number {

  private double base, argument;

  @Override
  public double doubleValue() throws Exception {
      if (base < 0 || base == 1 || argument < 0){
          throw new Exception();
      }else{
          return Math.log(this.argument) / Math.log(this.base);
      }
    
  }

  public Logarithm(double inputBase, double inputArgument) {
    this.base = inputBase;
    this.argument = inputArgument;
  }
}