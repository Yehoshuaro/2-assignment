public class Main {

    public static void main(String[] args) {
        ArrayList<Person> people = new ArrayList<>();
        people.add(new Employee("John", "Lennon", 27045.78));
        people.add(new Student("Ringo", "Drute", 2.5));
        people.add(new Student("Paul", "Boze", 3.8));
        people.add(new Employee("George", "Bush", 50000.00));

        Collections.sort(people, (p1, p2) -> {
            return Double.compare(p2.getPaymentAmount(), p1.getPaymentAmount());
        });

        for (Person person : people) {
            System.out.println(person + " earns " + person.getPaymentAmount() + " tenge");
        }
    }
}
