package pl.pjatk.core;

public class Dog {

    private Long id;
    private String name;

    public void sayWrr() {
        System.out.println("wrr");
    }

    public Dog(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
