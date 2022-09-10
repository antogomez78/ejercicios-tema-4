public class Main {
    public static void main(String[] args) {
        //if ejercicio

        int numeroIf = -1;

        if (numeroIf < 0) {
            System.out.println("la variable numeroIf" + " " + numeroIf + " " + "es negativa");
        } else if (numeroIf == 0) {
            System.out.println("la variable numeroIf es cero");

        } else {
            System.out.println("la variable numeroIf" + " " + numeroIf + " " + "es positiva");

        }
        //while

        int numeroWhile = 1;
        while (numeroWhile < 3) {
            numeroWhile++;
            System.out.println("la variable numeroWhile ahora vale" + " " + numeroWhile);
        }


        //do while

        int numeroDoWhile = 3;
        do {
            numeroDoWhile++;
            System.out.println("la variable numeroDoWhile ahora vale " + " " + numeroDoWhile);
        } while (numeroDoWhile < 3);

        //for

        for(int numeroFor = 0; numeroFor <= 3; numeroFor++){

            System.out.println("ahora la variable numeroFor vale" + " " + numeroFor);

        }

        //switch

        var estacion = "verano";
        switch (estacion) {
            case "verano":
                System.out.println("es verano");
                break;
            case "otoño":
                System.out.println("es otoño");
                break;
            case "invierno":
                System.out.println("es invierno");
                break;
            case "primavera":
                System.out.println("es primavera");
                break;
            default:
                System.out.println("esa no es una estacion");
        }
    }
}






