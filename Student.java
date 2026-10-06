import java.util.Scanner;
class Student{
int usn;
String name;
void accept(){
Scanner sc= new Scanner(System.in);
System.out.print("Enter Name:");
name=sc.nextLine();
System.out.println("Enter USN:");
usn=sc.nextInt();
}
void display(){
System.out.println("Name:"+name);
System.out.println("USN:"+usn);
}
public static void main(String[] args){
Student[] s= new Student[2];
for(int i=0;i<2;i++){
s[i]=new Student();
s[i].accept();
}
for(int i=0;i<2;i++){
s[i].display();
}
}
}