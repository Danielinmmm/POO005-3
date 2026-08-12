public class Main {

    public static void main(String[] args) {

        String[] D = {
            "**** ",
            "*   *",
            "*   *",
            "*   *",
            "**** "
        };

        String[] A = {
            "  *  ",
            " * * ",
            "*   *",
            "*****",
            "*   *"
        };

        String[] N = {
            "*   *",
            "**  *",
            "* * *",
            "*  **",
            "*   *"
        };

        String[] I = {
            "*****",
            "  *  ",
            "  *  ",
            "  *  ",
            "*****"
        };

        String[] E = {
            "*****",
            "*    ",
            "**** ",
            "*    ",
            "*****"
        };

        String[] L = {
            "*    ",
            "*    ",
            "*    ",
            "*    ",
            "*****"
        };

        // Imprimir DANIEL
        for (int i = 0; i < 5; i++) {
            System.out.println(
                D[i] + "  " +
                A[i] + "  " +
                N[i] + "  " +
                I[i] + "  " +
                E[i] + "  " +
                L[i]
            );
        }
    }
}
