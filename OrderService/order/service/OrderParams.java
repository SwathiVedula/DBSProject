package order.service;
import lombok.*;

@Getter @Setter
public class OrderParams{


String CustomerName;
String OrderDate;
String ShippingAddress;
List<OrderItems> OrderItems;
Currency Total;


}