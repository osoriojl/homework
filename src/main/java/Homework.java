public class Homework {
    public static void main(String[] args) {
        String name = "Jose Luis Osorio.";
        System.out.println("Hello, my name is " + name);

        int num = 12;
        float myFlt = (float) num;
        System.out.println(num);
        System.out.println(myFlt);

        float flt = 432.02f;
        double myDouble = flt;
        System.out.println(flt);
        System.out.println(myDouble);

        int x = 4;
        int myAnswer = 3 * (x +1);
        System.out.println(myAnswer);

        String phrase = "The quick brown fox jumps over the lazy dog";
        System.out.println(phrase);
        System.out.println(phrase.length());

        if (67 > 32) {
            System.out.println("67 is bigger than 32, duh");
        }
        int age = 34;
        if(21 < age) {
            System.out.println("C'mon in.");
        } else {
            System.out.println("Go home.");
        }

        int prize = 9;
        switch (prize) {
            case 2:
                System.out.println("You won a lawn mower");
                break;
            case 4:
                System.out.println("You won a snow plower");
                break;
            case 9:
                System.out.println("You won an Audi");
                break;
            case 10:
                System.out.println("You won a vacation to Madagascar");
                break;
            default:
                System.out.println("You ain't won nothing, broke boy");
        }

        int v = 1;
        while (v < 10) {
            System.out.println(v);
            v++;
        }

        for (int h = 3; h <= 34; h = h * 3) {
            System.out.println(h);
        }

        String[] words = {"Hello", "How is the weather", "What you are doing?", "I have to go, bye."};
            System.out.println(words[2]);

    }
}
