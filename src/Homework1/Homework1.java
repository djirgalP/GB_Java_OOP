package Homework1;

public class Homework1 {
    public static void main(String[] args) {
        Person vasya = new Person("Василий","Пупкин", Sexes.M);//дед
        Person ivan = new Person("Ваня","Пупкин", Sexes.M);//отец
        Person irina = new Person("Ирина","Шольц", Sexes.F);//мать
        //дети
        Person masha = new Person("Маша","Пупкина", Sexes.F);
        Person jane = new Person("Женя", "Пупкина",Sexes.F);


/*        irina.appendToFamily(vasya);
        irina.appendToFamily(masha);
        vasya.appendToFamily(jane);
        vasya.appendToFamily(ivan);

        view(irina);*/

        GeoTree gt = new GeoTree();
        gt.appendChild(vasya, ivan);
        gt.appendChild(irina, masha);
        gt.appendChild(irina, jane);
        gt.appendChild(ivan, masha);
        gt.appendChild(ivan, jane);
        gt.appendPartner(ivan, irina);

        System.out.println(new Research(gt).spend(vasya, Relationship.parent));//для кого Василий - родитель
        System.out.println(new Research(gt).spend(vasya, Relationship.children));//для кого Василий - ребенок
        System.out.println(new Research(gt).spend(vasya, Relationship.partner));//для кого Василий - супруг
        System.out.println(new Research(gt).spend(ivan, Relationship.partner));//для кого Ваня - супруг
        System.out.println(new Research(gt).spend(jane, Relationship.children));//для кого Женя - ребенок
    }

    public static void view(Person rootPerson) {
        System.out.println(rootPerson);
        for (Person person : rootPerson.getFamily()) {
            view(person);
        }
    }
}