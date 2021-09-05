public class queue{
     int f=-1,r=-1;
     int []arr=new int[5];
    boolean isfull(){
        if((f==r+1)||(f==0&&r==arr.length-1)) return true;
        return false;
    }
    boolean isempty(){
        if(f==-1) return true;
        return false;
    }
    void create(int data){
        if(isfull())
            System.out.println("Queue is Full");
        else{
            if(f==-1) f=0;
            r=(r+1)%arr.length;
            arr[r]=data;
        }
    }
    void delete(){
        if(isempty())
            System.out.println("Queue is Empty");
        else{
            if(f==r)
               f=r=-1;
            else
                f=(f+1)%arr.length;
        }
    }
    void display(){
        if(isempty())
            System.out.println("Queue is Empty");
        else{
            int i;
            for( i=f;i!=r;i=(i+1)%arr.length){
                System.out.print(arr[i]+" ");
            }
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args){
        queue q=new queue();
        q.delete();
        q.create(5);
        q.create(7);
        q.create(8);
        q.create(9);
        q.create(10);
        q.display();
        System.out.println();
        q.delete();
        q.delete();
        q.delete();
        q.delete();
        q.delete();
        q.display();
        q.delete();
        q.create(15);
        q.create(11);
        q.create(17);
        q.display();
    }
}