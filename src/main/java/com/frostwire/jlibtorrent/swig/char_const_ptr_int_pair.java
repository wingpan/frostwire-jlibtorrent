/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class char_const_ptr_int_pair {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected char_const_ptr_int_pair(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(char_const_ptr_int_pair obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_char_const_ptr_int_pair(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public char_const_ptr_int_pair() {
    this(libtorrent_jni.new_char_const_ptr_int_pair__SWIG_0(), true);
  }

  public char_const_ptr_int_pair(String first, int second) {
    this(libtorrent_jni.new_char_const_ptr_int_pair__SWIG_1(first, second), true);
  }

  public char_const_ptr_int_pair(char_const_ptr_int_pair p) {
    this(libtorrent_jni.new_char_const_ptr_int_pair__SWIG_2(char_const_ptr_int_pair.getCPtr(p), p), true);
  }

  public void setFirst(String value) {
    libtorrent_jni.char_const_ptr_int_pair_first_set(swigCPtr, this, value);
  }

  public String getFirst() {
    return libtorrent_jni.char_const_ptr_int_pair_first_get(swigCPtr, this);
  }

  public void setSecond(int value) {
    libtorrent_jni.char_const_ptr_int_pair_second_set(swigCPtr, this, value);
  }

  public int getSecond() {
    return libtorrent_jni.char_const_ptr_int_pair_second_get(swigCPtr, this);
  }

}
