package foo;

import com.google.common.base.Optional;
import io.norberg.automatter.AutoMatter;

import javax.annotation.Generated;


@Generated("io.norberg.automatter.processor.AutoMatterProcessor")
public final class GenericGuavaOptionalFieldsBuilder<T> {

  private Optional<T> foo;
  private Optional<T> bar;

  public GenericGuavaOptionalFieldsBuilder() {
    this.foo = Optional.absent();
  }

  private GenericGuavaOptionalFieldsBuilder(GenericGuavaOptionalFields<? extends T> v) {
    this.foo = (Optional<T>) v.foo();
    this.bar = (Optional<T>) v.bar();
  }

  private GenericGuavaOptionalFieldsBuilder(GenericGuavaOptionalFieldsBuilder<? extends T> v) {
    this.foo = (Optional<T>) v.foo;
    this.bar = (Optional<T>) v.bar;
  }

  public Optional<T> foo() {
    return foo;
  }

  public GenericGuavaOptionalFieldsBuilder<T> foo(T foo) {
    return foo(Optional.fromNullable(foo));
  }

  public GenericGuavaOptionalFieldsBuilder<T> foo(Optional<? extends T> foo) {
    if (foo == null) {
      throw new NullPointerException("foo");
    }
    this.foo = (Optional<T>) foo;
    return this;
  }

  public Optional<T> bar() {
    return bar;
  }

  public GenericGuavaOptionalFieldsBuilder<T> bar(T bar) {
    return bar(Optional.fromNullable(bar));
  }

  public GenericGuavaOptionalFieldsBuilder<T> bar(Optional<? extends T> bar) {
    this.bar = (Optional<T>) bar;
    return this;
  }

  public GenericGuavaOptionalFields<T> build() {
    return new Value<T>(foo, bar);
  }

  public static <T> GenericGuavaOptionalFieldsBuilder<T> from(GenericGuavaOptionalFields<? extends T> v) {
    return new GenericGuavaOptionalFieldsBuilder<T>(v);
  }

  public static <T> GenericGuavaOptionalFieldsBuilder<T> from(GenericGuavaOptionalFieldsBuilder<? extends T> v) {
    return new GenericGuavaOptionalFieldsBuilder<T>(v);
  }

  private static final class Value<T>
      implements GenericGuavaOptionalFields<T> {

    private final Optional<T> foo;
    private final Optional<T> bar;

    private Value(@AutoMatter.Field("foo") Optional<T> foo, @AutoMatter.Field("bar") Optional<T> bar) {
      if (foo == null) {
        throw new NullPointerException("foo");
      }
      this.foo = foo;
      this.bar = bar;
    }

    @AutoMatter.Field
    @Override
    public Optional<T> foo() {
      return foo;
    }

    @AutoMatter.Field
    @Override
    public Optional<T> bar() {
      return bar;
    }

    public GenericGuavaOptionalFieldsBuilder<T> builder() {
      return new GenericGuavaOptionalFieldsBuilder<T>(this);
    }

    @Override
    public boolean equals(Object o) {
      if (this == o) {
        return true;
      }
      if (!(o instanceof GenericGuavaOptionalFields)) {
        return false;
      }

      final GenericGuavaOptionalFields<?> that = (GenericGuavaOptionalFields<?>) o;

      if (foo != null ? !foo.equals(that.foo()) : that.foo() != null) {
        return false;
      }
      if (bar != null ? !bar.equals(that.bar()) : that.bar() != null) {
        return false;
      }

      return true;
    }

    @Override
    public int hashCode() {
      int result = 1;
      long temp;
      result = 31 * result + (foo != null ? foo.hashCode() : 0);
      result = 31 * result + (bar != null ? bar.hashCode() : 0);
      return result;
    }

    @Override
    public String toString() {
      return "GenericGuavaOptionalFields{" +
             "foo=" + foo +
             ", bar=" + bar +
             '}';
    }
  }
}
