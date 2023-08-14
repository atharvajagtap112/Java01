abstract class pen{
abstract void write();
abstract void refill();
        }
        class Fountain extends pen{
    public void changenip(){

    }

            @Override
            void write() {

            }

            @Override
            void refill() {

            }}
            class monkey{
        void jump(){
            System.out.println("Jump");
        }
        void bite(){
            System.out.println("bite");
        }

            }
            interface BaseAnimale{
        void eat();
        void sleep();

            }
            class Human extends monkey implements BaseAnimale{

               @Override
               public void eat(){
                   System.out.println("eat");
               }
                public void sleep(){
                    System.out.println("sleep");
                }
            }

public class CH_11_Practice_Set {
    public static void main(String[] args) {
        //Problem1
        Human man=new Human();
man.eat();
man.sleep();
man.bite();
man.jump();
//Problem 2
monkey ma =new Human();// take this human use like a monkey
ma.bite();
    }
}
