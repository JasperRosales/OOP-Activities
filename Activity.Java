public class Activity{
    public static void main(String[] args){
      Dog hotdog = new Dog();
      Dog footlong = new Dog();
      Dog colddog = new Dog();

      hotdog.setName("Johnrey Banagwas");
      footlong.setName("Kevin Durant");
      colddog.setName("SiRon maysala");


      System.out.println(hotdog.showName());
      System.out.println(footlong.showName());
      System.out.println(colddog.showName());

      hotdog.bark();
      footlong.bark();
      colddog.bark();

      hotdog.setNumberOfPuppies(4);
      footlong.setNumberOfPuppies(3);
      colddog.setNumberOfPuppies(5);

      System.out.println(hotdog.showNumberOfPuppies());
      System.out.println(footlong.showNumberOfPuppies());
      System.out.println(colddog.showNumberOfPuppies());


      String[] puppies1 = {"ron", "jeric", "taguro", "olaf"};
      String[] puppies2 = {"hazel", "mica", "johnray", "charlie"};
      String[] puppies3 = {"aaron", "furrer", "marco", "nicole mitch manigat"};

      hotdog.setListOfPuppies(puppies1);
      footlong.setListOfPuppies(puppies2);
      colddog.setListOfPuppies(puppies3);

      hotdog.showPuppies();
      footlong.showPuppies();
      colddog.showPuppies();



    }
}