package com.example.orderservice.pojo;



import lombok.Data;
import org.apache.ibatis.type.Alias;


import java.util.Date;
import java.util.List;

@Alias("Order")
@Data
public class Order{
    public String order_id;
    public int type;
    public int state;
    public String user_id;
    public int passenger_num;
    public Double price;
    public Date datetime;
    public String from_name;
    public String to_name;
    public Double from_lat;
    public Double from_lon;
    public Double to_lat;
    public Double to_lon;
    public String driver_id;
    public String description;
    public Date taken_time;
}
