
package net.t3kt.tctrl.schema.impl;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import net.t3kt.tctrl.schema.ParamOption;
import net.t3kt.tctrl.schema.ParamType;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_StringParamSpecImpl extends StringParamSpecImpl {

  private final String key;
  private final String label;
  private final String path;
  private final ImmutableSet<String> tags;
  private final ParamType type;
  private final String style;
  private final String otherType;
  private final String group;
  private final String defaultValue;
  private final ImmutableList<ParamOption> options;

  private AutoValue_StringParamSpecImpl(
      String key,
      String label,
      String path,
      ImmutableSet<String> tags,
      ParamType type,
      @Nullable String style,
      @Nullable String otherType,
      @Nullable String group,
      String defaultValue,
      ImmutableList<ParamOption> options) {
    this.key = key;
    this.label = label;
    this.path = path;
    this.tags = tags;
    this.type = type;
    this.style = style;
    this.otherType = otherType;
    this.group = group;
    this.defaultValue = defaultValue;
    this.options = options;
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
  public String defaultValue() {
    return defaultValue;
  }

  @Override
  public ImmutableList<ParamOption> options() {
    return options;
  }

  @Override
  public String toString() {
    return "StringParamSpecImpl{"
        + "key=" + key + ", "
        + "label=" + label + ", "
        + "path=" + path + ", "
        + "tags=" + tags + ", "
        + "type=" + type + ", "
        + "style=" + style + ", "
        + "otherType=" + otherType + ", "
        + "group=" + group + ", "
        + "defaultValue=" + defaultValue + ", "
        + "options=" + options
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof StringParamSpecImpl) {
      StringParamSpecImpl that = (StringParamSpecImpl) o;
      return (this.key.equals(that.key()))
           && (this.label.equals(that.label()))
           && (this.path.equals(that.path()))
           && (this.tags.equals(that.tags()))
           && (this.type.equals(that.type()))
           && ((this.style == null) ? (that.style() == null) : this.style.equals(that.style()))
           && ((this.otherType == null) ? (that.otherType() == null) : this.otherType.equals(that.otherType()))
           && ((this.group == null) ? (that.group() == null) : this.group.equals(that.group()))
           && (this.defaultValue.equals(that.defaultValue()))
           && (this.options.equals(that.options()));
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
    h ^= this.defaultValue.hashCode();
    h *= 1000003;
    h ^= this.options.hashCode();
    return h;
  }

  static final class Builder extends StringParamSpecImpl.Builder {
    private String key;
    private String label;
    private String path;
    private ImmutableSet.Builder<String> tagsBuilder$;
    private ImmutableSet<String> tags;
    private ParamType type;
    private String style;
    private String otherType;
    private String group;
    private String defaultValue;
    private ImmutableList<ParamOption> options;
    Builder() {
      this.tags = ImmutableSet.of();
    }
    private Builder(StringParamSpecImpl source) {
      this.key = source.key();
      this.label = source.label();
      this.path = source.path();
      this.tags = source.tags();
      this.type = source.type();
      this.style = source.style();
      this.otherType = source.otherType();
      this.group = source.group();
      this.defaultValue = source.defaultValue();
      this.options = source.options();
    }
    @Override
    public StringParamSpecImpl.Builder setKey(String key) {
      this.key = key;
      return this;
    }
    @Override
    public StringParamSpecImpl.Builder setLabel(String label) {
      this.label = label;
      return this;
    }
    @Override
    public StringParamSpecImpl.Builder setPath(String path) {
      this.path = path;
      return this;
    }
    @Override
    public StringParamSpecImpl.Builder setTags(ImmutableSet<String> tags) {
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
    public StringParamSpecImpl.Builder setType(ParamType type) {
      this.type = type;
      return this;
    }
    @Override
    public StringParamSpecImpl.Builder setStyle(@Nullable String style) {
      this.style = style;
      return this;
    }
    @Override
    public StringParamSpecImpl.Builder setOtherType(@Nullable String otherType) {
      this.otherType = otherType;
      return this;
    }
    @Override
    public StringParamSpecImpl.Builder setGroup(@Nullable String group) {
      this.group = group;
      return this;
    }
    @Override
    public StringParamSpecImpl.Builder setDefaultValue(String defaultValue) {
      this.defaultValue = defaultValue;
      return this;
    }
    @Override
    public StringParamSpecImpl.Builder setOptions(ImmutableList<ParamOption> options) {
      this.options = options;
      return this;
    }
    @Override
    public StringParamSpecImpl build() {
      if (tagsBuilder$ != null) {
        this.tags = tagsBuilder$.build();
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
      if (this.defaultValue == null) {
        missing += " defaultValue";
      }
      if (this.options == null) {
        missing += " options";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_StringParamSpecImpl(
          this.key,
          this.label,
          this.path,
          this.tags,
          this.type,
          this.style,
          this.otherType,
          this.group,
          this.defaultValue,
          this.options);
    }
  }

}
