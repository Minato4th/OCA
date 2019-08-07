package University.Animals;

class Animals {

    private String hidden = "Animal";

    public String names = "animals";

    private void hiddenMethod() {
        System.out.println("I run only from Animals");
    }

    protected void onlyForInheritor() {
        System.out.println("I run only for inheritors of Animals");
    }

    public void runHidden() {
        hiddenMethod();
    }

    public void overriddenMethod() {
        System.out.println("Animals");
    }

    public void takeHidden() {
        System.out.println(hidden);
    }
}

class Cats extends Animals {

    private String hidden = "Cats";

    public String names = "Cats";

    public void overriddenMethod() {
        System.out.println("Cats");
    }

    public void takeHidden() {
        System.out.println(hidden);
    }

    public void forCats() {
        System.out.println("I run only for Cats");
    }
}

class MaineCoon extends Cats {

    private String hidden = "MaineCoon";

    public String names = "MaineCoon";

    public void overriddenMethod() {
        System.out.println("MaineCoon");
    }

    public void takeHidden() {
        System.out.println(hidden);
    }

    public void forMaineCoon() {
        System.out.println("I run only for MaineCoon");
    }
}

class Lion extends Cats {

    private String hidden = "Lion";

    public String names = "Lion";

    public void overriddenMethod() {
        System.out.println("Lion");
    }

    public void takeHidden() {
        System.out.println(hidden);
    }

    public void forLion() {
        System.out.println("I run only for Lion");
    }
}

public class WorkWithCats {

    public static void main(String[] args) {

        Animals animals = new Animals();
        Cats cats = new Cats();
        MaineCoon maineCoon = new MaineCoon();
        Lion lion = new Lion();

        Animals animals1 = new Lion();
        Cats cats1 = (Cats) animals1;
        Lion lion1 = (Lion) cats1;

        System.out.println(animals1.names);
        animals1.overriddenMethod();
        lion1.forLion();

//
////        Lion lion1 = (Lion) new Animals();
//
//        //--------------------------------------------------
//        System.out.println(animals.names);
//        animals.takeHidden();
//        animals.onlyForInheritor();
//        animals.overriddenMethod();
//        animals.runHidden();
//
//        System.out.println();
//
//        System.out.println(lion.names);
//        lion.takeHidden();
//        lion.onlyForInheritor();
//        lion.overriddenMethod();
//        lion.runHidden();
//
//        System.out.println();
//        //--------------------------------------------------
//
//        Animals animalsLion = new Lion();
//
//        System.out.println(animalsLion.names);
//        animalsLion.takeHidden();
//        animalsLion.onlyForInheritor();
//        animalsLion.overriddenMethod();
//        animalsLion.runHidden();
////        animalsLion.forLion();
//
//        System.out.println();
//        //--------------------------------------------------
//
////        MaineCoon animalsMaineCoon = animalsLion;
////        MaineCoon animalsMaineCoon = (MaineCoon)animalsLion;
//
//        Cats animalsCats = (Cats) animalsLion;
//        System.out.println(animalsLion.names);
//        animalsCats.takeHidden();
//        animalsCats.onlyForInheritor();
//        animalsCats.overriddenMethod();
//        animalsCats.runHidden();
////        animalsCats.forLion();
//        animalsCats.forCats();
    }


}
