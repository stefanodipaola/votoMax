class AlunnoTest{
    public static void main(String[] args)

    {
        Alunno A = new Alunno('A',5.0);
        Alunno B = new Alunno('B',8.0);
        Alunno C = new Alunno('C',10.0);
        Calcolo Z = new Calcolo();
        
        Z.massimo(5.0,8.0,10.0);

         System.out.println(Z);


        
    }
}