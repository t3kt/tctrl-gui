
package net.t3kt.tctrl.schema.impl;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import net.t3kt.tctrl.schema.ModuleSpec;
import net.t3kt.tctrl.schema.ParamSpec;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_ModuleSpecImpl extends ModuleSpecImpl {

  private final String moduleType;
  private final String key;
  private final String label;
  private final String path;
  private final ImmutableList<ModuleSpec> children;
  private final ImmutableList<ParamSpec> params;
  private final String group;
  private final ImmutableSet<String> tags;

  private AutoValue_ModuleSpecImpl(
      @Nullable String moduleType,
      String key,
      String label,
      @Nullable String path,
      ImmutableList<ModuleSpec> children,
      ImmutableList<ParamSpec> params,
      @Nullable String group,
      ImmutableSet<String> tags) {
    this.moduleType = moduleType;
    this.key = key;
    this.label = label;
    this.path = path;
    this.children = children;
    this.params = params;
    this.group = group;
    this.tags = tags;
  }

  @Nullable
  @Override
  public String getModuleType() {
    return moduleType;
  }

  @Override
  public String getKey() {
    return key;
  }

  @Override
  public String getLabel() {
    return label;
  }

  @Nullable
  @Override
  public String getPath() {
    return path;
  }

  @Override
  public ImmutableList<ModuleSpec> getChildren() {
    return children;
  }

  @Override
  public ImmutableList<ParamSpec> getParams() {
    return params;
  }

  @Nullable
  @Override
  public String getGroup() {
    return group;
  }

  @Override
  public ImmutableSet<String> getTags() {
    return tags;
  }

  @Override
  public String toString() {
    return "ModuleSpecImpl{"
        + "moduleType=" + moduleType + ", "
        + "key=" + key + ", "
        + "label=" + label + ", "
        + "path=" + path + ", "
        + "children=" + children + ", "
        + "params=" + params + ", "
        + "group=" + group + ", "
        + "tags=" + tags
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof ModuleSpecImpl) {
      ModuleSpecImpl that = (ModuleSpecImpl) o;
      return ((this.moduleType == null) ? (that.getModuleType() == null) : this.moduleType.equals(that.getModuleType()))
           && (this.key.equals(that.getKey()))
           && (this.label.equals(that.getLabel()))
           && ((this.path == null) ? (that.getPath() == null) : this.path.equals(that.getPath()))
           && (this.children.equals(that.getChildren()))
           && (this.params.equals(that.getParams()))
           && ((this.group == null) ? (that.getGroup() == null) : this.group.equals(that.getGroup()))
           && (this.tags.equals(that.getTags()));
    }
    return false;
  }

  @Override
  public int hashCode() {
    int h = 1;
    h *= 1000003;
    h ^= (moduleType == null) ? 0 : this.moduleType.hashCode();
    h *= 1000003;
    h ^= this.key.hashCode();
    h *= 1000003;
    h ^= this.label.hashCode();
    h *= 1000003;
    h ^= (path == null) ? 0 : this.path.hashCode();
    h *= 1000003;
    h ^= this.children.hashCode();
    h *= 1000003;
    h ^= this.params.hashCode();
    h *= 1000003;
    h ^= (group == null) ? 0 : this.group.hashCode();
    h *= 1000003;
    h ^= this.tags.hashCode();
    return h;
  }

  static final class Builder extends ModuleSpecImpl.Builder {
    private String moduleType;
    private String key;
    private String label;
    private String path;
    private ImmutableList<ModuleSpec> children;
    private ImmutableList<ParamSpec> params;
    private String group;
    private ImmutableSet<String> tags;
    Builder() {
    }
    private Builder(ModuleSpecImpl source) {
      this.moduleType = source.getModuleType();
      this.key = source.getKey();
      this.label = source.getLabel();
      this.path = source.getPath();
      this.children = source.getChildren();
      this.params = source.getParams();
      this.group = source.getGroup();
      this.tags = source.getTags();
    }
    @Override
    public ModuleSpecImpl.Builder setModuleType(@Nullable String moduleType) {
      this.moduleType = moduleType;
      return this;
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
    public ModuleSpecImpl.Builder setPath(@Nullable String path) {
      this.path = path;
      return this;
    }
    @Override
    public ModuleSpecImpl.Builder setChildren(ImmutableList<ModuleSpec> children) {
      this.children = children;
      return this;
    }
    @Override
    public ModuleSpecImpl.Builder setParams(ImmutableList<ParamSpec> params) {
      this.params = params;
      return this;
    }
    @Override
    public ModuleSpecImpl.Builder setGroup(@Nullable String group) {
      this.group = group;
      return this;
    }
    @Override
    public ModuleSpecImpl.Builder setTags(ImmutableSet<String> tags) {
      this.tags = tags;
      return this;
    }
    @Override
    public ModuleSpecImpl build() {
      String missing = "";
      if (this.key == null) {
        missing += " key";
      }
      if (this.label == null) {
        missing += " label";
      }
      if (this.children == null) {
        missing += " children";
      }
      if (this.params == null) {
        missing += " params";
      }
      if (this.tags == null) {
        missing += " tags";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_ModuleSpecImpl(
          this.moduleType,
          this.key,
          this.label,
          this.path,
          this.children,
          this.params,
          this.group,
          this.tags);
    }
  }

}
