package utils;

/**
 * The bootstrap-datepicker requires a custom date format ({@see http://www.eyecon.ro/bootstrap-datepicker/}).
 * Since this format pattern is not compatible with {@link java.text.SimpleDateFormat}, we need a converter method.
 *
 * @author <a href="mailto:benoit.courtine@gmail.com">Benoît Courtine</a>.
 */
public class DateFormatUtils {

  /**
   * Very basic converter: only some basic conversions are supported.
   *
   * @param javaSimpleDateFormat Java date format, compatible with {@link java.text.SimpleDateFormat} patterns.
   * @return bootstrap-datepicker equivalent format.
   */
  public static String toJsDateFormat(String javaSimpleDateFormat) {
    return javaSimpleDateFormat
        .replaceAll("[HhmsS]", "") // hours, minutes, seconds, and milliseconds are not supported in JQuery date format patterns.
        .replace('M', 'm'); // Minutes are lower case in JQuery date format patterns.
  }
}
