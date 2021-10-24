package animal;

public class AnimalTeste {
    public static void main(String[] args) {
        Mamifero mamifero = new Mamifero();
        Cachorro cachorro = new Cachorro();
        Lobo lobo = new Lobo();
        Reptil reptil = new Reptil();
        Peixe peixe = new Peixe();
        Ave ave = new Ave();

//        mamifero.setPeso(80.3);
//        mamifero.setIdade(7);
//        mamifero.setMembros("4");
//        mamifero.setCorPelo("Preto");
//        mamifero.alimentar();

        cachorro.enterrarOsso();
        cachorro.emitirSom();

        cachorro.reagir(true);
        cachorro.reagir("Ola");
        cachorro.reagir(19);
        cachorro.reagir(2, 5);
//
//        lobo.emitirSom();
//
//        reptil.setPeso(5);
//        reptil.setIdade(3);
//        reptil.setMembros("4");
//        reptil.setCorEscama("Laranja");
//        reptil.emitirSom();
//
//        peixe.setPeso(2);
//        peixe.setIdade(1);
//        peixe.setMembros("7 nadadeira");
//        peixe.setCorEscama("Azul marinho");
//        peixe.locomover();
//        peixe.soltarBolha();
//
//        ave.setPeso(12);
//        ave.setIdade(4);
//        ave.setMembros("4");
//        ave.setCorPena("Vermelho");
//        ave.locomover();
//        ave.fazerNinho();
    }
}
