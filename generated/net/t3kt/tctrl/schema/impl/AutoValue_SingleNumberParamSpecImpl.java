
package net.t3kt.tctrl.schema.impl;

import com.google.common.collect.ImmutableSet;
import com.google.common.collect.Range;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import net.t3kt.tctrl.schema.ParamType;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_SingleNumberParamSpecImpl<T extends Comparable<T>> extends SingleNumberParamSpecImpl<T> {

  private final String key;
  private final String label;
  private final String group;
  private final ImmutableSet<String> tags;
  private final ParamType type;
  private final String style;
  private final String path;
  private final String otherType;
  private final T defaultValue;
  private final Range<T> limitRange;
  private final Range<T> normRange;

  private AutoValue_SingleNumberParamSpecImpl(
      String key,
      String label,
      String group,
      ImmutableSet<String> tags,
      ParamType type,
      String style,
      String path,
      @Nullable String otherType,
      T defaultValue,
      @Nullable Range<T> limitRange,
      Range<T> normRange) {
    this.key = key;
    this.label = label;
    this.group = group;
    this.tags = tags;
    this.type = type;
    this.style = style;
    this.path = path;
    this.otherType = otherType;
    this.defaultValue = defaultValue;
    this.limitRange = limitRange;
    this.normRange = normRange;
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
  public String group() {
    return group;
  }

  @Override
  public ImmutableSet<String> tags() {
    return tags;
  }

  @Override
  public ParamType type() {
    return type;
  }

  @Override
  public String style() {
    return style;
  }

  @Override
  public String path() {
    return path;
  }

  @Nullable
  @Override
  public String otherType() {
    return otherType;
  }

  @Override
  public T defaultValue() {
    return defaultValue;
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
  public String toString() {
    return "SingleNumberParamSpecImpl{"
        + "key=" + key + ", "
        + "label=" + label + ", "
        + "group=" + group + ", "
        + "tags=" + tags + ", "
        + "type=" + type + ", "
        + "style=" + style + ", "
        + "path=" + path + ", "
        + "otherType=" + otherType + ", "
        + "defaultValue=" + defaultValue + ", "
        + "limitRange=" + limitRange + ", "
        + "normRange=" + normRange
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SingleNumberParamSpecImpl) {
      SingleNumberParamSpecImpl<?> that = (SingleNumberParamSpecImpl<?>) o;
      return (this.key.equals(that.key()))
           && (this.label.equals(that.label()))
           && (this.group.equals(that.group()))
           && (this.tags.equals(that.tags()))
           && (this.type.equals(that.type()))
           && (this.style.equals(that.style()))
           && (this.path.equals(that.path()))
           && ((this.otherType == null) ? (that.otherType() == null) : this.otherType.equals(that.otherType()))
           && (this.defaultValue.equals(that.defaultValue()))
           && ((this.limitRange == null) ? (that.limitRange() == null) : this.limitRange.equals(that.limitRange()))
           && (this.normRange.equals(that.normRange()));
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
    h ^= this.group.hashCode();
    h *= 1000003;
    h ^= this.tags.hashCode();
    h *= 1000003;
    h ^= this.type.hashCode();
    h *= 1000003;
    h ^= this.style.hashCode();
    h *= 1000003;
    h ^= this.path.hashCode();
    h *= 1000003;
    h ^= (otherType == null) ? 0 : this.otherType.hashCode();
    h *= 1000003;
    h ^= this.defaultValue.hashCode();
    h *= 1000003;
    h ^= (limitRange == null) ? 0 : this.limitRange.hashCode();
    h *= 1000003;
    h ^= this.normRange.hashCode();
    return h;
  }

  static final class Builder<T extends Comparable<T>> extends SingleNumberParamSpecImpl.Builder<T> {
    private String key;
    private String label;
    private String group;
    private ImmutableSet<String> tags;
    private ParamType type;
    private String style;
    private String path;
    private String otherType;
    private T defaultValue;
    private Range<T> limitRange;
    private Range<T> normRange;
    Builder() {
    }
    private Builder(SingleNumberParamSpecImpl<T> source) {
      this.key = source.key();
      this.label = source.label();
      this.group = source.group();
      this.tags = source.tags();
      this.type = source.type();
      this.style = source.style();
      this.path = source.path();
      this.otherType = source.otherType();
      this.defaultValue = source.defaultValue();
      this.limitRange = source.limitRange();
      this.normRange = source.normRange();
    }
    @Override
    public SingleNumberParamSpecImpl.Builder<T> setKey(String key) {
      this.key = key;
      return this;
    }
    @Override
    public SingleNumberParamSpecImpl.Builder<T> setLabel(String label) {
      this.label = label;
      return this;
    }
    @Override
    public SingleNumberParamSpecImpl.Builder<T> setGroup(String group) {
      this.group = group;
      return this;
    }
    @Override
    public SingleNumberParamSpecImpl.Builder<T> setTags(ImmutableSet<String> tags) {
      this.tags = tags;
      return this;
    }
    @Override
    public SingleNumberParamSpecImpl.Builder<T> setType(ParamType type) {
      this.type = type;
      return this;
    }
    @Override
    public SingleNumberParamSpecImpl.Builder<T> setStyle(String style) {
      this.style = style;
      return this;
    }
    @Override
    public SingleNumberParamSpecImpl.Builder<T> setPath(String path) {
      this.path = path;
      return this;
    }
    @Override
    public SingleNumberParamSpecImpl.Builder<T> setOtherType(@Nullable String otherType) {
      this.otherType = otherType;
      return this;
    }
    @Override
    public SingleNumberParamSpecImpl.Builder<T> setDefaultValue(T defaultValue) {
      this.defaultValue = defaultValue;
      return this;
    }
    @Override
    public SingleNumberParamSpecImpl.Builder<T> setLimitRange(@Nullable Range<T> limitRange) {
      this.limitRange = limitRange;
      return this;
    }
    @Override
    public SingleNumberParamSpecImpl.Builder<T> setNormRange(Range<T> normRange) {
      this.normRange = normRange;
      return this;
    }
    @Override
    public SingleNumberParamSpecImpl<T> build() {
      String missing = "";
      if (this.key == null) {
        missing += " key";
      }
      if (this.label == null) {
        missing += " label";
      }
      if (this.group == null) {
        missing += " group";
      }
      if (this.tags == null) {
        missing += " tags";
      }
      if (this.type == null) {
        missing += " type";
      }
      if (this.style == null) {
        missing += " style";
      }
      if (this.path == null) {
        missing += " path";
      }
      if (this.defaultValue == null) {
        missing += " defaultValue";
      }
      if (this.normRange == null) {
        missing += " normRange";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_SingleNumberParamSpecImpl<T>(
          this.key,
          this.label,
          this.group,
          this.tags,
          this.type,
          this.style,
          this.path,
          this.otherType,
          this.defaultValue,
          this.limitRange,
          this.normRange);
    }
  }

}
