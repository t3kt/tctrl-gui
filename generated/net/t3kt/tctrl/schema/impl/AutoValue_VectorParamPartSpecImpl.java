
package net.t3kt.tctrl.schema.impl;

import com.google.common.collect.Range;
import javax.annotation.Generated;
import javax.annotation.Nullable;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_VectorParamPartSpecImpl<T extends Comparable<T>> extends VectorParamPartSpecImpl<T> {

  private final String key;
  private final String label;
  private final String path;
  private final Range<T> limitRange;
  private final Range<T> normRange;
  private final T defaultValue;

  private AutoValue_VectorParamPartSpecImpl(
      String key,
      String label,
      String path,
      @Nullable Range<T> limitRange,
      Range<T> normRange,
      T defaultValue) {
    this.key = key;
    this.label = label;
    this.path = path;
    this.limitRange = limitRange;
    this.normRange = normRange;
    this.defaultValue = defaultValue;
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
  public String path() {
    return path;
  }

  @Nullable
  @Override
  public Range<T> limitRange() {
    return limitRange;
  }

  @Override
  public Range<T> normRange() {
    return normRange;
  }

  @Override
  public T defaultValue() {
    return defaultValue;
  }

  @Override
  public String toString() {
    return "VectorParamPartSpecImpl{"
        + "key=" + key + ", "
        + "label=" + label + ", "
        + "path=" + path + ", "
        + "limitRange=" + limitRange + ", "
        + "normRange=" + normRange + ", "
        + "defaultValue=" + defaultValue
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof VectorParamPartSpecImpl) {
      VectorParamPartSpecImpl<?> that = (VectorParamPartSpecImpl<?>) o;
      return (this.key.equals(that.key()))
           && (this.label.equals(that.label()))
           && (this.path.equals(that.path()))
           && ((this.limitRange == null) ? (that.limitRange() == null) : this.limitRange.equals(that.limitRange()))
           && (this.normRange.equals(that.normRange()))
           && (this.defaultValue.equals(that.defaultValue()));
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
    h *= 1000003;
    h ^= this.path.hashCode();
    h *= 1000003;
    h ^= (limitRange == null) ? 0 : this.limitRange.hashCode();
    h *= 1000003;
    h ^= this.normRange.hashCode();
    h *= 1000003;
    h ^= this.defaultValue.hashCode();
    return h;
  }

  static final class Builder<T extends Comparable<T>> extends VectorParamPartSpecImpl.Builder<T> {
    private String key;
    private String label;
    private String path;
    private Range<T> limitRange;
    private Range<T> normRange;
    private T defaultValue;
    Builder() {
    }
    private Builder(VectorParamPartSpecImpl<T> source) {
      this.key = source.key();
      this.label = source.label();
      this.path = source.path();
      this.limitRange = source.limitRange();
      this.normRange = source.normRange();
      this.defaultValue = source.defaultValue();
    }
    @Override
    public VectorParamPartSpecImpl.Builder<T> setKey(String key) {
      this.key = key;
      return this;
    }
    @Override
    public VectorParamPartSpecImpl.Builder<T> setLabel(String label) {
      this.label = label;
      return this;
    }
    @Override
    public VectorParamPartSpecImpl.Builder<T> setPath(String path) {
      this.path = path;
      return this;
    }
    @Override
    public VectorParamPartSpecImpl.Builder<T> setLimitRange(@Nullable Range<T> limitRange) {
      this.limitRange = limitRange;
      return this;
    }
    @Override
    public VectorParamPartSpecImpl.Builder<T> setNormRange(Range<T> normRange) {
      this.normRange = normRange;
      return this;
    }
    @Override
    public VectorParamPartSpecImpl.Builder<T> setDefaultValue(T defaultValue) {
      this.defaultValue = defaultValue;
      return this;
    }
    @Override
    public VectorParamPartSpecImpl<T> build() {
      String missing = "";
      if (this.key == null) {
        missing += " key";
      }
      if (this.label == null) {
        missing += " label";
      }
      if (this.path == null) {
        missing += " path";
      }
      if (this.normRange == null) {
        missing += " normRange";
      }
      if (this.defaultValue == null) {
        missing += " defaultValue";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_VectorParamPartSpecImpl<T>(
          this.key,
          this.label,
          this.path,
          this.limitRange,
          this.normRange,
          this.defaultValue);
    }
  }

}
