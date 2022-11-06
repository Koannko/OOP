import java.util.HashMap;

public class Person {
    int yearBirth;
    String father;
    String mother;
    String name;
    int numOfChildren;
    HashMap<Integer, Person> children = new HashMap<>();
    int count = 0;

    public Person(int yearBirth, String name) {
        this.yearBirth = yearBirth;
        this.name = name;
    }

    public String getFather() {
        return father;
    }

    public void setFather(String father) {
        this.father = father;
    }

    public String getMother() {
        return mother;
    }

    public void setMother(String mother) {
        this.mother = mother;
    }

    public int getYearBirth() {
        return yearBirth;
    }

    public void setYearBirth(int yearBirth) {
        this.yearBirth = yearBirth;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public HashMap<Integer, Person> getChildren() {
        return children;
    }

    public void setChildren(HashMap<Integer, Person> children) {
        this.children = children;
    }

    public void addChild(Person p) {
        children = getChildren();
        numOfChildren = children.size();
        children.put(numOfChildren, p);
        setChildren(children);
    }

}
