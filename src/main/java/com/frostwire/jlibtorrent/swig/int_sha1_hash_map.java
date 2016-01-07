/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class int_sha1_hash_map {
  private transient long swigCPtr;
  protected transient boolean swigCMemOwn;

  protected int_sha1_hash_map(long cPtr, boolean cMemoryOwn) {
    swigCMemOwn = cMemoryOwn;
    swigCPtr = cPtr;
  }

  protected static long getCPtr(int_sha1_hash_map obj) {
    return (obj == null) ? 0 : obj.swigCPtr;
  }

  protected void finalize() {
    delete();
  }

  public synchronized void delete() {
    if (swigCPtr != 0) {
      if (swigCMemOwn) {
        swigCMemOwn = false;
        libtorrent_jni.delete_int_sha1_hash_map(swigCPtr);
      }
      swigCPtr = 0;
    }
  }

  public int_sha1_hash_map() {
    this(libtorrent_jni.new_int_sha1_hash_map__SWIG_0(), true);
  }

  public int_sha1_hash_map(int_sha1_hash_map arg0) {
    this(libtorrent_jni.new_int_sha1_hash_map__SWIG_1(int_sha1_hash_map.getCPtr(arg0), arg0), true);
  }

  public long size() {
    return libtorrent_jni.int_sha1_hash_map_size(swigCPtr, this);
  }

  public boolean empty() {
    return libtorrent_jni.int_sha1_hash_map_empty(swigCPtr, this);
  }

  public void clear() {
    libtorrent_jni.int_sha1_hash_map_clear(swigCPtr, this);
  }

  public sha1_hash get(int key) {
    return new sha1_hash(libtorrent_jni.int_sha1_hash_map_get(swigCPtr, this, key), false);
  }

  public void set(int key, sha1_hash x) {
    libtorrent_jni.int_sha1_hash_map_set(swigCPtr, this, key, sha1_hash.getCPtr(x), x);
  }

  public void del(int key) {
    libtorrent_jni.int_sha1_hash_map_del(swigCPtr, this, key);
  }

  public boolean has_key(int key) {
    return libtorrent_jni.int_sha1_hash_map_has_key(swigCPtr, this, key);
  }

  public int_vector keys() {
    return new int_vector(libtorrent_jni.int_sha1_hash_map_keys(swigCPtr, this), true);
  }

}
