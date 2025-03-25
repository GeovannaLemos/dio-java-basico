

import facade.Facade;
import singleton.SingletonEager;
import singleton.SingletonLazy;
import singleton.SingletonLazyHolder;
import strategy.Comportamento;
import strategy.ComportamentoAgressivo;
import strategy.ComportamentoDefensivo;
import strategy.ComportamentoNormal;
import strategy.Robo;

public class Test {
    public static void main(String[] args) {
        // testes relacionados ao Design Pattern Singleton: 

        SingletonLazy lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstancia();
        System.out.println(lazy);


        SingletonEager eager = SingletonEager.getInstancia();
        System.out.println(eager);
        eager = SingletonEager.getInstancia();
        System.out.println(eager);

        SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        holder = SingletonLazyHolder.getInstancia();
        System.out.println(holder);


        //testes relacionados ao Strategy

        Comportamento normal = new ComportamentoNormal();
        Comportamento defensivo = new ComportamentoDefensivo();
        Comportamento agressivo = new ComportamentoAgressivo();

        Robo robo = new Robo();
        robo.setComportamento(normal);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.mover();

        //Facade

        Facade facade = new Facade();
        facade.migrarCliente("Geovanna", "01332-000");
    }
}
