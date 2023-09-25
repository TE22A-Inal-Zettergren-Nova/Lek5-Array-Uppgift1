public class App {
    public static void main(String[] args) throws Exception {
        
         /*Uppgift a */
        int[] fält1 = new int[5];
        fält1[0] = 8;
        fält1[1] = 4;
        fält1[2] = 6;
        fält1[3] = 3;
        fält1[4] = 9;
        
        System.out.println("Fält1 Innehåll: ");
        System.out.println("element 0: "+fält1[0]);
        System.out.println("element 1: "+fält1[1]);
        System.out.println("element 2: "+fält1[2]);
        System.out.println("element 3: "+fält1[3]);
        System.out.println("element 3: "+fält1[4]);

        System.out.println("Antal element i fält1: "+ fält1.length);

        int fält1_summa = fält1[0]+fält1[1]+fält1[2]+fält1[3]+fält1[4];

        double medelvärde = fält1_summa/5;
        System.out.println("Medelvärdet är: "+medelvärde);

        /*Uppgift b */

        int[] fält2 = new int[5];

        fält2[0] = 18;
        fält2[1] = 14;
        fält2[2] = 16;
        fält2[3] = 13;
        fält2[4] = 19;

        int fält2_summa = fält2[0]+fält2[1]+fält2[2]+fält2[3]+fält2[4];

        System.out.println("Summan av fält 1 och fält 2 är: "+(fält1_summa+fält2_summa));

        double medelvärde_båda = (fält1_summa+fält2_summa)/10;

        System.out.println("Medelvärdet av fält 1 och fält 2: "+medelvärde_båda);

        




    }
}
