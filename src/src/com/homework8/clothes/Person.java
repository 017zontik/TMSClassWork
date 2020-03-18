package src.com.homework8.clothes;

public class Person {
    private String name;
    private IClothes jacket;
    private IClothes foot;
    private IClothes pants;


    public Person(String name, IClothes jacket, IClothes foot, IClothes pants) {
        this.name = name;
        this.jacket = jacket;
        this.foot = foot;
        this.pants = pants;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public IClothes getJacket() {
        return jacket;
    }

    public void setJacket(IClothes jacket) {
        this.jacket = jacket;
    }

    public IClothes getFoot() {
        return foot;
    }

    public void setFoot(IClothes foot) {
        this.foot = foot;
    }

    public IClothes getPants() {
        return pants;
    }

    public void setPants(IClothes pants) {
        this.pants = pants;
    }


    public void putOnClothes() {
        jacket.putOn();
        pants.putOn();
        foot.putOn();
    }


    public void takeOffClothes() {
    jacket.takeOff();
    pants.takeOff();
    foot.takeOff();
    }
}
