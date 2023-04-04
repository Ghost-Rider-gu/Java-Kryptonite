/**
 * We have an Order class with date and name fields.
 * Need to implement getLastOrderNames method that gets a List of the last names of orders by date.
 */
package corp.siendev.com;

import java.util.Comparator;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class LastOrderName {
    public static List<String> getLastOrderNames(List<Order> listOfOrders, int countOrder) {
        int orderQuantity = listOfOrders.size();
        return listOfOrders.stream()
                .sorted(Comparator.comparing(Order::getDate))
                .skip(orderQuantity - countOrder)
                .map(Order::getName)
                .collect(Collectors.toList());
    }

    public static class Order {
        private Date date;
        private String name;

        public Date getDate() {
            return date;
        }

        public void setDate(Date date) {
            this.date = date;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
    }
}
