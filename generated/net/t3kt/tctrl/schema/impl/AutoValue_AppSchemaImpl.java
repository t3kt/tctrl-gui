
package net.t3kt.tctrl.schema.impl;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import javax.annotation.Generated;
import javax.annotation.Nullable;
import net.t3kt.tctrl.schema.ModuleSpec;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_AppSchemaImpl extends AppSchemaImpl {

  private final String key;
  private final String label;
  private final String path;
  private final ImmutableList<ModuleSpec> children;
  private final String group;
  private final ImmutableSet<String> tags;

  private AutoValue_AppSchemaImpl(
      String key,
      String label,
      @Nullable String path,
      ImmutableList<ModuleSpec> children,
      @Nullable String group,
      ImmutableSet<String> tags) {
    this.key = key;
    this.label = label;
    this.path = path;
    this.children = children;
    this.group = group;
    this.tags = tags;
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
    return "AppSchemaImpl{"
        + "key=" + key + ", "
        + "label=" + label + ", "
        + "path=" + path + ", "
        + "children=" + children + ", "
        + "group=" + group + ", "
        + "tags=" + tags
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AppSchemaImpl) {
      AppSchemaImpl that = (AppSchemaImpl) o;
      return (this.key.equals(that.getKey()))
           && (this.label.equals(that.getLabel()))
           && ((this.path == null) ? (that.getPath() == null) : this.path.equals(that.getPath()))
           && (this.children.equals(that.getChildren()))
           && ((this.group == null) ? (that.getGroup() == null) : this.group.equals(that.getGroup()))
           && (this.tags.equals(that.getTags()));
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
    h ^= (path == null) ? 0 : this.path.hashCode();
    h *= 1000003;
    h ^= this.children.hashCode();
    h *= 1000003;
    h ^= (group == null) ? 0 : this.group.hashCode();
    h *= 1000003;
    h ^= this.tags.hashCode();
    return h;
  }

  static final class Builder extends AppSchemaImpl.Builder {
    private String key;
    private String label;
    private String path;
    private ImmutableList<ModuleSpec> children;
    private String group;
    private ImmutableSet<String> tags;
    Builder() {
    }
    private Builder(AppSchemaImpl source) {
      this.key = source.getKey();
      this.label = source.getLabel();
      this.path = source.getPath();
      this.children = source.getChildren();
      this.group = source.getGroup();
      this.tags = source.getTags();
    }
    @Override
    public AppSchemaImpl.Builder setKey(String key) {
      this.key = key;
      return this;
    }
    @Override
    public AppSchemaImpl.Builder setLabel(String label) {
      this.label = label;
      return this;
    }
    @Override
    public AppSchemaImpl.Builder setPath(@Nullable String path) {
      this.path = path;
      return this;
    }
    @Override
    public AppSchemaImpl.Builder setChildren(ImmutableList<ModuleSpec> children) {
      this.children = children;
      return this;
    }
    @Override
    public AppSchemaImpl.Builder setGroup(@Nullable String group) {
      this.group = group;
      return this;
    }
    @Override
    public AppSchemaImpl.Builder setTags(ImmutableSet<String> tags) {
      this.tags = tags;
      return this;
    }
    @Override
    public AppSchemaImpl build() {
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
      if (this.tags == null) {
        missing += " tags";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_AppSchemaImpl(
          this.key,
          this.label,
          this.path,
          this.children,
          this.group,
          this.tags);
    }
  }

}
