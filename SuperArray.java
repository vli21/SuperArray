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
    if  (size >= data.length){
      resize();
    }
    for(int i=size-1;i>=index;i--){
      data[i+1] = data[i];
    }
    data[index] = element;
    size++;
  }
  public String remove(int index){
    String removed;
    if (index>=size ||index <0){
      return "error";
    }
    else{
      removed = data [index];
      for(int i=index;i<size-1;i++){
        data[i] = data[i+1];
      }
      data[size-1]=null;
      size--;
      return removed;
    }
  }
  public String get(int index){
    return data[index];
  }

  public String set(int index, String element){
    String changed= data[index];
    data [index]= element;
    return changed;
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
  public int indexOf(String s){
    int here=-1;
    for (int i=0; i <size; i++){
      if (data[i].equals(s)){
        here =i;
        return here;
      }
    }
    return here;
  }

  public String[] toArray(){
    String storage[]=new String[size];
    storage=data;
    return storage;
  }

  public int lastIndexOf(String value) {
    int index=0;
    for (int i= size-1; i>=0; i--){
      if (data[i].equals(value)){
        index=i;
      }
    }
    return index;
  }

}
