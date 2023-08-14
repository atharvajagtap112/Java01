interface Bicycle{
    int a=45;
    void ApplyBreak(int decrement);
    void SpeedUp(int increment);
}
interface HeroCycle{
     void Horn();
     void BlowHorn();

}
class AvonCycle implements Bicycle,HeroCycle{
    void Cycle(){
        System.out.println("poo poo poo");
    }
    public void ApplyBreak(int decrement){
        System.out.println("Applying Break");
    }
    public void SpeedUp(int increment){
        System.out.println("Increasing speed");
    }
public void Horn(){
    System.out.println("pee pee pee");
    }
    public void BlowHorn(){
        System.out.println("poo poo poo");

    }

}
public class CH_11_Interfaces {
    public static void main(String[] args) {
        AvonCycle cy =new AvonCycle();
        cy.ApplyBreak(4);
        cy.SpeedUp(1);
        cy.Cycle();
        cy.Horn();
    cy.BlowHorn();
    }

}
