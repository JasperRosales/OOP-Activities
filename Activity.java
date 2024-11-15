
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


      Dog[] puppies1 = {
              new Dog().setName("Ron"),
              new Dog().setName("Jeric"),
              new Dog().setName("Taguro"),
              new Dog().setName("Olaf")
      };

      Dog[] puppies2 = {
              new Dog().setName("Hazel"),
              new Dog().setName("Mica"),
              new Dog().setName("Janray")
      };


      Dog[] puppies3 = {
              new Dog().setName("Aaron"),
              new Dog().setName("Furrer"),
              new Dog().setName("Marco"),
              new Dog().setName("Nicole Mitch Maningat"),
              new Dog().setName("Charcle")
      };

      hotdog.setListOfPuppies(puppies1);
      hotdog.showPuppies();

      footlong.setListOfPuppies(puppies2);
      footlong.showPuppies();

      colddog.setListOfPuppies(puppies3);
      colddog.showPuppies();


    }
}
