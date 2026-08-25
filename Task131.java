package Task13;

class Afritada {
 public void showIngredients(){System.out.println("Afritada = [Tomato Sauce, Meat]");}
}
class Mechado extends Afritada {
 public void showIngredients(){System.out.println("Mechado = [Tomato Sauce, Meat, Potatoes & Carrots]");}
}
class Menudo extends Afritada {
 public void showIngredients(){System.out.println("Menudo = [Tomato Sauce, Meat, Potatoes & Carrots, Liver Spread, Raisins, Hotdog]");}
}
class Caldereta extends Afritada {
 public void showIngredients(){System.out.println("Caldereta = [Tomato Sauce, Meat, Potatoes & Carrots, Tomato Paste, Liver Spread, Raisins, Hotdog, Cheese]");}
}
public class Task131 {
 public static void main(String[] args) {
  Afritada meal1=new Afritada(), meal2=new Mechado(), meal3=new Menudo(), meal4=new Caldereta();
  meal1.showIngredients(); meal2.showIngredients(); meal3.showIngredients(); meal4.showIngredients();
 }
}
