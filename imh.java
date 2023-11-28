package oppsclanandobj;


interface father{
     abstract void run();
     abstract void athelete();

}
interface mother{
     abstract void run();
     abstract void athelete();

}

class son implements father,mother{

   public void run (){
        System.out.println("its happy");
    }

     public void athelete (){
        System.out.println("very fast");
    }


    public static void main(String[] args) {
        son obj =new son();
        obj.run();
        obj.athelete();
        
    }
}
