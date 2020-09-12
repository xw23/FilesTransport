package AnimalExercise;


public class AnimalFactory {

   /*
   public static void main(String[] args) {
      
      Animal cat1 = AnimalFactory.create(AnimalType.Cat);    //////    ENUM  :  AnimalType.Cat
      System.out.println(cat1.speak());
      System.out.println(cat1.getAge());
      System.out.println(cat1.getBackpack());
      
      Animal cow1 = AnimalFactory.create(AnimalType.Cow);    //////    ENUM  :  AnimalType.Cat
      System.out.println(cow1.speak());
      System.out.println(cow1.getAge());
      System.out.println(cow1.getBackpack());
      
      Animal dog1 = AnimalFactory.create(AnimalType.Dog);    //////    ENUM  :  AnimalType.Cat
      System.out.println(dog1.speak());
      System.out.println(dog1.getAge());
      System.out.println(dog1.getBackpack());
      
      Animal duck1 = AnimalFactory.create(AnimalType.Duck);    //////    ENUM  :  AnimalType.Cat
      System.out.println(duck1.speak());
      System.out.println(duck1.getAge());
      System.out.println(duck1.getBackpack());
      
   }
   */
   
   
    public static Animal create(AnimalType type){
        //@TODO: implement me
       
       if (type == null) {
          return null;
       }
       
       Animal rtAnimal; // = new Animal();  /////////
       
       
       
       if (type.equals("Cat")) {
          rtAnimal = new Cat();
       } else if (type.equals("Cow")) {
          rtAnimal = new Cow();
       } else if (type.equals("Dog")) {
          rtAnimal = new Dog();
       } else//(type.equals("Duck"))   //////  AnimalType : ENUM : only 4 values
          {
          rtAnimal = new Duck();
       }
       
       
       
       rtAnimal.setAge(11);           
                     ///////////    ?????????    Set  AGE  , right  PLACE  ?????
       
       
       return rtAnimal;
    }
}
