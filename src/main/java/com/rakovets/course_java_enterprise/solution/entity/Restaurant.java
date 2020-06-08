package main.java.com.rakovets.course_java_enterprise.solution.entity;

import java.util.HashSet;
import java.util.Set;

public class Restaurant {
    private long id;
    private String name;
    private Set<Dish> dishes = new HashSet<>();
    private Set<Review> reviews = new HashSet<>();

    public Restaurant(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Dish> getDishes() {
        return dishes;
    }

    public void setDishes(Set<Dish> dishes) {
        this.dishes = dishes;
    }

    public Set<Review> getReviews() {
        return reviews;
    }

    public void setReviews(Set<Review> reviews) {
        this.reviews = reviews;
    }

    @Override
    public String toString() {
        return "Restaurant{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", dishes=" + dishes +
                ", reviews=" + reviews +
                '}';
    }
}
