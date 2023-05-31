package org.example.sem2.task2;

import org.example.sem2.task1.Actor;

import java.util.List;

public interface MarketBehaviour {

    void acceptToMarket(Actor actor);
    void releaseFromMarket(List<Actor> actors);
    void update();
}
