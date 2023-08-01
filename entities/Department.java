package entities;

public class Department {
    private Integer department_id;
    private String name;
    private Region region;
    public Integer getDepartment_id() {
        return department_id;
    }
    public void setDepartment_id(Integer department_id) {
        this.department_id = department_id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Region getRegion() {
        return region;
    }
    public void setRegion(Region region) {
        this.region = region;
    }
}
