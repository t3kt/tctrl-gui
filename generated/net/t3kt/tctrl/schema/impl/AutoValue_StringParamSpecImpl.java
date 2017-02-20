
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
  private final String group;
  private final ImmutableSet<String> tags;
  private final ParamType type;
  private final String style;
  private final String path;
  private final String otherType;
  private final String defaultValue;
  private final ImmutableList<ParamOption> options;

  private AutoValue_StringParamSpecImpl(
      String key,
      String label,
      String group,
      ImmutableSet<String> tags,
      ParamType type,
      String style,
      String path,
      @Nullable String otherType,
      String defaultValue,
      ImmutableList<ParamOption> options) {
    this.key = key;
    this.label = label;
    this.group = group;
    this.tags = tags;
    this.type = type;
    this.style = style;
    this.path = path;
    this.otherType = otherType;
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
        + "group=" + group + ", "
        + "tags=" + tags + ", "
        + "type=" + type + ", "
        + "style=" + style + ", "
        + "path=" + path + ", "
        + "otherType=" + otherType + ", "
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
           && (this.group.equals(that.group()))
           && (this.tags.equals(that.tags()))
           && (this.type.equals(that.type()))
           && (this.style.equals(that.style()))
           && (this.path.equals(that.path()))
           && ((this.otherType == null) ? (that.otherType() == null) : this.otherType.equals(that.otherType()))
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
    h ^= this.options.hashCode();
    return h;
  }

  static final class Builder extends StringParamSpecImpl.Builder {
    private String key;
    private String label;
    private String group;
    private ImmutableSet<String> tags;
    private ParamType type;
    private String style;
    private String path;
    private String otherType;
    private String defaultValue;
    private ImmutableList<ParamOption> options;
    Builder() {
    }
    private Builder(StringParamSpecImpl source) {
      this.key = source.key();
      this.label = source.label();
      this.group = source.group();
      this.tags = source.tags();
      this.type = source.type();
      this.style = source.style();
      this.path = source.path();
      this.otherType = source.otherType();
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
    public StringParamSpecImpl.Builder setGroup(String group) {
      this.group = group;
      return this;
    }
    @Override
    public StringParamSpecImpl.Builder setTags(ImmutableSet<String> tags) {
      this.tags = tags;
      return this;
    }
    @Override
    public StringParamSpecImpl.Builder setType(ParamType type) {
      this.type = type;
      return this;
    }
    @Override
    public StringParamSpecImpl.Builder setStyle(String style) {
      this.style = style;
      return this;
    }
    @Override
    public StringParamSpecImpl.Builder setPath(String path) {
      this.path = path;
      return this;
    }
    @Override
    public StringParamSpecImpl.Builder setOtherType(@Nullable String otherType) {
      this.otherType = otherType;
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
      if (this.options == null) {
        missing += " options";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_StringParamSpecImpl(
          this.key,
          this.label,
          this.group,
          this.tags,
          this.type,
          this.style,
          this.path,
          this.otherType,
          this.defaultValue,
          this.options);
    }
  }

}
