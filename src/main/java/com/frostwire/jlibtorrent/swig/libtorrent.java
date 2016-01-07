/* ----------------------------------------------------------------------------
 * This file was automatically generated by SWIG (http://www.swig.org).
 * Version 3.0.8
 *
 * Do not make changes to this file unless you know what you are doing--modify
 * the SWIG interface file instead.
 * ----------------------------------------------------------------------------- */

package com.frostwire.jlibtorrent.swig;

public class libtorrent implements libtorrentConstants {
  public static boolean op_eq(error_condition lhs, error_condition rhs) {
    return libtorrent_jni.op_eq__SWIG_0(error_condition.getCPtr(lhs), lhs, error_condition.getCPtr(rhs), rhs);
  }

  public static boolean op_lt(error_condition lhs, error_condition rhs) {
    return libtorrent_jni.op_lt__SWIG_0(error_condition.getCPtr(lhs), lhs, error_condition.getCPtr(rhs), rhs);
  }

  public static boolean op_eq(error_code lhs, error_code rhs) {
    return libtorrent_jni.op_eq__SWIG_1(error_code.getCPtr(lhs), lhs, error_code.getCPtr(rhs), rhs);
  }

  public static boolean op_lt(error_code lhs, error_code rhs) {
    return libtorrent_jni.op_lt__SWIG_1(error_code.getCPtr(lhs), lhs, error_code.getCPtr(rhs), rhs);
  }

  public static boolean op_neq(error_code lhs, error_code rhs) {
    return libtorrent_jni.op_neq__SWIG_0(error_code.getCPtr(lhs), lhs, error_code.getCPtr(rhs), rhs);
  }

  public static boolean op_neq(error_condition lhs, error_condition rhs) {
    return libtorrent_jni.op_neq__SWIG_1(error_condition.getCPtr(lhs), lhs, error_condition.getCPtr(rhs), rhs);
  }

  public static boolean op_eq(error_code code, error_condition condition) {
    return libtorrent_jni.op_eq__SWIG_2(error_code.getCPtr(code), code, error_condition.getCPtr(condition), condition);
  }

  public static boolean op_neq(error_code lhs, error_condition rhs) {
    return libtorrent_jni.op_neq__SWIG_2(error_code.getCPtr(lhs), lhs, error_condition.getCPtr(rhs), rhs);
  }

  public static boolean op_eq(error_condition condition, error_code code) {
    return libtorrent_jni.op_eq__SWIG_3(error_condition.getCPtr(condition), condition, error_code.getCPtr(code), code);
  }

  public static boolean op_neq(error_condition lhs, error_code rhs) {
    return libtorrent_jni.op_neq__SWIG_3(error_condition.getCPtr(lhs), lhs, error_code.getCPtr(rhs), rhs);
  }

  public static long hash_value(error_code ec) {
    return libtorrent_jni.hash_value(error_code.getCPtr(ec), ec);
  }

  public static error_code make_error_code(errc_t e) {
    return new error_code(libtorrent_jni.make_error_code(e.swigValue()), true);
  }

  public static error_condition make_error_condition(errc_t e) {
    return new error_condition(libtorrent_jni.make_error_condition(e.swigValue()), true);
  }

  public static String version() {
    return libtorrent_jni.version();
  }

  public static error_category get_libtorrent_category() {
    return new error_category(libtorrent_jni.get_libtorrent_category(), false);
  }

  public static error_category get_http_category() {
    return new error_category(libtorrent_jni.get_http_category(), false);
  }

  public static high_resolution_clock.time_point min_time() {
    return new high_resolution_clock.time_point(libtorrent_jni.min_time(), true);
  }

  public static high_resolution_clock.time_point max_time() {
    return new high_resolution_clock.time_point(libtorrent_jni.max_time(), true);
  }

  public static void throw_type_error() {
    libtorrent_jni.throw_type_error();
  }

  public static void throw_invalid_handle() {
    libtorrent_jni.throw_invalid_handle();
  }

  public static stats_metric_vector session_stats_metrics() {
    return new stats_metric_vector(libtorrent_jni.session_stats_metrics(), true);
  }

  public static int find_metric_idx(String name) {
    return libtorrent_jni.find_metric_idx(name);
  }

  public static close_reason_t error_to_close_reason(error_code ec) {
    return close_reason_t.swigToEnum(libtorrent_jni.error_to_close_reason(error_code.getCPtr(ec), ec));
  }

  public static String operation_name(int op) {
    return libtorrent_jni.operation_name(op);
  }

  public static int getUser_alert_id() {
    return libtorrent_jni.user_alert_id_get();
  }

  public static void initialize_default_settings(session_settings s) {
    libtorrent_jni.initialize_default_settings(session_settings.getCPtr(s), s);
  }

  public static void save_settings_to_dict(session_settings s, string_entry_map sett) {
    libtorrent_jni.save_settings_to_dict(session_settings.getCPtr(s), s, string_entry_map.getCPtr(sett), sett);
  }

