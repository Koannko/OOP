import java.util.HashMap;
import java.util.Scanner;

public class FamilyTree {
    private HashMap<Integer, Person> family;
    private Scanner scanner;
    private int currentYear;
    private String name;
    private int index = 0;

    public FamilyTree() {
        currentYear = 0;
        family = new HashMap<>();
        family.put(index++, new Person(currentYear, "Adam"));
        family.put(index++, new Person(currentYear, "Eva"));
        currentYear += 25;
        giveBirth(family.get(0), family.get(1), console());
        giveBirth(family.get(0), family.get(1), console());
        currentYear += 25;
    }

    private void giveBirth(Person father, Person mother, String childName) {
        family.put(index, new Person(currentYear, childName));
        currentYear += 25;
        family.get(index).setMother(mother.getName());
        family.get(index).setFather(father.getName());
        father.addChild(family.get(index));
        mother.addChild(family.get(index));
        index++;
        System.out.println(father.getChildren());
    }

    public String console() {
        scanner = new Scanner(System.in);
        System.out.println("Give a name to your child: ");
        if (scanner.hasNextLine()) {
            name = scanner.nextLine().toString();
        }
        return name;
    }
}
