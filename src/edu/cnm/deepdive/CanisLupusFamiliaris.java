package edu.cnm.deepdive;

public class CanisLupusFamiliaris extends CanisLupus
    implements Trainable {

  private static int instanceCount = 0;

  public CanisLupusFamiliaris() {
    instanceCount++;
  }

  public static int getInstanceCount() {
    return instanceCount;
  }

  @Override
  public void hunt() {
    System.out.println("Hunt for play.");
  }

  @Override
  public void speak() {
    System.out.println("Bark, unless I'm a Basenji.");
  }

  @Override
  public void perform() {
    System.out.println("Sit, speak, roll over, play dead.");
  }

}
