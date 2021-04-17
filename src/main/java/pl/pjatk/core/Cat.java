package pl.pjatk.core;

public class Cat {

    private Long id;
    private String name;

    public Cat(Long id, String name) {
        this.id = id;
        this.name = name;
        System.out.println("hello from cat");
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
