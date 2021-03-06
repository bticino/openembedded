DESCRIPTION = "GNU dbm is a set of database routines that use extensible hashing."
HOMEPAGE = "http://www.gnu.org/software/gdbm/gdbm.html"
SECTION = "libs"
PRIORITY = "optional"
LICENSE = "GPL"

PR = "r4"

SRC_URI = "${GNU_MIRROR}/gdbm/gdbm-${PV}.tar.gz \
	   file://makefile.patch;patch=1 \
           file://libtool-mode.patch;patch=1"

inherit autotools

TARGET_CC_ARCH += "${LDFLAGS}"

do_install_appned(){
	oe_runmake inslall-compat DESTDIR=${D}
}

do_stage () {
	oe_libinstall -so -a libgdbm ${STAGING_LIBDIR}
	install -m 0644 ${S}/gdbm.h ${STAGING_INCDIR}/
	oe_libinstall -so -a libgdbm_compat ${STAGING_LIBDIR}
	install -m 0644 ${S}/dbm.h ${STAGING_INCDIR}/
	install -m 0644 ${S}/ndbm.h ${STAGING_INCDIR}/
}

SRC_URI[md5sum] = "1d1b1d5c0245b1c00aff92da751e9aa1"
SRC_URI[sha256sum] = "cc340338a2e28b40058ab9eb5354a21d53f88a1582ea21ba0bb185c37a281dc9"
