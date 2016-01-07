/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class dht_error_alert extends alert {
  private transient long swigCPtr;

  protected dht_error_alert(long cPtr, boolean cMemoryOwn) {
    super(libtorrent_jni.dht_error_alert_SWIGUpcast(cPtr), cMemoryOwn);
    swigCPtr = cPtr;
  }

  protected static long getCPtr(dht_error_alert obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_dht_error_alert(swigCPtr);
      }
      swigCPtr = 0;
    }
    super.delete();
  }

  public int type() {
    return libtorrent_jni.dht_error_alert_type(swigCPtr, this);
  }

  public int category() {
    return libtorrent_jni.dht_error_alert_category(swigCPtr, this);
  }

  public String what() {
    return libtorrent_jni.dht_error_alert_what(swigCPtr, this);
  }

  public String message() {
    return libtorrent_jni.dht_error_alert_message(swigCPtr, this);
  }

  public void setError(error_code value) {
    libtorrent_jni.dht_error_alert_error_set(swigCPtr, this, error_code.getCPtr(value), value);
  }

  public error_code getError() {
    long cPtr = libtorrent_jni.dht_error_alert_error_get(swigCPtr, this);
    return (cPtr == 0) ? null : new error_code(cPtr, false);
  }

  public void setOperation(dht_error_alert.op_t value) {
    libtorrent_jni.dht_error_alert_operation_set(swigCPtr, this, value.swigValue());
  }

  public dht_error_alert.op_t getOperation() {
    return dht_error_alert.op_t.swigToEnum(libtorrent_jni.dht_error_alert_operation_get(swigCPtr, this));
  }

  public final static int priority = libtorrent_jni.dht_error_alert_priority_get();
  public final static int alert_type = libtorrent_jni.dht_error_alert_alert_type_get();
  public final static int static_category = libtorrent_jni.dht_error_alert_static_category_get();
  public final static class op_t {
    public final static dht_error_alert.op_t unknown = new dht_error_alert.op_t("unknown");
    public final static dht_error_alert.op_t hostname_lookup = new dht_error_alert.op_t("hostname_lookup");

    public final int swigValue() {
      return swigValue;
    }

    public String toString() {
      return swigName;
    }

    public static op_t swigToEnum(int swigValue) {
      if (swigValue < swigValues.length && swigValue >= 0 && swigValues[swigValue].swigValue == swigValue)
        return swigValues[swigValue];
      for (int i = 0; i < swigValues.length; i++)
        if (swigValues[i].swigValue == swigValue)
          return swigValues[i];
      throw new IllegalArgumentException("No enum " + op_t.class + " with value " + swigValue);
    }

    private op_t(String swigName) {
      this.swigName = swigName;
      this.swigValue = swigNext++;
    }

    private op_t(String swigName, int swigValue) {
      this.swigName = swigName;
      this.swigValue = swigValue;
      swigNext = swigValue+1;
    }

    private op_t(String swigName, op_t swigEnum) {
      this.swigName = swigName;
      this.swigValue = swigEnum.swigValue;
      swigNext = this.swigValue+1;
    }

    private static op_t[] swigValues = { unknown, hostname_lookup };
    private static int swigNext = 0;
    private final int swigValue;
    private final String swigName;
  }

}
