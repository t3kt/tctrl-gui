
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
  private final ImmutableSet<String> tags;
  private final ImmutableList<ModuleSpec> children;
  private final String description;

  private AutoValue_AppSchemaImpl(
      String key,
      String label,
      String path,
      ImmutableSet<String> tags,
      ImmutableList<ModuleSpec> children,
      @Nullable String description) {
    this.key = key;
    this.label = label;
    this.path = path;
    this.tags = tags;
    this.children = children;
    this.description = description;
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
  public ImmutableList<ModuleSpec> children() {
    return children;
  }

  @Nullable
  @Override
  public String description() {
    return description;
  }

  @Override
  public String toString() {
    return "AppSchemaImpl{"
        + "key=" + key + ", "
        + "label=" + label + ", "
        + "path=" + path + ", "
        + "tags=" + tags + ", "
        + "children=" + children + ", "
        + "description=" + description
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
           && (this.tags.equals(that.tags()))
           && (this.children.equals(that.children()))
           && ((this.description == null) ? (that.description() == null) : this.description.equals(that.description()));
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
    h ^= this.children.hashCode();
    h *= 1000003;
    h ^= (description == null) ? 0 : this.description.hashCode();
    return h;
  }

  static final class Builder extends AppSchemaImpl.Builder {
    private String key;
    private String label;
    private String path;
    private ImmutableSet.Builder<String> tagsBuilder$;
    private ImmutableSet<String> tags;
    private ImmutableList.Builder<ModuleSpec> childrenBuilder$;
    private ImmutableList<ModuleSpec> children;
    private String description;
    Builder() {
      this.tags = ImmutableSet.of();
      this.children = ImmutableList.of();
    }
    private Builder(AppSchemaImpl source) {
      this.key = source.key();
      this.label = source.label();
      this.path = source.path();
      this.tags = source.tags();
      this.children = source.children();
      this.description = source.description();
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
    public AppSchemaImpl.Builder setTags(ImmutableSet<String> tags) {
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
    public AppSchemaImpl.Builder setChildren(ImmutableList<ModuleSpec> children) {
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
    public AppSchemaImpl.Builder setDescription(@Nullable String description) {
      this.description = description;
      return this;
    }
    @Override
    public AppSchemaImpl build() {
      if (tagsBuilder$ != null) {
        this.tags = tagsBuilder$.build();
      }
      if (childrenBuilder$ != null) {
        this.children = childrenBuilder$.build();
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
      if (!missing.isEmpty()) {
        throw new IllegalStateException("Missing required properties:" + missing);
      }
      return new AutoValue_AppSchemaImpl(
          this.key,
          this.label,
          this.path,
          this.tags,
          this.children,
          this.description);
    }
  }

}
