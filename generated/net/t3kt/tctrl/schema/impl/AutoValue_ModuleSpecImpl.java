
package net.t3kt.tctrl.schema.impl;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import net.t3kt.tctrl.schema.ModuleSpec;
import net.t3kt.tctrl.schema.ParamSpec;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_ModuleSpecImpl extends ModuleSpecImpl {

  private final String key;
  private final String label;
  private final String path;
  private final String group;
  private final ImmutableSet<String> tags;
  private final ImmutableList<ModuleSpec> children;
  private final String moduleType;
  private final ImmutableList<ParamSpec> params;

  private AutoValue_ModuleSpecImpl(
      String key,
      String label,
      String path,
      String group,
      ImmutableSet<String> tags,
      ImmutableList<ModuleSpec> children,
      @Nullable String moduleType,
      ImmutableList<ParamSpec> params) {
    this.key = key;
    this.label = label;
    this.path = path;
    this.group = group;
    this.tags = tags;
    this.children = children;
    this.moduleType = moduleType;
    this.params = params;
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
  public String group() {
    return group;
  }

  @Override
  public ImmutableSet<String> tags() {
    return tags;
  }

  @Override
  public ImmutableList<ModuleSpec> children() {
    return children;
  }

  @Nullable
  @Override
  public String moduleType() {
    return moduleType;
  }

  @Override
  public ImmutableList<ParamSpec> params() {
    return params;
  }

  @Override
  public String toString() {
    return "ModuleSpecImpl{"
        + "key=" + key + ", "
        + "label=" + label + ", "
        + "path=" + path + ", "
        + "group=" + group + ", "
        + "tags=" + tags + ", "
        + "children=" + children + ", "
        + "moduleType=" + moduleType + ", "
        + "params=" + params
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ModuleSpecImpl) {
      ModuleSpecImpl that = (ModuleSpecImpl) o;
      return (this.key.equals(that.key()))
           && (this.label.equals(that.label()))
           && (this.path.equals(that.path()))
           && (this.group.equals(that.group()))
           && (this.tags.equals(that.tags()))
           && (this.children.equals(that.children()))
           && ((this.moduleType == null) ? (that.moduleType() == null) : this.moduleType.equals(that.moduleType()))
           && (this.params.equals(that.params()));
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
    h ^= this.group.hashCode();
    h *= 1000003;
    h ^= this.tags.hashCode();
    h *= 1000003;
    h ^= this.children.hashCode();
    h *= 1000003;
    h ^= (moduleType == null) ? 0 : this.moduleType.hashCode();
    h *= 1000003;
    h ^= this.params.hashCode();
    return h;
  }

  static final class Builder extends ModuleSpecImpl.Builder {
    private String key;
    private String label;
    private String path;
    private String group;
    private ImmutableSet<String> tags;
    private ImmutableList.Builder<ModuleSpec> childrenBuilder$;
    private ImmutableList<ModuleSpec> children;
    private String moduleType;
    private ImmutableList.Builder<ParamSpec> paramsBuilder$;
    private ImmutableList<ParamSpec> params;
    Builder() {
      this.children = ImmutableList.of();
      this.params = ImmutableList.of();
    }
    private Builder(ModuleSpecImpl source) {
      this.key = source.key();
      this.label = source.label();
      this.path = source.path();
      this.group = source.group();
      this.tags = source.tags();
      this.children = source.children();
      this.moduleType = source.moduleType();
      this.params = source.params();
    }
    @Override
    public ModuleSpecImpl.Builder setKey(String key) {
      this.key = key;
      return this;
    }
    @Override
    public ModuleSpecImpl.Builder setLabel(String label) {
      this.label = label;
      return this;
    }
    @Override
    public ModuleSpecImpl.Builder setPath(String path) {
      this.path = path;
      return this;
    }
    @Override
    public ModuleSpecImpl.Builder setGroup(String group) {
      this.group = group;
      return this;
    }
    @Override
    public ModuleSpecImpl.Builder setTags(ImmutableSet<String> tags) {
      this.tags = tags;
      return this;
    }
    @Override
    public ModuleSpecImpl.Builder setChildren(ImmutableList<ModuleSpec> children) {
      if (childrenBuilder$ != null) {
        throw new IllegalStateException("Cannot set children after calling childrenBuilder()");
      }
      this.children = children;
      return this;
    }
    @Override
    public ImmutableList.Builder<ModuleSpec> childrenBuilder() {
      if (childrenBuilder$ == null) {
        if (children == null) {
          childrenBuilder$ = ImmutableList.builder();
        } else {
          childrenBuilder$ = ImmutableList.builder();
          childrenBuilder$.addAll(children);
          children = null;
        }
      }
      return childrenBuilder$;
    }
    @Override
    public ModuleSpecImpl.Builder setModuleType(@Nullable String moduleType) {
      this.moduleType = moduleType;
      return this;
    }
    @Override
    public ModuleSpecImpl.Builder setParams(ImmutableList<ParamSpec> params) {
      if (paramsBuilder$ != null) {
        throw new IllegalStateException("Cannot set params after calling paramsBuilder()");
      }
      this.params = params;
      return this;
    }
    @Override
    public ImmutableList.Builder<ParamSpec> paramsBuilder() {
      if (paramsBuilder$ == null) {
        if (params == null) {
          paramsBuilder$ = ImmutableList.builder();
        } else {
          paramsBuilder$ = ImmutableList.builder();
          paramsBuilder$.addAll(params);
          params = null;
        }
      }
      return paramsBuilder$;
    }
    @Override
    public ModuleSpecImpl build() {
      if (childrenBuilder$ != null) {
        this.children = childrenBuilder$.build();
      }
      if (paramsBuilder$ != null) {
        this.params = paramsBuilder$.build();
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
      if (this.group == null) {
        missing += " group";
      }
      if (this.tags == null) {
        missing += " tags";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_ModuleSpecImpl(
          this.key,
          this.label,
          this.path,
          this.group,
          this.tags,
          this.children,
          this.moduleType,
          this.params);
    }
  }

}
