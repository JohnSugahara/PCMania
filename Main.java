import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        float t = 0;

        int x = -1;
        int quant1 = 0;
        int quant2 = 0;
        int quant3 = 0;

        Cliente cliente = new Cliente();
        Computador computador[] = new Computador[3];

        MemoriaUSB memoriaUSB[] = new MemoriaUSB[3];

        MemoriaUSB m1 = new MemoriaUSB("MiniUSB", 2);
        MemoriaUSB m2 = new MemoriaUSB("SuperUSB", 15);
        MemoriaUSB m3 = new MemoriaUSB("UltraUSB", 45);

        memoriaUSB[0] = m1;
        memoriaUSB[1] = m2;
        memoriaUSB[2] = m3;


        SistemaOperacional SOs[] = new SistemaOperacional[3];

        SistemaOperacional s1 = new SistemaOperacional("Linux Ubuntu", 32);
        SistemaOperacional s2 = new SistemaOperacional("Windows 8", 64);
        SistemaOperacional s3 = new SistemaOperacional("Windows 10", 64);

        SOs[0] = s1;
        SOs[1] = s2;
        SOs[2] = s3;


        HardwareBasico HBs[] = new HardwareBasico[3];

        HardwareBasico h1 = new HardwareBasico("Pention Core i3", 2200F);
        HardwareBasico h2 = new HardwareBasico("Pention Core i5", 3370F);
        HardwareBasico h3 = new HardwareBasico("Pention Core i7", 4500F);

        HBs[0] = h1;
        HBs[1] = h2;
        HBs[2] = h3;


        Computador c1 = new Computador("Positivo", 3300F, HBs[0], SOs[0], memoriaUSB[0]);
        Computador c2 = new Computador("Acer", 8800F, HBs[1], SOs[1], memoriaUSB[1]);
        Computador c3 = new Computador("Vaio",4800F,HBs[2],SOs[2], memoriaUSB[2]);

        computador[0] = c1;
        computador[1] = c2;
        computador[2] = c3;



        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual Promoção você deseja da Loja Computadores2077!");
        System.out.println("");
        System.out.println("Verifique nossas promos!!!");
        System.out.println("|Promoção (1)|");
        System.out.println("     ______________");
        System.out.println("    ||            ||");
        System.out.println("    ||POSITIVO    ||");
        System.out.println("    ||            ||");
        System.out.println("    ||            ||");
        System.out.println("    ||____________||");
        System.out.println("    |______________|");
        System.out.println("   //############//");
        System.out.println("  //############//");
        System.out.println(" //      ____  // ");
        System.out.println("/_____/___/____/");
        System.out.println("");
        computador[0].mostraPCconfig();
        System.out.println("_________________________________________________________");
        System.out.println("");
        System.out.println("|Promoção (2)|");
        System.out.println(" _________ ");
        System.out.println(":______.-':");
        System.out.println("| ______  |");
        System.out.println("|:______B:|");
        System.out.println("|:______B:|");
        System.out.println("|:______B:| ");
        System.out.println("|         |  ");
        System.out.println("|:_____:  |");
        System.out.println("|    ==   |  ");
        System.out.println("|       O |");
        System.out.println("|       o |");
        System.out.println("|       o |");
        System.out.println("|'-.____o_|");
        System.out.println(":_________: ");
        System.out.println("");
        computador[1].mostraPCconfig();
        System.out.println("_________________________________________________________");
        System.out.println("");
        System.out.println("|Promoção (2)|");
        System.out.println("        ,---------,");
        System.out.println("      ,'        ,'| ");
        System.out.println("    ,'        ,'  |");
        System.out.println("   ,        ,'    |");
        System.out.println("  +---------+     |");
        System.out.println("  | -==----'|     |");
        System.out.println("  |         |     |");
        System.out.println("  |`---=    |     |");
        System.out.println("  |==== ooo |     ;");
        System.out.println("  |(((( [33]|    ,'");
        System.out.println("  |((((     |  ,'");
        System.out.println("  |         |,' ");
        System.out.println("  +---------+");
        System.out.println("");
        computador[2].mostraPCconfig();
        System.out.println("_________________________________________________________");
        System.out.println("|Promoção (1)||Promoção (2)||Promoção (3)||Sair (0)|");
        x = entrada.nextInt();

        if (x == 1)
        {
            float y = computador[0].preco;
            cliente.calculaTotalCompra(y);
            quant1 += 1;
        }
        else if (x == 2)
        {
            float y = computador[1].preco;
            cliente.calculaTotalCompra(y); 
            quant2 += 1;
        }
        else if (x == 3)
        {
            float y = computador[2].preco;
            cliente.calculaTotalCompra(y); 
            quant3 += 1;
        }
        System.out.println("_________________________________________________________");
        System.out.println("");

        while (x != 0)
        {
            System.out.println("|Promoção (1)||Promoção (2)||Promoção (3)||Sair (0)|");

            x = entrada.nextInt();

            if (x == 1)
            {
                float y = computador[0].preco;
                cliente.calculaTotalCompra(y);
                quant1 += 1;
            }
            else if (x == 2)
            {
                float y = computador[1].preco;
                cliente.calculaTotalCompra(y); 
                quant2 += 1;
            }
            else if (x == 3)
            {
                float y = computador[2].preco;
                cliente.calculaTotalCompra(y); 
                quant3 += 1;
            }

            System.out.println("_________________________________________________________");
            System.out.println("");
        }
        System.out.println("_________________________________________________________");
        System.out.println("||  _______  _______  ___      _______  _______  _______  ");
        System.out.println("|| |  _    ||       ||   |    |       ||       ||       | ");
        System.out.println("|| | |_|   ||   _   ||   |    |    ___||_     _||   _   | ");
        System.out.println("|| |       ||  | |  ||   |    |   |___   |   |  |  | |  | ");
        System.out.println("|| |  _   | |  |_|  ||   |___ |    ___|  |   |  |  |_|  | ");
        System.out.println("|| | |_|   ||       ||       ||   |___   |   |  |       | ");
        System.out.println("|| |_______||_______||_______||_______|  |___|  |_______| ");
        System.out.println("||  _______  _______  _______  _______  _______  _______  ");
        System.out.println("||  _______  _______  _______  _______  _______  _______  ");
        System.out.println("||                                                        ");
        System.out.println("||                     ITEMS COMPRADOS                    ");
        System.out.println("||                                                        ");
        if (quant1 > 0)
        {
            System.out.println("|| NOME: "+ computador[0].marca);
            System.out.println("|| PREÇO: "+ computador[0].preco);
            System.out.println("|| QUANTIDADE: "+ quant1+ " unidades");

            
            System.out.println("||                                                        ");
        }
        if (quant2 > 0)
        {
            System.out.println("|| NOME: "+ computador[1].marca);
            System.out.println("|| PREÇO: "+ computador[1].preco);
            System.out.println("|| QUANTIDADE: "+ quant2+ " unidades");

            
            System.out.println("||                                                        ");
        }
        if (quant3 > 0)
        {
            System.out.println("|| NOME: "+ computador[2].marca);
            System.out.println("|| PREÇO: "+ computador[2].preco);
            System.out.println("|| QUANTIDADE: "+ quant3+ " unidades");

            
            System.out.println("||                                                        ");
        }

        System.out.println("|| VALOR TOTAL COBRADO: " + cliente.calculaTotalCompra(t));
        System.out.println("||                                                        ");
        System.out.println("|| COMPRADOR: "+ cliente.nome);
        System.out.println("|| CPF: "+ cliente.cpf);
        System.out.println("||                                                        ");
        System.out.println("||                                                        ");
        System.out.println("||  _______  _______  _______  _______  _______  _______  ");
        System.out.println("_________________________________________________________");

        








    }
}
