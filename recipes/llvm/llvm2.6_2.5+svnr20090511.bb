require llvm.inc

SRCREV = "71428"

PV = "2.5+svnr${SRCPV}"

PR = "r0"

DEPENDS = "llvm-common llvm2.6-native"

SRC_URI = "\
  svn://llvm.org/svn/llvm-project/llvm/;proto=http;module=trunk \
  file://fix-build.patch;patch=1 \
  file://llvm-debugonly-zeroormore.patch;patch=1;pnum=0 \
"

S = "${WORKDIR}/trunk"

LLVM_RELEASE = "2.6"