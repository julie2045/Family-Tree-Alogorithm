import java.util.Scanner; // import the Scanner class 
import java.util.ArrayList; // import the ArrayList class

class Relation {
    Person A, B;

  

      void findRelation(){
      
      //create varibles of each person
    
      Person myAlex = new Person("Alex", "Lincoln");
      Person myAlley = new Person("Alley", "Monica");
      Person myAnna = new Person("Anna", "Monica");
      Person myBen = new Person("Ben", "Marj");
      Person myClarence = new Person("Clarence", "Jerome");
      Person myDonnie = new Person("Donnie", "Elizabeth");
      Person myElizabeth = new Person("Elizabeth", null);
      Person myEllane = new Person("Ellane", "Gabe");
      Person myGabe = new Person("Gabe", "Marj");
      Person myJake = new Person("Jake", "Gabe");
      Person myJamie = new Person("Jamie", "Kim");
      Person myJerome = new Person("Jerome", "Marj");
      Person myJohn = new Person("John", "Marj");
      Person myJohnG = new Person("JohnG", "Kim");
      Person myJulia = new Person("Julia", "Kim");
      Person myKim = new Person("Kim", "Marj");
      Person myLincoln = new Person("Lincoln", "Phil");
      Person myMarj = new Person("Marj", "Elizabeth");
      Person myMartin = new Person("Martin", "Marj");
      Person myMo = new Person("Mo", "Ellane");
      Person myMonica = new Person("Monica", "Marj");
      Person myPatricia = new Person("Patrcia", "Elizabeth");
      Person myPhil = new Person("Phil", "Monica");
      Person myPrecila = new Person("Precila", "Jerome");
      Person myRosanne = new Person("Rosanne", "Elizabeth");
      Person myRuthanne = new Person("Ruthanne", "Elizabeth");
      Person mySteven = new Person("Steven", "Monica");
      Person myVeera = new Person("Veera", "Jerome");
        
     //make an array to list out each person 
     ArrayList<Person> availablePerson = new ArrayList<Person>();
      availablePerson.add(myAlex);
      availablePerson.add(myAlley);
      availablePerson.add(myAnna);
      availablePerson.add(myBen);
      availablePerson.add(myClarence);
      availablePerson.add(myDonnie);
      availablePerson.add(myElizabeth);
      availablePerson.add(myEllane);
      availablePerson.add(myGabe);
      availablePerson.add(myJake);
      availablePerson.add(myJamie);
      availablePerson.add(myJerome);
      availablePerson.add(myJohn);
      availablePerson.add(myJohnG);
      availablePerson.add(myJulia);
      availablePerson.add(myKim);
      availablePerson.add(myLincoln);
      availablePerson.add(myMarj);
      availablePerson.add(myMartin);
      availablePerson.add(myMo);
      availablePerson.add(myMonica);
      availablePerson.add(myPatricia);
      availablePerson.add(myPhil);
      availablePerson.add(myPrecila);
      availablePerson.add(myRosanne);
      availablePerson.add(myRuthanne);
      availablePerson.add(mySteven);
      availablePerson.add(myVeera);
           for  (int i = 0;i < availablePerson.size(); i++){
              System.out.println(String.format("%d %s", i, availablePerson.get(i).this.name));
            }


      //have user pick two people 
      Scanner input = new Scanner(System.in);
      int selectedPersonIndex;
      
      System.out.println();
      System.out.println("Pick person one: ");
      selectedPersonIndex = input.nextInt();
      this.A = availablePerson.get(selectedPersonIndex);
        System.out.println(this.A);
      
      System.out.println();
      System.out.println("Pick person two: ");
      selectedPersonIndex = input.nextInt();
      this.B = availablePerson.get(selectedPersonIndex);
        System.out.println(this.B);

   
       //creating a 2d array to figure out their relation
         String[ ][ ] commonAnces =
        {
            {"same person", "parent", "grandparent", "great grandparent", "great grandparent", "2x great grandparent"},
            {"parent", "siblings", "aunt/uncle", "grand aunt/uncle", "great grand aunt/uncle"},
            {"grandparent", "aunt/uncle", "first cousin", "first cousin once removed", "first cousin twice removed"},
            {"great grandparent", "grand aunt/uncle", "first cousin once removed", "second cousin", "second cousin once removed"},
            {"2x great grandparent", "great grand aunt/uncle", "first cousin twice removed", "second cousin once removed", "third cousin"},
            };

    //print out each list for each person 
  
      listA = fillList(list(), A);
      System.out.println(listA);
      listB = fillList(list(), B);
      System.out.println(listB);
      
        
    //determine where the common ancestor is and use array to find the relation 
  
  

      //display relation 
        
  }

  //making function for creating a list of each person's parent (i know i did not do this right)
  String x;
  void fillList(list(), x){
    ArrayList<String> list = new ArrayList<String>();
    if (x != null);
       list.add(x); //adding x to list
      parentX = x.this.parent; //finding parent of x
      list.add(parentX); //adding that to list
      fillList(list(),parentX);  //recursive function so do the same for the parent of x and find the parent of parentX
   
    else:
    for(int i=0;i<list.size();i++){
    System.out.println(list.get(i)); //prints out list 
} 

      
    
  }

}

