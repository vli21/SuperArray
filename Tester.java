public class Tester {
  public static void main (String args[]){
    SuperArray words = new SuperArray();
    words.add("kani");
    words.add("uni");
    words.add("ebi");
    for(int i = 0; i < words.size(); i++){
      System.out.println( words.get(i) );
    }

    System.out.println (words.size());

    words.clear();
    System.out.println(words.isEmpty());

    words.add("hi");
    words.add("im");
    words.add("empty");
    
    for(int i = 0; i < words.size(); i++){
      System.out.println( words.get(i) );
    }
    System.out.println(words.isEmpty());


  }
}
