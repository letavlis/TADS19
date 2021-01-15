package Mecanica;

import Mecanica.controles.Mecanica;
public class MainTeste {
    public static void main(String[] args) {
        Mecanica m = new Mecanica("Silva");
        m.cadastraVeiculo("abd-2b55", 96, "Gol", "Carol");
        System.out.println(m.toString());
        m.cadastraVeiculo("abd-2b54", 96, "Gol", "Jose");
        System.out.println(m.toString());
        m.cadastraVeiculo("abd-2b53", 96, "Gol", "Vanessa");
        m.cadastraVeiculo("abd-2b54", 96, "Gol", "Ana");
        System.out.println(m.toString());
        m.cadastraVeiculo("abd-2b53", 96, "Gol", "Brenda");
        System.out.println(m.toString());
    }
}
