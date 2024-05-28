public class MyArray {
    public static void main(String[] args) {
        
    
int[] numbersArray = new int[5];
    numbersArray[0] = 17;
    numbersArray[1] = 31;
    numbersArray[2] = 29;
    numbersArray[3] = 65;
    numbersArray[4] = 98;

  for (int i=0; i <numbersArray.length; i++){
    System.out.println(numbersArray[i]);
  }
  for (int i=0; i<numbersArray.length; i++){
     System.out.println(numbersArray[i]);
     if (numbersArray[i] == 65){
      System.out.println("Found " + numbersArray[i]);
      break;
     }     
   

   }
 }
}
