
package net.t3kt.tctrl.schema.impl;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.ImmutableSet;
import javax.annotation.Generated;
import net.t3kt.tctrl.schema.ModuleSpec;

@Generated("com.google.auto.value.processor.AutoValueProcessor")
 final class AutoValue_AppSchemaImpl extends AppSchemaImpl {

  private final String key;
  private final String label;
  private final String path;
  private final String group;
  private final ImmutableSet<String> tags;
  private final ImmutableList<ModuleSpec> children;

  private AutoValue_AppSchemaImpl(
      String key,
      String label,
      String path,
      String group,
      ImmutableSet<String> tags,
      ImmutableList<ModuleSpec> children) {
    this.key = key;
    this.label = label;
    this.path = path;
    this.group = group;
    this.tags = tags;
    this.children = children;
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

  @Override
  public String toString() {
    return "AppSchemaImpl{"
        + "key=" + key + ", "
        + "label=" + label + ", "
        + "path=" + path + ", "
        + "group=" + group + ", "
        + "tags=" + tags + ", "
        + "children=" + children
        + "}";
  }

  @Override
  public boolean equals(Object o) {
    if (o == this) {
      return true;
    }
    if (o instanceof AppSchemaImpl) {
      AppSchemaImpl that = (AppSchemaImpl) o;
      return (this.key.equals(that.key()))
           && (this.label.equals(that.label()))
           && (this.path.equals(that.path()))
           && (this.group.equals(that.group()))
           && (this.tags.equals(that.tags()))
           && (this.children.equals(that.children()));
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
    return h;
  }

  static final class Builder extends AppSchemaImpl.Builder {
    private String key;
    private String label;
    private String path;
    private String group;
    private ImmutableSet<String> tags;
    private ImmutableList<ModuleSpec> children;
    Builder() {
    }
    private Builder(AppSchemaImpl source) {
      this.key = source.key();
      this.label = source.label();
      this.path = source.path();
      this.group = source.group();
      this.tags = source.tags();
      this.children = source.children();
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
    public AppSchemaImpl.Builder setPath(String path) {
      this.path = path;
      return this;
    }
    @Override
    public AppSchemaImpl.Builder setGroup(String group) {
      this.group = group;
      return this;
    }
    @Override
    public AppSchemaImpl.Builder setTags(ImmutableSet<String> tags) {
      this.tags = tags;
      return this;
    }
    @Override
    public AppSchemaImpl.Builder setChildren(ImmutableList<ModuleSpec> children) {
      this.children = children;
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
      if (this.path == null) {
        missing += " path";
      }
      if (this.group == null) {
        missing += " group";
      }
      if (this.tags == null) {
        missing += " tags";
      }
      if (this.children == null) {
        missing += " children";
      }
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_AppSchemaImpl(
          this.key,
          this.label,
          this.path,
          this.group,
          this.tags,
          this.children);
    }
  }

}
