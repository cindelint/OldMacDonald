class Cow implements Animal {
  protected String mySound, myType;
  public Cow(String type, String sound) {
    mySound = sound;
    myType = type;
  }
  public Cow() {
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
