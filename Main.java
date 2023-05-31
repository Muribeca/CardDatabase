import JogosCartas.*;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Vanguard vg = new Vanguard();
        Digimon d = new Digimon();
        Magic mtg = new Magic();
        DragonBall db = new DragonBall();
        Yugioh ygo = new Yugioh();
        Scanner sc = new Scanner(System.in);
        ArrayList<Cartas> cartas = new ArrayList<>();
        int opcao;

        do {
            System.out.println("\nEscolha uma opção:");
            System.out.println("1. Cadastrar Carta De Vanguard");
            System.out.println("2. Cadastrar Carta De Digimon");
            System.out.println("3. Cadastrar Carta De Magic");
            System.out.println("4. Cadastrar Carta De Dragon Ball");
            System.out.println("5. Cadastrar Carta de Yu-Gi-Oh");
            System.out.println("6. Listar cartas cadastradas");
            System.out.println("7. Excluir cartas cadastrada");
            System.out.println("8. Alterar cartas cadastrada");
            System.out.println("9 - Listar apenas as cartas de Vanguard");
            System.out.println("10 - Listar apenas as cartas de Digimon");
            System.out.println("11 - Listar apenas as cartas de Magic");
            System.out.println("12 - Listar apenas as cartas de Dragon Ball");
            System.out.println("13 - Listar apenas as cartas de Yu-gi-oh");
            System.out.println("14. Sair");
            opcao = sc.nextInt();

            switch (opcao) {
                case 1 -> {
                    System.out.println("Digite o nome da carta de Vanguard:");
                    vg.setNomeCarta(sc.next());
                    System.out.println("Digite o nome da coleção:");
                    vg.setNomeColecao(sc.next());
                    System.out.println("Digite o numero na coleção:");
                    vg.setNumeroColecao(sc.next());
                    System.out.println("Digite o tipo de carta:");
                    vg.setTipoCarta(sc.next());
                    System.out.println("Digite a quantidade de cartas na coleção:");
                    vg.setQuantidadeCarta(sc.next());
                    cartas.add(vg);
                }
                case 2 -> {
                    System.out.println("Digite o nome da carta de digimon:");
                    d.setNomeCarta(sc.next());
                    System.out.println("Digite o nome da coleção:");
                    d.setNomeColecao(sc.next());
                    System.out.println("Digite o numero na coleção:");
                    d.setNumeroColecao(sc.next());
                    System.out.println("Digite o tipo de carta:");
                    d.setTipoCarta(sc.next());
                    System.out.println("Digite a quantidade de cartas na coleção:");
                    d.setQuantidadeCarta(sc.next());
                    cartas.add(d);
                }
                case 3 -> {
                    System.out.println("Digite o nome da carta de Magic:");
                    mtg.setNomeCarta(sc.next());
                    System.out.println("Digite o nome da coleção:");
                    mtg.setNomeColecao(sc.next());
                    System.out.println("Digite o numero na coleção:");
                    mtg.setNumeroColecao(sc.next());
                    System.out.println("Digite o tipo de carta:");
                    mtg.setTipoCarta(sc.next());
                    System.out.println("Digite a quantidade de cartas na coleção:");
                    mtg.setQuantidadeCarta(sc.next());
                    cartas.add(mtg);
                }
                case 4 -> {
                    System.out.println("Digite o nome da carta de dragon ball:");
                    db.setNomeCarta(sc.next());
                    System.out.println("Digite o nome da coleção:");
                    db.setNomeColecao(sc.next());
                    System.out.println("Digite o numero na coleção:");
                    db.setNumeroColecao(sc.next());
                    System.out.println("Digite o tipo de carta:");
                    db.setTipoCarta(sc.next());
                    System.out.println("Digite a quantidade de cartas na coleção:");
                    db.setQuantidadeCarta(sc.next());
                    cartas.add(db);
                }
                case 5 -> {
                    System.out.println("Digite o nome da carta de yu-gi-oh:");
                    ygo.setNomeCarta(sc.next());
                    System.out.println("Digite o nome da coleção:");
                    ygo.setNomeColecao(sc.next());
                    System.out.println("Digite o numero na coleção:");
                    ygo.setNumeroColecao(sc.next());
                    System.out.println("Digite o tipo de carta:");
                    ygo.setTipoCarta(sc.next());
                    System.out.println("Digite a quantidade de cartas na coleção:");
                    ygo.setQuantidadeCarta(sc.next());
                    cartas.add(ygo);
                }
                case 6 -> {
                    System.out.println("\nLista de Cartas cadastradas:");
                    for (Cartas p : cartas) {
                        if (p instanceof Vanguard) {
                            System.out.println("nome da carta:" + vg.getNomeCarta() + "nome da coleção:" + vg.getNomeColecao() + "Numero da coleção:" + vg.getNumeroColecao() + "essa carta é do tipo" + vg.getTipoCarta()+ "voce tem :" + vg.getQuantidadeCarta());
                        } else if (p instanceof Digimon) {
                            System.out.println("nome da carta:" + d.getNomeCarta() + "nome da coleção:" + d.getNomeColecao() + "Numero da coleção:" + d.getNumeroColecao() + "essa carta é do tipo" + d.getTipoCarta() + "voce tem :" + d.getQuantidadeCarta());
                        } else if (p instanceof Magic) {
                            System.out.println("nome da carta:" + mtg.getNomeCarta() + "nome da coleção:" + mtg.getNomeColecao() + "Numero da coleção:" + mtg.getNumeroColecao() + "essa carta é do tipo" + mtg.getTipoCarta() + "voce tem :" + mtg.getQuantidadeCarta());
                        } else if (p instanceof DragonBall) {
                            System.out.println("nome da carta:" + db.getNomeCarta() + "nome da coleção:" + db.getNomeColecao() + "Numero da coleção:" + db.getNumeroColecao() + "essa carta é do tipo" + db.getTipoCarta() + "voce tem :" + db.getQuantidadeCarta());
                        } else if (p instanceof Yugioh) {
                            System.out.println("nome da carta:" + ygo.getNomeCarta() + "nome da coleção:" + ygo.getNomeColecao() + "Numero da coleção:" + ygo.getNumeroColecao() + "essa carta é do tipo" + ygo.getTipoCarta() + "voce tem :" + ygo.getQuantidadeCarta());
                        }
                    }
                }
                case 7 -> {
                    System.out.println("Digite o nome da carta a ser excluido:");
                    String nome = sc.next();
                    boolean encontrou = false;
                    for (Cartas p : cartas) {
                        if (p.getNomeCarta().equals(nome)) {
                            cartas.remove(p);
                            System.out.println("Carta excluida com sucesso!");
                            encontrou = true;
                            break;
                        }
                    }
                    if (!encontrou) {
                        System.out.println(" nenhuma carta com esse nome!");
                    }
                }
                case 8 -> {
                    System.out.println("\nDigite o nome da carta a ser alterada");
                    String nome2 = sc.next();
                    boolean encontrou1 = false;
                    for (Cartas p : cartas) {
                        if (p.getNomeCarta().equals(nome2)) {
                            if (p instanceof Vanguard) {
                                System.out.println("Digite o novo nome da carta de Vanguard:");
                                vg.setNomeCarta(sc.next());
                                System.out.println("Digite o novo nome da coleção:");
                                vg.setNomeColecao(sc.next());
                                System.out.println("Digite o novo numero na coleção:");
                                vg.setNumeroColecao(sc.next());
                                System.out.println("Digite o novo tipo de carta:");
                                vg.setTipoCarta(sc.next());
                                System.out.println("Digite a nova quantidade de cartas na coleção:");
                                vg.setQuantidadeCarta(sc.next());
                            } else if (p instanceof Digimon) {
                                System.out.println("Digite o novo nome da carta de digimon:");
                                d.setNomeCarta(sc.next());
                                System.out.println("Digite o  novo nome da coleção:");
                                d.setNomeColecao(sc.next());
                                System.out.println("Digite o novo numero na coleção:");
                                d.setNumeroColecao(sc.next());
                                System.out.println("Digite o novo tipo de carta:");
                                d.setTipoCarta(sc.next());
                                System.out.println("Digite a nova quantidade de cartas na coleção:");
                                d.setQuantidadeCarta(sc.next());
                            } else if (p instanceof Magic) {
                                System.out.println("Digite o  novo nome da carta de Magic:");
                                mtg.setNomeCarta(sc.next());
                                System.out.println("Digite o novo nome da coleção:");
                                mtg.setNomeColecao(sc.next());
                                System.out.println("Digite o novo numero na coleção:");
                                mtg.setNumeroColecao(sc.next());
                                System.out.println("Digite o novo tipo de carta:");
                                mtg.setTipoCarta(sc.next());
                                System.out.println("Digite a nova quantidade de cartas na coleção:");
                                mtg.setQuantidadeCarta(sc.next());
                            } else if (p instanceof DragonBall) {
                                System.out.println("Digite o novo nome da carta de dragon ball:");
                                db.setNomeCarta(sc.next());
                                System.out.println("Digite o novo nome da coleção:");
                                db.setNomeColecao(sc.next());
                                System.out.println("Digite o novo numero na coleção:");
                                db.setNumeroColecao(sc.next());
                                System.out.println("Digite o novo tipo de carta:");
                                db.setTipoCarta(sc.next());
                                System.out.println("Digite a nova quantidade de cartas na coleção:");
                                db.setQuantidadeCarta(sc.next());
                            }  else if (p instanceof Yugioh) {
                                System.out.println("Digite o novo nome da carta de yu-gi-oh:");
                                ygo.setNomeCarta(sc.next());
                                System.out.println("Digite o novo nome da coleção:");
                                ygo.setNomeColecao(sc.next());
                                System.out.println("Digite o novo numero na coleção:");
                                ygo.setNumeroColecao(sc.next());
                                System.out.println("Digite o novo tipo de carta:");
                                ygo.setTipoCarta(sc.next());
                                System.out.println("Digite a nova quantidade de cartas na coleção:");
                                ygo.setQuantidadeCarta(sc.next());
                            } 
                            System.out.println("Carta alterado com sucesso!");
                            encontrou1 = true;
                            break;
                        }
                    }
                    if (!encontrou1) {
                        System.out.println("Nenhuma Carta com esse nome!");
                    }
                }
                case 9 -> {
                    System.out.println("Lista de cartas de Vanguard");
                    for (Cartas p : cartas) {
                        if (p instanceof Vanguard) {
                            System.out.println(vg);
                        }
                    }
                }
                case 10 -> {
                    System.out.println("Lista de cartas de digimon");
                    for (Cartas p : cartas) {
                        if (p instanceof Digimon) {
                            System.out.println(d);
                        }
                    }
                }
                case 11 -> {
                    System.out.println("Lista de cartas de magic");
                    for (Cartas p : cartas) {
                        if (p instanceof Magic) {
                            System.out.println(mtg);
                        }
                    }
                }
                case 12 -> {
                    System.out.println("Lista de cartas de Dragon Ball");
                    for (Cartas p : cartas) {
                        if (p instanceof DragonBall) {
                            System.out.println(db);
                        }
                    }
                }
                case 13 -> {
                    System.out.println("Lista de cartas de Yu-gi-oh");
                    for (Cartas p : cartas) {
                        if (p instanceof Yugioh) {
                            System.out.println(ygo);
                        }
                    }
                }
                case 14 -> System.out.println("Saindo...");
                default -> System.out.println("Opção inválida!");
            }
        } while (opcao != 14);
    }
}