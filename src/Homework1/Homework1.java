package Homework1;

public class Homework1 {
    public static void main(String[] args) {

        Person irina = new Person("Ирина","Шольц", Sexes.Ж);
        Person vasya = new Person("Вася","Пупкин", Sexes.М);
        Person masha = new Person("Маша","Пупкина", Sexes.Ж);
        Person jane = new Person("Женя", "Пупкина",Sexes.Ж);
        Person ivan = new Person("Ваня","Пупкин", Sexes.М);

        GeoTree gt = new GeoTree();
        gt.append(irina, vasya);
        gt.append(irina, masha);
        gt.append(vasya, jane);
        gt.append(vasya, ivan);

        System.out.println(new Research(gt).spend(irina, Relationship.parent));
    }

    public static void view(Person rootPerson) {
        System.out.println(rootPerson);
        for (Person person : rootPerson.getFamily()) {
            view(person);
        }
    }
}