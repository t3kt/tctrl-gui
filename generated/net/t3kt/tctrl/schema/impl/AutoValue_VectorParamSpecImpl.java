
package net.t3kt.tctrl.schema.impl;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import net.t3kt.tctrl.schema.ParamType;
import net.t3kt.tctrl.schema.VectorParamPartSpec;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_VectorParamSpecImpl<T extends Comparable<T>> extends VectorParamSpecImpl<T> {

  private final String key;
  private final String label;
  private final String group;
  private final ImmutableSet<String> tags;
  private final ParamType type;
  private final String style;
  private final String path;
  private final String otherType;
  private final ImmutableList<VectorParamPartSpec<T>> parts;

  private AutoValue_VectorParamSpecImpl(
      String key,
      String label,
      String group,
      ImmutableSet<String> tags,
      ParamType type,
      String style,
      String path,
      @Nullable String otherType,
      ImmutableList<VectorParamPartSpec<T>> parts) {
    this.key = key;
    this.label = label;
    this.group = group;
    this.tags = tags;
    this.type = type;
    this.style = style;
    this.path = path;
    this.otherType = otherType;
    this.parts = parts;
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
  public ImmutableList<VectorParamPartSpec<T>> parts() {
    return parts;
  }

  @Override
  public String toString() {
    return "VectorParamSpecImpl{"
        + "key=" + key + ", "
        + "label=" + label + ", "
        + "group=" + group + ", "
        + "tags=" + tags + ", "
        + "type=" + type + ", "
        + "style=" + style + ", "
        + "path=" + path + ", "
        + "otherType=" + otherType + ", "
        + "parts=" + parts
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof VectorParamSpecImpl) {
      VectorParamSpecImpl<?> that = (VectorParamSpecImpl<?>) o;
      return (this.key.equals(that.key()))
           && (this.label.equals(that.label()))
           && (this.group.equals(that.group()))
           && (this.tags.equals(that.tags()))
           && (this.type.equals(that.type()))
           && (this.style.equals(that.style()))
           && (this.path.equals(that.path()))
           && ((this.otherType == null) ? (that.otherType() == null) : this.otherType.equals(that.otherType()))
           && (this.parts.equals(that.parts()));
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
    h ^= this.parts.hashCode();
    return h;
  }

  static final class Builder<T extends Comparable<T>> extends VectorParamSpecImpl.Builder<T> {
    private String key;
    private String label;
    private String group;
    private ImmutableSet<String> tags;
    private ParamType type;
    private String style;
    private String path;
    private String otherType;
    private ImmutableList<VectorParamPartSpec<T>> parts;
    Builder() {
    }
    private Builder(VectorParamSpecImpl<T> source) {
      this.key = source.key();
      this.label = source.label();
      this.group = source.group();
      this.tags = source.tags();
      this.type = source.type();
      this.style = source.style();
      this.path = source.path();
      this.otherType = source.otherType();
      this.parts = source.parts();
    }
    @Override
    public VectorParamSpecImpl.Builder<T> setKey(String key) {
      this.key = key;
      return this;
    }
    @Override
    public VectorParamSpecImpl.Builder<T> setLabel(String label) {
      this.label = label;
      return this;
    }
    @Override
    public VectorParamSpecImpl.Builder<T> setGroup(String group) {
      this.group = group;
      return this;
    }
    @Override
    public VectorParamSpecImpl.Builder<T> setTags(ImmutableSet<String> tags) {
      this.tags = tags;
      return this;
    }
    @Override
    public VectorParamSpecImpl.Builder<T> setType(ParamType type) {
      this.type = type;
      return this;
    }
    @Override
    public VectorParamSpecImpl.Builder<T> setStyle(String style) {
      this.style = style;
      return this;
    }
    @Override
    public VectorParamSpecImpl.Builder<T> setPath(String path) {
      this.path = path;
      return this;
    }
    @Override
    public VectorParamSpecImpl.Builder<T> setOtherType(@Nullable String otherType) {
      this.otherType = otherType;
      return this;
    }
    @Override
    public VectorParamSpecImpl.Builder<T> setParts(ImmutableList<VectorParamPartSpec<T>> parts) {
      this.parts = parts;
      return this;
    }
    @Override
    public VectorParamSpecImpl<T> build() {
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
      if (this.parts == null) {
        missing += " parts";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_VectorParamSpecImpl<T>(
          this.key,
          this.label,
          this.group,
          this.tags,
          this.type,
          this.style,
          this.path,
          this.otherType,
          this.parts);
    }
  }

}