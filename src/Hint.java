import java.lang.annotation.*;


@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE,ElementType.METHOD})
@Repeatable(Hints.class)
@interface Hint{
    String value();
}