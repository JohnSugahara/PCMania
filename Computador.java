public class Computador {

    String marca;
    float preco;

    HardwareBasico HBs;
    SistemaOperacional SOs;
    MemoriaUSB memoriaUSB;

    Computador(String marca, float preco, HardwareBasico HBs, SistemaOperacional SOs, MemoriaUSB memoriaUSB)
    {
        this.marca = marca;
        this.preco = preco;
        this.HBs = HBs;
        this.SOs = SOs;
        this.memoriaUSB = memoriaUSB;
    }

    void mostraPCconfig()
    {
        System.out.println("Marca: "+ this.marca);
        System.out.println("Preço: "+ this.preco);
        System.out.println("HardwareBasico: "+ this.HBs.nome +" "+ this.HBs.capacidade);
        System.out.println("SistemaOperacional: "+ this.SOs.nome + " " + this.SOs.tipo);
    }


    
}
