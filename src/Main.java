import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Queue<Person> queue = new LinkedList<>(generateClients());
        while (!queue.isEmpty()) {
            Person person = queue.poll();
            System.out.println(person.getName() + " " + person.getSurname() + " прокатился на аттракционе");
            person.numberTicket();
            if (person.getTickets() > 0) {
                queue.offer(person);
            }
        }
    }

    public static List<Person> generateClients() {
        List<Person> clients = new LinkedList<>();
        clients.add(new Person("Olesya", "Yakimenko", 3));
        clients.add(new Person("Aleksey", "Yakimenko", 2));
        clients.add(new Person("Milina", "Yakimenko", 1));
        clients.add(new Person("Ilona", "Agapkina", 4));
        return clients;
    }
}
