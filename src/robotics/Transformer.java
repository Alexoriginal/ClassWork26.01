package robotics;

/**
 * Created by java on 26.01.2018.
 */
public class Transformer extends Robot {

    private String name;


    protected String transformerField;

    private boolean swork;

   public void fight(){
        if(swork==true){
            System.out.println(getName()+"i can fight"+ "my serial number"+getSerialNumder());//бурум имя от робота
        }

    }

    public boolean isSwork() {
        return swork;
    }

    public void setSwork(boolean swork) {
        this.swork = swork;
    }



    public String getName() {
        System.out.println("it is transformer  get name");
        return name;
    }


    public void setName(String name) {
        System.out.println("it is transformer  set name");
        this.name=name;
    }

    @Override
    protected void thinking() {
        super.thinking();//родительский метод
        System.out.println("But i am transformr ");
    }

    @Override
    public String toString() {
        return name;
    }
//------------------------------------------------------------
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Transformer that = (Transformer) o;

        if (swork != that.swork) return false;
        if (name != null ? !name.equals(that.name) : that.name != null) return false;
        return !(transformerField != null ? !transformerField.equals(that.transformerField) : that.transformerField != null);

    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (transformerField != null ? transformerField.hashCode() : 0);
        result = 31 * result + (swork ? 1 : 0);
        return result;
    }
}
