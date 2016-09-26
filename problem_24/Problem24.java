import java.math.BigInteger;

public class Problem24 {

  public Problem24(){
    int counter = 1;
    BigInteger candidate = new BigInteger("0123456789");
    int comparisonResult = candidate.compareTo(new BigInteger("9876543210"));
    String cndStr = "";

    while(comparisonResult == -1 && counter <= 1000000){
      //System.out.println("candidate: " + candidate.toString());
      //System.out.println("1 index: " + candidate.toString().indexOf("1"));
      candidate = candidate.add(new BigInteger("1"));
      cndStr = candidate.toString();
      if(cndStr.length() == 9){
        cndStr = "0" + cndStr;
      }

      if(cndStr.indexOf("0") >= 0 && cndStr.indexOf("1") >= 0 && cndStr.indexOf("2") >= 0 && cndStr.indexOf("3") >= 0 && cndStr.indexOf("4") >= 0 && cndStr.indexOf("5") >= 0 && cndStr.indexOf("6") >= 0 && cndStr.indexOf("7") >= 0 && cndStr.indexOf("8") >= 0 && cndStr.indexOf("9") >= 0){
        counter++;
        System.out.println("candidate " + counter + ": " + cndStr);
      }

      comparisonResult = candidate.compareTo(new BigInteger("9876543210"));
    }
  }

  public static void main(String[] args){
    Problem24 p24 = new Problem24();
  }
}
