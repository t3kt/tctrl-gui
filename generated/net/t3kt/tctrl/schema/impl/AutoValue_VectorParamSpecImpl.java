
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
  private final String path;
  private final ImmutableSet<String> tags;
  private final ParamType type;
  private final String style;
  private final String otherType;
  private final String group;
  private final ImmutableList<VectorParamPartSpec<T>> parts;

  private AutoValue_VectorParamSpecImpl(
      String key,
      String label,
      String path,
      ImmutableSet<String> tags,
      ParamType type,
      @Nullable String style,
      @Nullable String otherType,
      @Nullable String group,
      ImmutableList<VectorParamPartSpec<T>> parts) {
    this.key = key;
    this.label = label;
    this.path = path;
    this.tags = tags;
    this.type = type;
    this.style = style;
    this.otherType = otherType;
    this.group = group;
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
  public String path() {
    return path;
  }

  @Override
  public ImmutableSet<String> tags() {
    return tags;
  }

  @Override
  public ParamType type() {
    return type;
  }

  @Nullable
  @Override
  public String style() {
    return style;
  }

  @Nullable
  @Override
  public String otherType() {
    return otherType;
  }

  @Nullable
  @Override
  public String group() {
    return group;
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
        + "path=" + path + ", "
        + "tags=" + tags + ", "
        + "type=" + type + ", "
        + "style=" + style + ", "
        + "otherType=" + otherType + ", "
        + "group=" + group + ", "
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
           && (this.path.equals(that.path()))
           && (this.tags.equals(that.tags()))
           && (this.type.equals(that.type()))
           && ((this.style == null) ? (that.style() == null) : this.style.equals(that.style()))
           && ((this.otherType == null) ? (that.otherType() == null) : this.otherType.equals(that.otherType()))
           && ((this.group == null) ? (that.group() == null) : this.group.equals(that.group()))
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
    h ^= this.path.hashCode();
    h *= 1000003;
    h ^= this.tags.hashCode();
    h *= 1000003;
    h ^= this.type.hashCode();
    h *= 1000003;
    h ^= (style == null) ? 0 : this.style.hashCode();
    h *= 1000003;
    h ^= (otherType == null) ? 0 : this.otherType.hashCode();
    h *= 1000003;
    h ^= (group == null) ? 0 : this.group.hashCode();
    h *= 1000003;
    h ^= this.parts.hashCode();
    return h;
  }

  static final class Builder<T extends Comparable<T>> extends VectorParamSpecImpl.Builder<T> {
    private String key;
    private String label;
    private String path;
    private ImmutableSet.Builder<String> tagsBuilder$;
    private ImmutableSet<String> tags;
    private ParamType type;
    private String style;
    private String otherType;
    private String group;
    private ImmutableList.Builder<VectorParamPartSpec<T>> partsBuilder$;
    private ImmutableList<VectorParamPartSpec<T>> parts;
    Builder() {
      this.tags = ImmutableSet.of();
      this.parts = ImmutableList.of();
    }
    private Builder(VectorParamSpecImpl<T> source) {
      this.key = source.key();
      this.label = source.label();
      this.path = source.path();
      this.tags = source.tags();
      this.type = source.type();
      this.style = source.style();
      this.otherType = source.otherType();
      this.group = source.group();
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
    public VectorParamSpecImpl.Builder<T> setPath(String path) {
      this.path = path;
      return this;
    }
    @Override
    public VectorParamSpecImpl.Builder<T> setTags(ImmutableSet<String> tags) {
      if (tagsBuilder$ != null) {
        throw new IllegalStateException("Cannot set tags after calling tagsBuilder()");
      }
      this.tags = tags;
      return this;
    }
    @Override
    public ImmutableSet.Builder<String> tagsBuilder() {
      if (tagsBuilder$ == null) {
        if (tags == null) {
          tagsBuilder$ = ImmutableSet.builder();
        } else {
          tagsBuilder$ = ImmutableSet.builder();
          tagsBuilder$.addAll(tags);
          tags = null;
        }
      }
      return tagsBuilder$;
    }
    @Override
    public VectorParamSpecImpl.Builder<T> setType(ParamType type) {
      this.type = type;
      return this;
    }
    @Override
    public VectorParamSpecImpl.Builder<T> setStyle(@Nullable String style) {
      this.style = style;
      return this;
    }
    @Override
    public VectorParamSpecImpl.Builder<T> setOtherType(@Nullable String otherType) {
      this.otherType = otherType;
      return this;
    }
    @Override
    public VectorParamSpecImpl.Builder<T> setGroup(@Nullable String group) {
      this.group = group;
      return this;
    }
    @Override
    public VectorParamSpecImpl.Builder<T> setParts(ImmutableList<VectorParamPartSpec<T>> parts) {
      if (partsBuilder$ != null) {
        throw new IllegalStateException("Cannot set parts after calling partsBuilder()");
      }
      this.parts = parts;
      return this;
    }
    @Override
    public ImmutableList.Builder<VectorParamPartSpec<T>> partsBuilder() {
      if (partsBuilder$ == null) {
        if (parts == null) {
          partsBuilder$ = ImmutableList.builder();
        } else {
          partsBuilder$ = ImmutableList.builder();
          partsBuilder$.addAll(parts);
          parts = null;
        }
      }
      return partsBuilder$;
    }
    @Override
    public VectorParamSpecImpl<T> build() {
      if (tagsBuilder$ != null) {
        this.tags = tagsBuilder$.build();
      }
      if (partsBuilder$ != null) {
        this.parts = partsBuilder$.build();
      }
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
      if (this.type == null) {
        missing += " type";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_VectorParamSpecImpl<T>(
          this.key,
          this.label,
          this.path,
          this.tags,
          this.type,
          this.style,
          this.otherType,
          this.group,
          this.parts);
    }
  }

}
