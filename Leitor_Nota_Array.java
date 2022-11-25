int nota = 0;
  Scanner sc = new Scanner (System.in);
       ArrayList<Integer> Arnota = new ArrayList();
    while (nota!=-1)
    { 
    System.out.println ("Informe a nota do aluno");
      nota = sc.nextInt();
      if(nota>=0)
    Arnota.add(nota);
    }
    for (Integer i : Arnota ){ 
        System.out.println("A nota é " +i);
    }   
    System.out.println("Remover nota? ");
    int posicao = Arnota.indexOf(sc.nextInt());
    Arnota.remove(posicao);
    for (Integer i:Arnota){
    System.out.println("As notas agora são: "+i);;
}
