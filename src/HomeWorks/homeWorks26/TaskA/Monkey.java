package HomeWorks.homeWorks26.TaskA;

import javax.swing.plaf.synth.SynthOptionPaneUI;

class Monkey implements Actionable {


  @Override
  public void climb() {
   System.out.println("карабкается");
  }

  @Override
  public void hold() {
   System.out.println("Держится");
  }

  @Override
  public void eat() {
   System.out.println("Кушает");

  }
 }
