import java.util.List;

public class Main {

            public static void main(String[] args) throws InterruptedException {

                // Crearea unei liste de numere
                List<Integer> numere = List.of(1, 2, 3, 4, 5);

                // Pornirea unui Thread care va afișa conținutul listei
                Thread thread = new Thread(() -> {
                    for (Integer numar : numere) {
                        System.out.println(numar);
                    }
                });
                thread.start();

                // Așteptarea ca lista să fie afișată
                Thread.sleep(1000);
            }
        }