  public static int setting_by_name(String name) {
    return libtorrent_jni.setting_by_name(name);
  }

  public static String name_for_setting(int s) {
    return libtorrent_jni.name_for_setting(s);
  }

  public static void min_memory_usage(settings_pack set) {
    libtorrent_jni.min_memory_usage(settings_pack.getCPtr(set), set);
  }

  public static void high_performance_seed(settings_pack set) {
    libtorrent_jni.high_performance_seed(settings_pack.getCPtr(set), set);
  }

  public static void TORRENT_CFG() {
    libtorrent_jni.TORRENT_CFG();
  }

  public static int plus_one(int val) {
    return libtorrent_jni.plus_one(val);
  }

  public static int minus_one(int val) {
    return libtorrent_jni.minus_one(val);
  }

  public static error_category get_bdecode_category() {
    return new error_category(libtorrent_jni.get_bdecode_category(), false);
  }

  public static String print_entry(bdecode_node e, boolean single_line, int indent) {
    return libtorrent_jni.print_entry__SWIG_0(bdecode_node.getCPtr(e), e, single_line, indent);
  }

  public static String print_entry(bdecode_node e, boolean single_line) {
    return libtorrent_jni.print_entry__SWIG_1(bdecode_node.getCPtr(e), e, single_line);
  }

  public static String print_entry(bdecode_node e) {
    return libtorrent_jni.print_entry__SWIG_2(bdecode_node.getCPtr(e), e);
  }

  public static String make_magnet_uri(torrent_handle handle) {
    return libtorrent_jni.make_magnet_uri__SWIG_0(torrent_handle.getCPtr(handle), handle);
  }

  public static String make_magnet_uri(torrent_info info) {
    return libtorrent_jni.make_magnet_uri__SWIG_1(torrent_info.getCPtr(info), info);
  }

  public static void parse_magnet_uri(String uri, add_torrent_params p, error_code ec) {
    libtorrent_jni.parse_magnet_uri(uri, add_torrent_params.getCPtr(p), p, error_code.getCPtr(ec), ec);
  }

  public static void add_files(file_storage fs, String file, long flags) {
    libtorrent_jni.add_files__SWIG_0(file_storage.getCPtr(fs), fs, file, flags);
  }

  public static void add_files(file_storage fs, String file) {
    libtorrent_jni.add_files__SWIG_1(file_storage.getCPtr(fs), fs, file);
  }

  public static void set_piece_hashes(create_torrent t, String p, error_code ec) {
    libtorrent_jni.set_piece_hashes__SWIG_0(create_torrent.getCPtr(t), t, p, error_code.getCPtr(ec), ec);
  }

  public static void set_piece_hashes(create_torrent t, String p) {
    libtorrent_jni.set_piece_hashes__SWIG_1(create_torrent.getCPtr(t), t, p);
  }

  public static boolean is_utp_stream_logging() {
    return libtorrent_jni.is_utp_stream_logging();
  }

  public static void set_utp_stream_logging(boolean enable) {
    libtorrent_jni.set_utp_stream_logging(enable);
  }

  public static high_resolution_clock.duration to_seconds(long n) {
    return new high_resolution_clock.duration(libtorrent_jni.to_seconds(n), true);
  }

  public static high_resolution_clock.duration to_milliseconds(long n) {
    return new high_resolution_clock.duration(libtorrent_jni.to_milliseconds(n), true);
  }

  public static high_resolution_clock.duration to_microseconds(long n) {
    return new high_resolution_clock.duration(libtorrent_jni.to_microseconds(n), true);
  }

  public static high_resolution_clock.duration to_minutes(long n) {
    return new high_resolution_clock.duration(libtorrent_jni.to_minutes(n), true);
  }

  public static high_resolution_clock.duration to_hours(long n) {
    return new high_resolution_clock.duration(libtorrent_jni.to_hours(n), true);
  }

  public static boolean add_files_cb(String p, add_files_listener listener) {
    return libtorrent_jni.add_files_cb(p, add_files_listener.getCPtr(listener), listener);
  }

  public static void add_files_ex(file_storage fs, String file, long flags, add_files_listener listener) {
    libtorrent_jni.add_files_ex(file_storage.getCPtr(fs), fs, file, flags, add_files_listener.getCPtr(listener), listener);
  }

  public static void set_piece_hashes_ex(String id, create_torrent t, String p, error_code ec, set_piece_hashes_listener listener) {
    libtorrent_jni.set_piece_hashes_ex(id, create_torrent.getCPtr(t), t, p, error_code.getCPtr(ec), ec, set_piece_hashes_listener.getCPtr(listener), listener);
  }

  public static int boost_version() {
    return libtorrent_jni.boost_version();
  }

  public static String boost_lib_version() {
    return libtorrent_jni.boost_lib_version();
  }

}
