
package net.t3kt.tctrl.schema;

import javax.annotation.Generated;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_ParamOption extends ParamOption {

  private final String key;
  private final String label;

  AutoValue_ParamOption(
      String key,
      String label) {
    if (key == null) {
      throw new NullPointerException("Null key");
    }
    this.key = key;
    if (label == null) {
      throw new NullPointerException("Null label");
    }
    this.label = label;
  }

  @Override
  public String key() {
    return key;
  }

  @Override
  public String label() {
    return label;
  }

  @Override
  public String toString() {
    return "ParamOption{"
        + "key=" + key + ", "
        + "label=" + label
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ParamOption) {
      ParamOption that = (ParamOption) o;
      return (this.key.equals(that.key()))
           && (this.label.equals(that.label()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= this.key.hashCode();
    h *= 1000003;
    h ^= this.label.hashCode();
    return h;
  }

}
