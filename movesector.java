import java.util.Scanner;


public class movesector {
    private String strVal = "" , strId = "";
    private double comp = 0.0;
    private char grade1 , grade2 , grade3 ;

    Scanner scan = new Scanner(System.in);

    public void setValue(int i ){
        System.out.print("Enter ID Comp Grade of student " + i + " : ");
        this.strVal = scan.nextLine();
    }

    public void setSub(){
        String[] part = this.strVal.split(" ");
        this.strId = part[0];
        this.comp = Double.parseDouble(part[1]);
        this.grade1 = part[2].charAt(0);
        this.grade2 = part[3].charAt(0);
        this.grade3 = part[4].charAt(0);

        System.out.println("Id : " + this.strId);
        System.out.println("Grade comp prog : " + this.comp);
        System.out.println("Grade 1 : " + this.grade1);
        System.out.println("Grade 2 : " + this.grade2);
        System.out.println("Grade 3 : " + this.grade3);
        System.out.println("--------------------------");

    }

    public String getID(){
        return this.strId;
    }

    public double getComp(){
        return this.comp;
    }

    public char getGrade1(){
        return this.grade1;
    }

    public char getGrade2(){
        return this.grade2;
    }

    public char getGrade3(){
        return this.grade3;
    }

    public void Compro(String ID1 , String ID2 , double comp1 , double comp2 , char grade1_1 , 
        char grade1_2 ,char grade2_1 , char grade2_2 ,char grade3_1 , char grade3_2){
        if(comp1 > comp2){
            System.out.println("Select : " + ID1); 
        }else if(comp1 < comp2){
            System.out.println("Select : " + ID2); 
        }else{
            calGrade1(ID1, ID2,grade1_1, grade1_2, grade2_1, grade2_2, grade3_1, grade3_2);
        }
    }

    public void calGrade1(String ID1, String ID2, char grade1_1 , char grade1_2 ,char grade2_1 , 
        char grade2_2 ,char grade3_1 , char grade3_2){
        if(calGrade_toInt(grade1_1) > calGrade_toInt(grade1_2)){
            System.out.println("Select : " + ID1);
        }else if(calGrade_toInt(grade1_1) < calGrade_toInt(grade1_2)){
            System.out.println("Select : " + ID2);
        }else{
            calGrade2(ID1, ID2, grade2_1, grade2_2, grade3_1, grade3_2);
        }
    }

    public void calGrade2(String ID1, String ID2, char grade2_1 , char grade2_2 ,char grade3_1 , 
        char grade3_2){
        if(calGrade_toInt(grade2_1) > calGrade_toInt(grade2_2)){
            System.out.println("Select : " + ID1);
        }else if(calGrade_toInt(grade2_1) < calGrade_toInt(grade2_2)){
            System.out.println("Select : " + ID2);
        }else{
            calGrade3(ID1, ID2, grade3_1, grade3_2);
        }
    }

    private void calGrade3(String ID1, String ID2,char grade3_1 , char grade3_2){
        if(calGrade_toInt(grade3_1) > calGrade_toInt(grade3_2)){
            System.out.println("Select : " + ID1);
        }else if(calGrade_toInt(grade3_1) < calGrade_toInt(grade3_2)){
            System.out.println("Select : " + ID2);
        }else{
            System.out.println("Select twice!!");
        }
    }

    public int calGrade_toInt(char grade){
        if(grade == 'A'){
            return 4;
        }else if (grade == 'B') {
            return 3;
        }else if (grade == 'C') {
            return 2;
        }else if (grade == 'D') {
            return 1;
        }else{
            return 0;
        }   
    }
}