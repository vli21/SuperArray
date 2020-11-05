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

  public SuperArray(int initialCapacity){
    data = new String [initialCapacity];
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

  public void add(int index, String element){
    if  (size == data.length){
      resize();
    }
    for(int i=size-1;i>=index;i--){
      data[i+1] = data[i];
    }
    data[index] = element;
    size++;
  }
  public String get(int index){
    return data[index];
  }

  public String set(int index, String element){
    data [index]= element;
    return data[index];
  }

  private void resize(){
    String temp[] = new String [data.length * 2];
        for (int i=0; i < data.length; i++){
            temp[i] = data[i];
        }
        data = temp;
  }

  public void clear(){
    String temp[]= new String [10];
    size = 0;
    data = temp;
  }

  public boolean isEmpty() {
    return size==0;
  }

  public String toString(){
    String array = "[";
    for (int i=0; i< size; i++){
      if (i== size-1){
        array+= data[i]+"]";
      }
      else{
      array+=data [i]+", ";
    }
    }
    return array;
  }

  public boolean contains(String s){
    boolean has=false;
    for (int i=0; i<size; i++){
      if (data[i].equals (s)){
        has =true;
      }
    }
    return has;
  }
}
