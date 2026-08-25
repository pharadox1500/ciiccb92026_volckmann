package Task13;
class Afritada{public void showIngredients(){System.out.println("Afritada");}}
class Mechado extends Afritada{public void showIngredients(){System.out.println("Mechado");}}
class Menudo extends Afritada{public void showIngredients(){System.out.println("Menudo");}}
class Caldereta extends Afritada{public void showIngredients(){System.out.println("Caldereta");}}
public class Task131{
 public static void main(String[] args){
  Afritada meal1=new Afritada();
  Afritada meal2=new Mechado();
  Afritada meal3=new Menudo();
  Afritada meal4=new Caldereta();
  meal1.showIngredients();
  meal2.showIngredients();
  meal3.showIngredients();
  meal4.showIngredients();
 }
}
