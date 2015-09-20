package android.util;

import java.io.PrintWriter;
import java.io.StringWriter;

public final class Log {

  public static final int VERBOSE = 2;
  public static final int DEBUG = 3;
  public static final int INFO = 4;
  public static final int WARN = 5;
  public static final int ERROR = 6;
  public static final int ASSERT = 7;

  private Log() {}

  public static int v(String tag, String msg) {
    return println(LOG_ID_MAIN, VERBOSE, tag, msg);
  }

  public static int v(String tag, String msg, Throwable tr) {
    return println(LOG_ID_MAIN, VERBOSE, tag, msg + '\n' + getStackTraceString(tr));
  }

  public static int d(String tag, String msg) {
    return println(LOG_ID_MAIN, DEBUG, tag, msg);
  }

  public static int d(String tag, String msg, Throwable tr) {
    return println(LOG_ID_MAIN, DEBUG, tag, msg + '\n' + getStackTraceString(tr));
  }

  public static int i(String tag, String msg) {
    return println(LOG_ID_MAIN, INFO, tag, msg);
  }

  public static int i(String tag, String msg, Throwable tr) {
    return println(LOG_ID_MAIN, INFO, tag, msg + '\n' + getStackTraceString(tr));
  }

  public static int w(String tag, String msg) {
    return println(LOG_ID_MAIN, WARN, tag, msg);
  }

  public static int w(String tag, String msg, Throwable tr) {
    return println(LOG_ID_MAIN, WARN, tag, msg + '\n' + getStackTraceString(tr));
  }

  public static int w(String tag, Throwable tr) {
    return println(LOG_ID_MAIN, WARN, tag, getStackTraceString(tr));
  }

  public static int e(String tag, String msg) {
    return println(LOG_ID_MAIN, ERROR, tag, msg);
  }

  public static int e(String tag, String msg, Throwable tr) {
    return println(LOG_ID_MAIN, ERROR, tag, msg + '\n' + getStackTraceString(tr));
  }

  public static String getStackTraceString(Throwable tr) {
    if (tr == null) {
      return "";
    }
    StringWriter sw = new StringWriter();
    PrintWriter pw = new PrintWriter(sw);
    tr.printStackTrace(pw);
    pw.flush();
    return sw.toString();
  }

  public static int println(int priority, String tag, String msg) {
    return println(LOG_ID_MAIN, priority, tag, msg);
  }

  private static final int LOG_ID_MAIN = 0;

  private static int println(int bufID, int priority, String tag, String msg) {
    return 0;
  }

}
