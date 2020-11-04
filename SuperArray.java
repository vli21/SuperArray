public class SuperArray{
  /*-----------------
  Instance Variables
  ------------------*/
  private String [] data;
  private int size; //The current size
  /*-----------
  Constructors
  ------------*/
  public SuperArray(){
     data= new String[10];
     size=0;
  }
  /*-----
  Methods
  ------*/
  public int size(){
    return size;
  }

  public boolean add(String element){
    if (size== data.length){
      resize();
    }
    data[size]= element;
    size++;
    return true;
  }

  public String get(int index){
    return data[index];
  }

  public String set(int index, String element){
    data [index]= element;
    return data[index];
  }

  private void resize(){
    String temp[] = new String [data.length+1];
        for (int i=0; i < data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
  }
  /*----------------
  Testing on example
  ----------------*/
  public static void main(String[] args) {
    SuperArray words = new SuperArray();
    words.add("kani");
    words.add("uni");
    words.add("ebi");
    for(int i = 0; i < words.size(); i++){
      System.out.println( words.get(i) );
    }
   }

}
