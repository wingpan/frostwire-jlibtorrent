/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class libtorrent_exception {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected libtorrent_exception(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(libtorrent_exception obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_libtorrent_exception(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public libtorrent_exception(error_code s) {
    this(libtorrent_jni.new_libtorrent_exception(error_code.getCPtr(s), s), true);
  }

  public String what() {
    return libtorrent_jni.libtorrent_exception_what(swigCPtr, this);
  }

  public error_code error() {
    return new error_code(libtorrent_jni.libtorrent_exception_error(swigCPtr, this), true);
  }

}
