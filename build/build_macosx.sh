#!/bin/bash

#define
#$CXX
#$BOOST_ROOT
#$LIBTORRENT_ROOT
#$JDK_INCLUDE_1
#$JDK_INCLUDE_2
#$LBITORRENT_LIBS

#export CXXFLAGS="-stdlib=libc++ -std=c++11 -O3 -I$BOOST_ROOT"
#$BOOST_ROOT/b2 variant=release link=static
#$BOOST_ROOT/bjam toolset=darwin variant=release deprecated-functions=off link=static

CXX=clang++
CXXFLAGS="-stdlib=libc++ -std=c++11 -O3"
DEFINES="-DNDEBUG=1 -DBOOST_ASIO_SEPARATE_COMPILATION=1 -DTORRENT_USE_ABSOLUTE_TIME=1 -DTORRENT_DISABLE_GEO_IP=1 -DTORRENT_NO_DEPRECATE=1"
INCLUDES="-I$BOOST_ROOT -I$LIBTORRENT_ROOT/include -I$JDK_INCLUDE_1 -I$JDK_INCLUDE_2"
LIBS="-ltorrent -lboost_system -lboost_chrono -lboost_date_time -lboost_thread"
LDFLAGS="-L$LBITORRENT_LIBS"
TARGET="libjlibtorrent.dylib"

$CXX $CXXFLAGS $DEFINES $INCLUDES -c swig/libtorrent_jni.cpp
$CXX -dynamiclib -o $TARGET libtorrent_jni.o $LIBS $LDFLAGS

strip -S -x $TARGET
rm -rf libtorrent_jni.o
