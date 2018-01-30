package Animals;

/**
 * Created by java on 30.01.2018.
 */

public class AnimalsMain {
    public static void main(String[] args) {


        Cat cat = new Cat("oval","vaska");
//        Cat cat1=new Cat("triangle","Isiska");
//        Cat cat2=new Cat("oval","vaska");
//        Cat cat3=cat;
//
        Dog dog=new Dog("oval","vaska");
//
//        System.out.println(cat==cat1);//sravnivaet ssilki
//        System.out.println(cat.equals(cat1));
//
//
//
//
//        System.out.println(cat==cat2);
//        System.out.println(cat.equals(cat2));
//
////        System.out.println(cat==cat3);
////        System.out.println(cat.equals(cat3));
//        System.out.println("--------------------------------");
//      //  System.out.println(cat==dog);
//        System.out.println(cat.equals(dog));

//        System.out.println(cat.hashCode()+" ,"+cat);
//
//        cat.sayMynHeadAndWhatICan();
//        System.out.println(cat.hashCode() +" ,"+cat);
//
//        cat.setName("Lolick");
//        System.out.println(cat.hashCode()+" ,"+cat);
//
//        cat.setName("Fox");
//
//        System.out.println(cat.hashCode()+" ,"+cat);




        Dog[] dogMass=new Dog[3];
        dogMass[0]=dog;
        dogMass[1]=cat;

      Animals1[]aniMas=new Animals1[2];
        aniMas[0]=cat;
        aniMas[1]=dog;

        for(Animals1 aniMa:aniMas){
            if(aniMa instanceof Dog){
                aniMa.sayMynHeadAndWhatICan();
            }
        }






//        Animals1 cat1=new Cat("oval","vaska");
//
//        System.out.println(cat instanceof Cat);
//
//
//
//        System.out.println(cat.getName().equals(dog.getName()));
//
//        System.out.println(cat.equals(dog));//ne ravni tak
//
//        System.out.println(cat.hashCode());
//        System.out.println(dog.hashCode());


    }
}
