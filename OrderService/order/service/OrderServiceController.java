package order.service;

import org.springframework.web.bind.annotation.RequestMapping;  
import org.springframework.web.bind.annotation.PathVariable;  
import org.springframework.web.bind.annotation.RestController;  
@RestController
public OrderServiceController{

 @Autowired
    OrderItemClient orderItemClient;
@RequestMapping(value="/neworder",method=RequestMethod.POST)
public  String createNewOrder(OrderParams orderserviceRequest){

OrderDAO orderDao= new OrderDAO();
//creates new order
orderDao.createNewOrder(orderserviceRequest);


    
    @GetMapping()
    public OrderItems newOrderItem()
    {
        return orderItemClient.newOrderItem();
    }


}

@RequestMapping(value="/retrieveorder/{customerName}",method=RequestMethod.GET,produces="application/json")
public  OrderParams retrieveOrder(@PathVariable String custName){

//retrieves existing order

OrderParams  orderParams  =orderDao.retrieveOrder(custName);
 @GetMapping()
    public OrderItems retrieveOrderItem()
    {
        OrderItems orderItems= orderItemClient.retrieveOrderItem();
    }



return orderParams;













}


}