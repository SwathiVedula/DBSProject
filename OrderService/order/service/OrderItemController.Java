package order.service;



import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.RestController;  
@RestController
public OrderItemController{

@RequestMapping(value="/neworderitem",method=RequestMethod.POST)
public  String createNewOrderItem(OrderItemParams orderItemRequest){

OrderDAO orderDao= new OrderDAO();
//creates new order
orderDao.createNewOrderItem(orderItemRequest);





}

@RequestMapping(value="/retrieveorderitem/{productCode}",method=RequestMethod.GET,produces="application/json")
public  OrderParams retrieveOrderItem(@PathVariable String productCode){

//retrieves existing orderitem details

OrderParams  orderParams  =orderDao.retrieveOrderItem(productCode);




return orderParams;













}


}