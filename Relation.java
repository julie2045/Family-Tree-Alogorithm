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
      Person myElizabeth = new Person("Elizabeth", "null");
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
              System.out.println(String.format("%d %s", i, availablePerson(i).name));
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
      
      
   
      


      //have a while loop to determine a common ancestor and alternate with finding the parent between A and B 

      //have an 2d array to figure out their relation

      //display relation 
  }
}