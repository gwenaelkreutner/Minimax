import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        Noeud racine = new Noeud(-1, new ArrayList<Noeud>(){{
            add(
                    new Noeud(-1, new ArrayList<Noeud>(){{
                        add(new Noeud(-1, new ArrayList<Noeud>(){{
                            add(new Noeud(-1, new ArrayList<Noeud>(){{
                                add(new Noeud(4, new ArrayList<>()));
                                add(new Noeud(3, new ArrayList<>()));
                                add(new Noeud(8, new ArrayList<>()));
                            }}));
                            add(new Noeud(-1, new ArrayList<Noeud>(){{
                                add(new Noeud(2, new ArrayList<>()));
                                add(new Noeud(1, new ArrayList<>()));
                            }}));
                        }}));
                        add(new Noeud(-1, new ArrayList<Noeud>(){{
                            add(new Noeud(-1, new ArrayList<Noeud>(){{
                                add(new Noeud(4, new ArrayList<>()));
                                add(new Noeud(2, new ArrayList<>()));
                                add(new Noeud(3, new ArrayList<>()));
                            }}));
                        }}));
                        add(new Noeud(-1, new ArrayList<Noeud>(){{
                            add(new Noeud(-1, new ArrayList<Noeud>(){{
                                add(new Noeud(6, new ArrayList<>()));
                                add(new Noeud(4, new ArrayList<>()));
                            }}));
                            add(new Noeud(-1, new ArrayList<Noeud>(){{
                                add(new Noeud(7, new ArrayList<>()));
                            }}));
                            add(new Noeud(-1, new ArrayList<Noeud>(){{
                                add(new Noeud(5, new ArrayList<>()));
                                add(new Noeud(2, new ArrayList<>()));
                            }}));
                        }}));
                    }})
            );
            add(
                    new Noeud(-1, new ArrayList<Noeud>(){{
                        add(new Noeud(-1, new ArrayList<Noeud>(){{
                            add(new Noeud(-1, new ArrayList<Noeud>(){{
                                add(new Noeud(1, new ArrayList<>()));
                                add(new Noeud(9, new ArrayList<>()));
                                add(new Noeud(0, new ArrayList<>()));
                            }}));
                        }}));
                        add(new Noeud(-1, new ArrayList<Noeud>(){{
                            add(new Noeud(-1, new ArrayList<Noeud>(){{
                                add(new Noeud(4, new ArrayList<>()));
                                add(new Noeud(3, new ArrayList<>()));
                            }}));
                            add(new Noeud(-1, new ArrayList<Noeud>(){{
                                add(new Noeud(0, new ArrayList<>()));
                            }}));
                        }}));
                        add(new Noeud(-1, new ArrayList<Noeud>(){{
                            add(new Noeud(-1, new ArrayList<Noeud>(){{
                                add(new Noeud(2, new ArrayList<>()));
                                add(new Noeud(8, new ArrayList<>()));
                                add(new Noeud(4, new ArrayList<>()));
                            }}));
                            add(new Noeud(-1, new ArrayList<Noeud>(){{
                                add(new Noeud(3, new ArrayList<>()));
                                add(new Noeud(7, new ArrayList<>()));
                            }}));
                            add(new Noeud(-1, new ArrayList<Noeud>(){{
                                add(new Noeud(5, new ArrayList<>()));
                                add(new Noeud(4, new ArrayList<>()));
                                add(new Noeud(1, new ArrayList<>()));
                            }}));
                        }}));
                    }})
            );
        }});

        Arbre a = new Arbre(racine);
        System.out.println(a.minimax(a.getRacine(), 4, true));
        System.out.println(a.alphaBeta(a.getRacine(), 4, Integer.MIN_VALUE, Integer.MAX_VALUE, true));
    }
}
