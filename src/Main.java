public class Main {
    public static void main(String[] args) {
        var dog = 8;
        System.out.println(dog);
        var cat = 3.6;
        System.out.println(cat);
        var paper = 763789;
        System.out.println(paper);
        dog = dog + 4;
        System.out.println(dog);
        cat = cat + 4;
        System.out.println(cat);
        paper=paper+4;
        System.out.println(paper);
        dog=dog-3;
        System.out.println(dog);
        cat=cat-1.6;
        System.out.println(cat);
        paper=paper-7639;
        System.out.println(paper);

        var friend=19;
        System.out.println(friend);
        friend=friend+2;
        System.out.println(friend);
        friend=friend/7;
        System.out.println(friend);

        var frog=3.5;
        System.out.println(frog);
        frog=frog*10;
        System.out.println(frog);
        frog=frog/3.5;
        System.out.println(frog);
        frog=frog+4;
        System.out.println(frog);

        var firstBoxer=78.2;
        var secondBoxer=82.7;
        var totalWeight= firstBoxer+secondBoxer;
        System.out.println(totalWeight);
        var weightDifference =secondBoxer-firstBoxer;
        System.out.println(weightDifference+" kg");
        weightDifference = secondBoxer%firstBoxer;
        System.out.println(weightDifference+" kg");

        var totalTime=640;
        var timeOfEachWorker=8;
        var amountOfWorkers= totalTime / timeOfEachWorker;
        System.out.println("Всего работников в компании – "+amountOfWorkers+" человек");
        amountOfWorkers= amountOfWorkers+94;
        timeOfEachWorker=totalTime/amountOfWorkers;
        System.out.println("Если в компании работает "+amountOfWorkers+" человек"+" то всего "+timeOfEachWorker+  " часов работы может быть поделено между сотрудниками" );






    }
}