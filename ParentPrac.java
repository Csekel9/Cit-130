
package week2inheritence;

class Student {
    String name;
    int studID;
    String gender;
    int age;
}
class ElemStudent extends Student{
    String allergies;
    int emergencyContactPhone;

}
class HighschStudent extends Student {
    String grades;
    int car;
}
class ColschStudent extends Student {
    String tuition;
    int mealplan;
}
public class ParentPrac {
    public static void main(String[] args) {
        Student stud = new Student();
        ElemStudent elemStud = new ElemStudent ();
        elemStud.name = "Carl";
        elemStud.allergies = "email, homework, peanut, math";
        elemStud.emergencyContactPhone = 416423664;
        // I can store a subclass in a variable typed
        // to the super class! Handy because I can write
        // code that operates on the superclass before
        // the subclass has even been written
        stud = elemStud;
        ElemStudent anotherElemStudVar;
        anotherElemStudVar = (ElemStudent) stud;
        HighschStudent highschStud = new HighschStudent();
        highschStud.car = 183249;
        highschStud.grades = "a,b,c,d,f";
        ColschStudent colschStud = new ColschStudent();
        colschStud.mealplan = 4000;
        colschStud.tuition = "18,000";
        // demonstrate to your neighbor that you can use instance of
        // correctly and carry out a typecast
        // See section 11.9
        
        
        
        
    }
        
    }
    
