require ncurses_${PV}.bb
inherit native
EXTRA_OEMAKE = '"BUILD_CCFLAGS=${BUILD_CCFLAGS}"'
DEPENDS = ""

SRC_URI[md5sum] = "069c8880072060373290a4fefff43520"
SRC_URI[sha256sum] = "5abce063cf431790f4e6a801a96c7eea0b33a41ecd0970f6312f52575c083b36"
