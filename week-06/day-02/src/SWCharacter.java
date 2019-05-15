public class SWCharacter {
  private String name;
  private Double height;
  private Double mass;
  private String hairColour;
  private String skinColour;
  private String eyeColour;
  private String birthYear;
  private String gender;
  private boolean hasHeight;
  private boolean hasMass;
  private boolean hasHairColour;
  private boolean hasSkinColour;
  private boolean hasEyeColour;
  private boolean hasBirthYear;
  private boolean hasGender;

  public SWCharacter() {
  }

  public SWCharacter(String name, Double height, Double mass, String hairColour, String skinColour, String eyeColour, String birthYear, String gender) {
    this.name = name;
    this.height = height;
    this.mass = mass;
    this.hairColour = hairColour;
    this.skinColour = skinColour;
    this.eyeColour = eyeColour;
    this.birthYear = birthYear;
    this.gender = gender;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Double getHeight() {
    return height;
  }

  public void setHeight(Double height) {
    this.height = height;
  }

  public Double getMass() {
    return mass;
  }

  public void setMass(Double mass) {
    this.mass = mass;
  }

  public String getHairColour() {
    return hairColour;
  }

  public void setHairColour(String hairColour) {
    this.hairColour = hairColour;
  }

  public String getSkinColour() {
    return skinColour;
  }

  public void setSkinColour(String skinColour) {
    this.skinColour = skinColour;
  }

  public String getEyeColour() {
    return eyeColour;
  }

  public void setEyeColour(String eyeColour) {
    this.eyeColour = eyeColour;
  }

  public String getBirthYear() {
    return birthYear;
  }

  public void setBirthYear(String birthYear) {
    this.birthYear = birthYear;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public static boolean checkValue(String value) {
    if (value.equals("unknown")) {
      return false;
    }
    return true;
  }

  public boolean isHasHeight() {
    return hasHeight;
  }

  public void setHasHeight(boolean hasHeight) {
    this.hasHeight = hasHeight;
  }

  public boolean isHasMass() {
    return hasMass;
  }

  public void setHasMass(boolean hasMass) {
    this.hasMass = hasMass;
  }

  public boolean isHasHairColour() {
    return hasHairColour;
  }

  public void setHasHairColour(boolean hasHairColour) {
    this.hasHairColour = hasHairColour;
  }

  public boolean isHasSkinColour() {
    return hasSkinColour;
  }

  public void setHasSkinColour(boolean hasSkinColour) {
    this.hasSkinColour = hasSkinColour;
  }

  public boolean isHasEyeColour() {
    return hasEyeColour;
  }

  public void setHasEyeColour(boolean hasEyeColour) {
    this.hasEyeColour = hasEyeColour;
  }

  public boolean isHasBirthYear() {
    return hasBirthYear;
  }

  public void setHasBirthYear(boolean hasBirthYear) {
    this.hasBirthYear = hasBirthYear;
  }

  public boolean isHasGender() {
    return hasGender;
  }

  public void setHasGender(boolean hasGender) {
    this.hasGender = hasGender;
  }
}
