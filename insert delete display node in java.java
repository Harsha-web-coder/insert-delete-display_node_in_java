class Node
{
    int data;
    Node next;
    Node(int data)
    {
        this.data=data;
        this.next=null;
    }
}

public class Main
{
Node head=null;
Node tail=null;
int n=0;
void insert(int data)
{
Node newnode=new Node(data);
n++;
if(head==null)  
{
   head=newnode;
   tail=newnode;
   tail.next=head;
}
else
{
  tail.next=newnode;
  tail=newnode;
  tail.next=head;
}
}
void display()
{
   if(head==null)
       System.out.println("List is empty");
   else
   {
       Node t=head;
       do
       {
           System.out.print(t.data+" ");
           t=t.next;
       }while(t!=head);
       System.out.println();
   }
}

void delAt(int ind)
{
   if(ind>=n)
       ind=ind%n;
   if(ind<=0)
       System.out.println("enter a valid position");
   else if(ind==1)
   {
       head=head.next;
       tail.next=head;
   }
   else
   {
       Node t=head;
       int c=1;
       while(c<ind-1)
       {
           t=t.next;
           c++;
       }
       t.next=t.next.next;
   }
}


public static void main(String[] args) {
System.out.println("Hello World");
Main m=new Main();
m.insert(5);
m.insert(15);
m.insert(25);
m.insert(35);
m.insert(45);
m.display();
m.delAt(6);
m.display();
}
}