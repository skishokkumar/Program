class ceo{
    private static ceo ceoobject;
    private ceo(){ }
    public static ceo getInstance(){
        if(ceoobject==null){
            ceoobject=new ceo();
        }
        return ceoobject;
    }
    public void getConnection(){
        System.out.println("we get the connection");
    }
}
public class singelton {
    public static void main(String []args){
       ceo n=ceo.getInstance();
       n.getConnection();
    }
}
