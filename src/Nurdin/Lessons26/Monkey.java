//package Nurdin.Lessons26;
//
//public class Monkey extends AbstractAnimal implements SkillsMonkey {
//    private AbstractAnimal abstractAnimal;
//
//    public Monkey() {
//    }
//
//    public Monkey(String name, AbstractAnimal abstractAnimal) {
//        super(name);
//        this.abstractAnimal = abstractAnimal;
//    }
//
//    public AbstractAnimal getAbstractAnimal() {
//        return abstractAnimal;
//    }
//
//    public void setAbstractAnimal(AbstractAnimal abstractAnimal) {
//        this.abstractAnimal = abstractAnimal;
//    }
//
//    @Override
//    public String toString() {
//        return "Monkey{" +
//                "abstractAnimal=" + abstractAnimal +
//                "} " + super.toString();
//    }
//
//    @Override
//    public void drag() {
//        if (abstractAnimal != null)
//            System.out.println("Тащит другого зверя!");
//        else
//            System.out.println("Не тащит другого зверя!");
//    }
//}
