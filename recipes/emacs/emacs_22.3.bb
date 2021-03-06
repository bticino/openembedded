require emacs.inc

PR="r1"

EXTRA_OECONF = "--without-sound --without-x"

SRC_URI = "${GNU_MIRROR}/emacs/emacs-${PV}.tar.gz \
	   file://use-qemu.patch;patch=1 \
	   file://nostdlib-unwind.patch;patch=1"

S = "${WORKDIR}/emacs-${PV}"

SRC_URI[md5sum] = "aa8ba34f548cd78b35914ae5a7bb87eb"
SRC_URI[sha256sum] = "7bd9b719db8ee20c75ee0d256737f7fd2c0e2ea30a285a3afbfc32c856420d16"
