package Models.Entities;


public class Produce {
    private int Id;
    private String Name;
    private int Strength;
    private int Weight;
    private int Size;
    private int Thickness;
    private int Appearance;
    private Batch fBatch;
    private Standart fStandart;
    private Worker fWorker;

    public Produce(int id, int strength, int weight, int size, int thickness, int appearance, Batch batch, Standart standart, Worker worker, String name) {
        Id = id;
        Strength = strength;
        Weight = weight;
        Size = size;
        Thickness = thickness;
        Appearance = appearance;
        fBatch = batch;
        fStandart = standart;
        fWorker = worker;
        Name = name;
    }
    public Produce(int id, int strength, int weight, int size, int thickness, int appearance, String name) {
        Id = id;
        Strength = strength;
        Weight = weight;
        Size = size;
        Thickness = thickness;
        Appearance = appearance;
        Name = name;
    }
    public Produce(int id){
        Id = id;
    }
    public Produce() {

    }

    public Worker getfWorker() {
        return fWorker;
    }

    public void setfWorker(Worker fWorker) {
        this.fWorker = fWorker;
    }

    public Standart getfStandart() {
        return fStandart;
    }


    public void setfStandart(Standart fStandart) {
        this.fStandart = fStandart;
    }

    public Batch getfBatch() {
        return fBatch;
    }

    public void setfBatch(Batch fBatch) {
        this.fBatch = fBatch;
    }

    public int getAppearance() {
        return Appearance;
    }

    public void setAppearance(int appearance) {
        Appearance = appearance;
    }

    public int getThickness() {
        return Thickness;
    }

    public void setThickness(int thickness) {
        Thickness = thickness;
    }

    public int getSize() {
        return Size;
    }

    public void setSize(int size) {
        Size = size;
    }

    public int getWeight() {
        return Weight;
    }

    public void setWeight(int weight) {
        Weight = weight;
    }

    public int getStrength() {
        return Strength;
    }

    public void setStrength(int strength) {
        Strength = strength;
    }

    public int getId() {
        return Id;
    }

    public void setId(int id) {
        Id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
