//package org.example.hm2;
//
//import java.util.List;
//
//public class Market implements MarketBehaviour, QueueBehaviour {
//
//    private List<Actor> queue;
//    private List<Actor> byuerList;
//
//
//    @Override
//    public void acceptToMarket(Actor actor) {
//        System.out.println(actor.getName() + " зашел в очередь");
//        byuerList.add(actor);
//    }
//
//    @Override
//    public void releaseFromMarket(List<Actor> actors) {
//
//    }
//
//    @Override
//    public void releaseFromMarket(Actor actor) {
//        System.out.println(actor.getName() + " покинул магазин.");
//        buyerList.remove(actor);
//    }
//
//    @Override
//    public void update() {
//
//    }
//
//    @Override
//    public void takeInQueue(Actor actor) {
//        System.out.println(actor.getName() + " встал в очередь.");
//        actorQueue.add(actor);
//    }
//
//    @Override
//    public void takeOrders() {
//        for (Actor actor: queue) {
//            if(!actor.isMakeOrder) {
//                actor.setMakeOrder(true);
//                System.out.println(actor.getName() + " сделал свой заказ");
//            }
//        }
//    }
//
//    @Override
//    public void giveOrders() {
//
//    }
//
//    @Override
//    public void releaseFromQueue() {
//
//    }
//}
