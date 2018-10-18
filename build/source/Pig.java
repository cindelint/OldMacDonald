class Pig implements Animal {
  private String mySound, myType;
  public Pig(String type, String sound) {
    mySound = sound;
    myType = type;
  }
  public Pig() {
    myType = "unknown";
    mySound = "unknown";
  }
  public String getSound() {
    return mySound;
  }
  public String getType() {
    return myType;
  }
}
