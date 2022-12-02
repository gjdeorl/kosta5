package kosta.domain;

import kosta.BoundedContext657Application;
import javax.persistence.*;
import java.util.List;
import lombok.Data;
import java.util.Date;


@Entity
@Table(name="Inventory_table")
@Data

public class Inventory  {


    
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    
    
    
    
    
    private Long id;
    
    
    
    
    
    private Integer qty;
    
    
    
    
    
    private String name;
    
    
    
    
    
    private Integer price;


    public static InventoryRepository repository(){
        InventoryRepository inventoryRepository = BoundedContext657Application.applicationContext.getBean(InventoryRepository.class);
        return inventoryRepository;
    }






}
