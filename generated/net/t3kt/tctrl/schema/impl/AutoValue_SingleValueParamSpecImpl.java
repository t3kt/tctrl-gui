
package net.t3kt.tctrl.schema.impl;

import com.google.common.collect.ImmutableSet;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import net.t3kt.tctrl.schema.ParamType;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_SingleValueParamSpecImpl<T extends Comparable<T>> extends SingleValueParamSpecImpl<T> {

  private final String key;
  private final String label;
  private final String group;
  private final ImmutableSet<String> tags;
  private final ParamType type;
  private final String style;
  private final String path;
  private final String otherType;
  private final T defaultValue;

  private AutoValue_SingleValueParamSpecImpl(
      String key,
      String label,
      String group,
      ImmutableSet<String> tags,
      ParamType type,
      String style,
      String path,
      @Nullable String otherType,
      T defaultValue) {
    this.key = key;
    this.label = label;
    this.group = group;
    this.tags = tags;
    this.type = type;
    this.style = style;
    this.path = path;
    this.otherType = otherType;
    this.defaultValue = defaultValue;
  }

  @Override
  public String getKey() {
    return key;
  }

  @Override
  public String getLabel() {
    return label;
  }

  @Override
  public String getGroup() {
    return group;
  }

  @Override
  public ImmutableSet<String> getTags() {
    return tags;
  }

  @Override
  public ParamType getType() {
    return type;
  }

  @Override
  public String getStyle() {
    return style;
  }

  @Override
  public String getPath() {
    return path;
  }

  @Nullable
  @Override
  public String getOtherType() {
    return otherType;
  }

  @Override
  public T getDefaultValue() {
    return defaultValue;
  }

  @Override
  public String toString() {
    return "SingleValueParamSpecImpl{"
        + "key=" + key + ", "
        + "label=" + label + ", "
        + "group=" + group + ", "
        + "tags=" + tags + ", "
        + "type=" + type + ", "
        + "style=" + style + ", "
        + "path=" + path + ", "
        + "otherType=" + otherType + ", "
        + "defaultValue=" + defaultValue
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof SingleValueParamSpecImpl) {
      SingleValueParamSpecImpl<?> that = (SingleValueParamSpecImpl<?>) o;
      return (this.key.equals(that.getKey()))
           && (this.label.equals(that.getLabel()))
           && (this.group.equals(that.getGroup()))
           && (this.tags.equals(that.getTags()))
           && (this.type.equals(that.getType()))
           && (this.style.equals(that.getStyle()))
           && (this.path.equals(that.getPath()))
           && ((this.otherType == null) ? (that.getOtherType() == null) : this.otherType.equals(that.getOtherType()))
           && (this.defaultValue.equals(that.getDefaultValue()));
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
    return h;
  }

  static final class Builder<T extends Comparable<T>> extends SingleValueParamSpecImpl.Builder<T> {
    private String key;
    private String label;
    private String group;
    private ImmutableSet<String> tags;
    private ParamType type;
    private String style;
    private String path;
    private String otherType;
    private T defaultValue;
    Builder() {
    }
    private Builder(SingleValueParamSpecImpl<T> source) {
      this.key = source.getKey();
      this.label = source.getLabel();
      this.group = source.getGroup();
      this.tags = source.getTags();
      this.type = source.getType();
      this.style = source.getStyle();
      this.path = source.getPath();
      this.otherType = source.getOtherType();
      this.defaultValue = source.getDefaultValue();
    }
    @Override
    public SingleValueParamSpecImpl.Builder<T> setKey(String key) {
      this.key = key;
      return this;
    }
    @Override
    public SingleValueParamSpecImpl.Builder<T> setLabel(String label) {
      this.label = label;
      return this;
    }
    @Override
    public SingleValueParamSpecImpl.Builder<T> setGroup(String group) {
      this.group = group;
      return this;
    }
    @Override
    public SingleValueParamSpecImpl.Builder<T> setTags(ImmutableSet<String> tags) {
      this.tags = tags;
      return this;
    }
    @Override
    public SingleValueParamSpecImpl.Builder<T> setType(ParamType type) {
      this.type = type;
      return this;
    }
    @Override
    public SingleValueParamSpecImpl.Builder<T> setStyle(String style) {
      this.style = style;
      return this;
    }
    @Override
    public SingleValueParamSpecImpl.Builder<T> setPath(String path) {
      this.path = path;
      return this;
    }
    @Override
    public SingleValueParamSpecImpl.Builder<T> setOtherType(@Nullable String otherType) {
      this.otherType = otherType;
      return this;
    }
    @Override
    public SingleValueParamSpecImpl.Builder<T> setDefaultValue(T defaultValue) {
      this.defaultValue = defaultValue;
      return this;
    }
    @Override
    public SingleValueParamSpecImpl<T> build() {
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
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_SingleValueParamSpecImpl<T>(
          this.key,
          this.label,
          this.group,
          this.tags,
          this.type,
          this.style,
          this.path,
          this.otherType,
          this.defaultValue);
    }
  }

}
