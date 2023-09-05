package de.neuefische.joshu4l;

public interface OrderRepo {

    public void addOrder(Order order);
    public void removeOrder(String id);
    public Order checkOrder(String id);
}
