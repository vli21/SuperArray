public class Demo{
/*-------
Methods
-------*/
  public static void removeDuplicates(SuperArray s) {
      for (int i=0; i <s.size();){
        if (s.indexOf(s.get(i))==i){
          i++;
        }
        else{
          s.remove(i);
        }
      }
  }

  public static SuperArray findOverlap(SuperArray a, SuperArray b) {
    removeDuplicates(a);
    removeDuplicates(b);
    SuperArray Intersection= new SuperArray();
    for (int i=0; i<a.size();i++) {
      for (int j=0; j<b.size();j++){
        if (a.get(i).equals(b.get(j))){
          Intersection.add (a.get(i));
        }
      }
    }
    return Intersection;
  }

  public static SuperArray zip(SuperArray a, SuperArray b) {
    int length= 0;
    SuperArray mush= new SuperArray ();
    if (a.size()>b.size()) {
      length= a.size();
    }
    else {
      length= b.size();
    }
    for (int i=0; i<length; i++){
      if(length==a.size()){
        if (i<b.size()){
          mush.add (a.get(i));
          mush.add (b.get(i));
        }
        else{
          mush.add(a.get(i));
        }
      }
      if(length==b.size()){
        if (i<a.size()){
          mush.add (a.get(i));
          mush.add (b.get(i));
        }
        else{
          mush.add(b.get(i));
        }
      }
    }
    return mush;
  }

  /*----
  Tests
  ----*/
  public static void main(String[]args) {

    SuperArray words = new SuperArray();
    //grouped to save vertical space
    words.add("kani");   words.add("uni");     words.add("ebi");     words.add("una");
    words.add("una");    words.add("ebi");     words.add("kani");    words.add("una");
    words.add("una");    words.add("ebi");     words.add("toro");



    System.out.println(words);
    removeDuplicates(words);
    System.out.println(words);

    SuperArray A = new SuperArray();
    A.add ("9");
    A.add ("1");
    A.add ("2");
    A.add ("2");
    A.add ("3");
    A.add ("4");
    SuperArray B = new SuperArray();
    B.add ("0");
    B.add ("4");
    B.add ("2");
    B.add ("2");
    B.add ("9");

    System.out.println(findOverlap(A, B));

    /* works
    SuperArray one= new SuperArray();
    one.add("a");
    one.add("b");
    one.add("c");
    one.add("d");
    one.add("e");
    one.add("f");
    SuperArray two= new SuperArray();
    two.add("0");
    two.add("1");
    two.add("2");
    two.add("3");

    System.out.println(zip(one,two));
    */
    SuperArray one= new SuperArray();
    one.add("a");
    one.add("b");
    one.add("c");

    SuperArray two= new SuperArray();
    two.add("0");
    two.add("1");
    two.add("2");
    two.add("3");
    two.add("4");

    System.out.println(zip(one,two));

  }
}
